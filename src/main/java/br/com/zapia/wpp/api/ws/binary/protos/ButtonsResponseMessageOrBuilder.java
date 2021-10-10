// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface ButtonsResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.ButtonsResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string selectedButtonId = 1;</code>
   * @return Whether the selectedButtonId field is set.
   */
  boolean hasSelectedButtonId();
  /**
   * <code>optional string selectedButtonId = 1;</code>
   * @return The selectedButtonId.
   */
  java.lang.String getSelectedButtonId();
  /**
   * <code>optional string selectedButtonId = 1;</code>
   * @return The bytes for selectedButtonId.
   */
  com.google.protobuf.ByteString
      getSelectedButtonIdBytes();

  /**
   * <code>optional .binary.ContextInfo contextInfo = 3;</code>
   * @return Whether the contextInfo field is set.
   */
  boolean hasContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 3;</code>
   * @return The contextInfo.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContextInfo getContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 3;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContextInfoOrBuilder getContextInfoOrBuilder();

  /**
   * <code>optional .binary.ButtonsResponseMessage.ButtonsResponseMessageType type = 4;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional .binary.ButtonsResponseMessage.ButtonsResponseMessageType type = 4;</code>
   * @return The type.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ButtonsResponseMessage.ButtonsResponseMessageType getType();

  /**
   * <code>string selectedDisplayText = 2;</code>
   * @return Whether the selectedDisplayText field is set.
   */
  boolean hasSelectedDisplayText();
  /**
   * <code>string selectedDisplayText = 2;</code>
   * @return The selectedDisplayText.
   */
  java.lang.String getSelectedDisplayText();
  /**
   * <code>string selectedDisplayText = 2;</code>
   * @return The bytes for selectedDisplayText.
   */
  com.google.protobuf.ByteString
      getSelectedDisplayTextBytes();

  public br.com.zapia.wpp.api.ws.binary.protos.ButtonsResponseMessage.ResponseCase getResponseCase();
}