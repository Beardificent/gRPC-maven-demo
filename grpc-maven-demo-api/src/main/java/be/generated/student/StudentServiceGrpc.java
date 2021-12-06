package be.generated.student;

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

  public static final String SERVICE_NAME = "StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<be.generated.student.StudentRequest,
      be.generated.student.Student> getGetStudentInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStudentInfo",
      requestType = be.generated.student.StudentRequest.class,
      responseType = be.generated.student.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.generated.student.StudentRequest,
      be.generated.student.Student> getGetStudentInfoMethod() {
    io.grpc.MethodDescriptor<be.generated.student.StudentRequest, be.generated.student.Student> getGetStudentInfoMethod;
    if ((getGetStudentInfoMethod = StudentServiceGrpc.getGetStudentInfoMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentInfoMethod = StudentServiceGrpc.getGetStudentInfoMethod) == null) {
          StudentServiceGrpc.getGetStudentInfoMethod = getGetStudentInfoMethod = 
              io.grpc.MethodDescriptor.<be.generated.student.StudentRequest, be.generated.student.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentService", "getStudentInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.generated.student.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.generated.student.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("getStudentInfo"))
                  .build();
          }
        }
     }
     return getGetStudentInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<be.generated.student.StudentRequest,
      be.generated.student.StudentResponse> getCreateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createStudent",
      requestType = be.generated.student.StudentRequest.class,
      responseType = be.generated.student.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.generated.student.StudentRequest,
      be.generated.student.StudentResponse> getCreateStudentMethod() {
    io.grpc.MethodDescriptor<be.generated.student.StudentRequest, be.generated.student.StudentResponse> getCreateStudentMethod;
    if ((getCreateStudentMethod = StudentServiceGrpc.getCreateStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getCreateStudentMethod = StudentServiceGrpc.getCreateStudentMethod) == null) {
          StudentServiceGrpc.getCreateStudentMethod = getCreateStudentMethod = 
              io.grpc.MethodDescriptor.<be.generated.student.StudentRequest, be.generated.student.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "StudentService", "createStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.generated.student.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.generated.student.StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("createStudent"))
                  .build();
          }
        }
     }
     return getCreateStudentMethod;
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
    public void getStudentInfo(be.generated.student.StudentRequest request,
        io.grpc.stub.StreamObserver<be.generated.student.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentInfoMethod(), responseObserver);
    }

    /**
     */
    public void createStudent(be.generated.student.StudentRequest request,
        io.grpc.stub.StreamObserver<be.generated.student.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateStudentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStudentInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                be.generated.student.StudentRequest,
                be.generated.student.Student>(
                  this, METHODID_GET_STUDENT_INFO)))
          .addMethod(
            getCreateStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                be.generated.student.StudentRequest,
                be.generated.student.StudentResponse>(
                  this, METHODID_CREATE_STUDENT)))
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
    public void getStudentInfo(be.generated.student.StudentRequest request,
        io.grpc.stub.StreamObserver<be.generated.student.Student> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStudentInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createStudent(be.generated.student.StudentRequest request,
        io.grpc.stub.StreamObserver<be.generated.student.StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request, responseObserver);
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
    public be.generated.student.Student getStudentInfo(be.generated.student.StudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStudentInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public be.generated.student.StudentResponse createStudent(be.generated.student.StudentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateStudentMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<be.generated.student.Student> getStudentInfo(
        be.generated.student.StudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStudentInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.generated.student.StudentResponse> createStudent(
        be.generated.student.StudentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT_INFO = 0;
  private static final int METHODID_CREATE_STUDENT = 1;

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
        case METHODID_GET_STUDENT_INFO:
          serviceImpl.getStudentInfo((be.generated.student.StudentRequest) request,
              (io.grpc.stub.StreamObserver<be.generated.student.Student>) responseObserver);
          break;
        case METHODID_CREATE_STUDENT:
          serviceImpl.createStudent((be.generated.student.StudentRequest) request,
              (io.grpc.stub.StreamObserver<be.generated.student.StudentResponse>) responseObserver);
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
      return be.generated.student.StudentOuterClass.getDescriptor();
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
              .addMethod(getGetStudentInfoMethod())
              .addMethod(getCreateStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
