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

import lombok.Builder;

@Entity
@Table(name ="result")
@Builder(toBuilder = true)
public class ResultEntity {

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
    private StudentEntity student;

}