package br.edu.infnet.applocacaoveiculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @GetMapping("/clientes/lista")
    public String lista(){
        return "/clientes/lista";
    }
}
