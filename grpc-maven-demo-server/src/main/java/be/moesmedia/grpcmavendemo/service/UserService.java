package be.moesmedia.grpcmavendemo.service;

import org.lognet.springboot.grpc.GRpcService;

import be.generated.demo.ApiResponse;
import be.generated.demo.LoginRequest;
import be.generated.demo.UserGrpc.UserImplBase;


@GRpcService
public class UserService extends UserImplBase {
    
    public void login(LoginRequest request,
        io.grpc.stub.StreamObserver<ApiResponse> responseObserver) {
                String userName = request.getFirstName();
                String password = request.getPassword();
                ApiResponse.Builder response = ApiResponse.newBuilder();


                if(userName.equals(password)){
                    response.setResponseCode(1).setResponseMessage("Demo is a success!");
                } else {
                    response.setResponseCode(0).setResponseMessage("Demo has an error!");
                }

                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
    }

    public void logout(Void request,
        io.grpc.stub.StreamObserver<ApiResponse> responseObserver) {

    }

}
