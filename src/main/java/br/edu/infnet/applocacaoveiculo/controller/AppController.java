package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }


    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String autenticaLogin(Model model, @RequestParam String email, @RequestParam String password) {

        Usuario usuario = UsuarioController.validar(email, password);

        if (usuario != null) {

            model.addAttribute("loggedUser", usuario.getNome());
            return home();
        } else {
            return login();
        }
    }

    @GetMapping(value = "/logout")
    public String logout(Model model) {
        model.addAttribute("loggedUser", "");
        return "redirect:/";
    }
}
