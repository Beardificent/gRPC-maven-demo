package be.moesmedia.grpcmavendemo.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.moesmedia.grpcmavendemo.entities.ResultEntity;

@Repository
public interface ResultRepository extends JpaRepository<ResultEntity, UUID>{
    Optional<ResultEntity> findByIdAndStudentId(UUID id, UUID studentId);

}
