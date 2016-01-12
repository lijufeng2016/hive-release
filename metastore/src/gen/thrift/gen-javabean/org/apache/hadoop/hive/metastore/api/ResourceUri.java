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
public class ResourceUri implements org.apache.thrift.TBase<ResourceUri, ResourceUri._Fields>, java.io.Serializable, Cloneable, Comparable<ResourceUri> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResourceUri");

  private static final org.apache.thrift.protocol.TField RESOURCE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField URI_FIELD_DESC = new org.apache.thrift.protocol.TField("uri", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResourceUriStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResourceUriTupleSchemeFactory());
  }

  private ResourceType resourceType; // required
  private String uri; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ResourceType
     */
    RESOURCE_TYPE((short)1, "resourceType"),
    URI((short)2, "uri");

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
        case 1: // RESOURCE_TYPE
          return RESOURCE_TYPE;
        case 2: // URI
          return URI;
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
    tmpMap.put(_Fields.RESOURCE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("resourceType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResourceType.class)));
    tmpMap.put(_Fields.URI, new org.apache.thrift.meta_data.FieldMetaData("uri", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResourceUri.class, metaDataMap);
  }

  public ResourceUri() {
  }

  public ResourceUri(
    ResourceType resourceType,
    String uri)
  {
    this();
    this.resourceType = resourceType;
    this.uri = uri;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResourceUri(ResourceUri other) {
    if (other.isSetResourceType()) {
      this.resourceType = other.resourceType;
    }
    if (other.isSetUri()) {
      this.uri = other.uri;
    }
  }

  public ResourceUri deepCopy() {
    return new ResourceUri(this);
  }

  @Override
  public void clear() {
    this.resourceType = null;
    this.uri = null;
  }

  /**
   * 
   * @see ResourceType
   */
  public ResourceType getResourceType() {
    return this.resourceType;
  }

  /**
   * 
   * @see ResourceType
   */
  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }

  public void unsetResourceType() {
    this.resourceType = null;
  }

  /** Returns true if field resourceType is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceType() {
    return this.resourceType != null;
  }

  public void setResourceTypeIsSet(boolean value) {
    if (!value) {
      this.resourceType = null;
    }
  }

  public String getUri() {
    return this.uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public void unsetUri() {
    this.uri = null;
  }

  /** Returns true if field uri is set (has been assigned a value) and false otherwise */
  public boolean isSetUri() {
    return this.uri != null;
  }

  public void setUriIsSet(boolean value) {
    if (!value) {
      this.uri = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESOURCE_TYPE:
      if (value == null) {
        unsetResourceType();
      } else {
        setResourceType((ResourceType)value);
      }
      break;

    case URI:
      if (value == null) {
        unsetUri();
      } else {
        setUri((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_TYPE:
      return getResourceType();

    case URI:
      return getUri();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_TYPE:
      return isSetResourceType();
    case URI:
      return isSetUri();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResourceUri)
      return this.equals((ResourceUri)that);
    return false;
  }

  public boolean equals(ResourceUri that) {
    if (that == null)
      return false;

    boolean this_present_resourceType = true && this.isSetResourceType();
    boolean that_present_resourceType = true && that.isSetResourceType();
    if (this_present_resourceType || that_present_resourceType) {
      if (!(this_present_resourceType && that_present_resourceType))
        return false;
      if (!this.resourceType.equals(that.resourceType))
        return false;
    }

    boolean this_present_uri = true && this.isSetUri();
    boolean that_present_uri = true && that.isSetUri();
    if (this_present_uri || that_present_uri) {
      if (!(this_present_uri && that_present_uri))
        return false;
      if (!this.uri.equals(that.uri))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resourceType = true && (isSetResourceType());
    list.add(present_resourceType);
    if (present_resourceType)
      list.add(resourceType.getValue());

    boolean present_uri = true && (isSetUri());
    list.add(present_uri);
    if (present_uri)
      list.add(uri);

    return list.hashCode();
  }

  @Override
  public int compareTo(ResourceUri other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResourceType()).compareTo(other.isSetResourceType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceType, other.resourceType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUri()).compareTo(other.isSetUri());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUri()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uri, other.uri);
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
    StringBuilder sb = new StringBuilder("ResourceUri(");
    boolean first = true;

    sb.append("resourceType:");
    if (this.resourceType == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("uri:");
    if (this.uri == null) {
      sb.append("null");
    } else {
      sb.append(this.uri);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class ResourceUriStandardSchemeFactory implements SchemeFactory {
    public ResourceUriStandardScheme getScheme() {
      return new ResourceUriStandardScheme();
    }
  }

  private static class ResourceUriStandardScheme extends StandardScheme<ResourceUri> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResourceUri struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.resourceType = org.apache.hadoop.hive.metastore.api.ResourceType.findByValue(iprot.readI32());
              struct.setResourceTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // URI
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uri = iprot.readString();
              struct.setUriIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResourceUri struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourceType != null) {
        oprot.writeFieldBegin(RESOURCE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.resourceType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.uri != null) {
        oprot.writeFieldBegin(URI_FIELD_DESC);
        oprot.writeString(struct.uri);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResourceUriTupleSchemeFactory implements SchemeFactory {
    public ResourceUriTupleScheme getScheme() {
      return new ResourceUriTupleScheme();
    }
  }

  private static class ResourceUriTupleScheme extends TupleScheme<ResourceUri> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResourceUri struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResourceType()) {
        optionals.set(0);
      }
      if (struct.isSetUri()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetResourceType()) {
        oprot.writeI32(struct.resourceType.getValue());
      }
      if (struct.isSetUri()) {
        oprot.writeString(struct.uri);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResourceUri struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.resourceType = org.apache.hadoop.hive.metastore.api.ResourceType.findByValue(iprot.readI32());
        struct.setResourceTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.uri = iprot.readString();
        struct.setUriIsSet(true);
      }
    }
  }

}

