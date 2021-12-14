// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package be.moesmedia.generated.student;

public final class StudentOuterClass {
  private StudentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_CreateOneStudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_CreateOneStudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_CreateOneStudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_CreateOneStudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_DeleteOneStudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_DeleteOneStudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_DeleteOneStudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_DeleteOneStudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_GetManyStudentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_GetManyStudentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_GetManyStudentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_GetManyStudentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_UpdateOneStudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_UpdateOneStudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_UpdateOneStudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_UpdateOneStudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_Student_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_Student_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resources_PagingInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resources_PagingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rstudent.proto\022\tresources\032\023common/gende" +
      "r.proto\032\014result.proto\">\n\027CreateOneStuden" +
      "tRequest\022#\n\007student\030\001 \001(\0132\022.resources.St" +
      "udent\"&\n\030CreateOneStudentResponse\022\n\n\002id\030" +
      "\001 \001(\t\"%\n\027DeleteOneStudentRequest\022\n\n\002id\030\001" +
      " \001(\t\"+\n\030DeleteOneStudentResponse\022\017\n\007succ" +
      "ess\030\001 \001(\010\"=\n\026GetManyStudentsRequest\022#\n\004p" +
      "age\030\001 \001(\0132\025.resources.PagingInfo\"?\n\027GetM" +
      "anyStudentsResponse\022$\n\010students\030\001 \003(\0132\022." +
      "resources.Student\">\n\027UpdateOneStudentReq" +
      "uest\022#\n\007student\030\001 \001(\0132\022.resources.Studen" +
      "t\",\n\030UpdateOneStudentResponse\022\020\n\010checksu" +
      "m\030\001 \001(\t\"t\n\007Student\022\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002" +
      " \001(\t\022\013\n\003age\030\003 \001(\005\022\036\n\006gender\030\004 \001(\0162\016.comm" +
      "on.Gender\022\"\n\007results\030\005 \001(\0132\021.resources.R" +
      "esult\"7\n\nPagingInfo\022\023\n\013currentPage\030\001 \001(\005" +
      "\022\024\n\014itemsPerPage\030\002 \001(\0052\203\003\n\016StudentServic" +
      "e\022]\n\022getStudentOverview\022!.resources.GetM" +
      "anyStudentsRequest\032\".resources.GetManySt" +
      "udentsResponse\"\000\022Z\n\rcreateStudent\022\".reso" +
      "urces.CreateOneStudentRequest\032#.resource" +
      "s.CreateOneStudentResponse\"\000\022Z\n\rupdateSt" +
      "udent\022\".resources.UpdateOneStudentReques" +
      "t\032#.resources.UpdateOneStudentResponse\"\000" +
      "\022Z\n\rdeleteStudent\022\".resources.DeleteOneS" +
      "tudentRequest\032#.resources.DeleteOneStude" +
      "ntResponse\"\000B\"\n\036be.moesmedia.generated.s" +
      "tudentP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          be.moesmedia.generated.gender.GenderOuterClass.getDescriptor(),
          be.moesmedia.generated.result.ResultOuterClass.getDescriptor(),
        });
    internal_static_resources_CreateOneStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_resources_CreateOneStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_CreateOneStudentRequest_descriptor,
        new java.lang.String[] { "Student", });
    internal_static_resources_CreateOneStudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_resources_CreateOneStudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_CreateOneStudentResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_resources_DeleteOneStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_resources_DeleteOneStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_DeleteOneStudentRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_resources_DeleteOneStudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_resources_DeleteOneStudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_DeleteOneStudentResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_resources_GetManyStudentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_resources_GetManyStudentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_GetManyStudentsRequest_descriptor,
        new java.lang.String[] { "Page", });
    internal_static_resources_GetManyStudentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_resources_GetManyStudentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_GetManyStudentsResponse_descriptor,
        new java.lang.String[] { "Students", });
    internal_static_resources_UpdateOneStudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_resources_UpdateOneStudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_UpdateOneStudentRequest_descriptor,
        new java.lang.String[] { "Student", });
    internal_static_resources_UpdateOneStudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_resources_UpdateOneStudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_UpdateOneStudentResponse_descriptor,
        new java.lang.String[] { "Checksum", });
    internal_static_resources_Student_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_resources_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_Student_descriptor,
        new java.lang.String[] { "Id", "Name", "Age", "Gender", "Results", });
    internal_static_resources_PagingInfo_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_resources_PagingInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resources_PagingInfo_descriptor,
        new java.lang.String[] { "CurrentPage", "ItemsPerPage", });
    be.moesmedia.generated.gender.GenderOuterClass.getDescriptor();
    be.moesmedia.generated.result.ResultOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
