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
public class StudentGrpcService extends StudentServiceImplBase {


  public void getStudentInfo(
    StudentRequest request,
    StreamObserver<StudentResponse> responseObserver
  ) {
    log.info("gender: " + request.getGender());
    StudentResponse student = StudentResponse
      .newBuilder()
      .setName(request.getName())
      .setGender(request.getGender())
      .setAge(request.getAge())
      .build();

    log.info("HELLO STUDENT_GRPC_SERVICE :: GET_STUDENT_INFO");

    responseObserver.onNext(student);
    responseObserver.onCompleted();
  }
}
