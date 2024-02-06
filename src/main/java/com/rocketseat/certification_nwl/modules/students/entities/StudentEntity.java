package com.rocketseat.certification_nwl.modules.students.entities;

import java.util.UUID;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    private UUID id;
    private String email;
    private List<CertificationsStudentEntity> certificationsStudentEntity;
    
}
