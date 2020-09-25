// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

/** Protobuf type {@code grep11.VerifyFinalRequest} */
public final class VerifyFinalRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grep11.VerifyFinalRequest)
    VerifyFinalRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VerifyFinalRequest.newBuilder() to construct.
  private VerifyFinalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VerifyFinalRequest() {
    state_ = com.google.protobuf.ByteString.EMPTY;
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VerifyFinalRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VerifyFinalRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              state_ = input.readBytes();
              break;
            }
          case 18:
            {
              signature_ = input.readBytes();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_VerifyFinalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibm.crypto.grep11.grpc.Hsm
        .internal_static_grep11_VerifyFinalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibm.crypto.grep11.grpc.VerifyFinalRequest.class,
            com.ibm.crypto.grep11.grpc.VerifyFinalRequest.Builder.class);
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString state_;
  /**
   * <code>bytes State = 1;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getState() {
    return state_;
  }

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signature_;
  /**
   * <code>bytes Signature = 2;</code>
   *
   * @return The signature.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!state_.isEmpty()) {
      output.writeBytes(1, state_);
    }
    if (!signature_.isEmpty()) {
      output.writeBytes(2, signature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!state_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, state_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, signature_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.ibm.crypto.grep11.grpc.VerifyFinalRequest)) {
      return super.equals(obj);
    }
    com.ibm.crypto.grep11.grpc.VerifyFinalRequest other =
        (com.ibm.crypto.grep11.grpc.VerifyFinalRequest) obj;

    if (!getState().equals(other.getState())) return false;
    if (!getSignature().equals(other.getSignature())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + getState().hashCode();
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.ibm.crypto.grep11.grpc.VerifyFinalRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /** Protobuf type {@code grep11.VerifyFinalRequest} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grep11.VerifyFinalRequest)
      com.ibm.crypto.grep11.grpc.VerifyFinalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_VerifyFinalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibm.crypto.grep11.grpc.Hsm
          .internal_static_grep11_VerifyFinalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibm.crypto.grep11.grpc.VerifyFinalRequest.class,
              com.ibm.crypto.grep11.grpc.VerifyFinalRequest.Builder.class);
    }

    // Construct using com.ibm.crypto.grep11.grpc.VerifyFinalRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      state_ = com.google.protobuf.ByteString.EMPTY;

      signature_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_VerifyFinalRequest_descriptor;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.VerifyFinalRequest getDefaultInstanceForType() {
      return com.ibm.crypto.grep11.grpc.VerifyFinalRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.VerifyFinalRequest build() {
      com.ibm.crypto.grep11.grpc.VerifyFinalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.VerifyFinalRequest buildPartial() {
      com.ibm.crypto.grep11.grpc.VerifyFinalRequest result =
          new com.ibm.crypto.grep11.grpc.VerifyFinalRequest(this);
      result.state_ = state_;
      result.signature_ = signature_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibm.crypto.grep11.grpc.VerifyFinalRequest) {
        return mergeFrom((com.ibm.crypto.grep11.grpc.VerifyFinalRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibm.crypto.grep11.grpc.VerifyFinalRequest other) {
      if (other == com.ibm.crypto.grep11.grpc.VerifyFinalRequest.getDefaultInstance()) return this;
      if (other.getState() != com.google.protobuf.ByteString.EMPTY) {
        setState(other.getState());
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ibm.crypto.grep11.grpc.VerifyFinalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ibm.crypto.grep11.grpc.VerifyFinalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString state_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes State = 1;</code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getState() {
      return state_;
    }
    /**
     * <code>bytes State = 1;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes State = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {

      state_ = getDefaultInstance().getState();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes Signature = 2;</code>
     *
     * @return The signature.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     * <code>bytes Signature = 2;</code>
     *
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      signature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes Signature = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSignature() {

      signature_ = getDefaultInstance().getSignature();
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grep11.VerifyFinalRequest)
  }

  // @@protoc_insertion_point(class_scope:grep11.VerifyFinalRequest)
  private static final com.ibm.crypto.grep11.grpc.VerifyFinalRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.ibm.crypto.grep11.grpc.VerifyFinalRequest();
  }

  public static com.ibm.crypto.grep11.grpc.VerifyFinalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerifyFinalRequest> PARSER =
      new com.google.protobuf.AbstractParser<VerifyFinalRequest>() {
        @java.lang.Override
        public VerifyFinalRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VerifyFinalRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VerifyFinalRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerifyFinalRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibm.crypto.grep11.grpc.VerifyFinalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
