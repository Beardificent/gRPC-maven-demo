package be.moesmedia.grpcmavendemo.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.moesmedia.grpcmavendemo.entities.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, UUID>{
    Optional<Result> findByIdAndStudentId(UUID id, UUID studentId);

}
