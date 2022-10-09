package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Locacao;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.ClienteService;
import br.edu.infnet.applocacaoveiculo.model.service.LocacaoService;
import br.edu.infnet.applocacaoveiculo.model.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LocacaoController {
    @Autowired
    private LocacaoService locacaoService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/locacoes/lista")
    public String lista(Model model,@SessionAttribute("loggedUser") Usuario usuario) {

        model.addAttribute("listagem", locacaoService.obterLista(usuario));

        return "/locacoes/lista";
    }

    @GetMapping("/locacoes/{codigo}/excluir")
    public String exlusao(@PathVariable Integer codigo,RedirectAttributes redirectAttributes) {
        try{
            locacaoService.excluir(codigo);
            redirectAttributes.addFlashAttribute("msg","Locação excluída com sucesso");

        }catch (Exception e){
            redirectAttributes.addFlashAttribute("msg","Locação não pode ser excluída");

        }
        return "redirect:/locacoes/lista";
    }

    @PostMapping("/locacoes")
    public String inclusao(Locacao locacao, @SessionAttribute("loggedUser") Usuario usuario, RedirectAttributes redirectAttributes) {
       try{
           locacao.setUsuario(usuario);
           locacaoService.incluir(locacao);
           redirectAttributes.addFlashAttribute("msg","locação cadastrada com sucesso");
       }
       catch (Exception e){
           redirectAttributes.addFlashAttribute("msg","erro ao cadastrar a locação");

       }
        return "redirect:/locacoes/lista";
    }

    @GetMapping("/locacoes")
    public String novo(Model model, @SessionAttribute("loggedUser") Usuario usuario) {
        model.addAttribute("clientes", clienteService.obterLista(usuario));
        model.addAttribute("veiculos", veiculoService.obterLista(usuario));
        return "/locacoes/cadastro";
    }
}
