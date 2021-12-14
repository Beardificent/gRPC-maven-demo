package be.moesmedia.grpcmavendemoclient;

import be.generated.gender.Gender;
import be.generated.grade.Grade;
import be.generated.result.Result;
import be.generated.student.Student;
import be.generated.student.StudentRequest;
import be.generated.student.StudentServiceGrpc;
import be.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
  { "be.moesmedia.grpcdemomavenclient", "be.moesmedia.grpcdemomavendemo" }
)
@Slf4j
public class GrpcClientApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    ManagedChannel managedChannel = ManagedChannelBuilder
      .forAddress("localhost", 6565)
      .usePlaintext()
      .build();

    StudentServiceBlockingStub studentServiceBlockingStub = StudentServiceGrpc.newBlockingStub(
      managedChannel
    );

    Result resultResponse= Result
      .newBuilder()
      .setMaths(Grade.FAIL)
      .setArt(Grade.FAIL)
      .setChemistry(Grade.FAIL)
      .build();

    Student student = studentServiceBlockingStub.getStudentOverview(StudentRequest
      .newBuilder()
      .setName("Fluppe")
      .setAge(17)
      .setGender(Gender.FEMALE)
      .setResults(resultResponse)
      .build());

      log.info("name: " + student.getStudent().getName());
      log.info("age: " + student.getStudent().getAge());
      log.info("gender: " + student.getStudent().getGender());
      log.info("grades: " + student.getResults().getMaths());
      log.info("grades: " + student.getResults().getArt());
      log.info("grades: " + student.getResults().getChemistry());

      log.info(student.toString());
      managedChannel.shutdown();
  }
}
