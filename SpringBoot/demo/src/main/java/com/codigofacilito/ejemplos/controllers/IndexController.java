package com.codigofacilito.ejemplos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping
    public String index(Model model){

        model.addAttribute("title", "I'm the title");
        model.addAttribute("greet", "Hello from code!");

        return "index";
    }


}
