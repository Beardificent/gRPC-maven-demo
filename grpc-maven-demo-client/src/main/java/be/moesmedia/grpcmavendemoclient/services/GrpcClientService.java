package be.moesmedia.grpcmavendemoclient.services;

import be.generated.student.Gender;
import be.generated.student.StudentRequest;
import be.generated.student.StudentResponse;
import be.generated.student.StudentServiceGrpc;
import be.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GrpcClientService {

  public StudentResponse getStudentList() {
    ManagedChannel managedChannel = ManagedChannelBuilder
      .forAddress("localhost", 6565)
      .usePlaintext()
      .build();

    StudentServiceBlockingStub studentServiceBlockingStub = StudentServiceGrpc.newBlockingStub(
      managedChannel
    );

    StudentRequest studentRequest = StudentRequest
      .newBuilder()
      .setName("Fluppe")
      .setAge(17)
      .setGender(Gender.MALE)
      .build();

    StudentResponse studentResponse = studentServiceBlockingStub.getStudentInfo(
      studentRequest
    );

    log.debug("Received student response");
    log.debug("name: " + studentResponse.getName());
    log.debug("age: " + studentResponse.getAge());
    log.debug("gender: " + studentResponse.getGender());

    managedChannel.shutdown();

    return studentResponse;
  }
}
