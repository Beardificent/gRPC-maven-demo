package be.moesmedia.grpcmavendemoclient.controllers;

import be.generated.student.StudentResponse;
import be.moesmedia.grpcmavendemoclient.services.GrpcClientStudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class GrpcClientStudentController {

  private final GrpcClientStudentService grpcClientStudentService;

  public StudentResponse getStudentList() {
   //Talk to server logic, receive responses
   log.info("Talk to server logic, receive responses");
   return null;
  }
    
}
