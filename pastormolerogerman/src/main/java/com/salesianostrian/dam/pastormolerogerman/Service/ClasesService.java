package com.salesianostrian.dam.pastormolerogerman.Service;

import com.salesianostrian.dam.pastormolerogerman.Model.Clases;
import com.salesianostrian.dam.pastormolerogerman.Repository.IClasesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasesService {

    private final IClasesRepository clasesRepository;

    public Long contarClases(){
        return clasesRepository.count();
    }

    public List<Clases> listarClases(){
        return clasesRepository.findAll();
    }
}
