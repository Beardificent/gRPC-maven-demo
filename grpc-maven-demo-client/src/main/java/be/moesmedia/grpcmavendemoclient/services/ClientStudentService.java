package be.moesmedia.grpcmavendemoclient.services;

import be.moesmedia.generated.student.GetManyStudentsRequest;
import be.moesmedia.generated.student.PagingInfo;
import be.moesmedia.generated.student.Student;
import be.moesmedia.generated.student.StudentServiceGrpc.StudentServiceBlockingStub;
import be.moesmedia.grpcmavendemoclient.dto.StudentDetailDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.function.Function;

import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientStudentService {

  private final StudentServiceBlockingStub studentServiceStub;
  private final Function<Student, StudentDetailDto> studentMessageToDtoMapper;

  public List<Student> getStudentOverview() {
    final var getManyStudentResponse = studentServiceStub.getStudentOverview(
      GetManyStudentsRequest
        .newBuilder()
        .setPage(
          PagingInfo.newBuilder().setCurrentPage(0).setItemsPerPage(15).build()
        )
        .build()
    );

    log.info("Received student response: " + getManyStudentResponse.toString());
    return getManyStudentResponse.getStudentsList();
  }
}
