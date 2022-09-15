package com.teste.teste.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NomesController {
    
    @GetMapping("/nomes")
    public String nome(Model mv){
        
        List<String> pessoa = new ArrayList<>();
        pessoa.add("Marcelo");
        pessoa.add("Rosana");
        pessoa.add("Fabio");
        pessoa.add("Michelle");
        pessoa.add("Kamilly");

        mv.addAttribute("pessoas", pessoa);


        return "pessoa";

    }

   

}
