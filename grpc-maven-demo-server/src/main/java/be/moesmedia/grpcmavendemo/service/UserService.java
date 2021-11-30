package be.moesmedia.grpcmavendemo.service;

import org.lognet.springboot.grpc.GRpcService;

import be.generated.moes.ApiResponse;
import be.generated.moes.LoginRequest;
import be.generated.moes.UserGrpc.UserImplBase;

@GRpcService
public class UserService extends UserImplBase {
    
    public void login(LoginRequest request,
        io.grpc.stub.StreamObserver<ApiResponse> responseObserver) {
                String userName = request.getFirstName();
                String password = request.getPassword();
                ApiResponse.Builder response = ApiResponse.newBuilder();


                if(userName.equals(password)){
                    response.setResponseCode(1).setResponseMessage("Success!");
                } else {
                    response.setResponseCode(0).setResponseMessage("Error!");
                }

                responseObserver.onNext(response.build());
                responseObserver.onCompleted();
    }

    public void logout(Void request,
        io.grpc.stub.StreamObserver<ApiResponse> responseObserver) {

    }

}
