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

package org.apache.hadoop.hive.ql.plan;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.ql.io.AcidUtils;
import org.apache.hadoop.hive.ql.plan.Explain.Level;

/**
 * LoadTableDesc.
 *
 */
public class LoadTableDesc extends org.apache.hadoop.hive.ql.plan.LoadDesc
    implements Serializable {
  private static final long serialVersionUID = 1L;
  private LoadFileType loadFileType;
  private DynamicPartitionCtx dpCtx;
  private ListBucketingCtx lbCtx;
  private boolean inheritTableSpecs = true; //For partitions, flag controlling whether the current
                                            //table specs are to be used
  // Need to remember whether this is an acid compliant operation, and if so whether it is an
  // insert, update, or delete.
  private AcidUtils.Operation writeType;

  // TODO: the below seems like they should just be combined into partitionDesc
  private org.apache.hadoop.hive.ql.plan.TableDesc table;
  private Map<String, String> partitionSpec; // NOTE: this partitionSpec has to be ordered map

  public enum LoadFileType {
    REPLACE_ALL,        // Remove all existing data before copy/move
    KEEP_EXISTING,      // If any file exist while copy, then just duplicate the file
    OVERWRITE_EXISTING  // If any file exist while copy, then just overwrite the file
  }

  public LoadTableDesc(final Path sourcePath,
      final org.apache.hadoop.hive.ql.plan.TableDesc table,
      final Map<String, String> partitionSpec,
      final LoadFileType loadFileType,
      final AcidUtils.Operation writeType) {
    super(sourcePath);
    init(table, partitionSpec, loadFileType, writeType);
  }

  /**
   * For use with non-ACID compliant operations, such as LOAD
   * @param sourcePath
   * @param table
   * @param partitionSpec
   * @param loadFileType
   */
  public LoadTableDesc(final Path sourcePath,
                       final TableDesc table,
                       final Map<String, String> partitionSpec,
                       final LoadFileType loadFileType) {
    this(sourcePath, table, partitionSpec, loadFileType, AcidUtils.Operation.NOT_ACID);
  }

  public LoadTableDesc(final Path sourcePath,
      final org.apache.hadoop.hive.ql.plan.TableDesc table,
      final Map<String, String> partitionSpec,
      final AcidUtils.Operation writeType) {
    this(sourcePath, table, partitionSpec, LoadFileType.REPLACE_ALL, writeType);
  }

  /**
   * For DDL operations that are not ACID compliant.
   * @param sourcePath
   * @param table
   * @param partitionSpec
   */
  public LoadTableDesc(final Path sourcePath,
                       final org.apache.hadoop.hive.ql.plan.TableDesc table,
                       final Map<String, String> partitionSpec) {
    this(sourcePath, table, partitionSpec, LoadFileType.REPLACE_ALL, AcidUtils.Operation.NOT_ACID);
  }

  public LoadTableDesc(final Path sourcePath,
      final org.apache.hadoop.hive.ql.plan.TableDesc table,
      final DynamicPartitionCtx dpCtx,
      final AcidUtils.Operation writeType) {
    super(sourcePath);
    this.dpCtx = dpCtx;
    if (dpCtx != null && dpCtx.getPartSpec() != null && partitionSpec == null) {
      init(table, dpCtx.getPartSpec(), LoadFileType.REPLACE_ALL, writeType);
    } else {
      init(table, new LinkedHashMap<String, String>(), LoadFileType.REPLACE_ALL, writeType);
    }
  }

  private void init(
      final org.apache.hadoop.hive.ql.plan.TableDesc table,
      final Map<String, String> partitionSpec,
      final LoadFileType loadFileType,
      AcidUtils.Operation writeType) {
    this.table = table;
    this.partitionSpec = partitionSpec;
    this.loadFileType = loadFileType;
    this.writeType = writeType;
  }

  @Explain(displayName = "table", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
  public TableDesc getTable() {
    return table;
  }

  public void setTable(final org.apache.hadoop.hive.ql.plan.TableDesc table) {
    this.table = table;
  }

  @Explain(displayName = "partition", explainLevels = { Level.USER, Level.DEFAULT, Level.EXTENDED })
  public Map<String, String> getPartitionSpec() {
    return partitionSpec;
  }

  public void setPartitionSpec(final Map<String, String> partitionSpec) {
    this.partitionSpec = partitionSpec;
  }

  @Explain(displayName = "replace")
  public boolean getReplace() {
    return (loadFileType == LoadFileType.REPLACE_ALL);
  }

  public LoadFileType getLoadFileType() {
    return loadFileType;
  }

  public void setLoadFileType(LoadFileType loadFileType) {
    this.loadFileType = loadFileType;
  }

  public DynamicPartitionCtx getDPCtx() {
    return dpCtx;
  }

  public void setDPCtx(final DynamicPartitionCtx dpCtx) {
    this.dpCtx = dpCtx;
  }

  public boolean getInheritTableSpecs() {
    return inheritTableSpecs;
  }

  public void setInheritTableSpecs(boolean inheritTableSpecs) {
    this.inheritTableSpecs = inheritTableSpecs;
  }

  /**
   * @return the lbCtx
   */
  public ListBucketingCtx getLbCtx() {
    return lbCtx;
  }

  /**
   * @param lbCtx the lbCtx to set
   */
  public void setLbCtx(ListBucketingCtx lbCtx) {
    this.lbCtx = lbCtx;
  }

  public AcidUtils.Operation getWriteType() {
    return writeType;
  }
}
