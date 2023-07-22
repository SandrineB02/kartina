package fr.kartina.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResetController {

    @GetMapping("/reset")
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue sur la page de réinitialisation du mot de passe !");
        return "reset";
    }
    
}