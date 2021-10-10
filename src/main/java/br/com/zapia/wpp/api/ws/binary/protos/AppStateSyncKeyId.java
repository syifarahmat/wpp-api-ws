// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.AppStateSyncKeyId}
 */
public final class AppStateSyncKeyId extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.AppStateSyncKeyId)
    AppStateSyncKeyIdOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppStateSyncKeyId.newBuilder() to construct.
  private AppStateSyncKeyId(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppStateSyncKeyId() {
    keyId_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppStateSyncKeyId();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppStateSyncKeyId(
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
            bitField0_ |= 0x00000001;
            keyId_ = input.readBytes();
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyId_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyId_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.class, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder.class);
  }

  private int bitField0_;
  public static final int KEYID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString keyId_;
  /**
   * <code>optional bytes keyId = 1;</code>
   * @return Whether the keyId field is set.
   */
  @java.lang.Override
  public boolean hasKeyId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bytes keyId = 1;</code>
   * @return The keyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyId() {
    return keyId_;
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
      output.writeBytes(1, keyId_);
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
        .computeBytesSize(1, keyId_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId other = (br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId) obj;

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
    if (hasKeyId()) {
      hash = (37 * hash) + KEYID_FIELD_NUMBER;
      hash = (53 * hash) + getKeyId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId prototype) {
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
   * Protobuf type {@code binary.AppStateSyncKeyId}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.AppStateSyncKeyId)
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyId_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.class, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.newBuilder()
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
      keyId_ = com.google.protobuf.ByteString.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyId_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId build() {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId result = new br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.keyId_ = keyId_;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance()) return this;
      if (other.hasKeyId()) {
        setKeyId(other.getKeyId());
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
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString keyId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes keyId = 1;</code>
     * @return Whether the keyId field is set.
     */
    @java.lang.Override
    public boolean hasKeyId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes keyId = 1;</code>
     * @return The keyId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKeyId() {
      return keyId_;
    }
    /**
     * <code>optional bytes keyId = 1;</code>
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyId(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      keyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes keyId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      keyId_ = getDefaultInstance().getKeyId();
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


    // @@protoc_insertion_point(builder_scope:binary.AppStateSyncKeyId)
  }

  // @@protoc_insertion_point(class_scope:binary.AppStateSyncKeyId)
  private static final br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AppStateSyncKeyId>
      PARSER = new com.google.protobuf.AbstractParser<AppStateSyncKeyId>() {
    @java.lang.Override
    public AppStateSyncKeyId parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppStateSyncKeyId(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppStateSyncKeyId> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppStateSyncKeyId> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
