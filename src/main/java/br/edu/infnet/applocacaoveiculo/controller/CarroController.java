package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Carro;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CarroController {

    private static final Map<Integer, Carro> carros = new HashMap<Integer, Carro>();
    private static Integer id = 1;

    public static void incluir(Carro carro) {
        carro.setCodigo(id++);
        carros.put(carro.getCodigo(), carro);
        AppImpressao.relatorio("Carro " + carro.getModelo() + " cadastrado com sucesso", carro);

    }

    public static Collection<Carro> obterLista() {
        return carros.values();
    }



    @GetMapping("/carros/lista")
    public String lista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "/carros/lista";
    }

    public static void excluir(Integer codigo) {
        carros.remove(codigo);
    }

    @GetMapping("/carros/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        excluir(codigo);
        return "redirect:/carros/lista";
    }
}
