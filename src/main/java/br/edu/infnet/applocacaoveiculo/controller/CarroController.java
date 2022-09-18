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

import java.time.LocalDate;

@Controller
public class CarroController {
    @Autowired
    private CarroService carroService;

    @GetMapping("/carros/lista")
    public String lista(Model model) {

        model.addAttribute("listagem", carroService.obterLista());

        return "/carros/lista";
    }

    @GetMapping("/carros/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        carroService.excluir(codigo);
        return "redirect:/carros/lista";
    }

    @PostMapping("/carros")
    public String inclusao(Carro carro) {
        carroService.incluir(carro);
        return "redirect:/carros/lista";
    }

    @GetMapping("/carros")
    public String novo() {

        return "/carros/cadastro";
    }
}
