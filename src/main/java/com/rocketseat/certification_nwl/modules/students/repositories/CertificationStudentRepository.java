package com.rocketseat.certification_nwl.modules.students.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rocketseat.certification_nwl.modules.students.entities.CertificationStudentEntity;
import java.util.UUID;
import java.util.List;

public interface CertificationStudentRepository extends JpaRepository<CertificationStudentEntity, UUID>{
    
    @Query("SELECT c FROM certifications c INNER JOIN c.studentEntity std WHERE std.email = :email AND c.technology = :technology")
    List<CertificationStudentEntity> findByStudentEmailAndTechnology(String email, String technology);    

}