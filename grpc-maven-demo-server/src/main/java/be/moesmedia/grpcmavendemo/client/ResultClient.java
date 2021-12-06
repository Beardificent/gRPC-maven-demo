package be.moesmedia.grpcmavendemo.client;

import java.util.ArrayList;
import java.util.List;

import be.generated.result.ResultRequest;
import be.generated.result.ResultResponse;
import be.generated.result.ResultServiceGrpc;
import io.grpc.Channel;

/* public class ResultClient {
    
private ResultServiceGrpc.ResultServiceBlockingStub resultServiceBlockingStub;

public ResultClient(Channel channel) {
    resultServiceBlockingStub = ResultServiceGrpc.newBlockingStub(channel);
}

public List<String> getResults(String studentId) {
    ResultRequest resultRequest = ResultRequest.newBuilder().setStudentId(studentId).build();
    ResultResponse resultResponse = resultServiceBlockingStub.getResultForStudents(resultRequest);

    List<String> results = new ArrayList<String>();
    results.add(resultResponse.getMaths().toString());
    results.add(resultResponse.getArt().toString());
    results.add(resultResponse.getChemistry().toString());

    return results;
}
} */
