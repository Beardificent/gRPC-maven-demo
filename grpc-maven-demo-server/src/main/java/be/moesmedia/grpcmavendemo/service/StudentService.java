package be.moesmedia.grpcmavendemo.service;

import be.moesmedia.generated.student.GetManyStudentsResponse;
import be.moesmedia.generated.student.Student;
import be.moesmedia.grpcmavendemo.entities.StudentEntity;
import be.moesmedia.grpcmavendemo.repositories.StudentRepository;

import java.util.function.Function;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;
  private final Function<StudentEntity, Student> studentEntityToGrpcMessageMapper;

  @Transactional
  public GetManyStudentsResponse getStudentOverview(
    int pageNumber,
    int itemsPerPage
  ) {
    return GetManyStudentsResponse
      .newBuilder()
      .addAllStudents(
        studentRepository
          .findAll(PageRequest.of(pageNumber, itemsPerPage))
          .stream()
          .map(studentEntityToGrpcMessageMapper)
          .collect(Collectors.toList())
      )
      .build();
  }
}
