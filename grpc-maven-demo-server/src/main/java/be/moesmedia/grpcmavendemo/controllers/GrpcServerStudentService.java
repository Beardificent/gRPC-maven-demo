package be.moesmedia.grpcmavendemo.controllers;

import be.generated.student.Student;
import be.generated.student.StudentRequest;
import be.generated.student.StudentResponse;
import be.generated.student.StudentServiceGrpc.StudentServiceImplBase;


import be.moesmedia.grpcmavendemo.service.ServerStudentService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
@RequiredArgsConstructor
public class GrpcServerStudentService extends StudentServiceImplBase {

  private final ServerStudentService serverStudentService;


  @Override
  public void getStudentOverview(
    StudentRequest request,
    StreamObserver<StudentResponse> responseObserver
  ) {
     // return serverStudentService.getStudentOverview();
     
    responseObserver.onNext(serverStudentService.getStudentOverview());
    responseObserver.onCompleted();
  }
}
