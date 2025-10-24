package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Repository.IProfesoresRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfesoresService {

    private final IProfesoresRepository profesoresRepository;

    public Long contarProfesores(){
        return profesoresRepository.count();
    }
}
