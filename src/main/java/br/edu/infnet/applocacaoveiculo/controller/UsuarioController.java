package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", usuarioService.obterLista());
        return "/usuarios/lista";
    }

    @GetMapping("/usuarios")
    public String novo() {
        return "/usuarios/cadastro";
    }

    @GetMapping("/usuario")
    public String cadastro() {
        return "usuarios/cadastro";
    }

    @PostMapping("/usuarios/incluir")
    public String inclusao(Usuario usuario) {
        usuarioService.incluir(usuario);
        return "redirect:/usuarios/lista";
    }

    @GetMapping("/usuarios/{email}/excluir")
    public String exclusao(@PathVariable String email) {
        usuarioService.excluir(email);
        return "redirect:/usuarios/lista";
    }


}
