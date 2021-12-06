package be.moesmedia.grpcmavendemoclient.services;

import be.generated.student.Student;
import be.generated.student.StudentRequest;
import be.generated.student.StudentResponse;
import be.generated.student.StudentServiceGrpc;
import be.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import be.moesmedia.grpcmavendemoclient.dtos.StudentClientRequest;
import be.moesmedia.grpcmavendemoclient.dtos.StudentClientResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.stereotype.Service;

@Service
public class ClientGrpcService {

  public void addStudent(StudentClientRequest request) {
    ManagedChannel channel = ManagedChannelBuilder
      .forTarget("localhost:6565")
      .usePlaintext()
      .build();
    StudentServiceBlockingStub stub = StudentServiceGrpc.newBlockingStub(
      channel
    );
    Student student = stub.createStudent(
      StudentRequest
        .newBuilder()
        .setName(request.getName())
        .setAge(request.getAge())
        .setGender(request.getGender())
        .build()
    );
    channel.shutdown();
    return student;
  }

  public List<StudentClientResponse> getAllStudent() {
    ManagedChannel channel = ManagedChannelBuilder
      .forTarget("localhost:6565")
      .usePlaintext()
      .build();

    StudentServiceBlockingStub stub = StudentServiceGrpc.newBlockingStub(
      channel
    );

    List<StudentClientResponse> response = new ArrayList<>();

    StudentResponse studentGrpcResponse = stub.getStudentInfo(
      StudentRequest.newBuilder().build()
    );
    channel.shutdown();

    for (Student student : studentGrpcResponse.getStudentList()) {
      StudentClientResponse studentResponse = StudentClientResponse
        .builder()
        .name(student.getName())
        .age(student.getAge())
        .gender(student.getGender())
        .build();

      response.add(studentResponse);
    }

    return response;
  }
}
