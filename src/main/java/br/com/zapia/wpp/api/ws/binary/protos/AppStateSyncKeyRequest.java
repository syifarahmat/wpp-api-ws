// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.AppStateSyncKeyRequest}
 */
public final class AppStateSyncKeyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.AppStateSyncKeyRequest)
    AppStateSyncKeyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppStateSyncKeyRequest.newBuilder() to construct.
  private AppStateSyncKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppStateSyncKeyRequest() {
    keyIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppStateSyncKeyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppStateSyncKeyRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              keyIds_ = new java.util.ArrayList<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId>();
              mutable_bitField0_ |= 0x00000001;
            }
            keyIds_.add(
                input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        keyIds_ = java.util.Collections.unmodifiableList(keyIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest.class, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest.Builder.class);
  }

  public static final int KEYIDS_FIELD_NUMBER = 1;
  private java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId> keyIds_;
  /**
   * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId> getKeyIdsList() {
    return keyIds_;
  }
  /**
   * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder> 
      getKeyIdsOrBuilderList() {
    return keyIds_;
  }
  /**
   * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
   */
  @java.lang.Override
  public int getKeyIdsCount() {
    return keyIds_.size();
  }
  /**
   * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId getKeyIds(int index) {
    return keyIds_.get(index);
  }
  /**
   * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder getKeyIdsOrBuilder(
      int index) {
    return keyIds_.get(index);
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
    for (int i = 0; i < keyIds_.size(); i++) {
      output.writeMessage(1, keyIds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < keyIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, keyIds_.get(i));
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest other = (br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest) obj;

    if (!getKeyIdsList()
        .equals(other.getKeyIdsList())) return false;
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
    if (getKeyIdsCount() > 0) {
      hash = (37 * hash) + KEYIDS_FIELD_NUMBER;
      hash = (53 * hash) + getKeyIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest prototype) {
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
   * Protobuf type {@code binary.AppStateSyncKeyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.AppStateSyncKeyRequest)
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest.class, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest.newBuilder()
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
        getKeyIdsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (keyIdsBuilder_ == null) {
        keyIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        keyIdsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_AppStateSyncKeyRequest_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest build() {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest result = new br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest(this);
      int from_bitField0_ = bitField0_;
      if (keyIdsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          keyIds_ = java.util.Collections.unmodifiableList(keyIds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.keyIds_ = keyIds_;
      } else {
        result.keyIds_ = keyIdsBuilder_.build();
      }
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest.getDefaultInstance()) return this;
      if (keyIdsBuilder_ == null) {
        if (!other.keyIds_.isEmpty()) {
          if (keyIds_.isEmpty()) {
            keyIds_ = other.keyIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKeyIdsIsMutable();
            keyIds_.addAll(other.keyIds_);
          }
          onChanged();
        }
      } else {
        if (!other.keyIds_.isEmpty()) {
          if (keyIdsBuilder_.isEmpty()) {
            keyIdsBuilder_.dispose();
            keyIdsBuilder_ = null;
            keyIds_ = other.keyIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            keyIdsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKeyIdsFieldBuilder() : null;
          } else {
            keyIdsBuilder_.addAllMessages(other.keyIds_);
          }
        }
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
      br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId> keyIds_ =
      java.util.Collections.emptyList();
    private void ensureKeyIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        keyIds_ = new java.util.ArrayList<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId>(keyIds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder> keyIdsBuilder_;

    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId> getKeyIdsList() {
      if (keyIdsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(keyIds_);
      } else {
        return keyIdsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public int getKeyIdsCount() {
      if (keyIdsBuilder_ == null) {
        return keyIds_.size();
      } else {
        return keyIdsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId getKeyIds(int index) {
      if (keyIdsBuilder_ == null) {
        return keyIds_.get(index);
      } else {
        return keyIdsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder setKeyIds(
        int index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId value) {
      if (keyIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyIdsIsMutable();
        keyIds_.set(index, value);
        onChanged();
      } else {
        keyIdsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder setKeyIds(
        int index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder builderForValue) {
      if (keyIdsBuilder_ == null) {
        ensureKeyIdsIsMutable();
        keyIds_.set(index, builderForValue.build());
        onChanged();
      } else {
        keyIdsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder addKeyIds(br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId value) {
      if (keyIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyIdsIsMutable();
        keyIds_.add(value);
        onChanged();
      } else {
        keyIdsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder addKeyIds(
        int index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId value) {
      if (keyIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKeyIdsIsMutable();
        keyIds_.add(index, value);
        onChanged();
      } else {
        keyIdsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder addKeyIds(
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder builderForValue) {
      if (keyIdsBuilder_ == null) {
        ensureKeyIdsIsMutable();
        keyIds_.add(builderForValue.build());
        onChanged();
      } else {
        keyIdsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder addKeyIds(
        int index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder builderForValue) {
      if (keyIdsBuilder_ == null) {
        ensureKeyIdsIsMutable();
        keyIds_.add(index, builderForValue.build());
        onChanged();
      } else {
        keyIdsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder addAllKeyIds(
        java.lang.Iterable<? extends br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId> values) {
      if (keyIdsBuilder_ == null) {
        ensureKeyIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, keyIds_);
        onChanged();
      } else {
        keyIdsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder clearKeyIds() {
      if (keyIdsBuilder_ == null) {
        keyIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        keyIdsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public Builder removeKeyIds(int index) {
      if (keyIdsBuilder_ == null) {
        ensureKeyIdsIsMutable();
        keyIds_.remove(index);
        onChanged();
      } else {
        keyIdsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder getKeyIdsBuilder(
        int index) {
      return getKeyIdsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder getKeyIdsOrBuilder(
        int index) {
      if (keyIdsBuilder_ == null) {
        return keyIds_.get(index);  } else {
        return keyIdsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public java.util.List<? extends br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder> 
         getKeyIdsOrBuilderList() {
      if (keyIdsBuilder_ != null) {
        return keyIdsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(keyIds_);
      }
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder addKeyIdsBuilder() {
      return getKeyIdsFieldBuilder().addBuilder(
          br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder addKeyIdsBuilder(
        int index) {
      return getKeyIdsFieldBuilder().addBuilder(
          index, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.AppStateSyncKeyId keyIds = 1;</code>
     */
    public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder> 
         getKeyIdsBuilderList() {
      return getKeyIdsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder> 
        getKeyIdsFieldBuilder() {
      if (keyIdsBuilder_ == null) {
        keyIdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId.Builder, br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder>(
                keyIds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        keyIds_ = null;
      }
      return keyIdsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:binary.AppStateSyncKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:binary.AppStateSyncKeyRequest)
  private static final br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AppStateSyncKeyRequest>
      PARSER = new com.google.protobuf.AbstractParser<AppStateSyncKeyRequest>() {
    @java.lang.Override
    public AppStateSyncKeyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppStateSyncKeyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppStateSyncKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppStateSyncKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
