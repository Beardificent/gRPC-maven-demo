package be.moesmedia.grpcmavendemo.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name ="student")
@Data
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(
      name = "system-uuid",
      strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String gender;

    @Builder.Default
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Result> results = new ArrayList<>();
  
    public List<Result> getResults() {
      return List.copyOf(results);
    }
}