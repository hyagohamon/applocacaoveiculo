package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ClienteController {

    private static final Map<Integer, Cliente> clientes = new HashMap<Integer, Cliente>();
    private static Integer id = 1;

    public static void incluir(Cliente cliente) {
        cliente.setCodigo(id++);
        clientes.put(cliente.getCodigo(), cliente);
        AppImpressao.relatorio("Cliente " + cliente.getCodigo() + " cadastrado com sucesso", cliente);

    }

    public static Collection<Cliente> obterLista() {
        return clientes.values();
    }

    public static void excluir(Integer codigo) {
        clientes.remove(codigo);
    }

    @GetMapping("/clientes/lista")
    public String lista(Model model) {

        model.addAttribute("listagem", obterLista());

        return "/clientes/lista";
    }

    @GetMapping("/clientes/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        excluir(codigo);
        return "redirect:/clientes/lista";
    }
}
