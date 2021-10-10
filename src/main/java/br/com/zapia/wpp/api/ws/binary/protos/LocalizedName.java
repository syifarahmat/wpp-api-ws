// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.LocalizedName}
 */
public final class LocalizedName extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.LocalizedName)
    LocalizedNameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalizedName.newBuilder() to construct.
  private LocalizedName(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalizedName() {
    lg_ = "";
    lc_ = "";
    verifiedName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocalizedName();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocalizedName(
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
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            lg_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            lc_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            verifiedName_ = bs;
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_LocalizedName_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_LocalizedName_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.LocalizedName.class, br.com.zapia.wpp.api.ws.binary.protos.LocalizedName.Builder.class);
  }

  private int bitField0_;
  public static final int LG_FIELD_NUMBER = 1;
  private volatile java.lang.Object lg_;
  /**
   * <code>optional string lg = 1;</code>
   * @return Whether the lg field is set.
   */
  @java.lang.Override
  public boolean hasLg() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string lg = 1;</code>
   * @return The lg.
   */
  @java.lang.Override
  public java.lang.String getLg() {
    java.lang.Object ref = lg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        lg_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string lg = 1;</code>
   * @return The bytes for lg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLgBytes() {
    java.lang.Object ref = lg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LC_FIELD_NUMBER = 2;
  private volatile java.lang.Object lc_;
  /**
   * <code>optional string lc = 2;</code>
   * @return Whether the lc field is set.
   */
  @java.lang.Override
  public boolean hasLc() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string lc = 2;</code>
   * @return The lc.
   */
  @java.lang.Override
  public java.lang.String getLc() {
    java.lang.Object ref = lc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        lc_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string lc = 2;</code>
   * @return The bytes for lc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLcBytes() {
    java.lang.Object ref = lc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERIFIEDNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object verifiedName_;
  /**
   * <code>optional string verifiedName = 3;</code>
   * @return Whether the verifiedName field is set.
   */
  @java.lang.Override
  public boolean hasVerifiedName() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string verifiedName = 3;</code>
   * @return The verifiedName.
   */
  @java.lang.Override
  public java.lang.String getVerifiedName() {
    java.lang.Object ref = verifiedName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        verifiedName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string verifiedName = 3;</code>
   * @return The bytes for verifiedName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVerifiedNameBytes() {
    java.lang.Object ref = verifiedName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      verifiedName_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lg_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lc_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, verifiedName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lg_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lc_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, verifiedName_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.LocalizedName)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.LocalizedName other = (br.com.zapia.wpp.api.ws.binary.protos.LocalizedName) obj;

    if (hasLg() != other.hasLg()) return false;
    if (hasLg()) {
      if (!getLg()
          .equals(other.getLg())) return false;
    }
    if (hasLc() != other.hasLc()) return false;
    if (hasLc()) {
      if (!getLc()
          .equals(other.getLc())) return false;
    }
    if (hasVerifiedName() != other.hasVerifiedName()) return false;
    if (hasVerifiedName()) {
      if (!getVerifiedName()
          .equals(other.getVerifiedName())) return false;
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
    if (hasLg()) {
      hash = (37 * hash) + LG_FIELD_NUMBER;
      hash = (53 * hash) + getLg().hashCode();
    }
    if (hasLc()) {
      hash = (37 * hash) + LC_FIELD_NUMBER;
      hash = (53 * hash) + getLc().hashCode();
    }
    if (hasVerifiedName()) {
      hash = (37 * hash) + VERIFIEDNAME_FIELD_NUMBER;
      hash = (53 * hash) + getVerifiedName().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.LocalizedName prototype) {
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
   * Protobuf type {@code binary.LocalizedName}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.LocalizedName)
      br.com.zapia.wpp.api.ws.binary.protos.LocalizedNameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_LocalizedName_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_LocalizedName_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.LocalizedName.class, br.com.zapia.wpp.api.ws.binary.protos.LocalizedName.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.LocalizedName.newBuilder()
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
      lg_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      lc_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      verifiedName_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_LocalizedName_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.LocalizedName getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.LocalizedName.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.LocalizedName build() {
      br.com.zapia.wpp.api.ws.binary.protos.LocalizedName result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.LocalizedName buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.LocalizedName result = new br.com.zapia.wpp.api.ws.binary.protos.LocalizedName(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.lg_ = lg_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.lc_ = lc_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.verifiedName_ = verifiedName_;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.LocalizedName) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.LocalizedName)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.LocalizedName other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.LocalizedName.getDefaultInstance()) return this;
      if (other.hasLg()) {
        bitField0_ |= 0x00000001;
        lg_ = other.lg_;
        onChanged();
      }
      if (other.hasLc()) {
        bitField0_ |= 0x00000002;
        lc_ = other.lc_;
        onChanged();
      }
      if (other.hasVerifiedName()) {
        bitField0_ |= 0x00000004;
        verifiedName_ = other.verifiedName_;
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
      br.com.zapia.wpp.api.ws.binary.protos.LocalizedName parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.LocalizedName) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object lg_ = "";
    /**
     * <code>optional string lg = 1;</code>
     * @return Whether the lg field is set.
     */
    public boolean hasLg() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string lg = 1;</code>
     * @return The lg.
     */
    public java.lang.String getLg() {
      java.lang.Object ref = lg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          lg_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string lg = 1;</code>
     * @return The bytes for lg.
     */
    public com.google.protobuf.ByteString
        getLgBytes() {
      java.lang.Object ref = lg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string lg = 1;</code>
     * @param value The lg to set.
     * @return This builder for chaining.
     */
    public Builder setLg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      lg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string lg = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLg() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lg_ = getDefaultInstance().getLg();
      onChanged();
      return this;
    }
    /**
     * <code>optional string lg = 1;</code>
     * @param value The bytes for lg to set.
     * @return This builder for chaining.
     */
    public Builder setLgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      lg_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lc_ = "";
    /**
     * <code>optional string lc = 2;</code>
     * @return Whether the lc field is set.
     */
    public boolean hasLc() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string lc = 2;</code>
     * @return The lc.
     */
    public java.lang.String getLc() {
      java.lang.Object ref = lc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          lc_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string lc = 2;</code>
     * @return The bytes for lc.
     */
    public com.google.protobuf.ByteString
        getLcBytes() {
      java.lang.Object ref = lc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string lc = 2;</code>
     * @param value The lc to set.
     * @return This builder for chaining.
     */
    public Builder setLc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      lc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string lc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLc() {
      bitField0_ = (bitField0_ & ~0x00000002);
      lc_ = getDefaultInstance().getLc();
      onChanged();
      return this;
    }
    /**
     * <code>optional string lc = 2;</code>
     * @param value The bytes for lc to set.
     * @return This builder for chaining.
     */
    public Builder setLcBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      lc_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object verifiedName_ = "";
    /**
     * <code>optional string verifiedName = 3;</code>
     * @return Whether the verifiedName field is set.
     */
    public boolean hasVerifiedName() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string verifiedName = 3;</code>
     * @return The verifiedName.
     */
    public java.lang.String getVerifiedName() {
      java.lang.Object ref = verifiedName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          verifiedName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string verifiedName = 3;</code>
     * @return The bytes for verifiedName.
     */
    public com.google.protobuf.ByteString
        getVerifiedNameBytes() {
      java.lang.Object ref = verifiedName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verifiedName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string verifiedName = 3;</code>
     * @param value The verifiedName to set.
     * @return This builder for chaining.
     */
    public Builder setVerifiedName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      verifiedName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string verifiedName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerifiedName() {
      bitField0_ = (bitField0_ & ~0x00000004);
      verifiedName_ = getDefaultInstance().getVerifiedName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string verifiedName = 3;</code>
     * @param value The bytes for verifiedName to set.
     * @return This builder for chaining.
     */
    public Builder setVerifiedNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      verifiedName_ = value;
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


    // @@protoc_insertion_point(builder_scope:binary.LocalizedName)
  }

  // @@protoc_insertion_point(class_scope:binary.LocalizedName)
  private static final br.com.zapia.wpp.api.ws.binary.protos.LocalizedName DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.LocalizedName();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.LocalizedName getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LocalizedName>
      PARSER = new com.google.protobuf.AbstractParser<LocalizedName>() {
    @java.lang.Override
    public LocalizedName parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LocalizedName(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocalizedName> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalizedName> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.LocalizedName getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
