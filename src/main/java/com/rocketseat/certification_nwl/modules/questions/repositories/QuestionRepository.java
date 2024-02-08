package com.rocketseat.certification_nwl.modules.questions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocketseat.certification_nwl.modules.questions.entities.QuestionEntity;
import java.util.List;
import java.util.UUID;


public interface QuestionRepository extends JpaRepository <QuestionEntity, UUID> {
    List<QuestionEntity> findByTechnology(String technology);
}
