// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

/**
 * Protobuf type {@code binary.InteractiveAnnotation}
 */
public final class InteractiveAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:binary.InteractiveAnnotation)
    InteractiveAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InteractiveAnnotation.newBuilder() to construct.
  private InteractiveAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InteractiveAnnotation() {
    polygonVertices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InteractiveAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InteractiveAnnotation(
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
              polygonVertices_ = new java.util.ArrayList<br.com.zapia.wpp.api.ws.binary.protos.Point>();
              mutable_bitField0_ |= 0x00000001;
            }
            polygonVertices_.add(
                input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.Point.PARSER, extensionRegistry));
            break;
          }
          case 18: {
            br.com.zapia.wpp.api.ws.binary.protos.Location.Builder subBuilder = null;
            if (actionCase_ == 2) {
              subBuilder = ((br.com.zapia.wpp.api.ws.binary.protos.Location) action_).toBuilder();
            }
            action_ =
                input.readMessage(br.com.zapia.wpp.api.ws.binary.protos.Location.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.Location) action_);
              action_ = subBuilder.buildPartial();
            }
            actionCase_ = 2;
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
        polygonVertices_ = java.util.Collections.unmodifiableList(polygonVertices_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_InteractiveAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_InteractiveAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation.class, br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation.Builder.class);
  }

  private int bitField0_;
  private int actionCase_ = 0;
  private java.lang.Object action_;
  public enum ActionCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LOCATION(2),
    ACTION_NOT_SET(0);
    private final int value;
    private ActionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ActionCase valueOf(int value) {
      return forNumber(value);
    }

    public static ActionCase forNumber(int value) {
      switch (value) {
        case 2: return LOCATION;
        case 0: return ACTION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ActionCase
  getActionCase() {
    return ActionCase.forNumber(
        actionCase_);
  }

  public static final int POLYGONVERTICES_FIELD_NUMBER = 1;
  private java.util.List<br.com.zapia.wpp.api.ws.binary.protos.Point> polygonVertices_;
  /**
   * <code>repeated .binary.Point polygonVertices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.Point> getPolygonVerticesList() {
    return polygonVertices_;
  }
  /**
   * <code>repeated .binary.Point polygonVertices = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends br.com.zapia.wpp.api.ws.binary.protos.PointOrBuilder> 
      getPolygonVerticesOrBuilderList() {
    return polygonVertices_;
  }
  /**
   * <code>repeated .binary.Point polygonVertices = 1;</code>
   */
  @java.lang.Override
  public int getPolygonVerticesCount() {
    return polygonVertices_.size();
  }
  /**
   * <code>repeated .binary.Point polygonVertices = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.Point getPolygonVertices(int index) {
    return polygonVertices_.get(index);
  }
  /**
   * <code>repeated .binary.Point polygonVertices = 1;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.PointOrBuilder getPolygonVerticesOrBuilder(
      int index) {
    return polygonVertices_.get(index);
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  /**
   * <code>.binary.Location location = 2;</code>
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return actionCase_ == 2;
  }
  /**
   * <code>.binary.Location location = 2;</code>
   * @return The location.
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.Location getLocation() {
    if (actionCase_ == 2) {
       return (br.com.zapia.wpp.api.ws.binary.protos.Location) action_;
    }
    return br.com.zapia.wpp.api.ws.binary.protos.Location.getDefaultInstance();
  }
  /**
   * <code>.binary.Location location = 2;</code>
   */
  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.LocationOrBuilder getLocationOrBuilder() {
    if (actionCase_ == 2) {
       return (br.com.zapia.wpp.api.ws.binary.protos.Location) action_;
    }
    return br.com.zapia.wpp.api.ws.binary.protos.Location.getDefaultInstance();
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
    for (int i = 0; i < polygonVertices_.size(); i++) {
      output.writeMessage(1, polygonVertices_.get(i));
    }
    if (actionCase_ == 2) {
      output.writeMessage(2, (br.com.zapia.wpp.api.ws.binary.protos.Location) action_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < polygonVertices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, polygonVertices_.get(i));
    }
    if (actionCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (br.com.zapia.wpp.api.ws.binary.protos.Location) action_);
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
    if (!(obj instanceof br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation)) {
      return super.equals(obj);
    }
    br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation other = (br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation) obj;

    if (!getPolygonVerticesList()
        .equals(other.getPolygonVerticesList())) return false;
    if (!getActionCase().equals(other.getActionCase())) return false;
    switch (actionCase_) {
      case 2:
        if (!getLocation()
            .equals(other.getLocation())) return false;
        break;
      case 0:
      default:
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
    if (getPolygonVerticesCount() > 0) {
      hash = (37 * hash) + POLYGONVERTICES_FIELD_NUMBER;
      hash = (53 * hash) + getPolygonVerticesList().hashCode();
    }
    switch (actionCase_) {
      case 2:
        hash = (37 * hash) + LOCATION_FIELD_NUMBER;
        hash = (53 * hash) + getLocation().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parseFrom(
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
  public static Builder newBuilder(br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation prototype) {
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
   * Protobuf type {@code binary.InteractiveAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:binary.InteractiveAnnotation)
      br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_InteractiveAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_InteractiveAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation.class, br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation.Builder.class);
    }

    // Construct using br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation.newBuilder()
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
        getPolygonVerticesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (polygonVerticesBuilder_ == null) {
        polygonVertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        polygonVerticesBuilder_.clear();
      }
      actionCase_ = 0;
      action_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.WaMessageProtos.internal_static_binary_InteractiveAnnotation_descriptor;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation getDefaultInstanceForType() {
      return br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation build() {
      br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation buildPartial() {
      br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation result = new br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (polygonVerticesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          polygonVertices_ = java.util.Collections.unmodifiableList(polygonVertices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.polygonVertices_ = polygonVertices_;
      } else {
        result.polygonVertices_ = polygonVerticesBuilder_.build();
      }
      if (actionCase_ == 2) {
        if (locationBuilder_ == null) {
          result.action_ = action_;
        } else {
          result.action_ = locationBuilder_.build();
        }
      }
      result.bitField0_ = to_bitField0_;
      result.actionCase_ = actionCase_;
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
      if (other instanceof br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation) {
        return mergeFrom((br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation other) {
      if (other == br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation.getDefaultInstance()) return this;
      if (polygonVerticesBuilder_ == null) {
        if (!other.polygonVertices_.isEmpty()) {
          if (polygonVertices_.isEmpty()) {
            polygonVertices_ = other.polygonVertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePolygonVerticesIsMutable();
            polygonVertices_.addAll(other.polygonVertices_);
          }
          onChanged();
        }
      } else {
        if (!other.polygonVertices_.isEmpty()) {
          if (polygonVerticesBuilder_.isEmpty()) {
            polygonVerticesBuilder_.dispose();
            polygonVerticesBuilder_ = null;
            polygonVertices_ = other.polygonVertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            polygonVerticesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPolygonVerticesFieldBuilder() : null;
          } else {
            polygonVerticesBuilder_.addAllMessages(other.polygonVertices_);
          }
        }
      }
      switch (other.getActionCase()) {
        case LOCATION: {
          mergeLocation(other.getLocation());
          break;
        }
        case ACTION_NOT_SET: {
          break;
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
      br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int actionCase_ = 0;
    private java.lang.Object action_;
    public ActionCase
        getActionCase() {
      return ActionCase.forNumber(
          actionCase_);
    }

    public Builder clearAction() {
      actionCase_ = 0;
      action_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.util.List<br.com.zapia.wpp.api.ws.binary.protos.Point> polygonVertices_ =
      java.util.Collections.emptyList();
    private void ensurePolygonVerticesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        polygonVertices_ = new java.util.ArrayList<br.com.zapia.wpp.api.ws.binary.protos.Point>(polygonVertices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.Point, br.com.zapia.wpp.api.ws.binary.protos.Point.Builder, br.com.zapia.wpp.api.ws.binary.protos.PointOrBuilder> polygonVerticesBuilder_;

    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.Point> getPolygonVerticesList() {
      if (polygonVerticesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(polygonVertices_);
      } else {
        return polygonVerticesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public int getPolygonVerticesCount() {
      if (polygonVerticesBuilder_ == null) {
        return polygonVertices_.size();
      } else {
        return polygonVerticesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.Point getPolygonVertices(int index) {
      if (polygonVerticesBuilder_ == null) {
        return polygonVertices_.get(index);
      } else {
        return polygonVerticesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder setPolygonVertices(
        int index, br.com.zapia.wpp.api.ws.binary.protos.Point value) {
      if (polygonVerticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonVerticesIsMutable();
        polygonVertices_.set(index, value);
        onChanged();
      } else {
        polygonVerticesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder setPolygonVertices(
        int index, br.com.zapia.wpp.api.ws.binary.protos.Point.Builder builderForValue) {
      if (polygonVerticesBuilder_ == null) {
        ensurePolygonVerticesIsMutable();
        polygonVertices_.set(index, builderForValue.build());
        onChanged();
      } else {
        polygonVerticesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder addPolygonVertices(br.com.zapia.wpp.api.ws.binary.protos.Point value) {
      if (polygonVerticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonVerticesIsMutable();
        polygonVertices_.add(value);
        onChanged();
      } else {
        polygonVerticesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder addPolygonVertices(
        int index, br.com.zapia.wpp.api.ws.binary.protos.Point value) {
      if (polygonVerticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolygonVerticesIsMutable();
        polygonVertices_.add(index, value);
        onChanged();
      } else {
        polygonVerticesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder addPolygonVertices(
        br.com.zapia.wpp.api.ws.binary.protos.Point.Builder builderForValue) {
      if (polygonVerticesBuilder_ == null) {
        ensurePolygonVerticesIsMutable();
        polygonVertices_.add(builderForValue.build());
        onChanged();
      } else {
        polygonVerticesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder addPolygonVertices(
        int index, br.com.zapia.wpp.api.ws.binary.protos.Point.Builder builderForValue) {
      if (polygonVerticesBuilder_ == null) {
        ensurePolygonVerticesIsMutable();
        polygonVertices_.add(index, builderForValue.build());
        onChanged();
      } else {
        polygonVerticesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder addAllPolygonVertices(
        java.lang.Iterable<? extends br.com.zapia.wpp.api.ws.binary.protos.Point> values) {
      if (polygonVerticesBuilder_ == null) {
        ensurePolygonVerticesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, polygonVertices_);
        onChanged();
      } else {
        polygonVerticesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder clearPolygonVertices() {
      if (polygonVerticesBuilder_ == null) {
        polygonVertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        polygonVerticesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public Builder removePolygonVertices(int index) {
      if (polygonVerticesBuilder_ == null) {
        ensurePolygonVerticesIsMutable();
        polygonVertices_.remove(index);
        onChanged();
      } else {
        polygonVerticesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.Point.Builder getPolygonVerticesBuilder(
        int index) {
      return getPolygonVerticesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.PointOrBuilder getPolygonVerticesOrBuilder(
        int index) {
      if (polygonVerticesBuilder_ == null) {
        return polygonVertices_.get(index);  } else {
        return polygonVerticesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public java.util.List<? extends br.com.zapia.wpp.api.ws.binary.protos.PointOrBuilder> 
         getPolygonVerticesOrBuilderList() {
      if (polygonVerticesBuilder_ != null) {
        return polygonVerticesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(polygonVertices_);
      }
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.Point.Builder addPolygonVerticesBuilder() {
      return getPolygonVerticesFieldBuilder().addBuilder(
          br.com.zapia.wpp.api.ws.binary.protos.Point.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.Point.Builder addPolygonVerticesBuilder(
        int index) {
      return getPolygonVerticesFieldBuilder().addBuilder(
          index, br.com.zapia.wpp.api.ws.binary.protos.Point.getDefaultInstance());
    }
    /**
     * <code>repeated .binary.Point polygonVertices = 1;</code>
     */
    public java.util.List<br.com.zapia.wpp.api.ws.binary.protos.Point.Builder> 
         getPolygonVerticesBuilderList() {
      return getPolygonVerticesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.Point, br.com.zapia.wpp.api.ws.binary.protos.Point.Builder, br.com.zapia.wpp.api.ws.binary.protos.PointOrBuilder> 
        getPolygonVerticesFieldBuilder() {
      if (polygonVerticesBuilder_ == null) {
        polygonVerticesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.Point, br.com.zapia.wpp.api.ws.binary.protos.Point.Builder, br.com.zapia.wpp.api.ws.binary.protos.PointOrBuilder>(
                polygonVertices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        polygonVertices_ = null;
      }
      return polygonVerticesBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.Location, br.com.zapia.wpp.api.ws.binary.protos.Location.Builder, br.com.zapia.wpp.api.ws.binary.protos.LocationOrBuilder> locationBuilder_;
    /**
     * <code>.binary.Location location = 2;</code>
     * @return Whether the location field is set.
     */
    @java.lang.Override
    public boolean hasLocation() {
      return actionCase_ == 2;
    }
    /**
     * <code>.binary.Location location = 2;</code>
     * @return The location.
     */
    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.Location getLocation() {
      if (locationBuilder_ == null) {
        if (actionCase_ == 2) {
          return (br.com.zapia.wpp.api.ws.binary.protos.Location) action_;
        }
        return br.com.zapia.wpp.api.ws.binary.protos.Location.getDefaultInstance();
      } else {
        if (actionCase_ == 2) {
          return locationBuilder_.getMessage();
        }
        return br.com.zapia.wpp.api.ws.binary.protos.Location.getDefaultInstance();
      }
    }
    /**
     * <code>.binary.Location location = 2;</code>
     */
    public Builder setLocation(br.com.zapia.wpp.api.ws.binary.protos.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }
      actionCase_ = 2;
      return this;
    }
    /**
     * <code>.binary.Location location = 2;</code>
     */
    public Builder setLocation(
        br.com.zapia.wpp.api.ws.binary.protos.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      actionCase_ = 2;
      return this;
    }
    /**
     * <code>.binary.Location location = 2;</code>
     */
    public Builder mergeLocation(br.com.zapia.wpp.api.ws.binary.protos.Location value) {
      if (locationBuilder_ == null) {
        if (actionCase_ == 2 &&
            action_ != br.com.zapia.wpp.api.ws.binary.protos.Location.getDefaultInstance()) {
          action_ = br.com.zapia.wpp.api.ws.binary.protos.Location.newBuilder((br.com.zapia.wpp.api.ws.binary.protos.Location) action_)
              .mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        if (actionCase_ == 2) {
          locationBuilder_.mergeFrom(value);
        }
        locationBuilder_.setMessage(value);
      }
      actionCase_ = 2;
      return this;
    }
    /**
     * <code>.binary.Location location = 2;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        if (actionCase_ == 2) {
          actionCase_ = 0;
          action_ = null;
          onChanged();
        }
      } else {
        if (actionCase_ == 2) {
          actionCase_ = 0;
          action_ = null;
        }
        locationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.binary.Location location = 2;</code>
     */
    public br.com.zapia.wpp.api.ws.binary.protos.Location.Builder getLocationBuilder() {
      return getLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.binary.Location location = 2;</code>
     */
    @java.lang.Override
    public br.com.zapia.wpp.api.ws.binary.protos.LocationOrBuilder getLocationOrBuilder() {
      if ((actionCase_ == 2) && (locationBuilder_ != null)) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        if (actionCase_ == 2) {
          return (br.com.zapia.wpp.api.ws.binary.protos.Location) action_;
        }
        return br.com.zapia.wpp.api.ws.binary.protos.Location.getDefaultInstance();
      }
    }
    /**
     * <code>.binary.Location location = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.zapia.wpp.api.ws.binary.protos.Location, br.com.zapia.wpp.api.ws.binary.protos.Location.Builder, br.com.zapia.wpp.api.ws.binary.protos.LocationOrBuilder> 
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        if (!(actionCase_ == 2)) {
          action_ = br.com.zapia.wpp.api.ws.binary.protos.Location.getDefaultInstance();
        }
        locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.zapia.wpp.api.ws.binary.protos.Location, br.com.zapia.wpp.api.ws.binary.protos.Location.Builder, br.com.zapia.wpp.api.ws.binary.protos.LocationOrBuilder>(
                (br.com.zapia.wpp.api.ws.binary.protos.Location) action_,
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      actionCase_ = 2;
      onChanged();;
      return locationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:binary.InteractiveAnnotation)
  }

  // @@protoc_insertion_point(class_scope:binary.InteractiveAnnotation)
  private static final br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation();
  }

  public static br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<InteractiveAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<InteractiveAnnotation>() {
    @java.lang.Override
    public InteractiveAnnotation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InteractiveAnnotation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InteractiveAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InteractiveAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zapia.wpp.api.ws.binary.protos.InteractiveAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
