package br.edu.infnet.applocacaoveiculo.controller;

import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MotoController {

    @Autowired
    private MotoService motoService;


    @GetMapping("/motos/lista")
    public String lista(Model model, @SessionAttribute("loggedUser")Usuario usuario) {
        model.addAttribute("listagem", motoService.obterLista(usuario));
        return "/motos/lista";
    }


    @GetMapping("/motos/{id}/excluir")
    public String exlusao(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        try{
            motoService.excluir(id);
            redirectAttributes.addFlashAttribute("msg","Moto excluída com sucesso");
        }
        catch (Exception e){
            redirectAttributes.addFlashAttribute("msg","Moto não pode ser excluída");
            return "redirect:/motos/lista";

        }
        return "redirect:/motos/lista";
    }

    @PostMapping("/motos")
    public String inclusao(Moto moto, @SessionAttribute("loggedUser")Usuario usuario,RedirectAttributes redirectAttributes) {
        try{
            moto.setUsuario(usuario);
            motoService.incluir(moto);
            redirectAttributes.addFlashAttribute("msg","Moto cadastrada com sucesso");

        }catch (Exception e){
            redirectAttributes.addFlashAttribute("msg","Moto não pode ser cadastrada");
            return "redirect:/motos/lista";

        }

        return "redirect:/motos/lista";
    }

    @GetMapping("/motos")
    public String novo() {

        return "/motos/cadastro";
    }
}
