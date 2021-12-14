package be.moesmedia.grpcmavendemoclient.services;

import be.generated.gender.Gender;
import be.generated.student.Student;
import be.generated.student.StudentRequest;
import be.generated.student.StudentServiceGrpc;
import be.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
@Slf4j
@AllArgsConstructor
public class GrpcClientStudentService {

  ManagedChannel managedChannel = ManagedChannelBuilder
    .forAddress("localhost", 6565)
    .usePlaintext()
    .build();

  StudentServiceBlockingStub studentServiceBlockingStub = StudentServiceGrpc.newBlockingStub(
    managedChannel
  );

  public Student getStudentOverview() {
    StudentRequest studentRequest = StudentRequest
      .newBuilder()
      .setName("Fluppe")
      .setAge(17)
      .setGender(Gender.MALE)
      .build();

    Student studentResponse = studentServiceBlockingStub.getStudentOverview(
      studentRequest
    );

    log.info("Received student response");
    log.info("name: " + studentResponse.getStudent().getName());
    log.info("age: " + studentResponse.getStudent().getAge());
    log.info("gender: " + studentResponse.getStudent().getGender());

    managedChannel.shutdown();
    log.info("CLIENT SIDE ::  GRPC_CLIENT_STUDENT_SERVICE has been used");
    return studentResponse;
  }
}
