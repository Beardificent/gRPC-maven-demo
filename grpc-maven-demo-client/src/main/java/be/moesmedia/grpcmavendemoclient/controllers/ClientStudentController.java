package be.moesmedia.grpcmavendemoclient.controllers;

import be.generated.student.Student;
import be.generated.student.StudentServiceGrpc;
import be.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import be.moesmedia.grpcmavendemoclient.services.ClientStudentService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class ClientStudentController {
  
  private final ClientStudentService grpcClientStudentService;



  @RequestMapping("/student")
  public Student getStudentList() {
    //Talk to server logic, receive responses
    log.info("Talk to server logic, receive responses");
    return grpcClientStudentService.getStudentOverview();
  }
}
