package com.salesianostrian.dam.pastormolerogerman.Controller;

import com.salesianostrian.dam.pastormolerogerman.Model.Alumnos;
import com.salesianostrian.dam.pastormolerogerman.Repository.IClasesRepository;
import com.salesianostrian.dam.pastormolerogerman.Service.AlumnosService;
import com.salesianostrian.dam.pastormolerogerman.Service.ClasesService;
import com.salesianostrian.dam.pastormolerogerman.Service.IncidenciasService;
import com.salesianostrian.dam.pastormolerogerman.Service.ProfesoresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class AlumnosController {

    private final AlumnosService alumnosService;
    private final IncidenciasService incidenciasService;
    private final ClasesService clasesService;
    private final ProfesoresService profesoresService;


    @GetMapping("/alumnos")
    public String mostrarAlumnos(Model model){
        model.addAttribute("alumnos", new Alumnos());
        model.addAttribute("listarAlumnos", alumnosService.listarAlumnos());
         model.addAttribute("clases", clasesService.listarClases());
        //model.addAttribute("incidencias",incidenciasService.devolverTodasLasIncidencias());
         model.addAttribute("profesores", profesoresService.listarProfesores());
         return "alumnos";
    }

    @PostMapping("/alumnos/elimnar/{id}")
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

    @GetMapping("/alumnos/guardar")
    public String agregarAlumnos(Model model){
        model.addAttribute("alumnos", new Alumnos());
        model.addAttribute("clases", clasesService.listarClases());
        //model.addAttribute("incidencias", incidenciasService.devolverTodasLasIncidencias());
        model.addAttribute("profesores", profesoresService.listarProfesores());
        return "alumnos";
    }

    @PostMapping("/alumnos/guardar")
    public String agregarAlumno(@ModelAttribute Alumnos alumnos,Model model){
        alumnosService.agregarAlumno(alumnos);
        return "redirect:/alumnos";
    }

    @GetMapping("/alumnos/editar/{dni}")
    public String editarAlumno(@PathVariable String dni, Model model) {
        model.addAttribute("alumnos", alumnosService.buscarPorDni(dni));
        model.addAttribute("clases", clasesService.listarClases());
        model.addAttribute("profesores", profesoresService.listarProfesores());
        return "editarAlumno";
    }

    @PostMapping("/alumnos/editar")
    public String enviarEditarAlumno(@ModelAttribute Alumnos alumnos){
        alumnosService.editarAlumno(alumnos);
        return "redirect:/alumnos";

    }



}
