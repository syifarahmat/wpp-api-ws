// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface MessageContextInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.MessageContextInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.DeviceListMetadata deviceListMetadata = 1;</code>
   * @return Whether the deviceListMetadata field is set.
   */
  boolean hasDeviceListMetadata();
  /**
   * <code>optional .binary.DeviceListMetadata deviceListMetadata = 1;</code>
   * @return The deviceListMetadata.
   */
  br.com.zapia.wpp.api.ws.binary.protos.DeviceListMetadata getDeviceListMetadata();
  /**
   * <code>optional .binary.DeviceListMetadata deviceListMetadata = 1;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.DeviceListMetadataOrBuilder getDeviceListMetadataOrBuilder();

  /**
   * <code>optional int32 deviceListMetadataVersion = 2;</code>
   * @return Whether the deviceListMetadataVersion field is set.
   */
  boolean hasDeviceListMetadataVersion();
  /**
   * <code>optional int32 deviceListMetadataVersion = 2;</code>
   * @return The deviceListMetadataVersion.
   */
  int getDeviceListMetadataVersion();
}