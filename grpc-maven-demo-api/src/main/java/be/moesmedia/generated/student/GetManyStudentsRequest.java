// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package be.moesmedia.generated.student;

/**
 * Protobuf type {@code resources.GetManyStudentsRequest}
 */
public  final class GetManyStudentsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:resources.GetManyStudentsRequest)
    GetManyStudentsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetManyStudentsRequest.newBuilder() to construct.
  private GetManyStudentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetManyStudentsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetManyStudentsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetManyStudentsRequest(
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
            be.moesmedia.generated.student.PagingInfo.Builder subBuilder = null;
            if (page_ != null) {
              subBuilder = page_.toBuilder();
            }
            page_ = input.readMessage(be.moesmedia.generated.student.PagingInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(page_);
              page_ = subBuilder.buildPartial();
            }

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
    return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_GetManyStudentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_GetManyStudentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            be.moesmedia.generated.student.GetManyStudentsRequest.class, be.moesmedia.generated.student.GetManyStudentsRequest.Builder.class);
  }

  public static final int PAGE_FIELD_NUMBER = 1;
  private be.moesmedia.generated.student.PagingInfo page_;
  /**
   * <code>.resources.PagingInfo page = 1;</code>
   * @return Whether the page field is set.
   */
  public boolean hasPage() {
    return page_ != null;
  }
  /**
   * <code>.resources.PagingInfo page = 1;</code>
   * @return The page.
   */
  public be.moesmedia.generated.student.PagingInfo getPage() {
    return page_ == null ? be.moesmedia.generated.student.PagingInfo.getDefaultInstance() : page_;
  }
  /**
   * <code>.resources.PagingInfo page = 1;</code>
   */
  public be.moesmedia.generated.student.PagingInfoOrBuilder getPageOrBuilder() {
    return getPage();
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
    if (page_ != null) {
      output.writeMessage(1, getPage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (page_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPage());
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
    if (!(obj instanceof be.moesmedia.generated.student.GetManyStudentsRequest)) {
      return super.equals(obj);
    }
    be.moesmedia.generated.student.GetManyStudentsRequest other = (be.moesmedia.generated.student.GetManyStudentsRequest) obj;

    if (hasPage() != other.hasPage()) return false;
    if (hasPage()) {
      if (!getPage()
          .equals(other.getPage())) return false;
    }
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
    if (hasPage()) {
      hash = (37 * hash) + PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getPage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static be.moesmedia.generated.student.GetManyStudentsRequest parseFrom(
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
  public static Builder newBuilder(be.moesmedia.generated.student.GetManyStudentsRequest prototype) {
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
   * Protobuf type {@code resources.GetManyStudentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:resources.GetManyStudentsRequest)
      be.moesmedia.generated.student.GetManyStudentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_GetManyStudentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_GetManyStudentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              be.moesmedia.generated.student.GetManyStudentsRequest.class, be.moesmedia.generated.student.GetManyStudentsRequest.Builder.class);
    }

    // Construct using be.moesmedia.generated.student.GetManyStudentsRequest.newBuilder()
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
      if (pageBuilder_ == null) {
        page_ = null;
      } else {
        page_ = null;
        pageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_GetManyStudentsRequest_descriptor;
    }

    @java.lang.Override
    public be.moesmedia.generated.student.GetManyStudentsRequest getDefaultInstanceForType() {
      return be.moesmedia.generated.student.GetManyStudentsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public be.moesmedia.generated.student.GetManyStudentsRequest build() {
      be.moesmedia.generated.student.GetManyStudentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public be.moesmedia.generated.student.GetManyStudentsRequest buildPartial() {
      be.moesmedia.generated.student.GetManyStudentsRequest result = new be.moesmedia.generated.student.GetManyStudentsRequest(this);
      if (pageBuilder_ == null) {
        result.page_ = page_;
      } else {
        result.page_ = pageBuilder_.build();
      }
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
      if (other instanceof be.moesmedia.generated.student.GetManyStudentsRequest) {
        return mergeFrom((be.moesmedia.generated.student.GetManyStudentsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(be.moesmedia.generated.student.GetManyStudentsRequest other) {
      if (other == be.moesmedia.generated.student.GetManyStudentsRequest.getDefaultInstance()) return this;
      if (other.hasPage()) {
        mergePage(other.getPage());
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
      be.moesmedia.generated.student.GetManyStudentsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (be.moesmedia.generated.student.GetManyStudentsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private be.moesmedia.generated.student.PagingInfo page_;
    private com.google.protobuf.SingleFieldBuilderV3<
        be.moesmedia.generated.student.PagingInfo, be.moesmedia.generated.student.PagingInfo.Builder, be.moesmedia.generated.student.PagingInfoOrBuilder> pageBuilder_;
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     * @return Whether the page field is set.
     */
    public boolean hasPage() {
      return pageBuilder_ != null || page_ != null;
    }
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     * @return The page.
     */
    public be.moesmedia.generated.student.PagingInfo getPage() {
      if (pageBuilder_ == null) {
        return page_ == null ? be.moesmedia.generated.student.PagingInfo.getDefaultInstance() : page_;
      } else {
        return pageBuilder_.getMessage();
      }
    }
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     */
    public Builder setPage(be.moesmedia.generated.student.PagingInfo value) {
      if (pageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        page_ = value;
        onChanged();
      } else {
        pageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     */
    public Builder setPage(
        be.moesmedia.generated.student.PagingInfo.Builder builderForValue) {
      if (pageBuilder_ == null) {
        page_ = builderForValue.build();
        onChanged();
      } else {
        pageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     */
    public Builder mergePage(be.moesmedia.generated.student.PagingInfo value) {
      if (pageBuilder_ == null) {
        if (page_ != null) {
          page_ =
            be.moesmedia.generated.student.PagingInfo.newBuilder(page_).mergeFrom(value).buildPartial();
        } else {
          page_ = value;
        }
        onChanged();
      } else {
        pageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     */
    public Builder clearPage() {
      if (pageBuilder_ == null) {
        page_ = null;
        onChanged();
      } else {
        page_ = null;
        pageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     */
    public be.moesmedia.generated.student.PagingInfo.Builder getPageBuilder() {
      
      onChanged();
      return getPageFieldBuilder().getBuilder();
    }
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     */
    public be.moesmedia.generated.student.PagingInfoOrBuilder getPageOrBuilder() {
      if (pageBuilder_ != null) {
        return pageBuilder_.getMessageOrBuilder();
      } else {
        return page_ == null ?
            be.moesmedia.generated.student.PagingInfo.getDefaultInstance() : page_;
      }
    }
    /**
     * <code>.resources.PagingInfo page = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        be.moesmedia.generated.student.PagingInfo, be.moesmedia.generated.student.PagingInfo.Builder, be.moesmedia.generated.student.PagingInfoOrBuilder> 
        getPageFieldBuilder() {
      if (pageBuilder_ == null) {
        pageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            be.moesmedia.generated.student.PagingInfo, be.moesmedia.generated.student.PagingInfo.Builder, be.moesmedia.generated.student.PagingInfoOrBuilder>(
                getPage(),
                getParentForChildren(),
                isClean());
        page_ = null;
      }
      return pageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:resources.GetManyStudentsRequest)
  }

  // @@protoc_insertion_point(class_scope:resources.GetManyStudentsRequest)
  private static final be.moesmedia.generated.student.GetManyStudentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new be.moesmedia.generated.student.GetManyStudentsRequest();
  }

  public static be.moesmedia.generated.student.GetManyStudentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetManyStudentsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetManyStudentsRequest>() {
    @java.lang.Override
    public GetManyStudentsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetManyStudentsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetManyStudentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetManyStudentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public be.moesmedia.generated.student.GetManyStudentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

