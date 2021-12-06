package be.moesmedia.grpcmavendemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"be.moesmedia.grpcmavendemo.commons.mappers"})
public class GrpcMavenDemoApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(GrpcMavenDemoApplication.class, args);
	}

}
