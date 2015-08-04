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
public class BinaryColumnStatsData implements org.apache.thrift.TBase<BinaryColumnStatsData, BinaryColumnStatsData._Fields>, java.io.Serializable, Cloneable, Comparable<BinaryColumnStatsData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BinaryColumnStatsData");

  private static final org.apache.thrift.protocol.TField MAX_COL_LEN_FIELD_DESC = new org.apache.thrift.protocol.TField("maxColLen", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField AVG_COL_LEN_FIELD_DESC = new org.apache.thrift.protocol.TField("avgColLen", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_NULLS_FIELD_DESC = new org.apache.thrift.protocol.TField("numNulls", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BinaryColumnStatsDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BinaryColumnStatsDataTupleSchemeFactory());
  }

  private long maxColLen; // required
  private double avgColLen; // required
  private long numNulls; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MAX_COL_LEN((short)1, "maxColLen"),
    AVG_COL_LEN((short)2, "avgColLen"),
    NUM_NULLS((short)3, "numNulls");

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
        case 1: // MAX_COL_LEN
          return MAX_COL_LEN;
        case 2: // AVG_COL_LEN
          return AVG_COL_LEN;
        case 3: // NUM_NULLS
          return NUM_NULLS;
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
  private static final int __MAXCOLLEN_ISSET_ID = 0;
  private static final int __AVGCOLLEN_ISSET_ID = 1;
  private static final int __NUMNULLS_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MAX_COL_LEN, new org.apache.thrift.meta_data.FieldMetaData("maxColLen", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.AVG_COL_LEN, new org.apache.thrift.meta_data.FieldMetaData("avgColLen", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.NUM_NULLS, new org.apache.thrift.meta_data.FieldMetaData("numNulls", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BinaryColumnStatsData.class, metaDataMap);
  }

  public BinaryColumnStatsData() {
  }

  public BinaryColumnStatsData(
    long maxColLen,
    double avgColLen,
    long numNulls)
  {
    this();
    this.maxColLen = maxColLen;
    setMaxColLenIsSet(true);
    this.avgColLen = avgColLen;
    setAvgColLenIsSet(true);
    this.numNulls = numNulls;
    setNumNullsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BinaryColumnStatsData(BinaryColumnStatsData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.maxColLen = other.maxColLen;
    this.avgColLen = other.avgColLen;
    this.numNulls = other.numNulls;
  }

  public BinaryColumnStatsData deepCopy() {
    return new BinaryColumnStatsData(this);
  }

  @Override
  public void clear() {
    setMaxColLenIsSet(false);
    this.maxColLen = 0;
    setAvgColLenIsSet(false);
    this.avgColLen = 0.0;
    setNumNullsIsSet(false);
    this.numNulls = 0;
  }

  public long getMaxColLen() {
    return this.maxColLen;
  }

  public void setMaxColLen(long maxColLen) {
    this.maxColLen = maxColLen;
    setMaxColLenIsSet(true);
  }

  public void unsetMaxColLen() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXCOLLEN_ISSET_ID);
  }

  /** Returns true if field maxColLen is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxColLen() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXCOLLEN_ISSET_ID);
  }

  public void setMaxColLenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXCOLLEN_ISSET_ID, value);
  }

  public double getAvgColLen() {
    return this.avgColLen;
  }

  public void setAvgColLen(double avgColLen) {
    this.avgColLen = avgColLen;
    setAvgColLenIsSet(true);
  }

  public void unsetAvgColLen() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AVGCOLLEN_ISSET_ID);
  }

  /** Returns true if field avgColLen is set (has been assigned a value) and false otherwise */
  public boolean isSetAvgColLen() {
    return EncodingUtils.testBit(__isset_bitfield, __AVGCOLLEN_ISSET_ID);
  }

  public void setAvgColLenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AVGCOLLEN_ISSET_ID, value);
  }

  public long getNumNulls() {
    return this.numNulls;
  }

  public void setNumNulls(long numNulls) {
    this.numNulls = numNulls;
    setNumNullsIsSet(true);
  }

  public void unsetNumNulls() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMNULLS_ISSET_ID);
  }

  /** Returns true if field numNulls is set (has been assigned a value) and false otherwise */
  public boolean isSetNumNulls() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMNULLS_ISSET_ID);
  }

  public void setNumNullsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMNULLS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MAX_COL_LEN:
      if (value == null) {
        unsetMaxColLen();
      } else {
        setMaxColLen((Long)value);
      }
      break;

    case AVG_COL_LEN:
      if (value == null) {
        unsetAvgColLen();
      } else {
        setAvgColLen((Double)value);
      }
      break;

    case NUM_NULLS:
      if (value == null) {
        unsetNumNulls();
      } else {
        setNumNulls((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MAX_COL_LEN:
      return Long.valueOf(getMaxColLen());

    case AVG_COL_LEN:
      return Double.valueOf(getAvgColLen());

    case NUM_NULLS:
      return Long.valueOf(getNumNulls());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MAX_COL_LEN:
      return isSetMaxColLen();
    case AVG_COL_LEN:
      return isSetAvgColLen();
    case NUM_NULLS:
      return isSetNumNulls();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BinaryColumnStatsData)
      return this.equals((BinaryColumnStatsData)that);
    return false;
  }

  public boolean equals(BinaryColumnStatsData that) {
    if (that == null)
      return false;

    boolean this_present_maxColLen = true;
    boolean that_present_maxColLen = true;
    if (this_present_maxColLen || that_present_maxColLen) {
      if (!(this_present_maxColLen && that_present_maxColLen))
        return false;
      if (this.maxColLen != that.maxColLen)
        return false;
    }

    boolean this_present_avgColLen = true;
    boolean that_present_avgColLen = true;
    if (this_present_avgColLen || that_present_avgColLen) {
      if (!(this_present_avgColLen && that_present_avgColLen))
        return false;
      if (this.avgColLen != that.avgColLen)
        return false;
    }

    boolean this_present_numNulls = true;
    boolean that_present_numNulls = true;
    if (this_present_numNulls || that_present_numNulls) {
      if (!(this_present_numNulls && that_present_numNulls))
        return false;
      if (this.numNulls != that.numNulls)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_maxColLen = true;
    list.add(present_maxColLen);
    if (present_maxColLen)
      list.add(maxColLen);

    boolean present_avgColLen = true;
    list.add(present_avgColLen);
    if (present_avgColLen)
      list.add(avgColLen);

    boolean present_numNulls = true;
    list.add(present_numNulls);
    if (present_numNulls)
      list.add(numNulls);

    return list.hashCode();
  }

  @Override
  public int compareTo(BinaryColumnStatsData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMaxColLen()).compareTo(other.isSetMaxColLen());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxColLen()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxColLen, other.maxColLen);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAvgColLen()).compareTo(other.isSetAvgColLen());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvgColLen()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.avgColLen, other.avgColLen);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumNulls()).compareTo(other.isSetNumNulls());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumNulls()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numNulls, other.numNulls);
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
    StringBuilder sb = new StringBuilder("BinaryColumnStatsData(");
    boolean first = true;

    sb.append("maxColLen:");
    sb.append(this.maxColLen);
    first = false;
    if (!first) sb.append(", ");
    sb.append("avgColLen:");
    sb.append(this.avgColLen);
    first = false;
    if (!first) sb.append(", ");
    sb.append("numNulls:");
    sb.append(this.numNulls);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMaxColLen()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'maxColLen' is unset! Struct:" + toString());
    }

    if (!isSetAvgColLen()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'avgColLen' is unset! Struct:" + toString());
    }

    if (!isSetNumNulls()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'numNulls' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BinaryColumnStatsDataStandardSchemeFactory implements SchemeFactory {
    public BinaryColumnStatsDataStandardScheme getScheme() {
      return new BinaryColumnStatsDataStandardScheme();
    }
  }

  private static class BinaryColumnStatsDataStandardScheme extends StandardScheme<BinaryColumnStatsData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BinaryColumnStatsData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MAX_COL_LEN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.maxColLen = iprot.readI64();
              struct.setMaxColLenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AVG_COL_LEN
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.avgColLen = iprot.readDouble();
              struct.setAvgColLenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_NULLS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.numNulls = iprot.readI64();
              struct.setNumNullsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BinaryColumnStatsData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(MAX_COL_LEN_FIELD_DESC);
      oprot.writeI64(struct.maxColLen);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AVG_COL_LEN_FIELD_DESC);
      oprot.writeDouble(struct.avgColLen);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NUM_NULLS_FIELD_DESC);
      oprot.writeI64(struct.numNulls);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BinaryColumnStatsDataTupleSchemeFactory implements SchemeFactory {
    public BinaryColumnStatsDataTupleScheme getScheme() {
      return new BinaryColumnStatsDataTupleScheme();
    }
  }

  private static class BinaryColumnStatsDataTupleScheme extends TupleScheme<BinaryColumnStatsData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BinaryColumnStatsData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.maxColLen);
      oprot.writeDouble(struct.avgColLen);
      oprot.writeI64(struct.numNulls);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BinaryColumnStatsData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.maxColLen = iprot.readI64();
      struct.setMaxColLenIsSet(true);
      struct.avgColLen = iprot.readDouble();
      struct.setAvgColLenIsSet(true);
      struct.numNulls = iprot.readI64();
      struct.setNumNullsIsSet(true);
    }
  }

}

