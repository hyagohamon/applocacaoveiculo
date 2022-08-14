package br.edu.infnet.applocacaoveiculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarroController {

    @GetMapping("/carros/lista")
    public String lista(){
        return "/carros/lista";
    }
}
