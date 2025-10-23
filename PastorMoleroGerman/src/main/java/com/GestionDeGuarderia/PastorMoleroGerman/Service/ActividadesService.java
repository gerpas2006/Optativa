package com.GestionDeGuarderia.PastorMoleroGerman.Service;

import com.GestionDeGuarderia.PastorMoleroGerman.Repository.ActividadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesService {

    @Autowired
    private ActividadesRepository actividadesRepository;
}
