package br.edu.infnet.applocacaoveiculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsuarioController {


    private static Map<String, Usuario> usuarioMap = new HashMap<String, Usuario>();

    public static void incluir(Usuario usuario) {
        usuarioMap.put(usuario.getEmail(), usuario);

        AppImpressao.relatorio("Usuário " + usuario.getNome() + " cadastrado com sucesso", usuario);
    }

    @GetMapping("/usuarios/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "/usuarios/lista";
    }

    @GetMapping("/usuario")
    public String cadastro() {
        return "usuarios/cadastro";
    }

    @PostMapping("/usuarios/incluir")
    public String inclusao(Usuario usuario) {
        incluir(usuario);
        return "redirect:/";
    }

    @GetMapping("/usuarios/{email}/excluir")
    public String exclusao(@PathVariable String email) {
        excluir(email);
        return "redirect:/usuarios/lista";
    }

    public static void excluir(String email) {
        usuarioMap.remove(email);
    }

    public static Collection<Usuario> obterLista() {
        return usuarioMap.values();
    }

    public static Usuario validar(String email, String senha) {
        Usuario usuario = usuarioMap.get(email);
        if (usuario != null && senha.equals(usuario.getSenha())) {
            return usuario;
        }
        return null;

    }


}
