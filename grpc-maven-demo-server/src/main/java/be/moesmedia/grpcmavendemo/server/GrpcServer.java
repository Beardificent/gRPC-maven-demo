/* package be.moesmedia.grpcmavendemo.server;

import java.io.IOException;

import be.moesmedia.grpcmavendemo.service.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;


//Dees class mag weg denk ik door de grpcservice annotatie van lognet
@Slf4j
public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9091).addService(new UserService()).build();

        server.start();
        log.info("Server started on " + server.getPort());

        server.awaitTermination();
    }
}
 */