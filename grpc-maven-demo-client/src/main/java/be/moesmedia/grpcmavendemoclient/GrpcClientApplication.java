package be.moesmedia.grpcmavendemoclient;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class GrpcClientApplication {

    public static void main(String[] args) {
        //usePlainText should be replaced with a security checker
        SpringApplication.run(GrpcClientApplication.class, args);
    }
    
}
