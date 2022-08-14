package br.edu.infnet.applocacaoveiculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MotoController {

    @GetMapping("/motos/lista")
    public String lista(){
        return "/motos/lista";
    }
}
