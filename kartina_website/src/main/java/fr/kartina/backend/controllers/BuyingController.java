package fr.kartina.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyingController {

    @GetMapping("/buying")
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue sur le parcours d'achat !");
        return "buying";
    }
    
}

