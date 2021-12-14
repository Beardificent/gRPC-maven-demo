package be.moesmedia.grpcmavendemoclient.dto;

import java.util.List;

import be.moesmedia.grpcmavendemoclient.dto.vo.ResultsDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class StudentDetailDto {

  private String id;

  private String name;

  private Integer age;

  private String gender;

  private List<ResultsDto> results;

}
