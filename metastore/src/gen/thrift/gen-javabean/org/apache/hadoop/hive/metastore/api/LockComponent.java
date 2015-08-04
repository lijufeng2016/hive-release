/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-1-3")
public class LockComponent implements org.apache.thrift.TBase<LockComponent, LockComponent._Fields>, java.io.Serializable, Cloneable, Comparable<LockComponent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LockComponent");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("level", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField DBNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbname", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TABLENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tablename", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField PARTITIONNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionname", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LockComponentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LockComponentTupleSchemeFactory());
  }

  private LockType type; // required
  private LockLevel level; // required
  private String dbname; // required
  private String tablename; // optional
  private String partitionname; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see LockType
     */
    TYPE((short)1, "type"),
    /**
     * 
     * @see LockLevel
     */
    LEVEL((short)2, "level"),
    DBNAME((short)3, "dbname"),
    TABLENAME((short)4, "tablename"),
    PARTITIONNAME((short)5, "partitionname");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // LEVEL
          return LEVEL;
        case 3: // DBNAME
          return DBNAME;
        case 4: // TABLENAME
          return TABLENAME;
        case 5: // PARTITIONNAME
          return PARTITIONNAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TABLENAME,_Fields.PARTITIONNAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, LockType.class)));
    tmpMap.put(_Fields.LEVEL, new org.apache.thrift.meta_data.FieldMetaData("level", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, LockLevel.class)));
    tmpMap.put(_Fields.DBNAME, new org.apache.thrift.meta_data.FieldMetaData("dbname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLENAME, new org.apache.thrift.meta_data.FieldMetaData("tablename", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITIONNAME, new org.apache.thrift.meta_data.FieldMetaData("partitionname", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LockComponent.class, metaDataMap);
  }

  public LockComponent() {
  }

  public LockComponent(
    LockType type,
    LockLevel level,
    String dbname)
  {
    this();
    this.type = type;
    this.level = level;
    this.dbname = dbname;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LockComponent(LockComponent other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetLevel()) {
      this.level = other.level;
    }
    if (other.isSetDbname()) {
      this.dbname = other.dbname;
    }
    if (other.isSetTablename()) {
      this.tablename = other.tablename;
    }
    if (other.isSetPartitionname()) {
      this.partitionname = other.partitionname;
    }
  }

  public LockComponent deepCopy() {
    return new LockComponent(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.level = null;
    this.dbname = null;
    this.tablename = null;
    this.partitionname = null;
  }

  /**
   * 
   * @see LockType
   */
  public LockType getType() {
    return this.type;
  }

  /**
   * 
   * @see LockType
   */
  public void setType(LockType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * 
   * @see LockLevel
   */
  public LockLevel getLevel() {
    return this.level;
  }

  /**
   * 
   * @see LockLevel
   */
  public void setLevel(LockLevel level) {
    this.level = level;
  }

  public void unsetLevel() {
    this.level = null;
  }

  /** Returns true if field level is set (has been assigned a value) and false otherwise */
  public boolean isSetLevel() {
    return this.level != null;
  }

  public void setLevelIsSet(boolean value) {
    if (!value) {
      this.level = null;
    }
  }

  public String getDbname() {
    return this.dbname;
  }

  public void setDbname(String dbname) {
    this.dbname = dbname;
  }

  public void unsetDbname() {
    this.dbname = null;
  }

  /** Returns true if field dbname is set (has been assigned a value) and false otherwise */
  public boolean isSetDbname() {
    return this.dbname != null;
  }

  public void setDbnameIsSet(boolean value) {
    if (!value) {
      this.dbname = null;
    }
  }

  public String getTablename() {
    return this.tablename;
  }

  public void setTablename(String tablename) {
    this.tablename = tablename;
  }

  public void unsetTablename() {
    this.tablename = null;
  }

  /** Returns true if field tablename is set (has been assigned a value) and false otherwise */
  public boolean isSetTablename() {
    return this.tablename != null;
  }

  public void setTablenameIsSet(boolean value) {
    if (!value) {
      this.tablename = null;
    }
  }

  public String getPartitionname() {
    return this.partitionname;
  }

  public void setPartitionname(String partitionname) {
    this.partitionname = partitionname;
  }

  public void unsetPartitionname() {
    this.partitionname = null;
  }

  /** Returns true if field partitionname is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionname() {
    return this.partitionname != null;
  }

  public void setPartitionnameIsSet(boolean value) {
    if (!value) {
      this.partitionname = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((LockType)value);
      }
      break;

    case LEVEL:
      if (value == null) {
        unsetLevel();
      } else {
        setLevel((LockLevel)value);
      }
      break;

    case DBNAME:
      if (value == null) {
        unsetDbname();
      } else {
        setDbname((String)value);
      }
      break;

    case TABLENAME:
      if (value == null) {
        unsetTablename();
      } else {
        setTablename((String)value);
      }
      break;

    case PARTITIONNAME:
      if (value == null) {
        unsetPartitionname();
      } else {
        setPartitionname((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case LEVEL:
      return getLevel();

    case DBNAME:
      return getDbname();

    case TABLENAME:
      return getTablename();

    case PARTITIONNAME:
      return getPartitionname();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case LEVEL:
      return isSetLevel();
    case DBNAME:
      return isSetDbname();
    case TABLENAME:
      return isSetTablename();
    case PARTITIONNAME:
      return isSetPartitionname();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LockComponent)
      return this.equals((LockComponent)that);
    return false;
  }

  public boolean equals(LockComponent that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_level = true && this.isSetLevel();
    boolean that_present_level = true && that.isSetLevel();
    if (this_present_level || that_present_level) {
      if (!(this_present_level && that_present_level))
        return false;
      if (!this.level.equals(that.level))
        return false;
    }

    boolean this_present_dbname = true && this.isSetDbname();
    boolean that_present_dbname = true && that.isSetDbname();
    if (this_present_dbname || that_present_dbname) {
      if (!(this_present_dbname && that_present_dbname))
        return false;
      if (!this.dbname.equals(that.dbname))
        return false;
    }

    boolean this_present_tablename = true && this.isSetTablename();
    boolean that_present_tablename = true && that.isSetTablename();
    if (this_present_tablename || that_present_tablename) {
      if (!(this_present_tablename && that_present_tablename))
        return false;
      if (!this.tablename.equals(that.tablename))
        return false;
    }

    boolean this_present_partitionname = true && this.isSetPartitionname();
    boolean that_present_partitionname = true && that.isSetPartitionname();
    if (this_present_partitionname || that_present_partitionname) {
      if (!(this_present_partitionname && that_present_partitionname))
        return false;
      if (!this.partitionname.equals(that.partitionname))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_level = true && (isSetLevel());
    list.add(present_level);
    if (present_level)
      list.add(level.getValue());

    boolean present_dbname = true && (isSetDbname());
    list.add(present_dbname);
    if (present_dbname)
      list.add(dbname);

    boolean present_tablename = true && (isSetTablename());
    list.add(present_tablename);
    if (present_tablename)
      list.add(tablename);

    boolean present_partitionname = true && (isSetPartitionname());
    list.add(present_partitionname);
    if (present_partitionname)
      list.add(partitionname);

    return list.hashCode();
  }

  @Override
  public int compareTo(LockComponent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLevel()).compareTo(other.isSetLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.level, other.level);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDbname()).compareTo(other.isSetDbname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbname, other.dbname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTablename()).compareTo(other.isSetTablename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablename, other.tablename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPartitionname()).compareTo(other.isSetPartitionname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionname, other.partitionname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LockComponent(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("level:");
    if (this.level == null) {
      sb.append("null");
    } else {
      sb.append(this.level);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dbname:");
    if (this.dbname == null) {
      sb.append("null");
    } else {
      sb.append(this.dbname);
    }
    first = false;
    if (isSetTablename()) {
      if (!first) sb.append(", ");
      sb.append("tablename:");
      if (this.tablename == null) {
        sb.append("null");
      } else {
        sb.append(this.tablename);
      }
      first = false;
    }
    if (isSetPartitionname()) {
      if (!first) sb.append(", ");
      sb.append("partitionname:");
      if (this.partitionname == null) {
        sb.append("null");
      } else {
        sb.append(this.partitionname);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' is unset! Struct:" + toString());
    }

    if (!isSetLevel()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'level' is unset! Struct:" + toString());
    }

    if (!isSetDbname()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbname' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LockComponentStandardSchemeFactory implements SchemeFactory {
    public LockComponentStandardScheme getScheme() {
      return new LockComponentStandardScheme();
    }
  }

  private static class LockComponentStandardScheme extends StandardScheme<LockComponent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LockComponent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = org.apache.hadoop.hive.metastore.api.LockType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.level = org.apache.hadoop.hive.metastore.api.LockLevel.findByValue(iprot.readI32());
              struct.setLevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DBNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbname = iprot.readString();
              struct.setDbnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TABLENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tablename = iprot.readString();
              struct.setTablenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARTITIONNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.partitionname = iprot.readString();
              struct.setPartitionnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LockComponent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.level != null) {
        oprot.writeFieldBegin(LEVEL_FIELD_DESC);
        oprot.writeI32(struct.level.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.dbname != null) {
        oprot.writeFieldBegin(DBNAME_FIELD_DESC);
        oprot.writeString(struct.dbname);
        oprot.writeFieldEnd();
      }
      if (struct.tablename != null) {
        if (struct.isSetTablename()) {
          oprot.writeFieldBegin(TABLENAME_FIELD_DESC);
          oprot.writeString(struct.tablename);
          oprot.writeFieldEnd();
        }
      }
      if (struct.partitionname != null) {
        if (struct.isSetPartitionname()) {
          oprot.writeFieldBegin(PARTITIONNAME_FIELD_DESC);
          oprot.writeString(struct.partitionname);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LockComponentTupleSchemeFactory implements SchemeFactory {
    public LockComponentTupleScheme getScheme() {
      return new LockComponentTupleScheme();
    }
  }

  private static class LockComponentTupleScheme extends TupleScheme<LockComponent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LockComponent struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      oprot.writeI32(struct.level.getValue());
      oprot.writeString(struct.dbname);
      BitSet optionals = new BitSet();
      if (struct.isSetTablename()) {
        optionals.set(0);
      }
      if (struct.isSetPartitionname()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTablename()) {
        oprot.writeString(struct.tablename);
      }
      if (struct.isSetPartitionname()) {
        oprot.writeString(struct.partitionname);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LockComponent struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = org.apache.hadoop.hive.metastore.api.LockType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.level = org.apache.hadoop.hive.metastore.api.LockLevel.findByValue(iprot.readI32());
      struct.setLevelIsSet(true);
      struct.dbname = iprot.readString();
      struct.setDbnameIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.tablename = iprot.readString();
        struct.setTablenameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.partitionname = iprot.readString();
        struct.setPartitionnameIsSet(true);
      }
    }
  }

}

