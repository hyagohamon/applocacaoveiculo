package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String inclusao(Usuario usuario, RedirectAttributes redirectAttributes) {

        try {
            usuarioService.incluir(usuario);
            redirectAttributes.addFlashAttribute("msg", "Usuário cadastrado com sucesso");

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("msg", "Usuário não pode ser cadastrado");
            return "redirect:/usuarios/lista";

        }
        return "redirect:/usuarios/lista";
    }

    @GetMapping("/usuarios/{id}/excluir")
    public String exclusao(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        Usuario usuario = usuarioService.findById(id).get();
        if (usuario.getLocacoes().size() > 0) {
            redirectAttributes.addFlashAttribute("msg", "Usuário não pode ser excluído");
            return "redirect:/usuarios/lista";

        } else {
            usuarioService.excluir(id);
            redirectAttributes.addFlashAttribute("msg", "Usuário excluído com sucesso");

            return "redirect:/usuarios/lista";
        }

    }


}
