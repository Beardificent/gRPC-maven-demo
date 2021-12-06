package be.moesmedia.grpcmavendemoclient;

import be.generated.result.Grade;
import be.generated.result.ResultRequest;
import be.generated.result.ResultResponse;
import be.generated.result.ResultServiceGrpc;
import be.generated.result.ResultServiceGrpc.ResultServiceBlockingStub;
import be.generated.student.Gender;
import be.generated.student.StudentRequest;
import be.generated.student.StudentResponse;
import be.generated.student.StudentServiceGrpc;
import be.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GrpcClientApplication {

  public static void main(String[] args) {
    ManagedChannel managedChannel = ManagedChannelBuilder
      .forAddress("localhost", 6565)
      .usePlaintext()
      .build();

    ResultServiceBlockingStub resultServiceBlockingStub = ResultServiceGrpc.newBlockingStub(
      managedChannel
    );

    ResultRequest resultRequest = ResultRequest
      .newBuilder()
      .setMaths(Grade.FAIL)
      .setArt(Grade.PASS)
      .setChemistry(Grade.FAIL)
      .build();

    ResultResponse resultResponse = resultServiceBlockingStub.getResultForStudents(
      resultRequest
    );


    log.debug("Received result response");
    log.debug("Student grade: " + resultResponse.getStudentGrade());

    managedChannel.shutdown();
  }
}
