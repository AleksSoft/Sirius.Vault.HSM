// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hsm.proto

package com.ibm.crypto.grep11.grpc;

/** Protobuf type {@code grep11.SignSingleRequest} */
public final class SignSingleRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grep11.SignSingleRequest)
    SignSingleRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SignSingleRequest.newBuilder() to construct.
  private SignSingleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SignSingleRequest() {
    privKey_ = com.google.protobuf.ByteString.EMPTY;
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SignSingleRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SignSingleRequest(
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
              privKey_ = input.readBytes();
              break;
            }
          case 18:
            {
              com.ibm.crypto.grep11.grpc.Mechanism.Builder subBuilder = null;
              if (mech_ != null) {
                subBuilder = mech_.toBuilder();
              }
              mech_ =
                  input.readMessage(
                      com.ibm.crypto.grep11.grpc.Mechanism.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mech_);
                mech_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              data_ = input.readBytes();
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
    return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_SignSingleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibm.crypto.grep11.grpc.Hsm
        .internal_static_grep11_SignSingleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibm.crypto.grep11.grpc.SignSingleRequest.class,
            com.ibm.crypto.grep11.grpc.SignSingleRequest.Builder.class);
  }

  public static final int PRIVKEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString privKey_;
  /**
   * <code>bytes PrivKey = 1;</code>
   *
   * @return The privKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrivKey() {
    return privKey_;
  }

  public static final int MECH_FIELD_NUMBER = 2;
  private com.ibm.crypto.grep11.grpc.Mechanism mech_;
  /**
   * <code>.grep11.Mechanism Mech = 2;</code>
   *
   * @return Whether the mech field is set.
   */
  @java.lang.Override
  public boolean hasMech() {
    return mech_ != null;
  }
  /**
   * <code>.grep11.Mechanism Mech = 2;</code>
   *
   * @return The mech.
   */
  @java.lang.Override
  public com.ibm.crypto.grep11.grpc.Mechanism getMech() {
    return mech_ == null ? com.ibm.crypto.grep11.grpc.Mechanism.getDefaultInstance() : mech_;
  }
  /** <code>.grep11.Mechanism Mech = 2;</code> */
  @java.lang.Override
  public com.ibm.crypto.grep11.grpc.MechanismOrBuilder getMechOrBuilder() {
    return getMech();
  }

  public static final int DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes Data = 3;</code>
   *
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
      output.writeBytes(1, privKey_);
    }
    if (mech_ != null) {
      output.writeMessage(2, getMech());
    }
    if (!data_.isEmpty()) {
      output.writeBytes(3, data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!privKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, privKey_);
    }
    if (mech_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMech());
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, data_);
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
    if (!(obj instanceof com.ibm.crypto.grep11.grpc.SignSingleRequest)) {
      return super.equals(obj);
    }
    com.ibm.crypto.grep11.grpc.SignSingleRequest other =
        (com.ibm.crypto.grep11.grpc.SignSingleRequest) obj;

    if (!getPrivKey().equals(other.getPrivKey())) return false;
    if (hasMech() != other.hasMech()) return false;
    if (hasMech()) {
      if (!getMech().equals(other.getMech())) return false;
    }
    if (!getData().equals(other.getData())) return false;
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
    if (hasMech()) {
      hash = (37 * hash) + MECH_FIELD_NUMBER;
      hash = (53 * hash) + getMech().hashCode();
    }
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest parseFrom(
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

  public static Builder newBuilder(com.ibm.crypto.grep11.grpc.SignSingleRequest prototype) {
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
  /** Protobuf type {@code grep11.SignSingleRequest} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grep11.SignSingleRequest)
      com.ibm.crypto.grep11.grpc.SignSingleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_SignSingleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibm.crypto.grep11.grpc.Hsm
          .internal_static_grep11_SignSingleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibm.crypto.grep11.grpc.SignSingleRequest.class,
              com.ibm.crypto.grep11.grpc.SignSingleRequest.Builder.class);
    }

    // Construct using com.ibm.crypto.grep11.grpc.SignSingleRequest.newBuilder()
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

      if (mechBuilder_ == null) {
        mech_ = null;
      } else {
        mech_ = null;
        mechBuilder_ = null;
      }
      data_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.ibm.crypto.grep11.grpc.Hsm.internal_static_grep11_SignSingleRequest_descriptor;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.SignSingleRequest getDefaultInstanceForType() {
      return com.ibm.crypto.grep11.grpc.SignSingleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.SignSingleRequest build() {
      com.ibm.crypto.grep11.grpc.SignSingleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibm.crypto.grep11.grpc.SignSingleRequest buildPartial() {
      com.ibm.crypto.grep11.grpc.SignSingleRequest result =
          new com.ibm.crypto.grep11.grpc.SignSingleRequest(this);
      result.privKey_ = privKey_;
      if (mechBuilder_ == null) {
        result.mech_ = mech_;
      } else {
        result.mech_ = mechBuilder_.build();
      }
      result.data_ = data_;
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
      if (other instanceof com.ibm.crypto.grep11.grpc.SignSingleRequest) {
        return mergeFrom((com.ibm.crypto.grep11.grpc.SignSingleRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibm.crypto.grep11.grpc.SignSingleRequest other) {
      if (other == com.ibm.crypto.grep11.grpc.SignSingleRequest.getDefaultInstance()) return this;
      if (other.getPrivKey() != com.google.protobuf.ByteString.EMPTY) {
        setPrivKey(other.getPrivKey());
      }
      if (other.hasMech()) {
        mergeMech(other.getMech());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
      com.ibm.crypto.grep11.grpc.SignSingleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ibm.crypto.grep11.grpc.SignSingleRequest) e.getUnfinishedMessage();
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
     * <code>bytes PrivKey = 1;</code>
     *
     * @return The privKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPrivKey() {
      return privKey_;
    }
    /**
     * <code>bytes PrivKey = 1;</code>
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
     * <code>bytes PrivKey = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrivKey() {

      privKey_ = getDefaultInstance().getPrivKey();
      onChanged();
      return this;
    }

    private com.ibm.crypto.grep11.grpc.Mechanism mech_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.ibm.crypto.grep11.grpc.Mechanism,
            com.ibm.crypto.grep11.grpc.Mechanism.Builder,
            com.ibm.crypto.grep11.grpc.MechanismOrBuilder>
        mechBuilder_;
    /**
     * <code>.grep11.Mechanism Mech = 2;</code>
     *
     * @return Whether the mech field is set.
     */
    public boolean hasMech() {
      return mechBuilder_ != null || mech_ != null;
    }
    /**
     * <code>.grep11.Mechanism Mech = 2;</code>
     *
     * @return The mech.
     */
    public com.ibm.crypto.grep11.grpc.Mechanism getMech() {
      if (mechBuilder_ == null) {
        return mech_ == null ? com.ibm.crypto.grep11.grpc.Mechanism.getDefaultInstance() : mech_;
      } else {
        return mechBuilder_.getMessage();
      }
    }
    /** <code>.grep11.Mechanism Mech = 2;</code> */
    public Builder setMech(com.ibm.crypto.grep11.grpc.Mechanism value) {
      if (mechBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mech_ = value;
        onChanged();
      } else {
        mechBuilder_.setMessage(value);
      }

      return this;
    }
    /** <code>.grep11.Mechanism Mech = 2;</code> */
    public Builder setMech(com.ibm.crypto.grep11.grpc.Mechanism.Builder builderForValue) {
      if (mechBuilder_ == null) {
        mech_ = builderForValue.build();
        onChanged();
      } else {
        mechBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /** <code>.grep11.Mechanism Mech = 2;</code> */
    public Builder mergeMech(com.ibm.crypto.grep11.grpc.Mechanism value) {
      if (mechBuilder_ == null) {
        if (mech_ != null) {
          mech_ =
              com.ibm.crypto.grep11.grpc.Mechanism.newBuilder(mech_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          mech_ = value;
        }
        onChanged();
      } else {
        mechBuilder_.mergeFrom(value);
      }

      return this;
    }
    /** <code>.grep11.Mechanism Mech = 2;</code> */
    public Builder clearMech() {
      if (mechBuilder_ == null) {
        mech_ = null;
        onChanged();
      } else {
        mech_ = null;
        mechBuilder_ = null;
      }

      return this;
    }
    /** <code>.grep11.Mechanism Mech = 2;</code> */
    public com.ibm.crypto.grep11.grpc.Mechanism.Builder getMechBuilder() {

      onChanged();
      return getMechFieldBuilder().getBuilder();
    }
    /** <code>.grep11.Mechanism Mech = 2;</code> */
    public com.ibm.crypto.grep11.grpc.MechanismOrBuilder getMechOrBuilder() {
      if (mechBuilder_ != null) {
        return mechBuilder_.getMessageOrBuilder();
      } else {
        return mech_ == null ? com.ibm.crypto.grep11.grpc.Mechanism.getDefaultInstance() : mech_;
      }
    }
    /** <code>.grep11.Mechanism Mech = 2;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.ibm.crypto.grep11.grpc.Mechanism,
            com.ibm.crypto.grep11.grpc.Mechanism.Builder,
            com.ibm.crypto.grep11.grpc.MechanismOrBuilder>
        getMechFieldBuilder() {
      if (mechBuilder_ == null) {
        mechBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.ibm.crypto.grep11.grpc.Mechanism,
                com.ibm.crypto.grep11.grpc.Mechanism.Builder,
                com.ibm.crypto.grep11.grpc.MechanismOrBuilder>(
                getMech(), getParentForChildren(), isClean());
        mech_ = null;
      }
      return mechBuilder_;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes Data = 3;</code>
     *
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes Data = 3;</code>
     *
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes Data = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearData() {

      data_ = getDefaultInstance().getData();
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

    // @@protoc_insertion_point(builder_scope:grep11.SignSingleRequest)
  }

  // @@protoc_insertion_point(class_scope:grep11.SignSingleRequest)
  private static final com.ibm.crypto.grep11.grpc.SignSingleRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.ibm.crypto.grep11.grpc.SignSingleRequest();
  }

  public static com.ibm.crypto.grep11.grpc.SignSingleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignSingleRequest> PARSER =
      new com.google.protobuf.AbstractParser<SignSingleRequest>() {
        @java.lang.Override
        public SignSingleRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SignSingleRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SignSingleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignSingleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibm.crypto.grep11.grpc.SignSingleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
