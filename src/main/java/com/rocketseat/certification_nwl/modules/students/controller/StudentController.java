package com.rocketseat.certification_nwl.modules.students.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nwl.modules.students.dto.StudentCertificationAnswerDTO;
import com.rocketseat.certification_nwl.modules.students.useCases.VerifyIfHasCertificationUseCase;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @GetMapping("/HelloWorld")
    public String primeiraRequisicao(){
        return "Hello World";
    }

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody StudentCertificationAnswerDTO verifyHasCertificationDTO){

        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if(result){
            return "Usario ja fez a prova";
        }
        return "Usuario pode fazer a prova ";
    }
    
}
