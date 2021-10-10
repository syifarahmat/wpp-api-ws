// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.MuteAction}
 */
public final class MuteAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.MuteAction)
    MuteActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MuteAction.newBuilder() to construct.
  private MuteAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MuteAction() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MuteAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MuteAction(
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
            muted_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            muteEndTimestamp_ = input.readInt64();
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
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MuteAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MuteAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.MuteAction.class, br.com.zapia.wpp.api.ws.binary.protos.MuteAction.Builder.class);
  }

  private int bitField0_;
  public static final int MUTED_FIELD_NUMBER = 1;
  private boolean muted_;
  /**
   * <code>optional bool muted = 1;</code>
   * @return Whether the muted field is set.
   */
  @java.lang.Override
  public boolean hasMuted() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional bool muted = 1;</code>
   * @return The muted.
   */
  @java.lang.Override
  public boolean getMuted() {
    return muted_;
  }

  public static final int MUTEENDTIMESTAMP_FIELD_NUMBER = 2;
  private long muteEndTimestamp_;
  /**
   * <code>optional int64 muteEndTimestamp = 2;</code>
   * @return Whether the muteEndTimestamp field is set.
   */
  @java.lang.Override
  public boolean hasMuteEndTimestamp() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 muteEndTimestamp = 2;</code>
   * @return The muteEndTimestamp.
   */
  @java.lang.Override
  public long getMuteEndTimestamp() {
    return muteEndTimestamp_;
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
      output.writeBool(1, muted_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, muteEndTimestamp_);
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
        .computeBoolSize(1, muted_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, muteEndTimestamp_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.MuteAction)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.MuteAction other = (br.com.zapia.wpp.api.ws.binary.protos.MuteAction) obj;

    if (hasMuted() != other.hasMuted()) return false;
    if (hasMuted()) {
      if (getMuted()
          != other.getMuted()) return false;
    }
    if (hasMuteEndTimestamp() != other.hasMuteEndTimestamp()) return false;
    if (hasMuteEndTimestamp()) {
      if (getMuteEndTimestamp()
          != other.getMuteEndTimestamp()) return false;
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
    if (hasMuted()) {
      hash = (37 * hash) + MUTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMuted());
    }
    if (hasMuteEndTimestamp()) {
      hash = (37 * hash) + MUTEENDTIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMuteEndTimestamp());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.MuteAction prototype) {
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
   * Protobuf type {@code binary.MuteAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.MuteAction)
      br.com.zapia.wpp.api.ws.binary.protos.MuteActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MuteAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MuteAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.MuteAction.class, br.com.zapia.wpp.api.ws.binary.protos.MuteAction.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.MuteAction.newBuilder()
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
      muted_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      muteEndTimestamp_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_MuteAction_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.MuteAction getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.MuteAction.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.MuteAction build() {
      br.com.zapia.wpp.api.ws.binary.protos.MuteAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.MuteAction buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.MuteAction result = new br.com.zapia.wpp.api.ws.binary.protos.MuteAction(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.muted_ = muted_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.muteEndTimestamp_ = muteEndTimestamp_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.MuteAction) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.MuteAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.MuteAction other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.MuteAction.getDefaultInstance()) return this;
      if (other.hasMuted()) {
        setMuted(other.getMuted());
      }
      if (other.hasMuteEndTimestamp()) {
        setMuteEndTimestamp(other.getMuteEndTimestamp());
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
      br.com.zapia.wpp.api.ws.binary.protos.MuteAction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.MuteAction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean muted_ ;
    /**
     * <code>optional bool muted = 1;</code>
     * @return Whether the muted field is set.
     */
    @java.lang.Override
    public boolean hasMuted() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool muted = 1;</code>
     * @return The muted.
     */
    @java.lang.Override
    public boolean getMuted() {
      return muted_;
    }
    /**
     * <code>optional bool muted = 1;</code>
     * @param value The muted to set.
     * @return This builder for chaining.
     */
    public Builder setMuted(boolean value) {
      bitField0_ |= 0x00000001;
      muted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool muted = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMuted() {
      bitField0_ = (bitField0_ & ~0x00000001);
      muted_ = false;
      onChanged();
      return this;
    }

    private long muteEndTimestamp_ ;
    /**
     * <code>optional int64 muteEndTimestamp = 2;</code>
     * @return Whether the muteEndTimestamp field is set.
     */
    @java.lang.Override
    public boolean hasMuteEndTimestamp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 muteEndTimestamp = 2;</code>
     * @return The muteEndTimestamp.
     */
    @java.lang.Override
    public long getMuteEndTimestamp() {
      return muteEndTimestamp_;
    }
    /**
     * <code>optional int64 muteEndTimestamp = 2;</code>
     * @param value The muteEndTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setMuteEndTimestamp(long value) {
      bitField0_ |= 0x00000002;
      muteEndTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 muteEndTimestamp = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMuteEndTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000002);
      muteEndTimestamp_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:binary.MuteAction)
  }

  // @@protoc_insertion_point(class_scope:binary.MuteAction)
  private static final br.com.zapia.wpp.api.ws.binary.protos.MuteAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.MuteAction();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.MuteAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<MuteAction>
      PARSER = new com.google.protobuf.AbstractParser<MuteAction>() {
    @java.lang.Override
    public MuteAction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MuteAction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MuteAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MuteAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.MuteAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
