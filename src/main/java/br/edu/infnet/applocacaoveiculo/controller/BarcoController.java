package br.edu.infnet.applocacaoveiculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BarcoController {

    @GetMapping("/barcos/lista")
    public String lista(){
        return "/barcos/lista";
    }
}
