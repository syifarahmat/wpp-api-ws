// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string conversation = 1;</code>
   * @return Whether the conversation field is set.
   */
  boolean hasConversation();
  /**
   * <code>optional string conversation = 1;</code>
   * @return The conversation.
   */
  java.lang.String getConversation();
  /**
   * <code>optional string conversation = 1;</code>
   * @return The bytes for conversation.
   */
  com.google.protobuf.ByteString
      getConversationBytes();

  /**
   * <code>optional .binary.SenderKeyDistributionMessage senderKeyDistributionMessage = 2;</code>
   * @return Whether the senderKeyDistributionMessage field is set.
   */
  boolean hasSenderKeyDistributionMessage();
  /**
   * <code>optional .binary.SenderKeyDistributionMessage senderKeyDistributionMessage = 2;</code>
   * @return The senderKeyDistributionMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.SenderKeyDistributionMessage getSenderKeyDistributionMessage();
  /**
   * <code>optional .binary.SenderKeyDistributionMessage senderKeyDistributionMessage = 2;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.SenderKeyDistributionMessageOrBuilder getSenderKeyDistributionMessageOrBuilder();

  /**
   * <code>optional .binary.ImageMessage imageMessage = 3;</code>
   * @return Whether the imageMessage field is set.
   */
  boolean hasImageMessage();
  /**
   * <code>optional .binary.ImageMessage imageMessage = 3;</code>
   * @return The imageMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ImageMessage getImageMessage();
  /**
   * <code>optional .binary.ImageMessage imageMessage = 3;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ImageMessageOrBuilder getImageMessageOrBuilder();

  /**
   * <code>optional .binary.ContactMessage contactMessage = 4;</code>
   * @return Whether the contactMessage field is set.
   */
  boolean hasContactMessage();
  /**
   * <code>optional .binary.ContactMessage contactMessage = 4;</code>
   * @return The contactMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContactMessage getContactMessage();
  /**
   * <code>optional .binary.ContactMessage contactMessage = 4;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContactMessageOrBuilder getContactMessageOrBuilder();

  /**
   * <code>optional .binary.LocationMessage locationMessage = 5;</code>
   * @return Whether the locationMessage field is set.
   */
  boolean hasLocationMessage();
  /**
   * <code>optional .binary.LocationMessage locationMessage = 5;</code>
   * @return The locationMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.LocationMessage getLocationMessage();
  /**
   * <code>optional .binary.LocationMessage locationMessage = 5;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.LocationMessageOrBuilder getLocationMessageOrBuilder();

  /**
   * <code>optional .binary.ExtendedTextMessage extendedTextMessage = 6;</code>
   * @return Whether the extendedTextMessage field is set.
   */
  boolean hasExtendedTextMessage();
  /**
   * <code>optional .binary.ExtendedTextMessage extendedTextMessage = 6;</code>
   * @return The extendedTextMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ExtendedTextMessage getExtendedTextMessage();
  /**
   * <code>optional .binary.ExtendedTextMessage extendedTextMessage = 6;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ExtendedTextMessageOrBuilder getExtendedTextMessageOrBuilder();

  /**
   * <code>optional .binary.DocumentMessage documentMessage = 7;</code>
   * @return Whether the documentMessage field is set.
   */
  boolean hasDocumentMessage();
  /**
   * <code>optional .binary.DocumentMessage documentMessage = 7;</code>
   * @return The documentMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.DocumentMessage getDocumentMessage();
  /**
   * <code>optional .binary.DocumentMessage documentMessage = 7;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.DocumentMessageOrBuilder getDocumentMessageOrBuilder();

  /**
   * <code>optional .binary.AudioMessage audioMessage = 8;</code>
   * @return Whether the audioMessage field is set.
   */
  boolean hasAudioMessage();
  /**
   * <code>optional .binary.AudioMessage audioMessage = 8;</code>
   * @return The audioMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.AudioMessage getAudioMessage();
  /**
   * <code>optional .binary.AudioMessage audioMessage = 8;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.AudioMessageOrBuilder getAudioMessageOrBuilder();

  /**
   * <code>optional .binary.VideoMessage videoMessage = 9;</code>
   * @return Whether the videoMessage field is set.
   */
  boolean hasVideoMessage();
  /**
   * <code>optional .binary.VideoMessage videoMessage = 9;</code>
   * @return The videoMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.VideoMessage getVideoMessage();
  /**
   * <code>optional .binary.VideoMessage videoMessage = 9;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.VideoMessageOrBuilder getVideoMessageOrBuilder();

  /**
   * <code>optional .binary.Call call = 10;</code>
   * @return Whether the call field is set.
   */
  boolean hasCall();
  /**
   * <code>optional .binary.Call call = 10;</code>
   * @return The call.
   */
  br.com.zapia.wpp.api.ws.binary.protos.Call getCall();
  /**
   * <code>optional .binary.Call call = 10;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.CallOrBuilder getCallOrBuilder();

  /**
   * <code>optional .binary.Chat chat = 11;</code>
   * @return Whether the chat field is set.
   */
  boolean hasChat();
  /**
   * <code>optional .binary.Chat chat = 11;</code>
   * @return The chat.
   */
  br.com.zapia.wpp.api.ws.binary.protos.Chat getChat();
  /**
   * <code>optional .binary.Chat chat = 11;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ChatOrBuilder getChatOrBuilder();

  /**
   * <code>optional .binary.ProtocolMessage protocolMessage = 12;</code>
   * @return Whether the protocolMessage field is set.
   */
  boolean hasProtocolMessage();
  /**
   * <code>optional .binary.ProtocolMessage protocolMessage = 12;</code>
   * @return The protocolMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ProtocolMessage getProtocolMessage();
  /**
   * <code>optional .binary.ProtocolMessage protocolMessage = 12;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ProtocolMessageOrBuilder getProtocolMessageOrBuilder();

  /**
   * <code>optional .binary.ContactsArrayMessage contactsArrayMessage = 13;</code>
   * @return Whether the contactsArrayMessage field is set.
   */
  boolean hasContactsArrayMessage();
  /**
   * <code>optional .binary.ContactsArrayMessage contactsArrayMessage = 13;</code>
   * @return The contactsArrayMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContactsArrayMessage getContactsArrayMessage();
  /**
   * <code>optional .binary.ContactsArrayMessage contactsArrayMessage = 13;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContactsArrayMessageOrBuilder getContactsArrayMessageOrBuilder();

  /**
   * <code>optional .binary.HighlyStructuredMessage highlyStructuredMessage = 14;</code>
   * @return Whether the highlyStructuredMessage field is set.
   */
  boolean hasHighlyStructuredMessage();
  /**
   * <code>optional .binary.HighlyStructuredMessage highlyStructuredMessage = 14;</code>
   * @return The highlyStructuredMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.HighlyStructuredMessage getHighlyStructuredMessage();
  /**
   * <code>optional .binary.HighlyStructuredMessage highlyStructuredMessage = 14;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.HighlyStructuredMessageOrBuilder getHighlyStructuredMessageOrBuilder();

  /**
   * <code>optional .binary.SenderKeyDistributionMessage fastRatchetKeySenderKeyDistributionMessage = 15;</code>
   * @return Whether the fastRatchetKeySenderKeyDistributionMessage field is set.
   */
  boolean hasFastRatchetKeySenderKeyDistributionMessage();
  /**
   * <code>optional .binary.SenderKeyDistributionMessage fastRatchetKeySenderKeyDistributionMessage = 15;</code>
   * @return The fastRatchetKeySenderKeyDistributionMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.SenderKeyDistributionMessage getFastRatchetKeySenderKeyDistributionMessage();
  /**
   * <code>optional .binary.SenderKeyDistributionMessage fastRatchetKeySenderKeyDistributionMessage = 15;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.SenderKeyDistributionMessageOrBuilder getFastRatchetKeySenderKeyDistributionMessageOrBuilder();

  /**
   * <code>optional .binary.SendPaymentMessage sendPaymentMessage = 16;</code>
   * @return Whether the sendPaymentMessage field is set.
   */
  boolean hasSendPaymentMessage();
  /**
   * <code>optional .binary.SendPaymentMessage sendPaymentMessage = 16;</code>
   * @return The sendPaymentMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.SendPaymentMessage getSendPaymentMessage();
  /**
   * <code>optional .binary.SendPaymentMessage sendPaymentMessage = 16;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.SendPaymentMessageOrBuilder getSendPaymentMessageOrBuilder();

  /**
   * <code>optional .binary.LiveLocationMessage liveLocationMessage = 18;</code>
   * @return Whether the liveLocationMessage field is set.
   */
  boolean hasLiveLocationMessage();
  /**
   * <code>optional .binary.LiveLocationMessage liveLocationMessage = 18;</code>
   * @return The liveLocationMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.LiveLocationMessage getLiveLocationMessage();
  /**
   * <code>optional .binary.LiveLocationMessage liveLocationMessage = 18;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.LiveLocationMessageOrBuilder getLiveLocationMessageOrBuilder();

  /**
   * <code>optional .binary.RequestPaymentMessage requestPaymentMessage = 22;</code>
   * @return Whether the requestPaymentMessage field is set.
   */
  boolean hasRequestPaymentMessage();
  /**
   * <code>optional .binary.RequestPaymentMessage requestPaymentMessage = 22;</code>
   * @return The requestPaymentMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.RequestPaymentMessage getRequestPaymentMessage();
  /**
   * <code>optional .binary.RequestPaymentMessage requestPaymentMessage = 22;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.RequestPaymentMessageOrBuilder getRequestPaymentMessageOrBuilder();

  /**
   * <code>optional .binary.DeclinePaymentRequestMessage declinePaymentRequestMessage = 23;</code>
   * @return Whether the declinePaymentRequestMessage field is set.
   */
  boolean hasDeclinePaymentRequestMessage();
  /**
   * <code>optional .binary.DeclinePaymentRequestMessage declinePaymentRequestMessage = 23;</code>
   * @return The declinePaymentRequestMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.DeclinePaymentRequestMessage getDeclinePaymentRequestMessage();
  /**
   * <code>optional .binary.DeclinePaymentRequestMessage declinePaymentRequestMessage = 23;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.DeclinePaymentRequestMessageOrBuilder getDeclinePaymentRequestMessageOrBuilder();

  /**
   * <code>optional .binary.CancelPaymentRequestMessage cancelPaymentRequestMessage = 24;</code>
   * @return Whether the cancelPaymentRequestMessage field is set.
   */
  boolean hasCancelPaymentRequestMessage();
  /**
   * <code>optional .binary.CancelPaymentRequestMessage cancelPaymentRequestMessage = 24;</code>
   * @return The cancelPaymentRequestMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.CancelPaymentRequestMessage getCancelPaymentRequestMessage();
  /**
   * <code>optional .binary.CancelPaymentRequestMessage cancelPaymentRequestMessage = 24;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.CancelPaymentRequestMessageOrBuilder getCancelPaymentRequestMessageOrBuilder();

  /**
   * <code>optional .binary.TemplateMessage templateMessage = 25;</code>
   * @return Whether the templateMessage field is set.
   */
  boolean hasTemplateMessage();
  /**
   * <code>optional .binary.TemplateMessage templateMessage = 25;</code>
   * @return The templateMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.TemplateMessage getTemplateMessage();
  /**
   * <code>optional .binary.TemplateMessage templateMessage = 25;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.TemplateMessageOrBuilder getTemplateMessageOrBuilder();

  /**
   * <code>optional .binary.StickerMessage stickerMessage = 26;</code>
   * @return Whether the stickerMessage field is set.
   */
  boolean hasStickerMessage();
  /**
   * <code>optional .binary.StickerMessage stickerMessage = 26;</code>
   * @return The stickerMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.StickerMessage getStickerMessage();
  /**
   * <code>optional .binary.StickerMessage stickerMessage = 26;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.StickerMessageOrBuilder getStickerMessageOrBuilder();

  /**
   * <code>optional .binary.GroupInviteMessage groupInviteMessage = 28;</code>
   * @return Whether the groupInviteMessage field is set.
   */
  boolean hasGroupInviteMessage();
  /**
   * <code>optional .binary.GroupInviteMessage groupInviteMessage = 28;</code>
   * @return The groupInviteMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.GroupInviteMessage getGroupInviteMessage();
  /**
   * <code>optional .binary.GroupInviteMessage groupInviteMessage = 28;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.GroupInviteMessageOrBuilder getGroupInviteMessageOrBuilder();

  /**
   * <code>optional .binary.TemplateButtonReplyMessage templateButtonReplyMessage = 29;</code>
   * @return Whether the templateButtonReplyMessage field is set.
   */
  boolean hasTemplateButtonReplyMessage();
  /**
   * <code>optional .binary.TemplateButtonReplyMessage templateButtonReplyMessage = 29;</code>
   * @return The templateButtonReplyMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.TemplateButtonReplyMessage getTemplateButtonReplyMessage();
  /**
   * <code>optional .binary.TemplateButtonReplyMessage templateButtonReplyMessage = 29;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.TemplateButtonReplyMessageOrBuilder getTemplateButtonReplyMessageOrBuilder();

  /**
   * <code>optional .binary.ProductMessage productMessage = 30;</code>
   * @return Whether the productMessage field is set.
   */
  boolean hasProductMessage();
  /**
   * <code>optional .binary.ProductMessage productMessage = 30;</code>
   * @return The productMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ProductMessage getProductMessage();
  /**
   * <code>optional .binary.ProductMessage productMessage = 30;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ProductMessageOrBuilder getProductMessageOrBuilder();

  /**
   * <code>optional .binary.DeviceSentMessage deviceSentMessage = 31;</code>
   * @return Whether the deviceSentMessage field is set.
   */
  boolean hasDeviceSentMessage();
  /**
   * <code>optional .binary.DeviceSentMessage deviceSentMessage = 31;</code>
   * @return The deviceSentMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.DeviceSentMessage getDeviceSentMessage();
  /**
   * <code>optional .binary.DeviceSentMessage deviceSentMessage = 31;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.DeviceSentMessageOrBuilder getDeviceSentMessageOrBuilder();

  /**
   * <code>optional .binary.MessageContextInfo messageContextInfo = 35;</code>
   * @return Whether the messageContextInfo field is set.
   */
  boolean hasMessageContextInfo();
  /**
   * <code>optional .binary.MessageContextInfo messageContextInfo = 35;</code>
   * @return The messageContextInfo.
   */
  br.com.zapia.wpp.api.ws.binary.protos.MessageContextInfo getMessageContextInfo();
  /**
   * <code>optional .binary.MessageContextInfo messageContextInfo = 35;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.MessageContextInfoOrBuilder getMessageContextInfoOrBuilder();

  /**
   * <code>optional .binary.ListMessage listMessage = 36;</code>
   * @return Whether the listMessage field is set.
   */
  boolean hasListMessage();
  /**
   * <code>optional .binary.ListMessage listMessage = 36;</code>
   * @return The listMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ListMessage getListMessage();
  /**
   * <code>optional .binary.ListMessage listMessage = 36;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ListMessageOrBuilder getListMessageOrBuilder();

  /**
   * <code>optional .binary.FutureProofMessage viewOnceMessage = 37;</code>
   * @return Whether the viewOnceMessage field is set.
   */
  boolean hasViewOnceMessage();
  /**
   * <code>optional .binary.FutureProofMessage viewOnceMessage = 37;</code>
   * @return The viewOnceMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.FutureProofMessage getViewOnceMessage();
  /**
   * <code>optional .binary.FutureProofMessage viewOnceMessage = 37;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.FutureProofMessageOrBuilder getViewOnceMessageOrBuilder();

  /**
   * <code>optional .binary.OrderMessage orderMessage = 38;</code>
   * @return Whether the orderMessage field is set.
   */
  boolean hasOrderMessage();
  /**
   * <code>optional .binary.OrderMessage orderMessage = 38;</code>
   * @return The orderMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.OrderMessage getOrderMessage();
  /**
   * <code>optional .binary.OrderMessage orderMessage = 38;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.OrderMessageOrBuilder getOrderMessageOrBuilder();

  /**
   * <code>optional .binary.ListResponseMessage listResponseMessage = 39;</code>
   * @return Whether the listResponseMessage field is set.
   */
  boolean hasListResponseMessage();
  /**
   * <code>optional .binary.ListResponseMessage listResponseMessage = 39;</code>
   * @return The listResponseMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ListResponseMessage getListResponseMessage();
  /**
   * <code>optional .binary.ListResponseMessage listResponseMessage = 39;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ListResponseMessageOrBuilder getListResponseMessageOrBuilder();

  /**
   * <code>optional .binary.FutureProofMessage ephemeralMessage = 40;</code>
   * @return Whether the ephemeralMessage field is set.
   */
  boolean hasEphemeralMessage();
  /**
   * <code>optional .binary.FutureProofMessage ephemeralMessage = 40;</code>
   * @return The ephemeralMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.FutureProofMessage getEphemeralMessage();
  /**
   * <code>optional .binary.FutureProofMessage ephemeralMessage = 40;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.FutureProofMessageOrBuilder getEphemeralMessageOrBuilder();

  /**
   * <code>optional .binary.InvoiceMessage invoiceMessage = 41;</code>
   * @return Whether the invoiceMessage field is set.
   */
  boolean hasInvoiceMessage();
  /**
   * <code>optional .binary.InvoiceMessage invoiceMessage = 41;</code>
   * @return The invoiceMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.InvoiceMessage getInvoiceMessage();
  /**
   * <code>optional .binary.InvoiceMessage invoiceMessage = 41;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.InvoiceMessageOrBuilder getInvoiceMessageOrBuilder();

  /**
   * <code>optional .binary.ButtonsMessage buttonsMessage = 42;</code>
   * @return Whether the buttonsMessage field is set.
   */
  boolean hasButtonsMessage();
  /**
   * <code>optional .binary.ButtonsMessage buttonsMessage = 42;</code>
   * @return The buttonsMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ButtonsMessage getButtonsMessage();
  /**
   * <code>optional .binary.ButtonsMessage buttonsMessage = 42;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ButtonsMessageOrBuilder getButtonsMessageOrBuilder();

  /**
   * <code>optional .binary.ButtonsResponseMessage buttonsResponseMessage = 43;</code>
   * @return Whether the buttonsResponseMessage field is set.
   */
  boolean hasButtonsResponseMessage();
  /**
   * <code>optional .binary.ButtonsResponseMessage buttonsResponseMessage = 43;</code>
   * @return The buttonsResponseMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ButtonsResponseMessage getButtonsResponseMessage();
  /**
   * <code>optional .binary.ButtonsResponseMessage buttonsResponseMessage = 43;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ButtonsResponseMessageOrBuilder getButtonsResponseMessageOrBuilder();

  /**
   * <code>optional .binary.PaymentInviteMessage paymentInviteMessage = 44;</code>
   * @return Whether the paymentInviteMessage field is set.
   */
  boolean hasPaymentInviteMessage();
  /**
   * <code>optional .binary.PaymentInviteMessage paymentInviteMessage = 44;</code>
   * @return The paymentInviteMessage.
   */
  br.com.zapia.wpp.api.ws.binary.protos.PaymentInviteMessage getPaymentInviteMessage();
  /**
   * <code>optional .binary.PaymentInviteMessage paymentInviteMessage = 44;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.PaymentInviteMessageOrBuilder getPaymentInviteMessageOrBuilder();
}