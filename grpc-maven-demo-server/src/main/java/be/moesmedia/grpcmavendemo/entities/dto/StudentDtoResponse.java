package be.moesmedia.grpcmavendemo.entities.dto;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class StudentDtoResponse {
    
private String studentId;

private String name;

private Integer age;

private String gender;

private List<ResultDtoResponse> results;
}
