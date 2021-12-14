package be.moesmedia.grpcmavendemoclient.dto;

import be.moesmedia.grpcmavendemoclient.dto.vo.ResultsDto;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class UpdateResultsRequest extends ResultsDto{
    
}
