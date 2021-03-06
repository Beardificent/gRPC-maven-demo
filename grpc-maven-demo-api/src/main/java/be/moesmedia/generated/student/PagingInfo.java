// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package be.moesmedia.generated.student;

/**
 * Protobuf type {@code resources.PagingInfo}
 */
public  final class PagingInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:resources.PagingInfo)
    PagingInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PagingInfo.newBuilder() to construct.
  private PagingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PagingInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PagingInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PagingInfo(
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
          case 8: {

            currentPage_ = input.readInt32();
            break;
          }
          case 16: {

            itemsPerPage_ = input.readInt32();
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
    return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_PagingInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_PagingInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            be.moesmedia.generated.student.PagingInfo.class, be.moesmedia.generated.student.PagingInfo.Builder.class);
  }

  public static final int CURRENTPAGE_FIELD_NUMBER = 1;
  private int currentPage_;
  /**
   * <code>int32 currentPage = 1;</code>
   * @return The currentPage.
   */
  public int getCurrentPage() {
    return currentPage_;
  }

  public static final int ITEMSPERPAGE_FIELD_NUMBER = 2;
  private int itemsPerPage_;
  /**
   * <code>int32 itemsPerPage = 2;</code>
   * @return The itemsPerPage.
   */
  public int getItemsPerPage() {
    return itemsPerPage_;
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
    if (currentPage_ != 0) {
      output.writeInt32(1, currentPage_);
    }
    if (itemsPerPage_ != 0) {
      output.writeInt32(2, itemsPerPage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (currentPage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, currentPage_);
    }
    if (itemsPerPage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, itemsPerPage_);
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
    if (!(obj instanceof be.moesmedia.generated.student.PagingInfo)) {
      return super.equals(obj);
    }
    be.moesmedia.generated.student.PagingInfo other = (be.moesmedia.generated.student.PagingInfo) obj;

    if (getCurrentPage()
        != other.getCurrentPage()) return false;
    if (getItemsPerPage()
        != other.getItemsPerPage()) return false;
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
    hash = (37 * hash) + CURRENTPAGE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentPage();
    hash = (37 * hash) + ITEMSPERPAGE_FIELD_NUMBER;
    hash = (53 * hash) + getItemsPerPage();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static be.moesmedia.generated.student.PagingInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static be.moesmedia.generated.student.PagingInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static be.moesmedia.generated.student.PagingInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static be.moesmedia.generated.student.PagingInfo parseFrom(
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
  public static Builder newBuilder(be.moesmedia.generated.student.PagingInfo prototype) {
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
   * Protobuf type {@code resources.PagingInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:resources.PagingInfo)
      be.moesmedia.generated.student.PagingInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_PagingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_PagingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              be.moesmedia.generated.student.PagingInfo.class, be.moesmedia.generated.student.PagingInfo.Builder.class);
    }

    // Construct using be.moesmedia.generated.student.PagingInfo.newBuilder()
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
      currentPage_ = 0;

      itemsPerPage_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return be.moesmedia.generated.student.StudentOuterClass.internal_static_resources_PagingInfo_descriptor;
    }

    @java.lang.Override
    public be.moesmedia.generated.student.PagingInfo getDefaultInstanceForType() {
      return be.moesmedia.generated.student.PagingInfo.getDefaultInstance();
    }

    @java.lang.Override
    public be.moesmedia.generated.student.PagingInfo build() {
      be.moesmedia.generated.student.PagingInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public be.moesmedia.generated.student.PagingInfo buildPartial() {
      be.moesmedia.generated.student.PagingInfo result = new be.moesmedia.generated.student.PagingInfo(this);
      result.currentPage_ = currentPage_;
      result.itemsPerPage_ = itemsPerPage_;
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
      if (other instanceof be.moesmedia.generated.student.PagingInfo) {
        return mergeFrom((be.moesmedia.generated.student.PagingInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(be.moesmedia.generated.student.PagingInfo other) {
      if (other == be.moesmedia.generated.student.PagingInfo.getDefaultInstance()) return this;
      if (other.getCurrentPage() != 0) {
        setCurrentPage(other.getCurrentPage());
      }
      if (other.getItemsPerPage() != 0) {
        setItemsPerPage(other.getItemsPerPage());
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
      be.moesmedia.generated.student.PagingInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (be.moesmedia.generated.student.PagingInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int currentPage_ ;
    /**
     * <code>int32 currentPage = 1;</code>
     * @return The currentPage.
     */
    public int getCurrentPage() {
      return currentPage_;
    }
    /**
     * <code>int32 currentPage = 1;</code>
     * @param value The currentPage to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentPage(int value) {
      
      currentPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 currentPage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentPage() {
      
      currentPage_ = 0;
      onChanged();
      return this;
    }

    private int itemsPerPage_ ;
    /**
     * <code>int32 itemsPerPage = 2;</code>
     * @return The itemsPerPage.
     */
    public int getItemsPerPage() {
      return itemsPerPage_;
    }
    /**
     * <code>int32 itemsPerPage = 2;</code>
     * @param value The itemsPerPage to set.
     * @return This builder for chaining.
     */
    public Builder setItemsPerPage(int value) {
      
      itemsPerPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 itemsPerPage = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemsPerPage() {
      
      itemsPerPage_ = 0;
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


    // @@protoc_insertion_point(builder_scope:resources.PagingInfo)
  }

  // @@protoc_insertion_point(class_scope:resources.PagingInfo)
  private static final be.moesmedia.generated.student.PagingInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new be.moesmedia.generated.student.PagingInfo();
  }

  public static be.moesmedia.generated.student.PagingInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PagingInfo>
      PARSER = new com.google.protobuf.AbstractParser<PagingInfo>() {
    @java.lang.Override
    public PagingInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PagingInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PagingInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PagingInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public be.moesmedia.generated.student.PagingInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

