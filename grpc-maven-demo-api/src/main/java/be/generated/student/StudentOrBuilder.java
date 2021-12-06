// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package be.generated.student;

public interface StudentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Student)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string student_id = 1;</code>
   * @return The studentId.
   */
  java.lang.String getStudentId();
  /**
   * <code>string student_id = 1;</code>
   * @return The bytes for studentId.
   */
  com.google.protobuf.ByteString
      getStudentIdBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 3;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>.Gender gender = 4;</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <code>.Gender gender = 4;</code>
   * @return The gender.
   */
  be.generated.student.Gender getGender();

  /**
   * <code>.Grade maths = 5;</code>
   * @return The enum numeric value on the wire for maths.
   */
  int getMathsValue();
  /**
   * <code>.Grade maths = 5;</code>
   * @return The maths.
   */
  be.generated.student.Grade getMaths();

  /**
   * <code>.Grade art = 6;</code>
   * @return The enum numeric value on the wire for art.
   */
  int getArtValue();
  /**
   * <code>.Grade art = 6;</code>
   * @return The art.
   */
  be.generated.student.Grade getArt();

  /**
   * <code>.Grade chemistry = 7;</code>
   * @return The enum numeric value on the wire for chemistry.
   */
  int getChemistryValue();
  /**
   * <code>.Grade chemistry = 7;</code>
   * @return The chemistry.
   */
  be.generated.student.Grade getChemistry();
}