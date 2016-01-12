/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.ql.plan.api;

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
public class Graph implements org.apache.thrift.TBase<Graph, Graph._Fields>, java.io.Serializable, Cloneable, Comparable<Graph> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Graph");

  private static final org.apache.thrift.protocol.TField NODE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ROOTS_FIELD_DESC = new org.apache.thrift.protocol.TField("roots", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ADJACENCY_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("adjacencyList", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GraphStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GraphTupleSchemeFactory());
  }

  private NodeType nodeType; // required
  private List<String> roots; // required
  private List<Adjacency> adjacencyList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see NodeType
     */
    NODE_TYPE((short)1, "nodeType"),
    ROOTS((short)2, "roots"),
    ADJACENCY_LIST((short)3, "adjacencyList");

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
        case 1: // NODE_TYPE
          return NODE_TYPE;
        case 2: // ROOTS
          return ROOTS;
        case 3: // ADJACENCY_LIST
          return ADJACENCY_LIST;
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
    tmpMap.put(_Fields.NODE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("nodeType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, NodeType.class)));
    tmpMap.put(_Fields.ROOTS, new org.apache.thrift.meta_data.FieldMetaData("roots", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ADJACENCY_LIST, new org.apache.thrift.meta_data.FieldMetaData("adjacencyList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Adjacency.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Graph.class, metaDataMap);
  }

  public Graph() {
  }

  public Graph(
    NodeType nodeType,
    List<String> roots,
    List<Adjacency> adjacencyList)
  {
    this();
    this.nodeType = nodeType;
    this.roots = roots;
    this.adjacencyList = adjacencyList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Graph(Graph other) {
    if (other.isSetNodeType()) {
      this.nodeType = other.nodeType;
    }
    if (other.isSetRoots()) {
      List<String> __this__roots = new ArrayList<String>(other.roots);
      this.roots = __this__roots;
    }
    if (other.isSetAdjacencyList()) {
      List<Adjacency> __this__adjacencyList = new ArrayList<Adjacency>(other.adjacencyList.size());
      for (Adjacency other_element : other.adjacencyList) {
        __this__adjacencyList.add(new Adjacency(other_element));
      }
      this.adjacencyList = __this__adjacencyList;
    }
  }

  public Graph deepCopy() {
    return new Graph(this);
  }

  @Override
  public void clear() {
    this.nodeType = null;
    this.roots = null;
    this.adjacencyList = null;
  }

  /**
   * 
   * @see NodeType
   */
  public NodeType getNodeType() {
    return this.nodeType;
  }

  /**
   * 
   * @see NodeType
   */
  public void setNodeType(NodeType nodeType) {
    this.nodeType = nodeType;
  }

  public void unsetNodeType() {
    this.nodeType = null;
  }

  /** Returns true if field nodeType is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeType() {
    return this.nodeType != null;
  }

  public void setNodeTypeIsSet(boolean value) {
    if (!value) {
      this.nodeType = null;
    }
  }

  public int getRootsSize() {
    return (this.roots == null) ? 0 : this.roots.size();
  }

  public java.util.Iterator<String> getRootsIterator() {
    return (this.roots == null) ? null : this.roots.iterator();
  }

  public void addToRoots(String elem) {
    if (this.roots == null) {
      this.roots = new ArrayList<String>();
    }
    this.roots.add(elem);
  }

  public List<String> getRoots() {
    return this.roots;
  }

  public void setRoots(List<String> roots) {
    this.roots = roots;
  }

  public void unsetRoots() {
    this.roots = null;
  }

  /** Returns true if field roots is set (has been assigned a value) and false otherwise */
  public boolean isSetRoots() {
    return this.roots != null;
  }

  public void setRootsIsSet(boolean value) {
    if (!value) {
      this.roots = null;
    }
  }

  public int getAdjacencyListSize() {
    return (this.adjacencyList == null) ? 0 : this.adjacencyList.size();
  }

  public java.util.Iterator<Adjacency> getAdjacencyListIterator() {
    return (this.adjacencyList == null) ? null : this.adjacencyList.iterator();
  }

  public void addToAdjacencyList(Adjacency elem) {
    if (this.adjacencyList == null) {
      this.adjacencyList = new ArrayList<Adjacency>();
    }
    this.adjacencyList.add(elem);
  }

  public List<Adjacency> getAdjacencyList() {
    return this.adjacencyList;
  }

  public void setAdjacencyList(List<Adjacency> adjacencyList) {
    this.adjacencyList = adjacencyList;
  }

  public void unsetAdjacencyList() {
    this.adjacencyList = null;
  }

  /** Returns true if field adjacencyList is set (has been assigned a value) and false otherwise */
  public boolean isSetAdjacencyList() {
    return this.adjacencyList != null;
  }

  public void setAdjacencyListIsSet(boolean value) {
    if (!value) {
      this.adjacencyList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODE_TYPE:
      if (value == null) {
        unsetNodeType();
      } else {
        setNodeType((NodeType)value);
      }
      break;

    case ROOTS:
      if (value == null) {
        unsetRoots();
      } else {
        setRoots((List<String>)value);
      }
      break;

    case ADJACENCY_LIST:
      if (value == null) {
        unsetAdjacencyList();
      } else {
        setAdjacencyList((List<Adjacency>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_TYPE:
      return getNodeType();

    case ROOTS:
      return getRoots();

    case ADJACENCY_LIST:
      return getAdjacencyList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODE_TYPE:
      return isSetNodeType();
    case ROOTS:
      return isSetRoots();
    case ADJACENCY_LIST:
      return isSetAdjacencyList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Graph)
      return this.equals((Graph)that);
    return false;
  }

  public boolean equals(Graph that) {
    if (that == null)
      return false;

    boolean this_present_nodeType = true && this.isSetNodeType();
    boolean that_present_nodeType = true && that.isSetNodeType();
    if (this_present_nodeType || that_present_nodeType) {
      if (!(this_present_nodeType && that_present_nodeType))
        return false;
      if (!this.nodeType.equals(that.nodeType))
        return false;
    }

    boolean this_present_roots = true && this.isSetRoots();
    boolean that_present_roots = true && that.isSetRoots();
    if (this_present_roots || that_present_roots) {
      if (!(this_present_roots && that_present_roots))
        return false;
      if (!this.roots.equals(that.roots))
        return false;
    }

    boolean this_present_adjacencyList = true && this.isSetAdjacencyList();
    boolean that_present_adjacencyList = true && that.isSetAdjacencyList();
    if (this_present_adjacencyList || that_present_adjacencyList) {
      if (!(this_present_adjacencyList && that_present_adjacencyList))
        return false;
      if (!this.adjacencyList.equals(that.adjacencyList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nodeType = true && (isSetNodeType());
    list.add(present_nodeType);
    if (present_nodeType)
      list.add(nodeType.getValue());

    boolean present_roots = true && (isSetRoots());
    list.add(present_roots);
    if (present_roots)
      list.add(roots);

    boolean present_adjacencyList = true && (isSetAdjacencyList());
    list.add(present_adjacencyList);
    if (present_adjacencyList)
      list.add(adjacencyList);

    return list.hashCode();
  }

  @Override
  public int compareTo(Graph other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNodeType()).compareTo(other.isSetNodeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeType, other.nodeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoots()).compareTo(other.isSetRoots());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoots()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roots, other.roots);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdjacencyList()).compareTo(other.isSetAdjacencyList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdjacencyList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adjacencyList, other.adjacencyList);
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
    StringBuilder sb = new StringBuilder("Graph(");
    boolean first = true;

    sb.append("nodeType:");
    if (this.nodeType == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roots:");
    if (this.roots == null) {
      sb.append("null");
    } else {
      sb.append(this.roots);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("adjacencyList:");
    if (this.adjacencyList == null) {
      sb.append("null");
    } else {
      sb.append(this.adjacencyList);
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

  private static class GraphStandardSchemeFactory implements SchemeFactory {
    public GraphStandardScheme getScheme() {
      return new GraphStandardScheme();
    }
  }

  private static class GraphStandardScheme extends StandardScheme<Graph> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Graph struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.nodeType = org.apache.hadoop.hive.ql.plan.api.NodeType.findByValue(iprot.readI32());
              struct.setNodeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROOTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.roots = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.roots.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setRootsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADJACENCY_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.adjacencyList = new ArrayList<Adjacency>(_list11.size);
                Adjacency _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = new Adjacency();
                  _elem12.read(iprot);
                  struct.adjacencyList.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setAdjacencyListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Graph struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodeType != null) {
        oprot.writeFieldBegin(NODE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.nodeType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.roots != null) {
        oprot.writeFieldBegin(ROOTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.roots.size()));
          for (String _iter14 : struct.roots)
          {
            oprot.writeString(_iter14);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.adjacencyList != null) {
        oprot.writeFieldBegin(ADJACENCY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.adjacencyList.size()));
          for (Adjacency _iter15 : struct.adjacencyList)
          {
            _iter15.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GraphTupleSchemeFactory implements SchemeFactory {
    public GraphTupleScheme getScheme() {
      return new GraphTupleScheme();
    }
  }

  private static class GraphTupleScheme extends TupleScheme<Graph> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Graph struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNodeType()) {
        optionals.set(0);
      }
      if (struct.isSetRoots()) {
        optionals.set(1);
      }
      if (struct.isSetAdjacencyList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNodeType()) {
        oprot.writeI32(struct.nodeType.getValue());
      }
      if (struct.isSetRoots()) {
        {
          oprot.writeI32(struct.roots.size());
          for (String _iter16 : struct.roots)
          {
            oprot.writeString(_iter16);
          }
        }
      }
      if (struct.isSetAdjacencyList()) {
        {
          oprot.writeI32(struct.adjacencyList.size());
          for (Adjacency _iter17 : struct.adjacencyList)
          {
            _iter17.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Graph struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.nodeType = org.apache.hadoop.hive.ql.plan.api.NodeType.findByValue(iprot.readI32());
        struct.setNodeTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.roots = new ArrayList<String>(_list18.size);
          String _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = iprot.readString();
            struct.roots.add(_elem19);
          }
        }
        struct.setRootsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.adjacencyList = new ArrayList<Adjacency>(_list21.size);
          Adjacency _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = new Adjacency();
            _elem22.read(iprot);
            struct.adjacencyList.add(_elem22);
          }
        }
        struct.setAdjacencyListIsSet(true);
      }
    }
  }

}

