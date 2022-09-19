package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import br.edu.infnet.applocacaoveiculo.model.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MotoController {

    @Autowired
    private MotoService motoService;


    @GetMapping("/motos/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", motoService.obterLista());
        return "/motos/lista";
    }



    @GetMapping("/motos/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        motoService.excluir(codigo);
        return "redirect:/motos/lista";
    }

    @PostMapping("/motos")
    public String inclusao(Moto moto) {
        motoService.incluir(moto);
        return "redirect:/motos/lista";
    }

    @GetMapping("/motos")
    public String novo() {

        return "/motos/cadastro";
    }
}
