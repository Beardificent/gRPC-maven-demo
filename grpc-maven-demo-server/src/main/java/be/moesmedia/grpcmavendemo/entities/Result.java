package be.moesmedia.grpcmavendemo.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name ="result")
@Data
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(
      name = "system-uuid",
      strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column
    private String maths;

    @Column
    private String art;

    @Column
    private String chemistry;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Student getStudent() {
        return student.toBuilder().build();
      }
}