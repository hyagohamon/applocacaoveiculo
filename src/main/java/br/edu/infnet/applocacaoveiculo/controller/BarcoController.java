package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Barco;
import br.edu.infnet.applocacaoveiculo.model.domain.Carro;
import br.edu.infnet.applocacaoveiculo.model.service.BarcoService;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class BarcoController {

    @Autowired
    private BarcoService barcoService;

    @GetMapping("/barcos/lista")
    public String lista(Model model) {

        model.addAttribute("listagem", barcoService.obterLista());

        return "/barcos/lista";
    }

    @GetMapping("/barcos/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        barcoService.excluir(codigo);
        return "redirect:/barcos/lista";
    }

    @PostMapping("/barcos")
    public String inclusao(Barco barco) {
        barcoService.incluir(barco);
        return "redirect:/barcos/lista";
    }

    @GetMapping("/barcos")
    public String novo() {

        return "/barcos/cadastro";
    }
}
