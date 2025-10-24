package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Repository.IClasesRepository;
import com.salesianostrian.dam.pastormolerogerman.Service.AlumnosService;
import com.salesianostrian.dam.pastormolerogerman.Service.ClasesService;
import com.salesianostrian.dam.pastormolerogerman.Service.IncidenciasService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class AlumnosController {

    private final AlumnosService alumnosService;
    private final IncidenciasService incidenciasService;
    private final ClasesService clasesService;


    @GetMapping("/alumnos")
    public String mostrarAlumnos(Model model){
         model.addAttribute("listarAlumnos", alumnosService.listarAlumnos());
         model.addAttribute("clases", clasesService.listarClases());
         model.addAttribute("incidencias",incidenciasService.devolverTodasLasIncidencias());
         return "alumnos";
    }

    @PostMapping("/alumnos/{id}")
    public String eliminarAlumnos(@PathVariable Long id){
        alumnosService.eliminarAlumno(id);
        return "redirect:/alumnos";
    }

    @GetMapping("/alumnos/buscado")
    public String buscarAlumnoPorDni(String dni, Model model){
        model.addAttribute("alumnoBuscado", alumnosService.buscarPorDni(dni));
        model.addAttribute("listarAlumno", alumnosService.listarAlumnos());
        model.addAttribute("clases", clasesService.listarClases());
        return "alumnoBuscado";
    }

}
