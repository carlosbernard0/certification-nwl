package com.rocketseat.certification_nwl.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionAnswerDTO {
    private String questionID;
    private String alternativeID;
    private boolean isCorrect;
    
}
