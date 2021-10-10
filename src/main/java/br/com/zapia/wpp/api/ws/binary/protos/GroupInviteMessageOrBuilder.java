// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface GroupInviteMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.GroupInviteMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string groupJid = 1;</code>
   * @return Whether the groupJid field is set.
   */
  boolean hasGroupJid();
  /**
   * <code>optional string groupJid = 1;</code>
   * @return The groupJid.
   */
  java.lang.String getGroupJid();
  /**
   * <code>optional string groupJid = 1;</code>
   * @return The bytes for groupJid.
   */
  com.google.protobuf.ByteString
      getGroupJidBytes();

  /**
   * <code>optional string inviteCode = 2;</code>
   * @return Whether the inviteCode field is set.
   */
  boolean hasInviteCode();
  /**
   * <code>optional string inviteCode = 2;</code>
   * @return The inviteCode.
   */
  java.lang.String getInviteCode();
  /**
   * <code>optional string inviteCode = 2;</code>
   * @return The bytes for inviteCode.
   */
  com.google.protobuf.ByteString
      getInviteCodeBytes();

  /**
   * <code>optional int64 inviteExpiration = 3;</code>
   * @return Whether the inviteExpiration field is set.
   */
  boolean hasInviteExpiration();
  /**
   * <code>optional int64 inviteExpiration = 3;</code>
   * @return The inviteExpiration.
   */
  long getInviteExpiration();

  /**
   * <code>optional string groupName = 4;</code>
   * @return Whether the groupName field is set.
   */
  boolean hasGroupName();
  /**
   * <code>optional string groupName = 4;</code>
   * @return The groupName.
   */
  java.lang.String getGroupName();
  /**
   * <code>optional string groupName = 4;</code>
   * @return The bytes for groupName.
   */
  com.google.protobuf.ByteString
      getGroupNameBytes();

  /**
   * <code>optional bytes jpegThumbnail = 5;</code>
   * @return Whether the jpegThumbnail field is set.
   */
  boolean hasJpegThumbnail();
  /**
   * <code>optional bytes jpegThumbnail = 5;</code>
   * @return The jpegThumbnail.
   */
  com.google.protobuf.ByteString getJpegThumbnail();

  /**
   * <code>optional string caption = 6;</code>
   * @return Whether the caption field is set.
   */
  boolean hasCaption();
  /**
   * <code>optional string caption = 6;</code>
   * @return The caption.
   */
  java.lang.String getCaption();
  /**
   * <code>optional string caption = 6;</code>
   * @return The bytes for caption.
   */
  com.google.protobuf.ByteString
      getCaptionBytes();

  /**
   * <code>optional .binary.ContextInfo contextInfo = 7;</code>
   * @return Whether the contextInfo field is set.
   */
  boolean hasContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 7;</code>
   * @return The contextInfo.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContextInfo getContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 7;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContextInfoOrBuilder getContextInfoOrBuilder();
}