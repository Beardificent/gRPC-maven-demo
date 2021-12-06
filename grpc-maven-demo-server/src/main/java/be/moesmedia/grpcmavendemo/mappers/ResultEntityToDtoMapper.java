package be.moesmedia.grpcmavendemo.mappers;


import be.moesmedia.grpcmavendemo.commons.mappers.BiMapper;
import be.moesmedia.grpcmavendemo.entities.Result;
import be.moesmedia.grpcmavendemo.entities.dto.ResultDtoResponse;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
 
@Component
@RequiredArgsConstructor
public class ResultEntityToDtoMapper implements BiMapper<Result, ResultDtoResponse> {

  @Override
  public ResultDtoResponse map(Result mapFrom, ResultDtoResponse mapTo) {
    return ResultDtoResponse
      .builder()
      .studentId(mapFrom.getId().toString())
      .maths(mapFrom.getMaths())
      .art(mapFrom.getArt())
      .chemistry(mapFrom.getChemistry())
      .build();
  }

  @Override
  public Result mapBack(ResultDtoResponse mapFrom, Result mapTo) {
    return mapTo
      .toBuilder()
      .id(mapFrom.getStudentId() == null ? null : UUID.fromString(mapFrom.getStudentId()))
      .maths(mapFrom.getMaths())
      .art(mapFrom.getArt())
      .chemistry(mapFrom.getChemistry())
      .build();
  }
} 
