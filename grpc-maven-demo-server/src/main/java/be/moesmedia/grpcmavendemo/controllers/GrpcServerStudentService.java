package be.moesmedia.grpcmavendemo.controllers;

import be.generated.student.StudentRequest;
import be.generated.student.StudentResponse;
import be.generated.student.StudentServiceGrpc.StudentServiceImplBase;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
@RequiredArgsConstructor
@Slf4j
public class GrpcServerStudentService extends StudentServiceImplBase {


  public void getStudentInfo(
    StudentRequest request,
    StreamObserver<StudentResponse> responseObserver
  ) {

    StudentResponse student = StudentResponse
      .newBuilder()
      .setName(request.getName())
      .setGender(request.getGender())
      .setAge(request.getAge())
      .build();

    log.info("SERVER SIDE     :: GRPC_SERVER_STUDENT_SERVICE has been used");
    log.info("StudentResponse :: NAME: " + request.getName());
    log.info("StudentResponse :: AGE: " + request.getAge());
    log.info("StudentResponse :: GENDER: " + request.getGender());

    responseObserver.onNext(student);
    responseObserver.onCompleted();
  }
}
