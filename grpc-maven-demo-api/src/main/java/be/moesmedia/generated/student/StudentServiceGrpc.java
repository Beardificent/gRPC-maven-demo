package be.moesmedia.generated.student;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: student.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "resources.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<be.moesmedia.generated.student.GetManyStudentsRequest,
      be.moesmedia.generated.student.GetManyStudentsResponse> getGetStudentOverviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStudentOverview",
      requestType = be.moesmedia.generated.student.GetManyStudentsRequest.class,
      responseType = be.moesmedia.generated.student.GetManyStudentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.moesmedia.generated.student.GetManyStudentsRequest,
      be.moesmedia.generated.student.GetManyStudentsResponse> getGetStudentOverviewMethod() {
    io.grpc.MethodDescriptor<be.moesmedia.generated.student.GetManyStudentsRequest, be.moesmedia.generated.student.GetManyStudentsResponse> getGetStudentOverviewMethod;
    if ((getGetStudentOverviewMethod = StudentServiceGrpc.getGetStudentOverviewMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentOverviewMethod = StudentServiceGrpc.getGetStudentOverviewMethod) == null) {
          StudentServiceGrpc.getGetStudentOverviewMethod = getGetStudentOverviewMethod = 
              io.grpc.MethodDescriptor.<be.moesmedia.generated.student.GetManyStudentsRequest, be.moesmedia.generated.student.GetManyStudentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "resources.StudentService", "getStudentOverview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.moesmedia.generated.student.GetManyStudentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.moesmedia.generated.student.GetManyStudentsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("getStudentOverview"))
                  .build();
          }
        }
     }
     return getGetStudentOverviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<be.moesmedia.generated.student.CreateOneStudentRequest,
      be.moesmedia.generated.student.CreateOneStudentResponse> getCreateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createStudent",
      requestType = be.moesmedia.generated.student.CreateOneStudentRequest.class,
      responseType = be.moesmedia.generated.student.CreateOneStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.moesmedia.generated.student.CreateOneStudentRequest,
      be.moesmedia.generated.student.CreateOneStudentResponse> getCreateStudentMethod() {
    io.grpc.MethodDescriptor<be.moesmedia.generated.student.CreateOneStudentRequest, be.moesmedia.generated.student.CreateOneStudentResponse> getCreateStudentMethod;
    if ((getCreateStudentMethod = StudentServiceGrpc.getCreateStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getCreateStudentMethod = StudentServiceGrpc.getCreateStudentMethod) == null) {
          StudentServiceGrpc.getCreateStudentMethod = getCreateStudentMethod = 
              io.grpc.MethodDescriptor.<be.moesmedia.generated.student.CreateOneStudentRequest, be.moesmedia.generated.student.CreateOneStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "resources.StudentService", "createStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.moesmedia.generated.student.CreateOneStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.moesmedia.generated.student.CreateOneStudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("createStudent"))
                  .build();
          }
        }
     }
     return getCreateStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<be.moesmedia.generated.student.UpdateOneStudentRequest,
      be.moesmedia.generated.student.UpdateOneStudentResponse> getUpdateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateStudent",
      requestType = be.moesmedia.generated.student.UpdateOneStudentRequest.class,
      responseType = be.moesmedia.generated.student.UpdateOneStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.moesmedia.generated.student.UpdateOneStudentRequest,
      be.moesmedia.generated.student.UpdateOneStudentResponse> getUpdateStudentMethod() {
    io.grpc.MethodDescriptor<be.moesmedia.generated.student.UpdateOneStudentRequest, be.moesmedia.generated.student.UpdateOneStudentResponse> getUpdateStudentMethod;
    if ((getUpdateStudentMethod = StudentServiceGrpc.getUpdateStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getUpdateStudentMethod = StudentServiceGrpc.getUpdateStudentMethod) == null) {
          StudentServiceGrpc.getUpdateStudentMethod = getUpdateStudentMethod = 
              io.grpc.MethodDescriptor.<be.moesmedia.generated.student.UpdateOneStudentRequest, be.moesmedia.generated.student.UpdateOneStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "resources.StudentService", "updateStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.moesmedia.generated.student.UpdateOneStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.moesmedia.generated.student.UpdateOneStudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("updateStudent"))
                  .build();
          }
        }
     }
     return getUpdateStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<be.moesmedia.generated.student.DeleteOneStudentRequest,
      be.moesmedia.generated.student.DeleteOneStudentResponse> getDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteStudent",
      requestType = be.moesmedia.generated.student.DeleteOneStudentRequest.class,
      responseType = be.moesmedia.generated.student.DeleteOneStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.moesmedia.generated.student.DeleteOneStudentRequest,
      be.moesmedia.generated.student.DeleteOneStudentResponse> getDeleteStudentMethod() {
    io.grpc.MethodDescriptor<be.moesmedia.generated.student.DeleteOneStudentRequest, be.moesmedia.generated.student.DeleteOneStudentResponse> getDeleteStudentMethod;
    if ((getDeleteStudentMethod = StudentServiceGrpc.getDeleteStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getDeleteStudentMethod = StudentServiceGrpc.getDeleteStudentMethod) == null) {
          StudentServiceGrpc.getDeleteStudentMethod = getDeleteStudentMethod = 
              io.grpc.MethodDescriptor.<be.moesmedia.generated.student.DeleteOneStudentRequest, be.moesmedia.generated.student.DeleteOneStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "resources.StudentService", "deleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.moesmedia.generated.student.DeleteOneStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.moesmedia.generated.student.DeleteOneStudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("deleteStudent"))
                  .build();
          }
        }
     }
     return getDeleteStudentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStudentOverview(be.moesmedia.generated.student.GetManyStudentsRequest request,
        io.grpc.stub.StreamObserver<be.moesmedia.generated.student.GetManyStudentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentOverviewMethod(), responseObserver);
    }

    /**
     */
    public void createStudent(be.moesmedia.generated.student.CreateOneStudentRequest request,
        io.grpc.stub.StreamObserver<be.moesmedia.generated.student.CreateOneStudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStudentMethod(), responseObserver);
    }

    /**
     */
    public void updateStudent(be.moesmedia.generated.student.UpdateOneStudentRequest request,
        io.grpc.stub.StreamObserver<be.moesmedia.generated.student.UpdateOneStudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateStudentMethod(), responseObserver);
    }

    /**
     */
    public void deleteStudent(be.moesmedia.generated.student.DeleteOneStudentRequest request,
        io.grpc.stub.StreamObserver<be.moesmedia.generated.student.DeleteOneStudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteStudentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStudentOverviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                be.moesmedia.generated.student.GetManyStudentsRequest,
                be.moesmedia.generated.student.GetManyStudentsResponse>(
                  this, METHODID_GET_STUDENT_OVERVIEW)))
          .addMethod(
            getCreateStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                be.moesmedia.generated.student.CreateOneStudentRequest,
                be.moesmedia.generated.student.CreateOneStudentResponse>(
                  this, METHODID_CREATE_STUDENT)))
          .addMethod(
            getUpdateStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                be.moesmedia.generated.student.UpdateOneStudentRequest,
                be.moesmedia.generated.student.UpdateOneStudentResponse>(
                  this, METHODID_UPDATE_STUDENT)))
          .addMethod(
            getDeleteStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                be.moesmedia.generated.student.DeleteOneStudentRequest,
                be.moesmedia.generated.student.DeleteOneStudentResponse>(
                  this, METHODID_DELETE_STUDENT)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStudentOverview(be.moesmedia.generated.student.GetManyStudentsRequest request,
        io.grpc.stub.StreamObserver<be.moesmedia.generated.student.GetManyStudentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStudentOverviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createStudent(be.moesmedia.generated.student.CreateOneStudentRequest request,
        io.grpc.stub.StreamObserver<be.moesmedia.generated.student.CreateOneStudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStudent(be.moesmedia.generated.student.UpdateOneStudentRequest request,
        io.grpc.stub.StreamObserver<be.moesmedia.generated.student.UpdateOneStudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStudent(be.moesmedia.generated.student.DeleteOneStudentRequest request,
        io.grpc.stub.StreamObserver<be.moesmedia.generated.student.DeleteOneStudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public be.moesmedia.generated.student.GetManyStudentsResponse getStudentOverview(be.moesmedia.generated.student.GetManyStudentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStudentOverviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public be.moesmedia.generated.student.CreateOneStudentResponse createStudent(be.moesmedia.generated.student.CreateOneStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public be.moesmedia.generated.student.UpdateOneStudentResponse updateStudent(be.moesmedia.generated.student.UpdateOneStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public be.moesmedia.generated.student.DeleteOneStudentResponse deleteStudent(be.moesmedia.generated.student.DeleteOneStudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteStudentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.moesmedia.generated.student.GetManyStudentsResponse> getStudentOverview(
        be.moesmedia.generated.student.GetManyStudentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStudentOverviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.moesmedia.generated.student.CreateOneStudentResponse> createStudent(
        be.moesmedia.generated.student.CreateOneStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.moesmedia.generated.student.UpdateOneStudentResponse> updateStudent(
        be.moesmedia.generated.student.UpdateOneStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.moesmedia.generated.student.DeleteOneStudentResponse> deleteStudent(
        be.moesmedia.generated.student.DeleteOneStudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT_OVERVIEW = 0;
  private static final int METHODID_CREATE_STUDENT = 1;
  private static final int METHODID_UPDATE_STUDENT = 2;
  private static final int METHODID_DELETE_STUDENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT_OVERVIEW:
          serviceImpl.getStudentOverview((be.moesmedia.generated.student.GetManyStudentsRequest) request,
              (io.grpc.stub.StreamObserver<be.moesmedia.generated.student.GetManyStudentsResponse>) responseObserver);
          break;
        case METHODID_CREATE_STUDENT:
          serviceImpl.createStudent((be.moesmedia.generated.student.CreateOneStudentRequest) request,
              (io.grpc.stub.StreamObserver<be.moesmedia.generated.student.CreateOneStudentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT:
          serviceImpl.updateStudent((be.moesmedia.generated.student.UpdateOneStudentRequest) request,
              (io.grpc.stub.StreamObserver<be.moesmedia.generated.student.UpdateOneStudentResponse>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT:
          serviceImpl.deleteStudent((be.moesmedia.generated.student.DeleteOneStudentRequest) request,
              (io.grpc.stub.StreamObserver<be.moesmedia.generated.student.DeleteOneStudentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return be.moesmedia.generated.student.StudentOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetStudentOverviewMethod())
              .addMethod(getCreateStudentMethod())
              .addMethod(getUpdateStudentMethod())
              .addMethod(getDeleteStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
