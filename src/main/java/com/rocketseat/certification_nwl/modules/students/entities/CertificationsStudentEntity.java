package com.rocketseat.certification_nwl.modules.students.entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificationsStudentEntity {
    private UUID id;
    private UUID idStudent;
    private String technology;
    private int grape;
    private List<AnswersCertificationEntity> answersCertificationEntity;
}
