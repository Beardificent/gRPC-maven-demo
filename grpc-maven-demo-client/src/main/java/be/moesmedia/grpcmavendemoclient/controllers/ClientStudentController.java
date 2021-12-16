package be.moesmedia.grpcmavendemoclient.controllers;

import be.moesmedia.generated.student.Student;
import be.moesmedia.grpcmavendemoclient.services.ClientStudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class ClientStudentController {
  
  private final ClientStudentService grpcClientStudentService;

  @GetMapping("/student")
  public List<Student> getStudentList() {
    log.info("Talk to server logic, receive responses");
    return grpcClientStudentService.getStudentOverview();
  }
}
