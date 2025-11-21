package com.salesianostrian.dam.pastormolerogerman.error;

import org.springframework.http.ProblemDetail;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalHandleException {

    @ExceptionHandler(AlumnoErrorArgumentException.class)
    public String handleArgumentAlumno(AlumnoErrorArgumentException ex, Model model){

        model.addAttribute("mensaje",ex.getMessage());
        return "paginaError";

    }

    @ExceptionHandler(ProfesorErrorArgumentException.class)
    public String handArgumentProfesor(ProfesorErrorArgumentException ex,Model model){
        model.addAttribute("mensaje", ex.getMessage());
        return "paginaError";
    }

    @ExceptionHandler(ClasesErrorArgumentException.class)
    public String handArgumentProfesor(ClasesErrorArgumentException ex,Model model){
        model.addAttribute("mensaje", ex.getMessage());
        return "paginaError";
    }


}
