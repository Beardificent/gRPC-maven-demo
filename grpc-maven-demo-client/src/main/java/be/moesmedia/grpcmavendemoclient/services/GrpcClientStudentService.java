package be.moesmedia.grpcmavendemoclient.services;

import be.generated.student.Gender;
import be.generated.student.StudentRequest;
import be.generated.student.StudentResponse;
import be.generated.student.StudentServiceGrpc;
import be.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import be.moesmedia.grpcmavendemoclient.dtos.ClientStudentRequest;
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

  public StudentResponse getStudentList() {
    StudentRequest studentRequest = StudentRequest
      .newBuilder()
      .setName("Fluppe")
      .setAge(17)
      .setGender(Gender.MALE)
      .build();

    StudentResponse studentResponse = studentServiceBlockingStub.getStudentInfo(
      studentRequest
    );

    log.info("Received student response");
    log.info("name: " + studentResponse.getName());
    log.info("age: " + studentResponse.getAge());
    log.info("gender: " + studentResponse.getGender());

    managedChannel.shutdown();
    log.info("CLIENT SIDE ::  GRPC_CLIENT_STUDENT_SERVICE has been used");
    return studentResponse;
  }
}
