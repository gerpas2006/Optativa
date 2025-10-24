package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Repository.IIncidenciasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IncidenciasService {

    private final IIncidenciasRepository incidenciasRepository;

    public Long contarIncidencias(){
        return incidenciasRepository.count();
    }
}
