package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Locacao;
import br.edu.infnet.applocacaoveiculo.model.service.ClienteService;
import br.edu.infnet.applocacaoveiculo.model.service.LocacaoService;
import br.edu.infnet.applocacaoveiculo.model.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LocacaoController {
    @Autowired
    private LocacaoService locacaoService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/locacoes/lista")
    public String lista(Model model) {

        model.addAttribute("listagem", locacaoService.obterLista());

        return "/locacoes/lista";
    }

    @GetMapping("/locacoes/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        locacaoService.excluir(codigo);
        return "redirect:/locacoes/lista";
    }

    @PostMapping("/locacoes")
    public String inclusao(Locacao locacao) {
        locacaoService.incluir(locacao);
        return "redirect:/locacoes/lista";
    }

    @GetMapping("/locacoes")
    public String novo(Model model) {
        model.addAttribute("clientes", clienteService.obterLista());
        model.addAttribute("veiculos", veiculoService.obterLista());
        return "/locacoes/cadastro";
    }
}
