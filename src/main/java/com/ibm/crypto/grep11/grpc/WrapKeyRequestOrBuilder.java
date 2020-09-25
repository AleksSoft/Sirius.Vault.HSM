// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

public interface WrapKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grep11.WrapKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes Key = 1;</code>
   *
   * @return The key.
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes KeK = 2;</code>
   *
   * @return The keK.
   */
  com.google.protobuf.ByteString getKeK();

  /**
   * <code>bytes MacKey = 3;</code>
   *
   * @return The macKey.
   */
  com.google.protobuf.ByteString getMacKey();

  /**
   * <code>.grep11.Mechanism Mech = 4;</code>
   *
   * @return Whether the mech field is set.
   */
  boolean hasMech();
  /**
   * <code>.grep11.Mechanism Mech = 4;</code>
   *
   * @return The mech.
   */
  com.ibm.crypto.grep11.grpc.Mechanism getMech();
  /** <code>.grep11.Mechanism Mech = 4;</code> */
  com.ibm.crypto.grep11.grpc.MechanismOrBuilder getMechOrBuilder();
}
