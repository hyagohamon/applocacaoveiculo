package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Barco;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class BarcoController {

    private static final Map<Integer, Barco> barcos = new HashMap<Integer, Barco>();
    private static Integer id = 1;

    public static void incluir(Barco barco) {
        barco.setCodigo(id++);
        barcos.put(barco.getCodigo(), barco);
        AppImpressao.relatorio("Barco " + barco.getModelo() + " cadastrado com sucesso", barco);

    }

    public static Collection<Barco> obterLista() {
        return barcos.values();
    }

    public static void excluir(Integer codigo) {
        barcos.remove(codigo);
    }

    @GetMapping("/barcos/lista")
    public String lista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "/barcos/lista";
    }

    @GetMapping("/barcos/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        excluir(codigo);
        return "redirect:/barcos/lista";
    }
}
