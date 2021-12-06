package be.moesmedia.grpcmavendemoclient.dtos;

import be.generated.result.Grade;
import lombok.Data;

@Data
public class ResultClientRequest {
    
    private String id;

    private Grade maths;

    private Grade art;

    private Grade chemistry;

    private Grade studentId;
}
