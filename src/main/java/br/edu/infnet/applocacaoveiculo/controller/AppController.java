package br.edu.infnet.applocacaoveiculo.controller;

<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
=======
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> 3b9eca5 (tela de "login", cadastro e exclusão de usuários implementados.)

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

<<<<<<< HEAD
    @GetMapping(value = "/barcos")
    public String listaBarcos() {
        return "lista";
=======

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
>>>>>>> 3b9eca5 (tela de "login", cadastro e exclusão de usuários implementados.)
    }
}
