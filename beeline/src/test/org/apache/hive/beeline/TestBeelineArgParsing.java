/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hive.beeline;

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Unit test for Beeline arg parser.
 */
public class TestBeelineArgParsing {

  public class TestBeeline extends BeeLine {

    String connectArgs = null;
    List<String> properties = new ArrayList<String>();
    List<String> queries = new ArrayList<String>();

    @Override
    boolean dispatch(String command) {
      String connectCommand = "!connect";
      String propertyCommand = "!property";
      if (command.startsWith(connectCommand)) {
        this.connectArgs = command.substring(connectCommand.length() + 1, command.length());
      } else if (command.startsWith(propertyCommand)) {
        this.properties.add(command.substring(propertyCommand.length() + 1, command.length()));
      } else {
        this.queries.add(command);
      }
      return true;
    }
  }

  @Test
  public void testSimpleArgs() throws Exception {
    TestBeeline bl = new TestBeeline();
    String args[] = new String[] {"-u", "url", "-n", "name",
      "-p", "password", "-d", "driver", "-a", "authType"};
    Assert.assertEquals(0, bl.initArgs(args));
    Assert.assertTrue(bl.connectArgs.equals("url name password driver"));
    Assert.assertTrue(bl.getOpts().getAuthType().equals("authType"));
  }

  @Test
  public void testPasswordFileArgs() throws Exception {
    TestBeeline bl = new TestBeeline();
    File passFile = new File("file.password");
    passFile.deleteOnExit();
    FileOutputStream passFileOut = new FileOutputStream(passFile);
    passFileOut.write("mypass\n".getBytes());
    passFileOut.close();
    String args[] = new String[] {"-u", "url", "-n", "name",
      "-w", "file.password", "-p", "not-taken-if-w-is-present",
      "-d", "driver", "-a", "authType"};
    bl.initArgs(args);
    System.out.println(bl.connectArgs);
    // Password file contents are trimmed of trailing whitespaces and newlines
    Assert.assertTrue(bl.connectArgs.equals("url name mypass driver"));
    Assert.assertTrue(bl.getOpts().getAuthType().equals("authType"));
    passFile.delete();
  }

  /**
   * The first flag is taken by the parser.
   */
  @Test
  public void testDuplicateArgs() throws Exception {
    TestBeeline bl = new TestBeeline();
    String args[] = new String[] {"-u", "url", "-u", "url2", "-n", "name",
      "-p", "password", "-d", "driver"};
    Assert.assertEquals(0, bl.initArgs(args));
    Assert.assertTrue(bl.connectArgs.equals("url name password driver"));
  }

  @Test
  public void testQueryScripts() throws Exception {
    TestBeeline bl = new TestBeeline();
    String args[] = new String[] {"-u", "url", "-n", "name",
      "-p", "password", "-d", "driver", "-e", "select1", "-e", "select2"};
    Assert.assertEquals(0, bl.initArgs(args));
    Assert.assertTrue(bl.connectArgs.equals("url name password driver"));
    Assert.assertTrue(bl.queries.contains("select1"));
    Assert.assertTrue(bl.queries.contains("select2"));
  }

  /**
   * Test setting hive conf and hive vars with --hiveconf and --hivevar
   */
  @Test
  public void testHiveConfAndVars() throws Exception {
    TestBeeline bl = new TestBeeline();
    String args[] = new String[] {"-u", "url", "-n", "name",
      "-p", "password", "-d", "driver", "--hiveconf", "a=avalue", "--hiveconf", "b=bvalue",
      "--hivevar", "c=cvalue", "--hivevar", "d=dvalue"};
    Assert.assertEquals(0, bl.initArgs(args));
    Assert.assertTrue(bl.connectArgs.equals("url name password driver"));
    Assert.assertTrue(bl.getOpts().getHiveConfVariables().get("a").equals("avalue"));
    Assert.assertTrue(bl.getOpts().getHiveConfVariables().get("b").equals("bvalue"));
    Assert.assertTrue(bl.getOpts().getHiveVariables().get("c").equals("cvalue"));
    Assert.assertTrue(bl.getOpts().getHiveVariables().get("d").equals("dvalue"));
  }

  @Test
  public void testBeelineOpts() throws Exception {
    TestBeeline bl = new TestBeeline();
    String args[] =
        new String[] { "-u", "url", "-n", "name", "-p", "password", "-d", "driver",
            "--autoCommit=true", "--verbose", "--truncateTable" };
    Assert.assertEquals(0, bl.initArgs(args));
    Assert.assertTrue(bl.connectArgs.equals("url name password driver"));
    Assert.assertTrue(bl.getOpts().getAutoCommit());
    Assert.assertTrue(bl.getOpts().getVerbose());
    Assert.assertTrue(bl.getOpts().getTruncateTable());
  }

  /**
   * Test setting script file with -f option.
   */
  @Test
  public void testScriptFile() throws Exception {
    TestBeeline bl = new TestBeeline();
    String args[] = new String[] {"-u", "url", "-n", "name",
      "-p", "password", "-d", "driver", "-f", "myscript"};
    Assert.assertEquals(0, bl.initArgs(args));
    Assert.assertTrue(bl.connectArgs.equals("url name password driver"));
    Assert.assertTrue(bl.getOpts().getScriptFile().equals("myscript"));
  }

  /**
   * Displays the usage.
   */
  @Test
  public void testHelp() throws Exception {
    TestBeeline bl = new TestBeeline();
    String args[] = new String[] {"--help"};
    Assert.assertEquals(0, bl.initArgs(args));
  }

  /**
   * Displays the usage.
   */
  @Test
  public void testUnmatchedArgs() throws Exception {
    TestBeeline bl = new TestBeeline();
    String args[] = new String[] {"-u", "url", "-n"};
    Assert.assertEquals(-1, bl.initArgs(args));
  }

  @Test
  public void testBeelinePasswordMask() throws Exception {
    TestBeeline bl = new TestBeeline();
    File errFile = File.createTempFile("test", "tmp");
    bl.setErrorStream(new PrintStream(new FileOutputStream(errFile)));
    String args[] =
        new String[] { "-u", "url", "-n", "name", "-p", "password", "-d", "driver",
            "--autoCommit=true", "--verbose", "--truncateTable" };
    bl.initArgs(args);
    bl.close();
    String errContents = new String(Files.readAllBytes(Paths.get(errFile.toString())));
    Assert.assertTrue(errContents.contains(BeeLine.PASSWD_MASK));
  }

}
