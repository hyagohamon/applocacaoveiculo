package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;


    @GetMapping("/veiculos/lista")
    public String lista(Model model, @SessionAttribute("loggedUser") Usuario usuario) {
        model.addAttribute("listagem", veiculoService.obterLista(usuario));
        return "/veiculos/lista";
    }


    @GetMapping("/veiculos/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo, RedirectAttributes redirectAttributes) {
        try {
            veiculoService.excluir(codigo);
            redirectAttributes.addFlashAttribute("msg", "Veículo excluído com sucesso");

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("msg", "Veículo não pode ser excluído");
            return "redirect:/veiculos/lista";

        }
        return "redirect:/veiculos/lista";
    }


}
