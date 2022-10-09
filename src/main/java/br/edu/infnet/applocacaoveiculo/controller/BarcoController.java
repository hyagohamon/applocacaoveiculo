package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Barco;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.BarcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BarcoController {

    @Autowired
    private BarcoService barcoService;

    @GetMapping("/barcos/lista")
    public String lista(Model model, @SessionAttribute("loggedUser") Usuario usuario) {

        model.addAttribute("listagem", barcoService.obterLista(usuario));

        return "/barcos/lista";
    }

    @GetMapping("/barcos/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo, RedirectAttributes redirectAttributes) {

        try {
            barcoService.excluir(codigo);
            redirectAttributes.addFlashAttribute("msg", "Barco excluído com sucesso");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("msg", "Barco não pode ser excluído");
            return "redirect:/barcos/lista";

        }

        return "redirect:/barcos/lista";
    }

    @PostMapping("/barcos")
    public String inclusao(Barco barco, @SessionAttribute("loggedUser") Usuario usuario, RedirectAttributes redirectAttributes) {

        try {
            barco.setUsuario(usuario);
            barcoService.incluir(barco);
            redirectAttributes.addFlashAttribute("msg", "Barco cadastrado com sucesso");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("msg", "Barco não pode ser cadastrado");
            return "redirect:/barcos/lista";

        }

        return "redirect:/barcos/lista";
    }

    @GetMapping("/barcos")
    public String novo() {

        return "/barcos/cadastro";
    }
}
