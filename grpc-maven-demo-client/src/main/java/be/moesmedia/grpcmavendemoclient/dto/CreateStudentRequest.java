package be.moesmedia.grpcmavendemoclient.dto;

import be.moesmedia.grpcmavendemoclient.dto.vo.ResultsDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreateStudentRequest extends AbstractUpsertStudentRequest{
    
    private ResultsDto result;
    
}
