// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface ClearChatActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.ClearChatAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.SyncActionMessageRange messageRange = 1;</code>
   * @return Whether the messageRange field is set.
   */
  boolean hasMessageRange();
  /**
   * <code>optional .binary.SyncActionMessageRange messageRange = 1;</code>
   * @return The messageRange.
   */
  br.com.zapia.wpp.api.ws.binary.protos.SyncActionMessageRange getMessageRange();
  /**
   * <code>optional .binary.SyncActionMessageRange messageRange = 1;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.SyncActionMessageRangeOrBuilder getMessageRangeOrBuilder();
}