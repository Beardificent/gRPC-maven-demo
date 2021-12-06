package be.moesmedia.grpcmavendemo.controllers;

import be.generated.result.Grade;
import be.generated.student.Gender;
import be.generated.student.Student;
import be.generated.student.StudentRequest;
import be.generated.student.StudentResponse;
import be.generated.student.StudentServiceGrpc.StudentServiceImplBase;
import be.moesmedia.grpcmavendemo.client.ResultClient;
import be.moesmedia.grpcmavendemo.entities.dto.StudentDtoResponse;
import be.moesmedia.grpcmavendemo.repositories.StudentRepository;
import be.moesmedia.grpcmavendemo.service.StudentService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@GRpcService
@RequiredArgsConstructor
@RequestMapping(value = StudentGrpcService.BASE_PATH)
@Slf4j
public class StudentGrpcService extends StudentServiceImplBase {

  public static final String BASE_PATH = "/student";

  private final StudentService studentService;

  private final StudentRepository studentRepository;

  //https://blog.piinalpin.com/2021/01/create-simple-microservice-with-grpc/#what-is-grpc
  private static final List<Student> ALL_STUDENTS = List.of(
    Student
      .newBuilder()
      .setName("Fluppe Verboven")
      .setAge(30)
      .setGender(Gender.valueOf("MALE"))
      .build(),
    Student
      .newBuilder()
      .setName("Dikke Louisa")
      .setAge(54)
      .setGender(Gender.valueOf("FEMALE"))
      .build()
  );

  //https://blog.piinalpin.com/2021/01/create-simple-microservice-with-grpc/#what-is-grpc
  public void getAllStudentInfo(
    StudentRequest request,
    StreamObserver<StudentResponse> observer
  ) {
    StudentResponse response = StudentResponse
      .newBuilder()
      .addAllStudent(ALL_STUDENTS)
      .build();
    observer.onNext(response);
    observer.onCompleted();
  }

  public void addStudent(
    StudentRequest request,
    StreamObserver<Student> observer
  ) {
    Student studentToAdd = Student
      .newBuilder()
      .setName(request.getName())
      .setAge(request.getAge())
      .setGender(request.getGender())
      .build();

    observer.onNext(studentToAdd);
    observer.onCompleted();
  }

  @GetMapping("/${id}")
  public StudentDtoResponse getStudent(@PathVariable("id") String id) {
    return studentService.getStudentById(id);
  }

  public List<String> getResults(String studentId) {
    ManagedChannel channel = ManagedChannelBuilder
      .forTarget("localhost:6565")
      .usePlaintext()
      .build();

    ResultClient resultClient = new ResultClient(channel);

    return resultClient.getResults(studentId);
  }
}
