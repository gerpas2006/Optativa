package com.salesianostrian.dam.pastormolerogerman.Controller;


import com.salesianostrian.dam.pastormolerogerman.Service.AlumnosService;
import com.salesianostrian.dam.pastormolerogerman.Service.ClasesService;
import com.salesianostrian.dam.pastormolerogerman.Service.IncidenciasService;
import com.salesianostrian.dam.pastormolerogerman.Service.ProfesoresService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final AlumnosService alumnosService;
    private final ProfesoresService profesoresService;
    private final IncidenciasService incidenciasService;
    private final ClasesService clasesService;

    @GetMapping("/")
    public String contar(Model model){
        model.addAttribute("contarAlumnos", alumnosService.contarAlumnos());
        model.addAttribute("contarProfesores", profesoresService.contarProfesores());
        model.addAttribute("contarIncidencias", incidenciasService.contarIncidencias());
        model.addAttribute("contarClases", clasesService.contarClases());
        return "inicio";
    }

}
