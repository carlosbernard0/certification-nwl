package com.rocketseat.certification_nwl.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.rocketseat.certification_nwl.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute(VerifyHasCertificationDTO dto){
        if (dto.getEmail().equals("carlosbernardo774@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}
