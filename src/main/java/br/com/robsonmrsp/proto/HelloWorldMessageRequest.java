// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package br.com.robsonmrsp.proto;

/**
 * Protobuf type {@code helloworld.HelloWorldMessageRequest}
 */
public final class HelloWorldMessageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.HelloWorldMessageRequest)
    HelloWorldMessageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloWorldMessageRequest.newBuilder() to construct.
  private HelloWorldMessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloWorldMessageRequest() {
    myName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HelloWorldMessageRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HelloWorldMessageRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            myName_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.robsonmrsp.proto.Helloworld.internal_static_helloworld_HelloWorldMessageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.robsonmrsp.proto.Helloworld.internal_static_helloworld_HelloWorldMessageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.robsonmrsp.proto.HelloWorldMessageRequest.class, br.com.robsonmrsp.proto.HelloWorldMessageRequest.Builder.class);
  }

  public static final int MYNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object myName_;
  /**
   * <code>string myName = 1;</code>
   * @return The myName.
   */
  @java.lang.Override
  public java.lang.String getMyName() {
    java.lang.Object ref = myName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      myName_ = s;
      return s;
    }
  }
  /**
   * <code>string myName = 1;</code>
   * @return The bytes for myName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMyNameBytes() {
    java.lang.Object ref = myName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      myName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMyNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, myName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMyNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, myName_);
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
    if (!(obj instanceof br.com.robsonmrsp.proto.HelloWorldMessageRequest)) {
      return super.equals(obj);
    }
    br.com.robsonmrsp.proto.HelloWorldMessageRequest other = (br.com.robsonmrsp.proto.HelloWorldMessageRequest) obj;

    if (!getMyName()
        .equals(other.getMyName())) return false;
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
    hash = (37 * hash) + MYNAME_FIELD_NUMBER;
    hash = (53 * hash) + getMyName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.robsonmrsp.proto.HelloWorldMessageRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helloworld.HelloWorldMessageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.HelloWorldMessageRequest)
      br.com.robsonmrsp.proto.HelloWorldMessageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.robsonmrsp.proto.Helloworld.internal_static_helloworld_HelloWorldMessageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.robsonmrsp.proto.Helloworld.internal_static_helloworld_HelloWorldMessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.robsonmrsp.proto.HelloWorldMessageRequest.class, br.com.robsonmrsp.proto.HelloWorldMessageRequest.Builder.class);
    }

    // Construct using br.com.robsonmrsp.proto.HelloWorldMessageRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      myName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.robsonmrsp.proto.Helloworld.internal_static_helloworld_HelloWorldMessageRequest_descriptor;
    }

    @java.lang.Override
    public br.com.robsonmrsp.proto.HelloWorldMessageRequest getDefaultInstanceForType() {
      return br.com.robsonmrsp.proto.HelloWorldMessageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.robsonmrsp.proto.HelloWorldMessageRequest build() {
      br.com.robsonmrsp.proto.HelloWorldMessageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.robsonmrsp.proto.HelloWorldMessageRequest buildPartial() {
      br.com.robsonmrsp.proto.HelloWorldMessageRequest result = new br.com.robsonmrsp.proto.HelloWorldMessageRequest(this);
      result.myName_ = myName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.robsonmrsp.proto.HelloWorldMessageRequest) {
        return mergeFrom((br.com.robsonmrsp.proto.HelloWorldMessageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.robsonmrsp.proto.HelloWorldMessageRequest other) {
      if (other == br.com.robsonmrsp.proto.HelloWorldMessageRequest.getDefaultInstance()) return this;
      if (!other.getMyName().isEmpty()) {
        myName_ = other.myName_;
        onChanged();
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
      br.com.robsonmrsp.proto.HelloWorldMessageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.robsonmrsp.proto.HelloWorldMessageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object myName_ = "";
    /**
     * <code>string myName = 1;</code>
     * @return The myName.
     */
    public java.lang.String getMyName() {
      java.lang.Object ref = myName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        myName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string myName = 1;</code>
     * @return The bytes for myName.
     */
    public com.google.protobuf.ByteString
        getMyNameBytes() {
      java.lang.Object ref = myName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        myName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string myName = 1;</code>
     * @param value The myName to set.
     * @return This builder for chaining.
     */
    public Builder setMyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      myName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string myName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMyName() {
      
      myName_ = getDefaultInstance().getMyName();
      onChanged();
      return this;
    }
    /**
     * <code>string myName = 1;</code>
     * @param value The bytes for myName to set.
     * @return This builder for chaining.
     */
    public Builder setMyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      myName_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:helloworld.HelloWorldMessageRequest)
  }

  // @@protoc_insertion_point(class_scope:helloworld.HelloWorldMessageRequest)
  private static final br.com.robsonmrsp.proto.HelloWorldMessageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.robsonmrsp.proto.HelloWorldMessageRequest();
  }

  public static br.com.robsonmrsp.proto.HelloWorldMessageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloWorldMessageRequest>
      PARSER = new com.google.protobuf.AbstractParser<HelloWorldMessageRequest>() {
    @java.lang.Override
    public HelloWorldMessageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HelloWorldMessageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloWorldMessageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloWorldMessageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.robsonmrsp.proto.HelloWorldMessageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

