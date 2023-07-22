package fr.kartina.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/account")
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue sur la page de l'utilisateur !");
        return "account";
    }
    
}
