package be.generated.result;

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
    comments = "Source: result.proto")
public final class ResultServiceGrpc {

  private ResultServiceGrpc() {}

  public static final String SERVICE_NAME = "ResultService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<be.generated.result.ResultRequest,
      be.generated.result.ResultResponse> getGetResultForStudentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResultForStudents",
      requestType = be.generated.result.ResultRequest.class,
      responseType = be.generated.result.ResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.generated.result.ResultRequest,
      be.generated.result.ResultResponse> getGetResultForStudentsMethod() {
    io.grpc.MethodDescriptor<be.generated.result.ResultRequest, be.generated.result.ResultResponse> getGetResultForStudentsMethod;
    if ((getGetResultForStudentsMethod = ResultServiceGrpc.getGetResultForStudentsMethod) == null) {
      synchronized (ResultServiceGrpc.class) {
        if ((getGetResultForStudentsMethod = ResultServiceGrpc.getGetResultForStudentsMethod) == null) {
          ResultServiceGrpc.getGetResultForStudentsMethod = getGetResultForStudentsMethod = 
              io.grpc.MethodDescriptor.<be.generated.result.ResultRequest, be.generated.result.ResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ResultService", "getResultForStudents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.generated.result.ResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.generated.result.ResultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ResultServiceMethodDescriptorSupplier("getResultForStudents"))
                  .build();
          }
        }
     }
     return getGetResultForStudentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<be.generated.result.ResultRequest,
      be.generated.result.ResultResponse> getCreateResultForStudentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createResultForStudents",
      requestType = be.generated.result.ResultRequest.class,
      responseType = be.generated.result.ResultResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<be.generated.result.ResultRequest,
      be.generated.result.ResultResponse> getCreateResultForStudentsMethod() {
    io.grpc.MethodDescriptor<be.generated.result.ResultRequest, be.generated.result.ResultResponse> getCreateResultForStudentsMethod;
    if ((getCreateResultForStudentsMethod = ResultServiceGrpc.getCreateResultForStudentsMethod) == null) {
      synchronized (ResultServiceGrpc.class) {
        if ((getCreateResultForStudentsMethod = ResultServiceGrpc.getCreateResultForStudentsMethod) == null) {
          ResultServiceGrpc.getCreateResultForStudentsMethod = getCreateResultForStudentsMethod = 
              io.grpc.MethodDescriptor.<be.generated.result.ResultRequest, be.generated.result.ResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ResultService", "createResultForStudents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.generated.result.ResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  be.generated.result.ResultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ResultServiceMethodDescriptorSupplier("createResultForStudents"))
                  .build();
          }
        }
     }
     return getCreateResultForStudentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResultServiceStub newStub(io.grpc.Channel channel) {
    return new ResultServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResultServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ResultServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResultServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ResultServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ResultServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getResultForStudents(be.generated.result.ResultRequest request,
        io.grpc.stub.StreamObserver<be.generated.result.ResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetResultForStudentsMethod(), responseObserver);
    }

    /**
     */
    public void createResultForStudents(be.generated.result.ResultRequest request,
        io.grpc.stub.StreamObserver<be.generated.result.ResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateResultForStudentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetResultForStudentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                be.generated.result.ResultRequest,
                be.generated.result.ResultResponse>(
                  this, METHODID_GET_RESULT_FOR_STUDENTS)))
          .addMethod(
            getCreateResultForStudentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                be.generated.result.ResultRequest,
                be.generated.result.ResultResponse>(
                  this, METHODID_CREATE_RESULT_FOR_STUDENTS)))
          .build();
    }
  }

  /**
   */
  public static final class ResultServiceStub extends io.grpc.stub.AbstractStub<ResultServiceStub> {
    private ResultServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResultServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResultServiceStub(channel, callOptions);
    }

    /**
     */
    public void getResultForStudents(be.generated.result.ResultRequest request,
        io.grpc.stub.StreamObserver<be.generated.result.ResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetResultForStudentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createResultForStudents(be.generated.result.ResultRequest request,
        io.grpc.stub.StreamObserver<be.generated.result.ResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateResultForStudentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ResultServiceBlockingStub extends io.grpc.stub.AbstractStub<ResultServiceBlockingStub> {
    private ResultServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResultServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResultServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public be.generated.result.ResultResponse getResultForStudents(be.generated.result.ResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetResultForStudentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public be.generated.result.ResultResponse createResultForStudents(be.generated.result.ResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateResultForStudentsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ResultServiceFutureStub extends io.grpc.stub.AbstractStub<ResultServiceFutureStub> {
    private ResultServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResultServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResultServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResultServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.generated.result.ResultResponse> getResultForStudents(
        be.generated.result.ResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetResultForStudentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<be.generated.result.ResultResponse> createResultForStudents(
        be.generated.result.ResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateResultForStudentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESULT_FOR_STUDENTS = 0;
  private static final int METHODID_CREATE_RESULT_FOR_STUDENTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResultServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResultServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESULT_FOR_STUDENTS:
          serviceImpl.getResultForStudents((be.generated.result.ResultRequest) request,
              (io.grpc.stub.StreamObserver<be.generated.result.ResultResponse>) responseObserver);
          break;
        case METHODID_CREATE_RESULT_FOR_STUDENTS:
          serviceImpl.createResultForStudents((be.generated.result.ResultRequest) request,
              (io.grpc.stub.StreamObserver<be.generated.result.ResultResponse>) responseObserver);
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

  private static abstract class ResultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResultServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return be.generated.result.Result.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResultService");
    }
  }

  private static final class ResultServiceFileDescriptorSupplier
      extends ResultServiceBaseDescriptorSupplier {
    ResultServiceFileDescriptorSupplier() {}
  }

  private static final class ResultServiceMethodDescriptorSupplier
      extends ResultServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResultServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResultServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResultServiceFileDescriptorSupplier())
              .addMethod(getGetResultForStudentsMethod())
              .addMethod(getCreateResultForStudentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
