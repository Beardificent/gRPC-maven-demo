package be.moesmedia.grpcmavendemo.controllers;

import be.generated.grade.Grade;
import be.generated.result.Result;
import be.generated.student.Student;
import be.generated.student.StudentRequest;
import be.generated.student.StudentResponse;
import be.generated.student.StudentServiceGrpc.StudentServiceImplBase;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
@RequiredArgsConstructor
public class GrpcServerStudentService extends StudentServiceImplBase {

  //private final ServerStudentService serverStudentService;

  @Override
  public void getStudentOverview(
    StudentRequest request,
    StreamObserver<Student> responseObserver
  ) {
    Result studentResult = Result
      .newBuilder()
      .setStudentId(request.getStudentId())
      .setMaths(request.getResults().getMaths())
      .setArt(request.getResults().getArt())
      .setChemistry(request.getResults().getChemistry())
      .build();

    StudentResponse studentResponse = StudentResponse
      .newBuilder()
      .setName(request.getName())
      .setAge(request.getAge())
      .setGender(request.getGender())
      .build();
    // return serverStudentService.getStudentOverview();

    Student student = Student.newBuilder().setStudent(studentResponse).setResults(studentResult).build();
    responseObserver.onNext(student);
    responseObserver.onCompleted();
  }
}
