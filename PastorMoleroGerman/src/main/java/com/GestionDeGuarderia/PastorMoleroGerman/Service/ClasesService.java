package com.GestionDeGuarderia.PastorMoleroGerman.Service;

import com.GestionDeGuarderia.PastorMoleroGerman.Repository.ClasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasesService {

    @Autowired
    private ClasesRepository clasesRepository;
}
