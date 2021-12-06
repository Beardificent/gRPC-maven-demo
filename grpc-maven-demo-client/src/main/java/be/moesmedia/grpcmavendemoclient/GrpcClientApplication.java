package be.moesmedia.grpcmavendemoclient;

import be.generated.result.Grade;
import be.generated.result.ResultRequest;
import be.generated.result.ResultResponse;
import be.generated.result.ResultServiceGrpc;
import be.generated.result.ResultServiceGrpc.ResultServiceBlockingStub;
import be.generated.student.Gender;
import be.generated.student.Student;
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

    StudentServiceBlockingStub studentServiceBlockingStub = StudentServiceGrpc.newBlockingStub(
      managedChannel
    );
    ResultServiceBlockingStub resultServiceBlockingStub = ResultServiceGrpc.newBlockingStub(
      managedChannel
    );

    StudentRequest studentRequest = StudentRequest
      .newBuilder()
      .setName("Fluppe")
      .setAge(17)
      .setGender(Gender.valueOf("MALE"))
      .build();

    ResultRequest resultRequest = ResultRequest
      .newBuilder()
      .setMaths(Grade.valueOf("FAIL"))
      .setArt(Grade.valueOf("PASS"))
      .setChemistry(Grade.valueOf("FAIL"))
      .build();

    StudentResponse studentResponse = studentServiceBlockingStub.getStudentInfo(
      studentRequest
    );
    ResultResponse resultResponse = resultServiceBlockingStub.getResultForStudents(
      resultRequest
    );

    log.debug("Received student response: " + studentResponse.getName());
    log.debug("Received result response: " + resultResponse.getStudentGrade());

    managedChannel.shutdown();
  }
}
