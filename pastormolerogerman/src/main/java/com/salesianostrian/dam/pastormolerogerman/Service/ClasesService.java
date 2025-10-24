package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Repository.IClasesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClasesService {

    private final IClasesRepository clasesRepository;

    public Long contarClases(){
        return clasesRepository.count();
    }
}
