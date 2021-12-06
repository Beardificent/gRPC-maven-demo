package be.moesmedia.grpcmavendemo.controllers;

import be.generated.result.ResultRequest;
import be.generated.result.ResultResponse;
import be.generated.result.ResultServiceGrpc.ResultServiceImplBase;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.web.bind.annotation.GetMapping;

@GRpcService
@Slf4j
@AllArgsConstructor
public class ResultGrpcService extends ResultServiceImplBase {

  @GetMapping("/result")
  public void getResultForStudents(
    ResultRequest request,
    StreamObserver<ResultResponse> responseObserver
  ) {
    ResultResponse result = ResultResponse
      .newBuilder()
      .setStudentGrade(
        "You've achieved a " +
        request.getMaths() +
        " on maths, " +
        " a " +
        request.getArt() +
        " on art and a " +
        request.getChemistry() +
        " on chemistry"
      )
      .build();

    log.info("HELLO RESULT_GRPC_SERVICE :: GET_RESULTS_FOR_STUDENTS");

    responseObserver.onNext(result);
    responseObserver.onCompleted();
  }
}
