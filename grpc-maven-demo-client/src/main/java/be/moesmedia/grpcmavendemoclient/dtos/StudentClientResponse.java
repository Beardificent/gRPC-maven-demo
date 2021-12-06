package be.moesmedia.grpcmavendemoclient.dtos;

import java.util.List;

import be.generated.student.Gender;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
public class StudentClientResponse {
    private String name;

    private Integer age;

    private Gender gender;

    private List<ResultClientRequest> results;
}
