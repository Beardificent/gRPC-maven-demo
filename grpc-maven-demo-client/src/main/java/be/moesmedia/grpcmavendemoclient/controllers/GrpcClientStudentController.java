package be.moesmedia.grpcmavendemoclient.controllers;

import be.generated.student.StudentResponse;
import be.moesmedia.grpcmavendemoclient.dtos.ClientStudentRequest;
import be.moesmedia.grpcmavendemoclient.dtos.ClientStudentResponse;
import be.moesmedia.grpcmavendemoclient.services.GrpcClientStudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GrpcClientStudentController {

  private final GrpcClientStudentService grpcClientStudentService;

  @GetMapping("/student")
  public StudentResponse getStudentList() {
    return grpcClientStudentService.getStudentList();
  }
}
