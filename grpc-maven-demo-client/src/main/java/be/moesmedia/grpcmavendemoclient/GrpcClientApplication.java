package be.moesmedia.grpcmavendemoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"be.moesmedia.grpcdemomavenclient","be.moesmedia.grpcdemomavendemo"})
public class GrpcClientApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(GrpcClientApplication.class, args);
  }
}