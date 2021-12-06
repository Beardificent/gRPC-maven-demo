package be.moesmedia.grpcmavendemoclient.controllers;

import be.generated.student.Student;
import be.moesmedia.grpcmavendemoclient.dtos.StudentClientRequest;
import be.moesmedia.grpcmavendemoclient.dtos.StudentClientResponse;
import be.moesmedia.grpcmavendemoclient.services.ClientGrpcService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientStudentController {

  private final ClientGrpcService clientGrpcService;

  public StudentClientResponse addStudent(
    @RequestBody StudentClientRequest request
  ) {
    Student student = clientGrpcService.addStudent(request);

    return StudentClientResponse
      .builder()
      .name(student.getName())
      .age(student.getAge())
      .build();
  }

  public List<StudentClientResponse> getAllStudentInfo(){
      return clientGrpcService.getAllStudent();
  }
}
