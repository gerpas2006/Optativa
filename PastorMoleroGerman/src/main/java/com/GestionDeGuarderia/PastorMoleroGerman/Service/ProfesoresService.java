package com.GestionDeGuarderia.PastorMoleroGerman.Service;

import com.GestionDeGuarderia.PastorMoleroGerman.Repository.ProfesoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesoresService {

    @Autowired
    private ProfesoresRepository profesoresRepository;


}
