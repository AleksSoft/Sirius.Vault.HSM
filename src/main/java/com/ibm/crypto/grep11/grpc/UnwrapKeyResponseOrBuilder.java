// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

public interface UnwrapKeyResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grep11.UnwrapKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes Unwrapped = 7;</code>
   *
   * @return The unwrapped.
   */
  com.google.protobuf.ByteString getUnwrapped();

  /**
   * <code>bytes CheckSum = 8;</code>
   *
   * @return The checkSum.
   */
  com.google.protobuf.ByteString getCheckSum();
}
