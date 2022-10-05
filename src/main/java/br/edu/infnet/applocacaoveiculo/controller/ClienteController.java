package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public String novo() {

        return "/clientes/cadastro";
    }

    @PostMapping("/clientes/incluir")
    public String incluir(Cliente cliente, @SessionAttribute("loggedUser")Usuario usuario) {
        cliente.setUsuario(usuario);
        clienteService.incluir(cliente);

        return "redirect:/clientes/lista";
    }

    @GetMapping("/clientes/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo) {
        clienteService.excluir(codigo);
        return "redirect:/clientes/lista";
    }

    @GetMapping("/clientes/lista")
    public String lista(Model model,@SessionAttribute("loggedUser")Usuario usuario) {

        model.addAttribute("listagem", clienteService.obterLista(usuario));

        return "/clientes/lista";
    }

}
