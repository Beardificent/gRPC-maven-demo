package be.moesmedia.grpcmavendemo.controllers;

import be.generated.result.Grade;
import be.generated.result.ResultRequest;
import be.generated.result.ResultResponse;
import be.generated.result.ResultServiceGrpc.ResultServiceImplBase;
import be.moesmedia.grpcmavendemo.entities.dto.ResultDtoResponse;

import be.moesmedia.grpcmavendemo.repositories.ResultRepository;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.NoSuchElementException;
import java.util.UUID;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.transaction.annotation.Transactional;

@GRpcService
@Slf4j
@AllArgsConstructor
public class ResultGrpcService extends ResultServiceImplBase {
/* 
private final ResultRepository resultRepository;

 @Transactional
  public void getResultForStudent(
    ResultRequest request,
    StreamObserver<ResultResponse> observer, String studentId, String id
  ) {
    try {
        final var result = resultRepository.findByStudentId(UUID.fromString(studentId));

        ResultResponse.Builder resultResponse = ResultResponse
          .newBuilder()
          .setStudentId(studentId)
          .setMaths(Grade.valueOf(result.getMaths()))
          .setArt(Grade.valueOf(result.getArt()))
          .setChemistry(Grade.valueOf(result.getChemistry()))
          .build();
    
          observer.onNext(resultResponse.build());
          observer.onCompleted();
          
    } catch (NoSuchElementException e) {
        log.debug("No result found with this student id: " + studentId);
        observer.onError(Status.NOT_FOUND.asRuntimeException());

    } 

    //return resultRepository.findById(UUID.fromString(studentId));
  }  */
}
