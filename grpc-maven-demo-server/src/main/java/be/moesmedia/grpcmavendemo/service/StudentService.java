package be.moesmedia.grpcmavendemo.service;

import be.moesmedia.grpcmavendemo.commons.exceptions.EntityNotFoundException;
import be.moesmedia.grpcmavendemo.commons.mappers.Mapper;
import be.moesmedia.grpcmavendemo.entities.Student;
import be.moesmedia.grpcmavendemo.entities.dto.StudentDtoResponse;
import be.moesmedia.grpcmavendemo.repositories.StudentRepository;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;
  private final Mapper<Student, StudentDtoResponse> studentEntityToResponseMapper;

  @Transactional
  public List<Student> getStudentOverview() {
    return studentRepository.findAll();
  }

  @Transactional
  public StudentDtoResponse getStudentById(String studentId) {
    return studentRepository
      .findById(UUID.fromString(studentId))
      .map(studentEntityToResponseMapper::map)
      .orElseThrow(EntityNotFoundException::new);
  }
}
