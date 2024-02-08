package com.rocketseat.certification_nwl.modules.students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.certification_nwl.modules.students.entities.StudentEntity;

import java.util.UUID;
import java.util.Optional;

public interface StudentRepository extends JpaRepository< StudentEntity, UUID> {

    public Optional<StudentEntity> findByEmail(String email);
    
}
