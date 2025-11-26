package com.xworkz.matrimonyapp.service;

import com.xworkz.matrimonyapp.dto.MatrimonyDTO;
import com.xworkz.matrimonyapp.exceptions.DataInvalidException;

public interface MatrimonyService {
    void validateData(MatrimonyDTO matrimonyDTO)throws DataInvalidException;
}
