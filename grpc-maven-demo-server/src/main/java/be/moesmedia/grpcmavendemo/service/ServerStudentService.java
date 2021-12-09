package be.moesmedia.grpcmavendemo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import be.moesmedia.grpcmavendemo.entities.dto.StudentDtoResponse;
import be.moesmedia.grpcmavendemo.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServerStudentService {
    private final StudentRepository studentRepository;

    @Transactional
    public List<StudentDtoResponse> getStudentOverview(){
        return studentRepository.findAll().stream().map(student -> {
            final var response = new StudentDtoResponse();
            response.setName(student.getName());
            response.setAge(student.getAge());
            response.setGender(student.getGender());
            return response;
        }).collect(Collectors.toList());
    }
}
