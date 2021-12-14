package be.moesmedia.grpcmavendemoclient.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateStudentRequest extends AbstractUpsertStudentRequest{
    
    @NotNull
    private String id;
}
