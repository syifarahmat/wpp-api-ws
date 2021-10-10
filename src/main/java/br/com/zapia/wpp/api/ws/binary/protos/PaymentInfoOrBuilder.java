// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface PaymentInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.PaymentInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.PaymentInfo.PaymentInfoCurrency currencyDeprecated = 1;</code>
   * @return Whether the currencyDeprecated field is set.
   */
  boolean hasCurrencyDeprecated();
  /**
   * <code>optional .binary.PaymentInfo.PaymentInfoCurrency currencyDeprecated = 1;</code>
   * @return The currencyDeprecated.
   */
  br.com.zapia.wpp.api.ws.binary.protos.PaymentInfo.PaymentInfoCurrency getCurrencyDeprecated();

  /**
   * <code>optional uint64 amount1000 = 2;</code>
   * @return Whether the amount1000 field is set.
   */
  boolean hasAmount1000();
  /**
   * <code>optional uint64 amount1000 = 2;</code>
   * @return The amount1000.
   */
  long getAmount1000();

  /**
   * <code>optional string receiverJid = 3;</code>
   * @return Whether the receiverJid field is set.
   */
  boolean hasReceiverJid();
  /**
   * <code>optional string receiverJid = 3;</code>
   * @return The receiverJid.
   */
  java.lang.String getReceiverJid();
  /**
   * <code>optional string receiverJid = 3;</code>
   * @return The bytes for receiverJid.
   */
  com.google.protobuf.ByteString
      getReceiverJidBytes();

  /**
   * <code>optional .binary.PaymentInfo.PaymentInfoStatus status = 4;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>optional .binary.PaymentInfo.PaymentInfoStatus status = 4;</code>
   * @return The status.
   */
  br.com.zapia.wpp.api.ws.binary.protos.PaymentInfo.PaymentInfoStatus getStatus();

  /**
   * <code>optional uint64 transactionTimestamp = 5;</code>
   * @return Whether the transactionTimestamp field is set.
   */
  boolean hasTransactionTimestamp();
  /**
   * <code>optional uint64 transactionTimestamp = 5;</code>
   * @return The transactionTimestamp.
   */
  long getTransactionTimestamp();

  /**
   * <code>optional .binary.MessageKey requestMessageKey = 6;</code>
   * @return Whether the requestMessageKey field is set.
   */
  boolean hasRequestMessageKey();
  /**
   * <code>optional .binary.MessageKey requestMessageKey = 6;</code>
   * @return The requestMessageKey.
   */
  br.com.zapia.wpp.api.ws.binary.protos.MessageKey getRequestMessageKey();
  /**
   * <code>optional .binary.MessageKey requestMessageKey = 6;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.MessageKeyOrBuilder getRequestMessageKeyOrBuilder();

  /**
   * <code>optional uint64 expiryTimestamp = 7;</code>
   * @return Whether the expiryTimestamp field is set.
   */
  boolean hasExpiryTimestamp();
  /**
   * <code>optional uint64 expiryTimestamp = 7;</code>
   * @return The expiryTimestamp.
   */
  long getExpiryTimestamp();

  /**
   * <code>optional bool futureproofed = 8;</code>
   * @return Whether the futureproofed field is set.
   */
  boolean hasFutureproofed();
  /**
   * <code>optional bool futureproofed = 8;</code>
   * @return The futureproofed.
   */
  boolean getFutureproofed();

  /**
   * <code>optional string currency = 9;</code>
   * @return Whether the currency field is set.
   */
  boolean hasCurrency();
  /**
   * <code>optional string currency = 9;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>optional string currency = 9;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>optional .binary.PaymentInfo.PaymentInfoTxnStatus txnStatus = 10;</code>
   * @return Whether the txnStatus field is set.
   */
  boolean hasTxnStatus();
  /**
   * <code>optional .binary.PaymentInfo.PaymentInfoTxnStatus txnStatus = 10;</code>
   * @return The txnStatus.
   */
  br.com.zapia.wpp.api.ws.binary.protos.PaymentInfo.PaymentInfoTxnStatus getTxnStatus();

  /**
   * <code>optional bool useNoviFiatFormat = 11;</code>
   * @return Whether the useNoviFiatFormat field is set.
   */
  boolean hasUseNoviFiatFormat();
  /**
   * <code>optional bool useNoviFiatFormat = 11;</code>
   * @return The useNoviFiatFormat.
   */
  boolean getUseNoviFiatFormat();

  /**
   * <code>optional .binary.Money primaryAmount = 12;</code>
   * @return Whether the primaryAmount field is set.
   */
  boolean hasPrimaryAmount();
  /**
   * <code>optional .binary.Money primaryAmount = 12;</code>
   * @return The primaryAmount.
   */
  br.com.zapia.wpp.api.ws.binary.protos.Money getPrimaryAmount();
  /**
   * <code>optional .binary.Money primaryAmount = 12;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.MoneyOrBuilder getPrimaryAmountOrBuilder();

  /**
   * <code>optional .binary.Money exchangeAmount = 13;</code>
   * @return Whether the exchangeAmount field is set.
   */
  boolean hasExchangeAmount();
  /**
   * <code>optional .binary.Money exchangeAmount = 13;</code>
   * @return The exchangeAmount.
   */
  br.com.zapia.wpp.api.ws.binary.protos.Money getExchangeAmount();
  /**
   * <code>optional .binary.Money exchangeAmount = 13;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.MoneyOrBuilder getExchangeAmountOrBuilder();
}