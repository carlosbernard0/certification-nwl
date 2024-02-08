package com.rocketseat.certification_nwl.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.certification_nwl.modules.students.dto.StudentCertificationAnswerDTO;
import com.rocketseat.certification_nwl.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationUseCase {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;


    
    public boolean execute(StudentCertificationAnswerDTO dto){
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(),dto.getTechnology());
        if (!result.isEmpty()) {
            return true;

        }
        return false;
    }
}
