// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface SendPaymentMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.SendPaymentMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.Message noteMessage = 2;</code>
   * @return Whether the noteMessage field is set.
   */
  boolean hasNoteMessage();
  /**
   * <code>optional .binary.Message noteMessage = 2;</code>
   * @return The noteMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.Message getNoteMessage();
  /**
   * <code>optional .binary.Message noteMessage = 2;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.MessageOrBuilder getNoteMessageOrBuilder();

  /**
   * <code>optional .binary.MessageKey requestMessageKey = 3;</code>
   * @return Whether the requestMessageKey field is set.
   */
  boolean hasRequestMessageKey();
  /**
   * <code>optional .binary.MessageKey requestMessageKey = 3;</code>
   * @return The requestMessageKey.
   */
  br.com.zapia.wpp.api.ws.binary.protos.MessageKey getRequestMessageKey();
  /**
   * <code>optional .binary.MessageKey requestMessageKey = 3;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.MessageKeyOrBuilder getRequestMessageKeyOrBuilder();

  /**
   * <code>optional .binary.PaymentBackground background = 4;</code>
   * @return Whether the background field is set.
   */
  boolean hasBackground();
  /**
   * <code>optional .binary.PaymentBackground background = 4;</code>
   * @return The background.
   */
  br.com.zapia.wpp.api.ws.binary.protos.PaymentBackground getBackground();
  /**
   * <code>optional .binary.PaymentBackground background = 4;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.PaymentBackgroundOrBuilder getBackgroundOrBuilder();
}