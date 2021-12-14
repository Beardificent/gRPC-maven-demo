package be.moesmedia.grpcmavendemoclient.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;


@Data
public abstract class AbstractUpsertStudentRequest {
    
    @NotBlank
    private String name;
    
    @NotBlank
    private Integer age;
    
    @NotBlank
    private String gender;

}
