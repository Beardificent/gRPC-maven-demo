package be.moesmedia.grpcmavendemoclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import be.generated.student.StudentResponse;
import be.moesmedia.grpcmavendemoclient.services.GrpcClientService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GrpcClientServiceController {
    private final GrpcClientService grpcClientService;
    
    @GetMapping("/student")
    public StudentResponse testEndPoint(){
        return grpcClientService.getStudentList();
    } 
}
