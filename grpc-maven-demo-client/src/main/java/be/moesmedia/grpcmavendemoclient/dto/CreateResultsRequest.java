package be.moesmedia.grpcmavendemoclient.dto;

import be.moesmedia.grpcmavendemoclient.dto.vo.ResultsDto;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class CreateResultsRequest extends ResultsDto {
    
}
