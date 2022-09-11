package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;

@SessionAttributes("loggedUser")
@Controller
public class AppController {
    @Autowired
    UsuarioService usuarioService;

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
        Usuario usuario = usuarioService.validar(email, password);

        if (usuario != null) {

            model.addAttribute("loggedUser", usuario.getNome());
            return home();
        } else {
            return login();
        }
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        session.removeAttribute("loggedUser");
        return "redirect:/";
    }
}
