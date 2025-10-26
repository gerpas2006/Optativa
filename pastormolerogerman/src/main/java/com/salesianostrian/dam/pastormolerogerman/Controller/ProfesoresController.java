package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import com.salesianostrian.dam.pastormolerogerman.Service.ProfesoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfesoresController {

    private final ProfesoresService profesoresService;
}
