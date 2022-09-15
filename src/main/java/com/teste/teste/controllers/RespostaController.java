package com.teste.teste.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class RespostaController {
    
    @PostMapping("/resposta")
    public String cadastro(@RequestParam("nome") String nome, @RequestParam("email") String email,Model mvr){
        //String mensagem = "Nome " + nome.toUpperCase() + " email " + email.toUpperCase();
        //mvr.addAttribute("mensagem",mensagem);
        mvr.addAttribute("nome",nome);
        mvr.addAttribute("email",email.toUpperCase());
        return "valores";

    }
}
