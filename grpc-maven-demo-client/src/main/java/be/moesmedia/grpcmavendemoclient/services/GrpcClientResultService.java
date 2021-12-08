package be.moesmedia.grpcmavendemoclient.services;

import be.generated.result.Grade;
import be.generated.result.ResultRequest;
import be.generated.result.ResultResponse;
import be.generated.result.ResultServiceGrpc;
import be.generated.result.ResultServiceGrpc.ResultServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GrpcClientResultService {

  public ResultResponse getResultList() {
    ManagedChannel managedChannel = ManagedChannelBuilder
      .forAddress("localhost", 6565)
      .usePlaintext()
      .build();

    ResultServiceBlockingStub resultServiceBlockingStub = ResultServiceGrpc.newBlockingStub(
      managedChannel
    );

    ResultResponse resultResponse = resultServiceBlockingStub.getResultForStudents(
      ResultRequest
        .newBuilder()
        .setMaths(Grade.FAIL)
        .setArt(Grade.PASS)
        .setChemistry(Grade.FAIL)
        .build()
    );

    log.debug("Received result response");
    log.debug("Student grade: " + resultResponse.getStudentGrade());

    managedChannel.shutdown();

    return resultResponse;
  }
}
