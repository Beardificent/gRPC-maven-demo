package be.moesmedia.grpcmavendemo.mappers;

import be.moesmedia.generated.student.Student;
import be.moesmedia.grpcmavendemo.entities.StudentEntity;
import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class StudentEntityToGrpcMessageMapper
  implements Function<StudentEntity, Student> {

  @Override
  public Student apply(StudentEntity entity) {

    return Student
      .newBuilder()
      .setId(entity.getId().toString())
      .setName(entity.getName())
      .setAge(entity.getAge())
      .setGender(entity.getGender())
      .build();
  }
}
