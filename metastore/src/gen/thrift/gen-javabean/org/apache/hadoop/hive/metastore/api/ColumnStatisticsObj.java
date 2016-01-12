/**
 * Autogenerated by Thrift Compiler (0.9.3)
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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-11")
public class ColumnStatisticsObj implements org.apache.thrift.TBase<ColumnStatisticsObj, ColumnStatisticsObj._Fields>, java.io.Serializable, Cloneable, Comparable<ColumnStatisticsObj> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ColumnStatisticsObj");

  private static final org.apache.thrift.protocol.TField COL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("colName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("colType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STATS_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("statsData", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ColumnStatisticsObjStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ColumnStatisticsObjTupleSchemeFactory());
  }

  private String colName; // required
  private String colType; // required
  private ColumnStatisticsData statsData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COL_NAME((short)1, "colName"),
    COL_TYPE((short)2, "colType"),
    STATS_DATA((short)3, "statsData");

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
        case 1: // COL_NAME
          return COL_NAME;
        case 2: // COL_TYPE
          return COL_TYPE;
        case 3: // STATS_DATA
          return STATS_DATA;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COL_NAME, new org.apache.thrift.meta_data.FieldMetaData("colName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("colType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATS_DATA, new org.apache.thrift.meta_data.FieldMetaData("statsData", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnStatisticsData.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ColumnStatisticsObj.class, metaDataMap);
  }

  public ColumnStatisticsObj() {
  }

  public ColumnStatisticsObj(
    String colName,
    String colType,
    ColumnStatisticsData statsData)
  {
    this();
    this.colName = colName;
    this.colType = colType;
    this.statsData = statsData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ColumnStatisticsObj(ColumnStatisticsObj other) {
    if (other.isSetColName()) {
      this.colName = other.colName;
    }
    if (other.isSetColType()) {
      this.colType = other.colType;
    }
    if (other.isSetStatsData()) {
      this.statsData = new ColumnStatisticsData(other.statsData);
    }
  }

  public ColumnStatisticsObj deepCopy() {
    return new ColumnStatisticsObj(this);
  }

  @Override
  public void clear() {
    this.colName = null;
    this.colType = null;
    this.statsData = null;
  }

  public String getColName() {
    return this.colName;
  }

  public void setColName(String colName) {
    this.colName = colName;
  }

  public void unsetColName() {
    this.colName = null;
  }

  /** Returns true if field colName is set (has been assigned a value) and false otherwise */
  public boolean isSetColName() {
    return this.colName != null;
  }

  public void setColNameIsSet(boolean value) {
    if (!value) {
      this.colName = null;
    }
  }

  public String getColType() {
    return this.colType;
  }

  public void setColType(String colType) {
    this.colType = colType;
  }

  public void unsetColType() {
    this.colType = null;
  }

  /** Returns true if field colType is set (has been assigned a value) and false otherwise */
  public boolean isSetColType() {
    return this.colType != null;
  }

  public void setColTypeIsSet(boolean value) {
    if (!value) {
      this.colType = null;
    }
  }

  public ColumnStatisticsData getStatsData() {
    return this.statsData;
  }

  public void setStatsData(ColumnStatisticsData statsData) {
    this.statsData = statsData;
  }

  public void unsetStatsData() {
    this.statsData = null;
  }

  /** Returns true if field statsData is set (has been assigned a value) and false otherwise */
  public boolean isSetStatsData() {
    return this.statsData != null;
  }

  public void setStatsDataIsSet(boolean value) {
    if (!value) {
      this.statsData = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COL_NAME:
      if (value == null) {
        unsetColName();
      } else {
        setColName((String)value);
      }
      break;

    case COL_TYPE:
      if (value == null) {
        unsetColType();
      } else {
        setColType((String)value);
      }
      break;

    case STATS_DATA:
      if (value == null) {
        unsetStatsData();
      } else {
        setStatsData((ColumnStatisticsData)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COL_NAME:
      return getColName();

    case COL_TYPE:
      return getColType();

    case STATS_DATA:
      return getStatsData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COL_NAME:
      return isSetColName();
    case COL_TYPE:
      return isSetColType();
    case STATS_DATA:
      return isSetStatsData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ColumnStatisticsObj)
      return this.equals((ColumnStatisticsObj)that);
    return false;
  }

  public boolean equals(ColumnStatisticsObj that) {
    if (that == null)
      return false;

    boolean this_present_colName = true && this.isSetColName();
    boolean that_present_colName = true && that.isSetColName();
    if (this_present_colName || that_present_colName) {
      if (!(this_present_colName && that_present_colName))
        return false;
      if (!this.colName.equals(that.colName))
        return false;
    }

    boolean this_present_colType = true && this.isSetColType();
    boolean that_present_colType = true && that.isSetColType();
    if (this_present_colType || that_present_colType) {
      if (!(this_present_colType && that_present_colType))
        return false;
      if (!this.colType.equals(that.colType))
        return false;
    }

    boolean this_present_statsData = true && this.isSetStatsData();
    boolean that_present_statsData = true && that.isSetStatsData();
    if (this_present_statsData || that_present_statsData) {
      if (!(this_present_statsData && that_present_statsData))
        return false;
      if (!this.statsData.equals(that.statsData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_colName = true && (isSetColName());
    list.add(present_colName);
    if (present_colName)
      list.add(colName);

    boolean present_colType = true && (isSetColType());
    list.add(present_colType);
    if (present_colType)
      list.add(colType);

    boolean present_statsData = true && (isSetStatsData());
    list.add(present_statsData);
    if (present_statsData)
      list.add(statsData);

    return list.hashCode();
  }

  @Override
  public int compareTo(ColumnStatisticsObj other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetColName()).compareTo(other.isSetColName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colName, other.colName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColType()).compareTo(other.isSetColType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colType, other.colType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatsData()).compareTo(other.isSetStatsData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatsData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statsData, other.statsData);
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
    StringBuilder sb = new StringBuilder("ColumnStatisticsObj(");
    boolean first = true;

    sb.append("colName:");
    if (this.colName == null) {
      sb.append("null");
    } else {
      sb.append(this.colName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("colType:");
    if (this.colType == null) {
      sb.append("null");
    } else {
      sb.append(this.colType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statsData:");
    if (this.statsData == null) {
      sb.append("null");
    } else {
      sb.append(this.statsData);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetColName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colName' is unset! Struct:" + toString());
    }

    if (!isSetColType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colType' is unset! Struct:" + toString());
    }

    if (!isSetStatsData()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statsData' is unset! Struct:" + toString());
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

  private static class ColumnStatisticsObjStandardSchemeFactory implements SchemeFactory {
    public ColumnStatisticsObjStandardScheme getScheme() {
      return new ColumnStatisticsObjStandardScheme();
    }
  }

  private static class ColumnStatisticsObjStandardScheme extends StandardScheme<ColumnStatisticsObj> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ColumnStatisticsObj struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.colName = iprot.readString();
              struct.setColNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.colType = iprot.readString();
              struct.setColTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATS_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.statsData = new ColumnStatisticsData();
              struct.statsData.read(iprot);
              struct.setStatsDataIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ColumnStatisticsObj struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.colName != null) {
        oprot.writeFieldBegin(COL_NAME_FIELD_DESC);
        oprot.writeString(struct.colName);
        oprot.writeFieldEnd();
      }
      if (struct.colType != null) {
        oprot.writeFieldBegin(COL_TYPE_FIELD_DESC);
        oprot.writeString(struct.colType);
        oprot.writeFieldEnd();
      }
      if (struct.statsData != null) {
        oprot.writeFieldBegin(STATS_DATA_FIELD_DESC);
        struct.statsData.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ColumnStatisticsObjTupleSchemeFactory implements SchemeFactory {
    public ColumnStatisticsObjTupleScheme getScheme() {
      return new ColumnStatisticsObjTupleScheme();
    }
  }

  private static class ColumnStatisticsObjTupleScheme extends TupleScheme<ColumnStatisticsObj> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ColumnStatisticsObj struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.colName);
      oprot.writeString(struct.colType);
      struct.statsData.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ColumnStatisticsObj struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.colName = iprot.readString();
      struct.setColNameIsSet(true);
      struct.colType = iprot.readString();
      struct.setColTypeIsSet(true);
      struct.statsData = new ColumnStatisticsData();
      struct.statsData.read(iprot);
      struct.setStatsDataIsSet(true);
    }
  }

}

