// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package be.generated.student;

/**
 * Protobuf type {@code StudentResponse}
 */
public  final class StudentResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StudentResponse)
    StudentResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentResponse.newBuilder() to construct.
  private StudentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentResponse() {
    studentId_ = "";
    name_ = "";
    gender_ = 0;
    maths_ = 0;
    art_ = 0;
    chemistry_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudentResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StudentResponse(
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

            studentId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            age_ = input.readInt32();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            gender_ = rawValue;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            maths_ = rawValue;
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            art_ = rawValue;
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            chemistry_ = rawValue;
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
    return be.generated.student.StudentOuterClass.internal_static_StudentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return be.generated.student.StudentOuterClass.internal_static_StudentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            be.generated.student.StudentResponse.class, be.generated.student.StudentResponse.Builder.class);
  }

  public static final int STUDENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object studentId_;
  /**
   * <code>string student_id = 1;</code>
   * @return The studentId.
   */
  public java.lang.String getStudentId() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      studentId_ = s;
      return s;
    }
  }
  /**
   * <code>string student_id = 1;</code>
   * @return The bytes for studentId.
   */
  public com.google.protobuf.ByteString
      getStudentIdBytes() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      studentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 3;
  private int age_;
  /**
   * <code>int32 age = 3;</code>
   * @return The age.
   */
  public int getAge() {
    return age_;
  }

  public static final int GENDER_FIELD_NUMBER = 4;
  private int gender_;
  /**
   * <code>.Gender gender = 4;</code>
   * @return The enum numeric value on the wire for gender.
   */
  public int getGenderValue() {
    return gender_;
  }
  /**
   * <code>.Gender gender = 4;</code>
   * @return The gender.
   */
  public be.generated.student.Gender getGender() {
    @SuppressWarnings("deprecation")
    be.generated.student.Gender result = be.generated.student.Gender.valueOf(gender_);
    return result == null ? be.generated.student.Gender.UNRECOGNIZED : result;
  }

  public static final int MATHS_FIELD_NUMBER = 5;
  private int maths_;
  /**
   * <code>.Grade maths = 5;</code>
   * @return The enum numeric value on the wire for maths.
   */
  public int getMathsValue() {
    return maths_;
  }
  /**
   * <code>.Grade maths = 5;</code>
   * @return The maths.
   */
  public be.generated.student.Grade getMaths() {
    @SuppressWarnings("deprecation")
    be.generated.student.Grade result = be.generated.student.Grade.valueOf(maths_);
    return result == null ? be.generated.student.Grade.UNRECOGNIZED : result;
  }

  public static final int ART_FIELD_NUMBER = 6;
  private int art_;
  /**
   * <code>.Grade art = 6;</code>
   * @return The enum numeric value on the wire for art.
   */
  public int getArtValue() {
    return art_;
  }
  /**
   * <code>.Grade art = 6;</code>
   * @return The art.
   */
  public be.generated.student.Grade getArt() {
    @SuppressWarnings("deprecation")
    be.generated.student.Grade result = be.generated.student.Grade.valueOf(art_);
    return result == null ? be.generated.student.Grade.UNRECOGNIZED : result;
  }

  public static final int CHEMISTRY_FIELD_NUMBER = 7;
  private int chemistry_;
  /**
   * <code>.Grade chemistry = 7;</code>
   * @return The enum numeric value on the wire for chemistry.
   */
  public int getChemistryValue() {
    return chemistry_;
  }
  /**
   * <code>.Grade chemistry = 7;</code>
   * @return The chemistry.
   */
  public be.generated.student.Grade getChemistry() {
    @SuppressWarnings("deprecation")
    be.generated.student.Grade result = be.generated.student.Grade.valueOf(chemistry_);
    return result == null ? be.generated.student.Grade.UNRECOGNIZED : result;
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
    if (!getStudentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, studentId_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (age_ != 0) {
      output.writeInt32(3, age_);
    }
    if (gender_ != be.generated.student.Gender.MALE.getNumber()) {
      output.writeEnum(4, gender_);
    }
    if (maths_ != be.generated.student.Grade.PASS.getNumber()) {
      output.writeEnum(5, maths_);
    }
    if (art_ != be.generated.student.Grade.PASS.getNumber()) {
      output.writeEnum(6, art_);
    }
    if (chemistry_ != be.generated.student.Grade.PASS.getNumber()) {
      output.writeEnum(7, chemistry_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getStudentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, studentId_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, age_);
    }
    if (gender_ != be.generated.student.Gender.MALE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, gender_);
    }
    if (maths_ != be.generated.student.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, maths_);
    }
    if (art_ != be.generated.student.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, art_);
    }
    if (chemistry_ != be.generated.student.Grade.PASS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, chemistry_);
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
    if (!(obj instanceof be.generated.student.StudentResponse)) {
      return super.equals(obj);
    }
    be.generated.student.StudentResponse other = (be.generated.student.StudentResponse) obj;

    if (!getStudentId()
        .equals(other.getStudentId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getAge()
        != other.getAge()) return false;
    if (gender_ != other.gender_) return false;
    if (maths_ != other.maths_) return false;
    if (art_ != other.art_) return false;
    if (chemistry_ != other.chemistry_) return false;
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
    hash = (37 * hash) + STUDENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStudentId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + gender_;
    hash = (37 * hash) + MATHS_FIELD_NUMBER;
    hash = (53 * hash) + maths_;
    hash = (37 * hash) + ART_FIELD_NUMBER;
    hash = (53 * hash) + art_;
    hash = (37 * hash) + CHEMISTRY_FIELD_NUMBER;
    hash = (53 * hash) + chemistry_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static be.generated.student.StudentResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.generated.student.StudentResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.generated.student.StudentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.generated.student.StudentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.generated.student.StudentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static be.generated.student.StudentResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static be.generated.student.StudentResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static be.generated.student.StudentResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static be.generated.student.StudentResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static be.generated.student.StudentResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static be.generated.student.StudentResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static be.generated.student.StudentResponse parseFrom(
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
  public static Builder newBuilder(be.generated.student.StudentResponse prototype) {
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
   * Protobuf type {@code StudentResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StudentResponse)
      be.generated.student.StudentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return be.generated.student.StudentOuterClass.internal_static_StudentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return be.generated.student.StudentOuterClass.internal_static_StudentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              be.generated.student.StudentResponse.class, be.generated.student.StudentResponse.Builder.class);
    }

    // Construct using be.generated.student.StudentResponse.newBuilder()
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
      studentId_ = "";

      name_ = "";

      age_ = 0;

      gender_ = 0;

      maths_ = 0;

      art_ = 0;

      chemistry_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return be.generated.student.StudentOuterClass.internal_static_StudentResponse_descriptor;
    }

    @java.lang.Override
    public be.generated.student.StudentResponse getDefaultInstanceForType() {
      return be.generated.student.StudentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public be.generated.student.StudentResponse build() {
      be.generated.student.StudentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public be.generated.student.StudentResponse buildPartial() {
      be.generated.student.StudentResponse result = new be.generated.student.StudentResponse(this);
      result.studentId_ = studentId_;
      result.name_ = name_;
      result.age_ = age_;
      result.gender_ = gender_;
      result.maths_ = maths_;
      result.art_ = art_;
      result.chemistry_ = chemistry_;
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
      if (other instanceof be.generated.student.StudentResponse) {
        return mergeFrom((be.generated.student.StudentResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(be.generated.student.StudentResponse other) {
      if (other == be.generated.student.StudentResponse.getDefaultInstance()) return this;
      if (!other.getStudentId().isEmpty()) {
        studentId_ = other.studentId_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (other.gender_ != 0) {
        setGenderValue(other.getGenderValue());
      }
      if (other.maths_ != 0) {
        setMathsValue(other.getMathsValue());
      }
      if (other.art_ != 0) {
        setArtValue(other.getArtValue());
      }
      if (other.chemistry_ != 0) {
        setChemistryValue(other.getChemistryValue());
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
      be.generated.student.StudentResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (be.generated.student.StudentResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object studentId_ = "";
    /**
     * <code>string student_id = 1;</code>
     * @return The studentId.
     */
    public java.lang.String getStudentId() {
      java.lang.Object ref = studentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        studentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string student_id = 1;</code>
     * @return The bytes for studentId.
     */
    public com.google.protobuf.ByteString
        getStudentIdBytes() {
      java.lang.Object ref = studentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        studentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string student_id = 1;</code>
     * @param value The studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      studentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string student_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStudentId() {
      
      studentId_ = getDefaultInstance().getStudentId();
      onChanged();
      return this;
    }
    /**
     * <code>string student_id = 1;</code>
     * @param value The bytes for studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      studentId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 3;</code>
     * @return The age.
     */
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 3;</code>
     * @param value The age to set.
     * @return This builder for chaining.
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private int gender_ = 0;
    /**
     * <code>.Gender gender = 4;</code>
     * @return The enum numeric value on the wire for gender.
     */
    public int getGenderValue() {
      return gender_;
    }
    /**
     * <code>.Gender gender = 4;</code>
     * @param value The enum numeric value on the wire for gender to set.
     * @return This builder for chaining.
     */
    public Builder setGenderValue(int value) {
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Gender gender = 4;</code>
     * @return The gender.
     */
    public be.generated.student.Gender getGender() {
      @SuppressWarnings("deprecation")
      be.generated.student.Gender result = be.generated.student.Gender.valueOf(gender_);
      return result == null ? be.generated.student.Gender.UNRECOGNIZED : result;
    }
    /**
     * <code>.Gender gender = 4;</code>
     * @param value The gender to set.
     * @return This builder for chaining.
     */
    public Builder setGender(be.generated.student.Gender value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gender_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Gender gender = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGender() {
      
      gender_ = 0;
      onChanged();
      return this;
    }

    private int maths_ = 0;
    /**
     * <code>.Grade maths = 5;</code>
     * @return The enum numeric value on the wire for maths.
     */
    public int getMathsValue() {
      return maths_;
    }
    /**
     * <code>.Grade maths = 5;</code>
     * @param value The enum numeric value on the wire for maths to set.
     * @return This builder for chaining.
     */
    public Builder setMathsValue(int value) {
      maths_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Grade maths = 5;</code>
     * @return The maths.
     */
    public be.generated.student.Grade getMaths() {
      @SuppressWarnings("deprecation")
      be.generated.student.Grade result = be.generated.student.Grade.valueOf(maths_);
      return result == null ? be.generated.student.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.Grade maths = 5;</code>
     * @param value The maths to set.
     * @return This builder for chaining.
     */
    public Builder setMaths(be.generated.student.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      maths_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Grade maths = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaths() {
      
      maths_ = 0;
      onChanged();
      return this;
    }

    private int art_ = 0;
    /**
     * <code>.Grade art = 6;</code>
     * @return The enum numeric value on the wire for art.
     */
    public int getArtValue() {
      return art_;
    }
    /**
     * <code>.Grade art = 6;</code>
     * @param value The enum numeric value on the wire for art to set.
     * @return This builder for chaining.
     */
    public Builder setArtValue(int value) {
      art_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Grade art = 6;</code>
     * @return The art.
     */
    public be.generated.student.Grade getArt() {
      @SuppressWarnings("deprecation")
      be.generated.student.Grade result = be.generated.student.Grade.valueOf(art_);
      return result == null ? be.generated.student.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.Grade art = 6;</code>
     * @param value The art to set.
     * @return This builder for chaining.
     */
    public Builder setArt(be.generated.student.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      art_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Grade art = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearArt() {
      
      art_ = 0;
      onChanged();
      return this;
    }

    private int chemistry_ = 0;
    /**
     * <code>.Grade chemistry = 7;</code>
     * @return The enum numeric value on the wire for chemistry.
     */
    public int getChemistryValue() {
      return chemistry_;
    }
    /**
     * <code>.Grade chemistry = 7;</code>
     * @param value The enum numeric value on the wire for chemistry to set.
     * @return This builder for chaining.
     */
    public Builder setChemistryValue(int value) {
      chemistry_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Grade chemistry = 7;</code>
     * @return The chemistry.
     */
    public be.generated.student.Grade getChemistry() {
      @SuppressWarnings("deprecation")
      be.generated.student.Grade result = be.generated.student.Grade.valueOf(chemistry_);
      return result == null ? be.generated.student.Grade.UNRECOGNIZED : result;
    }
    /**
     * <code>.Grade chemistry = 7;</code>
     * @param value The chemistry to set.
     * @return This builder for chaining.
     */
    public Builder setChemistry(be.generated.student.Grade value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      chemistry_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Grade chemistry = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearChemistry() {
      
      chemistry_ = 0;
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


    // @@protoc_insertion_point(builder_scope:StudentResponse)
  }

  // @@protoc_insertion_point(class_scope:StudentResponse)
  private static final be.generated.student.StudentResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new be.generated.student.StudentResponse();
  }

  public static be.generated.student.StudentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentResponse>
      PARSER = new com.google.protobuf.AbstractParser<StudentResponse>() {
    @java.lang.Override
    public StudentResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StudentResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public be.generated.student.StudentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

