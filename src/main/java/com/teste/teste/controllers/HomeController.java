package com.teste.teste.controllers;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
   
    /**
     * @param mv
     * @return
     */
    @GetMapping
    public String home(Model mv){
        final ArrayList<String>  nomes = new ArrayList();
        nomes.add("Marcelo Alves Moreira");
        nomes.add("Rosana Brito da Silva");

        mv.addAttribute("nomes", nomes);

        return "home";
    }

    
    
}
