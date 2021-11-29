package be.moesmedia.grpcmavendemoclient;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import be.generated.moes.ApiResponse;
import be.generated.moes.Demo;
import be.generated.moes.LoginRequest;
import be.generated.moes.UserGrpc;
import be.generated.moes.UserGrpc.UserBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class GrpcClientApplication {

    public static void main(String[] args) {
        //usePlainText should be replaced with a security checker
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565).usePlaintext().build();

    UserBlockingStub clientStub = UserGrpc.newBlockingStub(channel);

    LoginRequest request = LoginRequest.newBuilder().setFirstName("Fluppe").setPassword("Fluppe").build();
    ApiResponse response = clientStub.login(request);
    log.info("response: " + response.getResponseMessage());
    }
    
}
