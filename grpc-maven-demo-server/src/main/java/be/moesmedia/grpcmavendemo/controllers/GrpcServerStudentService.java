package be.moesmedia.grpcmavendemo.controllers;

import be.moesmedia.generated.student.GetManyStudentsRequest;
import be.moesmedia.generated.student.GetManyStudentsResponse;
import be.moesmedia.generated.student.StudentServiceGrpc.StudentServiceImplBase;
import be.moesmedia.grpcmavendemo.service.StudentService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
@RequiredArgsConstructor
public class GrpcServerStudentService extends StudentServiceImplBase {

  private final StudentService serverStudentService;

  @Override
  public void getStudentOverview(
    GetManyStudentsRequest request,
    StreamObserver<GetManyStudentsResponse> responseObserver
  ) {
    responseObserver.onNext(
      serverStudentService.getStudentOverview(
        request.getPage().getCurrentPage(),
        request.getPage().getItemsPerPage()
      )
    );
    responseObserver.onCompleted();
  }
}
