package hery.itu.Daybyday.controller;

import hery.itu.Daybyday.services.LaravelAuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;


@Controller
public class AuthController {

    @Autowired
    private LaravelAuthService laravelAuthService;

    // Afficher la page de login (index.html)
    @GetMapping("/login")
    public String showLoginPage() {
        return "index"; // Redirige vers index.html
    }

    // Traiter la soumission du formulaire de login

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
        try {
            String token = laravelAuthService.authenticate(email, password);
            System.out.println(token);
            // Stocker le token dans la session
            session.setAttribute("token", token);
            return "redirect:/dashboard";
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("error", "Identifiants incorrects, tsy mety");
            return "index";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("token"); // Supprimer le token de la session
        session.invalidate(); // Invalider la session
        return "redirect:/login"; // Rediriger vers la page de login
    }

}