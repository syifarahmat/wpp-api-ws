// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.SyncdRecord}
 */
public final class SyncdRecord extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.SyncdRecord)
    SyncdRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SyncdRecord.newBuilder() to construct.
  private SyncdRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SyncdRecord() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SyncdRecord();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SyncdRecord(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = index_.toBuilder();
            }
            index_ = input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(index_);
              index_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            br.com.zapia.wpp.api.ws.binary.protos.KeyId.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) != 0)) {
              subBuilder = keyId_.toBuilder();
            }
            keyId_ = input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.KeyId.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(keyId_);
              keyId_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord.class, br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord.Builder.class);
  }

  private int bitField0_;
  public static final int INDEX_FIELD_NUMBER = 1;
  private br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex index_;
  /**
   * <code>optional .binary.SyncdIndex index = 1;</code>
   * @return Whether the index field is set.
   */
  @java.lang.Override
  public boolean hasIndex() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .binary.SyncdIndex index = 1;</code>
   * @return The index.
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex getIndex() {
    return index_ == null ? br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.getDefaultInstance() : index_;
  }
  /**
   * <code>optional .binary.SyncdIndex index = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.SyncdIndexOrBuilder getIndexOrBuilder() {
    return index_ == null ? br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.getDefaultInstance() : index_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private br.com.zapia.wpp.api.ws.binary.protos.SyncdValue value_;
  /**
   * <code>optional .binary.SyncdValue value = 2;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .binary.SyncdValue value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.SyncdValue getValue() {
    return value_ == null ? br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.getDefaultInstance() : value_;
  }
  /**
   * <code>optional .binary.SyncdValue value = 2;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.SyncdValueOrBuilder getValueOrBuilder() {
    return value_ == null ? br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.getDefaultInstance() : value_;
  }

  public static final int KEYID_FIELD_NUMBER = 3;
  private br.com.zapia.wpp.api.ws.binary.protos.KeyId keyId_;
  /**
   * <code>optional .binary.KeyId keyId = 3;</code>
   * @return Whether the keyId field is set.
   */
  @java.lang.Override
  public boolean hasKeyId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .binary.KeyId keyId = 3;</code>
   * @return The keyId.
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.KeyId getKeyId() {
    return keyId_ == null ? br.com.zapia.wpp.api.ws.binary.protos.KeyId.getDefaultInstance() : keyId_;
  }
  /**
   * <code>optional .binary.KeyId keyId = 3;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.KeyIdOrBuilder getKeyIdOrBuilder() {
    return keyId_ == null ? br.com.zapia.wpp.api.ws.binary.protos.KeyId.getDefaultInstance() : keyId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getIndex());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getValue());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getKeyId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIndex());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getKeyId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord other = (br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord) obj;

    if (hasIndex() != other.hasIndex()) return false;
    if (hasIndex()) {
      if (!getIndex()
          .equals(other.getIndex())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (hasKeyId() != other.hasKeyId()) return false;
    if (hasKeyId()) {
      if (!getKeyId()
          .equals(other.getKeyId())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasIndex()) {
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    if (hasKeyId()) {
      hash = (37 * hash) + KEYID_FIELD_NUMBER;
      hash = (53 * hash) + getKeyId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code binary.SyncdRecord}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.SyncdRecord)
      br.com.zapia.wpp.api.ws.binary.protos.SyncdRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord.class, br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getIndexFieldBuilder();
        getValueFieldBuilder();
        getKeyIdFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (indexBuilder_ == null) {
        index_ = null;
      } else {
        indexBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      if (keyIdBuilder_ == null) {
        keyId_ = null;
      } else {
        keyIdBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_SyncdRecord_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord build() {
      br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord result = new br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (indexBuilder_ == null) {
          result.index_ = index_;
        } else {
          result.index_ = indexBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (keyIdBuilder_ == null) {
          result.keyId_ = keyId_;
        } else {
          result.keyId_ = keyIdBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord.getDefaultInstance()) return this;
      if (other.hasIndex()) {
        mergeIndex(other.getIndex());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.hasKeyId()) {
        mergeKeyId(other.getKeyId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex index_;
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex, br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdIndexOrBuilder> indexBuilder_;
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     * @return Whether the index field is set.
     */
    public boolean hasIndex() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     * @return The index.
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex getIndex() {
      if (indexBuilder_ == null) {
        return index_ == null ? br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.getDefaultInstance() : index_;
      } else {
        return indexBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     */
    public Builder setIndex(br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex value) {
      if (indexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        index_ = value;
        onChanged();
      } else {
        indexBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     */
    public Builder setIndex(
        br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.Builder builderForValue) {
      if (indexBuilder_ == null) {
        index_ = builderForValue.build();
        onChanged();
      } else {
        indexBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     */
    public Builder mergeIndex(br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex value) {
      if (indexBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            index_ != null &&
            index_ != br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.getDefaultInstance()) {
          index_ =
            br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.newBuilder(index_).mergeFrom(value).buildPartial();
        } else {
          index_ = value;
        }
        onChanged();
      } else {
        indexBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     */
    public Builder clearIndex() {
      if (indexBuilder_ == null) {
        index_ = null;
        onChanged();
      } else {
        indexBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.Builder getIndexBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIndexFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdIndexOrBuilder getIndexOrBuilder() {
      if (indexBuilder_ != null) {
        return indexBuilder_.getMessageOrBuilder();
      } else {
        return index_ == null ?
            br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.getDefaultInstance() : index_;
      }
    }
    /**
     * <code>optional .binary.SyncdIndex index = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex, br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdIndexOrBuilder> 
        getIndexFieldBuilder() {
      if (indexBuilder_ == null) {
        indexBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex, br.com.zapia.wpp.api.ws.binary.protos.SyncdIndex.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdIndexOrBuilder>(
                getIndex(),
                getParentForChildren(),
                isClean());
        index_ = null;
      }
      return indexBuilder_;
    }

    private br.com.zapia.wpp.api.ws.binary.protos.SyncdValue value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.SyncdValue, br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdValueOrBuilder> valueBuilder_;
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     * @return The value.
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdValue getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     */
    public Builder setValue(br.com.zapia.wpp.api.ws.binary.protos.SyncdValue value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     */
    public Builder setValue(
        br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     */
    public Builder mergeValue(br.com.zapia.wpp.api.ws.binary.protos.SyncdValue value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            value_ != null &&
            value_ != br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.getDefaultInstance()) {
          value_ =
            br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.SyncdValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>optional .binary.SyncdValue value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.SyncdValue, br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.SyncdValue, br.com.zapia.wpp.api.ws.binary.protos.SyncdValue.Builder, br.com.zapia.wpp.api.ws.binary.protos.SyncdValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private br.com.zapia.wpp.api.ws.binary.protos.KeyId keyId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.KeyId, br.com.zapia.wpp.api.ws.binary.protos.KeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.KeyIdOrBuilder> keyIdBuilder_;
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     * @return Whether the keyId field is set.
     */
    public boolean hasKeyId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     * @return The keyId.
     */
    public br.com.zapia.wpp.api.ws.binary.protos.KeyId getKeyId() {
      if (keyIdBuilder_ == null) {
        return keyId_ == null ? br.com.zapia.wpp.api.ws.binary.protos.KeyId.getDefaultInstance() : keyId_;
      } else {
        return keyIdBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     */
    public Builder setKeyId(br.com.zapia.wpp.api.ws.binary.protos.KeyId value) {
      if (keyIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keyId_ = value;
        onChanged();
      } else {
        keyIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     */
    public Builder setKeyId(
        br.com.zapia.wpp.api.ws.binary.protos.KeyId.Builder builderForValue) {
      if (keyIdBuilder_ == null) {
        keyId_ = builderForValue.build();
        onChanged();
      } else {
        keyIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     */
    public Builder mergeKeyId(br.com.zapia.wpp.api.ws.binary.protos.KeyId value) {
      if (keyIdBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            keyId_ != null &&
            keyId_ != br.com.zapia.wpp.api.ws.binary.protos.KeyId.getDefaultInstance()) {
          keyId_ =
            br.com.zapia.wpp.api.ws.binary.protos.KeyId.newBuilder(keyId_).mergeFrom(value).buildPartial();
        } else {
          keyId_ = value;
        }
        onChanged();
      } else {
        keyIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     */
    public Builder clearKeyId() {
      if (keyIdBuilder_ == null) {
        keyId_ = null;
        onChanged();
      } else {
        keyIdBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.KeyId.Builder getKeyIdBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getKeyIdFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.KeyIdOrBuilder getKeyIdOrBuilder() {
      if (keyIdBuilder_ != null) {
        return keyIdBuilder_.getMessageOrBuilder();
      } else {
        return keyId_ == null ?
            br.com.zapia.wpp.api.ws.binary.protos.KeyId.getDefaultInstance() : keyId_;
      }
    }
    /**
     * <code>optional .binary.KeyId keyId = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.KeyId, br.com.zapia.wpp.api.ws.binary.protos.KeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.KeyIdOrBuilder> 
        getKeyIdFieldBuilder() {
      if (keyIdBuilder_ == null) {
        keyIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.KeyId, br.com.zapia.wpp.api.ws.binary.protos.KeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.KeyIdOrBuilder>(
                getKeyId(),
                getParentForChildren(),
                isClean());
        keyId_ = null;
      }
      return keyIdBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:binary.SyncdRecord)
  }

  // @@protoc_insertion_point(class_scope:binary.SyncdRecord)
  private static final br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SyncdRecord>
      PARSER = new com.google.protobuf.AbstractParser<SyncdRecord>() {
    @java.lang.Override
    public SyncdRecord parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SyncdRecord(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SyncdRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SyncdRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.SyncdRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
