package com.xworkz.surveyApp.service;

import com.xworkz.surveyApp.dto.SurveyDTO;
import com.xworkz.surveyApp.exceptions.DataInvalidException;

public interface SurveyService {
    void validateData(SurveyDTO surveyDTO)throws DataInvalidException;
}
