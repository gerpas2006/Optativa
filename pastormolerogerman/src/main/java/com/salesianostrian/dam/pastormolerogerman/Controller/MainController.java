package com.salesianostrian.dam.pastormolerogerman.Controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    public String mensaje(Model model){
        model.addAttribute("mensaje", "esto es un mensaje");
        return "index";
    }

}
