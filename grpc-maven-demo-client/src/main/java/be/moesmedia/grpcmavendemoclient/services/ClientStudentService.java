package be.moesmedia.grpcmavendemoclient.services;

import be.moesmedia.generated.gender.Gender;
import be.moesmedia.generated.grade.Grade;
import be.moesmedia.generated.result.Result;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ClientStudentService {

  ManagedChannel managedChannel = ManagedChannelBuilder
    .forAddress("localhost", 6565)
    .usePlaintext()
    .build();

  StudentServiceBlockingStub studentServiceBlockingStub = StudentServiceGrpc.newBlockingStub(
    managedChannel
  );

  public Student getStudentOverview() {
    Result resultResponse = Result
      .newBuilder()
      .setMaths(Grade.FAIL)
      .setArt(Grade.FAIL)
      .setChemistry(Grade.FAIL)
      .build();

    Student student = studentServiceBlockingStub.getStudentOverview(
      StudentRequest
        .newBuilder()
        .setName("FemFluppe")
        .setAge(17)
        .setGender(Gender.FEMALE)
        .setResults(resultResponse)
        .build()
    );

    log.info("Received student response");
    log.info("name: " + student.getStudent().getName());
    log.info("age: " + student.getStudent().getAge());
    log.info("gender: " + student.getStudent().getGender());
    log.info("grades: " + student.getResults().getMaths());
    log.info("grades: " + student.getResults().getArt());
    log.info("grades: " + student.getResults().getChemistry());
    log.info(student.toString());

    log.info("CLIENT SIDE ::  GRPC_CLIENT_STUDENT_SERVICE has been used");
    return student;
  }
}
