// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.Money}
 */
public final class Money extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.Money)
    MoneyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Money.newBuilder() to construct.
  private Money(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Money() {
    currencyCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Money();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Money(
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
          case 8: {
            bitField0_ |= 0x00000001;
            value_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            offset_ = input.readUInt32();
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            currencyCode_ = bs;
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Money_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Money_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.Money.class, br.com.zapia.wpp.api.ws.binary.protos.Money.Builder.class);
  }

  private int bitField0_;
  public static final int VALUE_FIELD_NUMBER = 1;
  private long value_;
  /**
   * <code>optional int64 value = 1;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 value = 1;</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private int offset_;
  /**
   * <code>optional uint32 offset = 2;</code>
   * @return Whether the offset field is set.
   */
  @java.lang.Override
  public boolean hasOffset() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional uint32 offset = 2;</code>
   * @return The offset.
   */
  @java.lang.Override
  public int getOffset() {
    return offset_;
  }

  public static final int CURRENCYCODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object currencyCode_;
  /**
   * <code>optional string currencyCode = 3;</code>
   * @return Whether the currencyCode field is set.
   */
  @java.lang.Override
  public boolean hasCurrencyCode() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string currencyCode = 3;</code>
   * @return The currencyCode.
   */
  @java.lang.Override
  public java.lang.String getCurrencyCode() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        currencyCode_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string currencyCode = 3;</code>
   * @return The bytes for currencyCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCurrencyCodeBytes() {
    java.lang.Object ref = currencyCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currencyCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      output.writeInt64(1, value_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(2, offset_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, currencyCode_);
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
        .computeInt64Size(1, value_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, offset_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, currencyCode_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.Money)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.Money other = (br.com.zapia.wpp.api.ws.binary.protos.Money) obj;

    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (getValue()
          != other.getValue()) return false;
    }
    if (hasOffset() != other.hasOffset()) return false;
    if (hasOffset()) {
      if (getOffset()
          != other.getOffset()) return false;
    }
    if (hasCurrencyCode() != other.hasCurrencyCode()) return false;
    if (hasCurrencyCode()) {
      if (!getCurrencyCode()
          .equals(other.getCurrencyCode())) return false;
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
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getValue());
    }
    if (hasOffset()) {
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getOffset();
    }
    if (hasCurrencyCode()) {
      hash = (37 * hash) + CURRENCYCODE_FIELD_NUMBER;
      hash = (53 * hash) + getCurrencyCode().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.Money parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.Money prototype) {
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
   * Protobuf type {@code binary.Money}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.Money)
      br.com.zapia.wpp.api.ws.binary.protos.MoneyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Money_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Money_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.Money.class, br.com.zapia.wpp.api.ws.binary.protos.Money.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.Money.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      value_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      offset_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      currencyCode_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_Money_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.Money getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.Money.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.Money build() {
      br.com.zapia.wpp.api.ws.binary.protos.Money result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.Money buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.Money result = new br.com.zapia.wpp.api.ws.binary.protos.Money(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.offset_ = offset_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.currencyCode_ = currencyCode_;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.Money) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.Money)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.Money other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.Money.getDefaultInstance()) return this;
      if (other.hasValue()) {
        setValue(other.getValue());
      }
      if (other.hasOffset()) {
        setOffset(other.getOffset());
      }
      if (other.hasCurrencyCode()) {
        bitField0_ |= 0x00000004;
        currencyCode_ = other.currencyCode_;
        onChanged();
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
      br.com.zapia.wpp.api.ws.binary.protos.Money parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.Money) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long value_ ;
    /**
     * <code>optional int64 value = 1;</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
    }
    /**
     * <code>optional int64 value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {
      bitField0_ |= 0x00000001;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0L;
      onChanged();
      return this;
    }

    private int offset_ ;
    /**
     * <code>optional uint32 offset = 2;</code>
     * @return Whether the offset field is set.
     */
    @java.lang.Override
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional uint32 offset = 2;</code>
     * @return The offset.
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
    }
    /**
     * <code>optional uint32 offset = 2;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(int value) {
      bitField0_ |= 0x00000002;
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      offset_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object currencyCode_ = "";
    /**
     * <code>optional string currencyCode = 3;</code>
     * @return Whether the currencyCode field is set.
     */
    public boolean hasCurrencyCode() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string currencyCode = 3;</code>
     * @return The currencyCode.
     */
    public java.lang.String getCurrencyCode() {
      java.lang.Object ref = currencyCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          currencyCode_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string currencyCode = 3;</code>
     * @return The bytes for currencyCode.
     */
    public com.google.protobuf.ByteString
        getCurrencyCodeBytes() {
      java.lang.Object ref = currencyCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currencyCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string currencyCode = 3;</code>
     * @param value The currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      currencyCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string currencyCode = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrencyCode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      currencyCode_ = getDefaultInstance().getCurrencyCode();
      onChanged();
      return this;
    }
    /**
     * <code>optional string currencyCode = 3;</code>
     * @param value The bytes for currencyCode to set.
     * @return This builder for chaining.
     */
    public Builder setCurrencyCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      currencyCode_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:binary.Money)
  }

  // @@protoc_insertion_point(class_scope:binary.Money)
  private static final br.com.zapia.wpp.api.ws.binary.protos.Money DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.Money();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.Money getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Money>
      PARSER = new com.google.protobuf.AbstractParser<Money>() {
    @java.lang.Override
    public Money parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Money(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Money> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Money> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.Money getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
