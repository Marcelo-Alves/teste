package com.teste.teste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RespostaController {
    
    @PostMapping("/resposta")
    public String cadastro( UsuarioController Usuario ,Model mvr){
        
        mvr.addAttribute("nome",Usuario.getNome());
        mvr.addAttribute("celular",Usuario.getCelular());
        mvr.addAttribute("email",Usuario.getEmail().toUpperCase());
        return "valores";

    }
}
