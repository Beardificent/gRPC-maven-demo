package be.moesmedia.grpcmavendemoclient.dto.vo;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultsDto {

    private String id;

    @NotBlank
    private String maths;

    @NotBlank
    private String art;

    @NotBlank
    private String chemistry;

}
