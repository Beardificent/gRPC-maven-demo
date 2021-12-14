package be.moesmedia.grpcmavendemoclient.dtos;

import java.util.List;

import be.generated.gender.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class ClientStudentRequest {

  private String name;

  private Integer age;

  private Gender gender;
  
  private List<ClientResultRequest> results;

}
