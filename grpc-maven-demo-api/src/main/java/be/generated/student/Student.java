// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package be.generated.student;

/**
 * Protobuf type {@code resources.Student}
 */
public  final class Student extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:resources.Student)
    StudentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Student.newBuilder() to construct.
  private Student(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Student() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Student();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Student(
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
            be.generated.student.StudentResponse.Builder subBuilder = null;
            if (student_ != null) {
              subBuilder = student_.toBuilder();
            }
            student_ = input.readMessage(be.generated.student.StudentResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(student_);
              student_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            be.generated.result.Result.Builder subBuilder = null;
            if (results_ != null) {
              subBuilder = results_.toBuilder();
            }
            results_ = input.readMessage(be.generated.result.Result.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(results_);
              results_ = subBuilder.buildPartial();
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
    return be.generated.student.StudentOuterClass.internal_static_resources_Student_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return be.generated.student.StudentOuterClass.internal_static_resources_Student_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            be.generated.student.Student.class, be.generated.student.Student.Builder.class);
  }

  public static final int STUDENT_FIELD_NUMBER = 1;
  private be.generated.student.StudentResponse student_;
  /**
   * <code>.resources.StudentResponse student = 1;</code>
   * @return Whether the student field is set.
   */
  public boolean hasStudent() {
    return student_ != null;
  }
  /**
   * <code>.resources.StudentResponse student = 1;</code>
   * @return The student.
   */
  public be.generated.student.StudentResponse getStudent() {
    return student_ == null ? be.generated.student.StudentResponse.getDefaultInstance() : student_;
  }
  /**
   * <code>.resources.StudentResponse student = 1;</code>
   */
  public be.generated.student.StudentResponseOrBuilder getStudentOrBuilder() {
    return getStudent();
  }

  public static final int RESULTS_FIELD_NUMBER = 2;
  private be.generated.result.Result results_;
  /**
   * <code>.resources.Result results = 2;</code>
   * @return Whether the results field is set.
   */
  public boolean hasResults() {
    return results_ != null;
  }
  /**
   * <code>.resources.Result results = 2;</code>
   * @return The results.
   */
  public be.generated.result.Result getResults() {
    return results_ == null ? be.generated.result.Result.getDefaultInstance() : results_;
  }
  /**
   * <code>.resources.Result results = 2;</code>
   */
  public be.generated.result.ResultOrBuilder getResultsOrBuilder() {
    return getResults();
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
    if (student_ != null) {
      output.writeMessage(1, getStudent());
    }
    if (results_ != null) {
      output.writeMessage(2, getResults());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (student_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStudent());
    }
    if (results_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResults());
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
    if (!(obj instanceof be.generated.student.Student)) {
      return super.equals(obj);
    }
    be.generated.student.Student other = (be.generated.student.Student) obj;

    if (hasStudent() != other.hasStudent()) return false;
    if (hasStudent()) {
      if (!getStudent()
          .equals(other.getStudent())) return false;
    }
    if (hasResults() != other.hasResults()) return false;
    if (hasResults()) {
      if (!getResults()
          .equals(other.getResults())) return false;
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
    if (hasStudent()) {
      hash = (37 * hash) + STUDENT_FIELD_NUMBER;
      hash = (53 * hash) + getStudent().hashCode();
    }
    if (hasResults()) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResults().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static be.generated.student.Student parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.generated.student.Student parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.generated.student.Student parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.generated.student.Student parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.generated.student.Student parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.generated.student.Student parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.generated.student.Student parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static be.generated.student.Student parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static be.generated.student.Student parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static be.generated.student.Student parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static be.generated.student.Student parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static be.generated.student.Student parseFrom(
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
  public static Builder newBuilder(be.generated.student.Student prototype) {
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
   * Protobuf type {@code resources.Student}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:resources.Student)
      be.generated.student.StudentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return be.generated.student.StudentOuterClass.internal_static_resources_Student_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return be.generated.student.StudentOuterClass.internal_static_resources_Student_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              be.generated.student.Student.class, be.generated.student.Student.Builder.class);
    }

    // Construct using be.generated.student.Student.newBuilder()
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
      if (studentBuilder_ == null) {
        student_ = null;
      } else {
        student_ = null;
        studentBuilder_ = null;
      }
      if (resultsBuilder_ == null) {
        results_ = null;
      } else {
        results_ = null;
        resultsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return be.generated.student.StudentOuterClass.internal_static_resources_Student_descriptor;
    }

    @java.lang.Override
    public be.generated.student.Student getDefaultInstanceForType() {
      return be.generated.student.Student.getDefaultInstance();
    }

    @java.lang.Override
    public be.generated.student.Student build() {
      be.generated.student.Student result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public be.generated.student.Student buildPartial() {
      be.generated.student.Student result = new be.generated.student.Student(this);
      if (studentBuilder_ == null) {
        result.student_ = student_;
      } else {
        result.student_ = studentBuilder_.build();
      }
      if (resultsBuilder_ == null) {
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
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
      if (other instanceof be.generated.student.Student) {
        return mergeFrom((be.generated.student.Student)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(be.generated.student.Student other) {
      if (other == be.generated.student.Student.getDefaultInstance()) return this;
      if (other.hasStudent()) {
        mergeStudent(other.getStudent());
      }
      if (other.hasResults()) {
        mergeResults(other.getResults());
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
      be.generated.student.Student parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (be.generated.student.Student) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private be.generated.student.StudentResponse student_;
    private com.google.protobuf.SingleFieldBuilderV3<
        be.generated.student.StudentResponse, be.generated.student.StudentResponse.Builder, be.generated.student.StudentResponseOrBuilder> studentBuilder_;
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     * @return Whether the student field is set.
     */
    public boolean hasStudent() {
      return studentBuilder_ != null || student_ != null;
    }
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     * @return The student.
     */
    public be.generated.student.StudentResponse getStudent() {
      if (studentBuilder_ == null) {
        return student_ == null ? be.generated.student.StudentResponse.getDefaultInstance() : student_;
      } else {
        return studentBuilder_.getMessage();
      }
    }
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     */
    public Builder setStudent(be.generated.student.StudentResponse value) {
      if (studentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        student_ = value;
        onChanged();
      } else {
        studentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     */
    public Builder setStudent(
        be.generated.student.StudentResponse.Builder builderForValue) {
      if (studentBuilder_ == null) {
        student_ = builderForValue.build();
        onChanged();
      } else {
        studentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     */
    public Builder mergeStudent(be.generated.student.StudentResponse value) {
      if (studentBuilder_ == null) {
        if (student_ != null) {
          student_ =
            be.generated.student.StudentResponse.newBuilder(student_).mergeFrom(value).buildPartial();
        } else {
          student_ = value;
        }
        onChanged();
      } else {
        studentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     */
    public Builder clearStudent() {
      if (studentBuilder_ == null) {
        student_ = null;
        onChanged();
      } else {
        student_ = null;
        studentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     */
    public be.generated.student.StudentResponse.Builder getStudentBuilder() {
      
      onChanged();
      return getStudentFieldBuilder().getBuilder();
    }
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     */
    public be.generated.student.StudentResponseOrBuilder getStudentOrBuilder() {
      if (studentBuilder_ != null) {
        return studentBuilder_.getMessageOrBuilder();
      } else {
        return student_ == null ?
            be.generated.student.StudentResponse.getDefaultInstance() : student_;
      }
    }
    /**
     * <code>.resources.StudentResponse student = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        be.generated.student.StudentResponse, be.generated.student.StudentResponse.Builder, be.generated.student.StudentResponseOrBuilder> 
        getStudentFieldBuilder() {
      if (studentBuilder_ == null) {
        studentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            be.generated.student.StudentResponse, be.generated.student.StudentResponse.Builder, be.generated.student.StudentResponseOrBuilder>(
                getStudent(),
                getParentForChildren(),
                isClean());
        student_ = null;
      }
      return studentBuilder_;
    }

    private be.generated.result.Result results_;
    private com.google.protobuf.SingleFieldBuilderV3<
        be.generated.result.Result, be.generated.result.Result.Builder, be.generated.result.ResultOrBuilder> resultsBuilder_;
    /**
     * <code>.resources.Result results = 2;</code>
     * @return Whether the results field is set.
     */
    public boolean hasResults() {
      return resultsBuilder_ != null || results_ != null;
    }
    /**
     * <code>.resources.Result results = 2;</code>
     * @return The results.
     */
    public be.generated.result.Result getResults() {
      if (resultsBuilder_ == null) {
        return results_ == null ? be.generated.result.Result.getDefaultInstance() : results_;
      } else {
        return resultsBuilder_.getMessage();
      }
    }
    /**
     * <code>.resources.Result results = 2;</code>
     */
    public Builder setResults(be.generated.result.Result value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        results_ = value;
        onChanged();
      } else {
        resultsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.resources.Result results = 2;</code>
     */
    public Builder setResults(
        be.generated.result.Result.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        results_ = builderForValue.build();
        onChanged();
      } else {
        resultsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.resources.Result results = 2;</code>
     */
    public Builder mergeResults(be.generated.result.Result value) {
      if (resultsBuilder_ == null) {
        if (results_ != null) {
          results_ =
            be.generated.result.Result.newBuilder(results_).mergeFrom(value).buildPartial();
        } else {
          results_ = value;
        }
        onChanged();
      } else {
        resultsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.resources.Result results = 2;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = null;
        onChanged();
      } else {
        results_ = null;
        resultsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.resources.Result results = 2;</code>
     */
    public be.generated.result.Result.Builder getResultsBuilder() {
      
      onChanged();
      return getResultsFieldBuilder().getBuilder();
    }
    /**
     * <code>.resources.Result results = 2;</code>
     */
    public be.generated.result.ResultOrBuilder getResultsOrBuilder() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilder();
      } else {
        return results_ == null ?
            be.generated.result.Result.getDefaultInstance() : results_;
      }
    }
    /**
     * <code>.resources.Result results = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        be.generated.result.Result, be.generated.result.Result.Builder, be.generated.result.ResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            be.generated.result.Result, be.generated.result.Result.Builder, be.generated.result.ResultOrBuilder>(
                getResults(),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:resources.Student)
  }

  // @@protoc_insertion_point(class_scope:resources.Student)
  private static final be.generated.student.Student DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new be.generated.student.Student();
  }

  public static be.generated.student.Student getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Student>
      PARSER = new com.google.protobuf.AbstractParser<Student>() {
    @java.lang.Override
    public Student parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Student(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Student> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Student> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public be.generated.student.Student getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

