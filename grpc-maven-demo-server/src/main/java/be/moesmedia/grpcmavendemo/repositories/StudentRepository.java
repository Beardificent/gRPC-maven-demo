package be.moesmedia.grpcmavendemo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.moesmedia.grpcmavendemo.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID>{

}
