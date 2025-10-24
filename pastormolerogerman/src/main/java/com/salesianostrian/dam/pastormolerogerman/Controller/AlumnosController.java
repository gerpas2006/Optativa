package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Service.AlumnosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AlumnosController {

    private final AlumnosService alumnosService;

}
