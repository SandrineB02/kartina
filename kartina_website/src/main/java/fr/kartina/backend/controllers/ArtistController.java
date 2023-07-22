package fr.kartina.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtistController {

    @GetMapping("/artist")
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue sur la page des artistes !");
        return "artist";
    }
    
}
