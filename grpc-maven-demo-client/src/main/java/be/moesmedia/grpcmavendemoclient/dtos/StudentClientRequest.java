package be.moesmedia.grpcmavendemoclient.dtos;

import java.util.List;

import be.generated.student.Gender;
import lombok.Data;

@Data
public class StudentClientRequest {

  private String name;

  private Integer age;

  private Gender gender;
  
  private List<ResultClientRequest> results;

}
