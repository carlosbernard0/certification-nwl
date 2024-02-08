package com.rocketseat.certification_nwl.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.certification_nwl.modules.students.dto.StudentCertificationAnswerDTO;
import com.rocketseat.certification_nwl.modules.students.repositories.StudentRepository;

@Service
public class StudentCertificationAnswersUseCase {
    @Autowired
    private StudentRepository studentRepository;

    public void execute(StudentCertificationAnswerDTO  dto){
        var student = studentRepository.findByEmail(dto.getEmail());

        // if(student)
    }
}
