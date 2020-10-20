// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

/** Protobuf type {@code grep11.GenerateKeyPairResponse} */
public final class GenerateKeyPairResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grep11.GenerateKeyPairResponse)
    GenerateKeyPairResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GenerateKeyPairResponse.newBuilder() to construct.
  private GenerateKeyPairResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateKeyPairResponse() {
    privKey_ = com.google.protobuf.ByteString.EMPTY;
    pubKey_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateKeyPairResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GenerateKeyPairResponse(
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
          case 42:
            {
              privKey_ = input.readBytes();
              break;
            }
          case 50:
            {
              pubKey_ = input.readBytes();
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
    return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_GenerateKeyPairResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibm.crypto.grep11.grpc.Hsm
        .internal_static_grep11_GenerateKeyPairResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.class,
            com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.Builder.class);
  }

  public static final int PRIVKEY_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString privKey_;
  /**
   * <code>bytes PrivKey = 5;</code>
   *
   * @return The privKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrivKey() {
    return privKey_;
  }

  public static final int PUBKEY_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString pubKey_;
  /**
   * <code>bytes PubKey = 6;</code>
   *
   * @return The pubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPubKey() {
    return pubKey_;
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
    if (!privKey_.isEmpty()) {
      output.writeBytes(5, privKey_);
    }
    if (!pubKey_.isEmpty()) {
      output.writeBytes(6, pubKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!privKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(5, privKey_);
    }
    if (!pubKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(6, pubKey_);
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
    if (!(obj instanceof com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse)) {
      return super.equals(obj);
    }
    com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse other =
        (com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse) obj;

    if (!getPrivKey().equals(other.getPrivKey())) return false;
    if (!getPubKey().equals(other.getPubKey())) return false;
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
    hash = (37 * hash) + PRIVKEY_FIELD_NUMBER;
    hash = (53 * hash) + getPrivKey().hashCode();
    hash = (37 * hash) + PUBKEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parseFrom(
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

  public static Builder newBuilder(com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse prototype) {
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
  /** Protobuf type {@code grep11.GenerateKeyPairResponse} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grep11.GenerateKeyPairResponse)
      com.ibm.crypto.grep11.grpc.GenerateKeyPairResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.ibm.crypto.grep11.grpc.Hsm
          .internal_static_grep11_GenerateKeyPairResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibm.crypto.grep11.grpc.Hsm
          .internal_static_grep11_GenerateKeyPairResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.class,
              com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.Builder.class);
    }

    // Construct using com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.newBuilder()
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
      privKey_ = com.google.protobuf.ByteString.EMPTY;

      pubKey_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.ibm.crypto.grep11.grpc.Hsm
          .internal_static_grep11_GenerateKeyPairResponse_descriptor;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse getDefaultInstanceForType() {
      return com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse build() {
      com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse buildPartial() {
      com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse result =
          new com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse(this);
      result.privKey_ = privKey_;
      result.pubKey_ = pubKey_;
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
      if (other instanceof com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse) {
        return mergeFrom((com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse other) {
      if (other == com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse.getDefaultInstance())
        return this;
      if (other.getPrivKey() != com.google.protobuf.ByteString.EMPTY) {
        setPrivKey(other.getPrivKey());
      }
      if (other.getPubKey() != com.google.protobuf.ByteString.EMPTY) {
        setPubKey(other.getPubKey());
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
      com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString privKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes PrivKey = 5;</code>
     *
     * @return The privKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPrivKey() {
      return privKey_;
    }
    /**
     * <code>bytes PrivKey = 5;</code>
     *
     * @param value The privKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrivKey(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      privKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes PrivKey = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrivKey() {

      privKey_ = getDefaultInstance().getPrivKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString pubKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes PubKey = 6;</code>
     *
     * @return The pubKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPubKey() {
      return pubKey_;
    }
    /**
     * <code>bytes PubKey = 6;</code>
     *
     * @param value The pubKey to set.
     * @return This builder for chaining.
     */
    public Builder setPubKey(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      pubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes PubKey = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPubKey() {

      pubKey_ = getDefaultInstance().getPubKey();
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

    // @@protoc_insertion_point(builder_scope:grep11.GenerateKeyPairResponse)
  }

  // @@protoc_insertion_point(class_scope:grep11.GenerateKeyPairResponse)
  private static final com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse();
  }

  public static com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateKeyPairResponse> PARSER =
      new com.google.protobuf.AbstractParser<GenerateKeyPairResponse>() {
        @java.lang.Override
        public GenerateKeyPairResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GenerateKeyPairResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GenerateKeyPairResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateKeyPairResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibm.crypto.grep11.grpc.GenerateKeyPairResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
