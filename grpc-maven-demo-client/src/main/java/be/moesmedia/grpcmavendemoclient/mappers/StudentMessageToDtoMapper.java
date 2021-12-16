package be.moesmedia.grpcmavendemoclient.mappers;

import be.moesmedia.generated.result.Result;
import be.moesmedia.generated.student.Student;
import be.moesmedia.grpcmavendemoclient.dto.StudentDetailDto;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class StudentMessageToDtoMapper implements Function<Student, StudentDetailDto>{

  @Override
  public StudentDetailDto apply(Student studentMessage) {
    return StudentDetailDto.builder()
    .name(studentMessage.getName())
    .age(studentMessage.getAge())
    .gender(studentMessage.getGender().name())
    //mapFrom Result
    .build();
  }
  
}
