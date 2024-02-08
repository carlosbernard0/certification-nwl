package com.rocketseat.certification_nwl.modules.questions.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionAnswerDTO {
    private String questionID;
    private String alternativeID;
    private boolean isCorrect;    
}
