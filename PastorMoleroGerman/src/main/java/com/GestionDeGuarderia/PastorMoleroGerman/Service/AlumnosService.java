package com.GestionDeGuarderia.PastorMoleroGerman.Service;

import com.GestionDeGuarderia.PastorMoleroGerman.Repository.AlumnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnosService {


    @Autowired
    private AlumnosRepository alumnosRepository;

}
