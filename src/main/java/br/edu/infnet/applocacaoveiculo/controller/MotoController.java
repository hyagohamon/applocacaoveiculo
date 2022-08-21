package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MotoController {

    private static final Map<Integer, Moto> motos = new HashMap<Integer, Moto>();
    private static Integer id = 1;


    public static void incluir(Moto moto) {
        moto.setCodigo(id++);
        motos.put(moto.getCodigo(), moto);
        AppImpressao.relatorio("Moto " + moto.getModelo() + " cadastrada com sucesso", moto);

    }

    public static Collection<Moto> obterLista() {
        return motos.values();
    }

    @GetMapping("/motos/lista")
    public String lista(Model model) {
        model.addAttribute("listagem", obterLista());
        return "/motos/lista";
    }

    public static void excluir(Integer codigo) {
        motos.remove(codigo);
    }

    @GetMapping("/motos/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        excluir(codigo);
        return "redirect:/motos/lista";
    }
}
