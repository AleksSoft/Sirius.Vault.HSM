// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

public interface GenerateKeyPairRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grep11.GenerateKeyPairRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grep11.Mechanism Mech = 1;</code>
   *
   * @return Whether the mech field is set.
   */
  boolean hasMech();
  /**
   * <code>.grep11.Mechanism Mech = 1;</code>
   *
   * @return The mech.
   */
  com.ibm.crypto.grep11.grpc.Mechanism getMech();
  /** <code>.grep11.Mechanism Mech = 1;</code> */
  com.ibm.crypto.grep11.grpc.MechanismOrBuilder getMechOrBuilder();

  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PubKeyTemplate = 2;</code>
   */
  int getPubKeyTemplateCount();
  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PubKeyTemplate = 2;</code>
   */
  boolean containsPubKeyTemplate(long key);
  /** Use {@link #getPubKeyTemplateMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, com.google.protobuf.ByteString> getPubKeyTemplate();
  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PubKeyTemplate = 2;</code>
   */
  java.util.Map<java.lang.Long, com.google.protobuf.ByteString> getPubKeyTemplateMap();
  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PubKeyTemplate = 2;</code>
   */
  com.google.protobuf.ByteString getPubKeyTemplateOrDefault(
      long key, com.google.protobuf.ByteString defaultValue);
  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PubKeyTemplate = 2;</code>
   */
  com.google.protobuf.ByteString getPubKeyTemplateOrThrow(long key);

  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PrivKeyTemplate = 3;</code>
   */
  int getPrivKeyTemplateCount();
  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PrivKeyTemplate = 3;</code>
   */
  boolean containsPrivKeyTemplate(long key);
  /** Use {@link #getPrivKeyTemplateMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, com.google.protobuf.ByteString> getPrivKeyTemplate();
  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PrivKeyTemplate = 3;</code>
   */
  java.util.Map<java.lang.Long, com.google.protobuf.ByteString> getPrivKeyTemplateMap();
  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PrivKeyTemplate = 3;</code>
   */
  com.google.protobuf.ByteString getPrivKeyTemplateOrDefault(
      long key, com.google.protobuf.ByteString defaultValue);
  /**
   *
   *
   * <pre>
   * [(gogoproto.castkey) = "github.com/ibm-developer/ibm-cloud-hyperprotectcrypto/golang/ep11.Attribute"];
   * </pre>
   *
   * <code>map&lt;uint64, bytes&gt; PrivKeyTemplate = 3;</code>
   */
  com.google.protobuf.ByteString getPrivKeyTemplateOrThrow(long key);

  /**
   * <code>string PrivKeyId = 5;</code>
   *
   * @return The privKeyId.
   */
  java.lang.String getPrivKeyId();
  /**
   * <code>string PrivKeyId = 5;</code>
   *
   * @return The bytes for privKeyId.
   */
  com.google.protobuf.ByteString getPrivKeyIdBytes();

  /**
   * <code>string PubKeyId = 6;</code>
   *
   * @return The pubKeyId.
   */
  java.lang.String getPubKeyId();
  /**
   * <code>string PubKeyId = 6;</code>
   *
   * @return The bytes for pubKeyId.
   */
  com.google.protobuf.ByteString getPubKeyIdBytes();
}
