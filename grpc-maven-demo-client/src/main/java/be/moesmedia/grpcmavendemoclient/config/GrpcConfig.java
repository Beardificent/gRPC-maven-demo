package be.moesmedia.grpcmavendemoclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import be.moesmedia.generated.student.StudentServiceGrpc;
import be.moesmedia.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Configuration
public class GrpcConfig {

    @Value("${grpc.server.host}")
    private String grpcHost;

    @Value("${grpc.server.port}")
    private int grpcPort;

  @Bean
  public ManagedChannel grpcChannel() {
    return ManagedChannelBuilder.forAddress(grpcHost, grpcPort).usePlaintext().build();
  }

  @Bean
  public StudentServiceBlockingStub studentServiceStub(ManagedChannel grpcChannel) {
      return StudentServiceGrpc.newBlockingStub(grpcChannel);
  }
}
