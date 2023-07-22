package fr.kartina.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String home(Model model) {
        model.addAttribute("message", "Bienvenue dans le panier !");
        return "cart";
    }
    
}
