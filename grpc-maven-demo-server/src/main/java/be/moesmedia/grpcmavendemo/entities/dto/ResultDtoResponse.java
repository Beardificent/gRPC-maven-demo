package be.moesmedia.grpcmavendemo.entities.dto;

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
public class ResultDtoResponse {

    private String id;

    private String maths;

    private String art;

    private String chemistry;

    private String studentId;

}
