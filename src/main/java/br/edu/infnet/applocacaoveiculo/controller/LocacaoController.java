package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Locacao;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LocacaoController {

    private static final Map<Integer, Locacao> locacoes = new HashMap<Integer, Locacao>();
    private static Integer id = 1;

    public static void incluir(Locacao locacao) {
        locacao.setCodigo(id++);
        locacoes.put(locacao.getCodigo(), locacao);
        AppImpressao.relatorio("Locação " + locacao.getDescricao() + " cadastrado com sucesso", locacao);

    }

    public static Collection<Locacao> obterLista() {
        return locacoes.values();
    }

    public static void excluir(Integer codigo) {
        locacoes.remove(codigo);
    }

    @GetMapping("/locacoes/lista")
    public String lista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "/locacoes/lista";
    }

    @GetMapping("/locacoes/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        excluir(codigo);
        return "redirect:/locacoes/lista";
    }
}
