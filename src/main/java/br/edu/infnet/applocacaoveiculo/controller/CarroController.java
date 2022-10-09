package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Carro;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CarroController {
    @Autowired
    private CarroService carroService;

    @GetMapping("/carros/lista")
    public String lista(Model model, @SessionAttribute("loggedUser") Usuario usuario) {

        model.addAttribute("listagem", carroService.obterLista(usuario));

        return "/carros/lista";
    }

    @GetMapping("/carros/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo, RedirectAttributes redirectAttributes) {
        try {
            carroService.excluir(codigo);
            redirectAttributes.addFlashAttribute("msg", "Carro excluído com sucesso");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("msg", "Carro não pode ser excluído");
            return "redirect:/carros/lista";

        }

        return "redirect:/carros/lista";
    }

    @PostMapping("/carros")
    public String inclusao(Carro carro, @SessionAttribute("loggedUser") Usuario usuario, RedirectAttributes redirectAttributes) {
        try {
            carro.setUsuario(usuario);
            carroService.incluir(carro);
            redirectAttributes.addFlashAttribute("msg", "Carro cadastrado com sucesso");

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("msg", "Carro não pode ser cadastrado");
            return "redirect:/carros/lista";

        }

        return "redirect:/carros/lista";
    }

    @GetMapping("/carros")
    public String novo() {

        return "/carros/cadastro";
    }
}
