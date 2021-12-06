package be.moesmedia.grpcmavendemo.service;

import be.moesmedia.grpcmavendemo.commons.exceptions.EntityNotFoundException;
import be.moesmedia.grpcmavendemo.commons.mappers.Mapper;
import be.moesmedia.grpcmavendemo.entities.Result;
import be.moesmedia.grpcmavendemo.entities.dto.ResultDtoResponse;
import be.moesmedia.grpcmavendemo.repositories.ResultRepository;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ResultService {

  private final ResultRepository resultRepository;
  private final Mapper<Result, ResultDtoResponse> resultEntityToResponseMapper;

  @Transactional
  public List<Result> getAllResults() {
    return resultRepository.findAll();
  }

  @Transactional
  public ResultDtoResponse getResultByStudentId(String id,String studentId) {
    return resultRepository
      .findByIdAndStudentId(UUID.fromString(id),UUID.fromString(studentId))
      .map(resultEntityToResponseMapper::map)
      .orElseThrow(EntityNotFoundException::new);
  }
}
