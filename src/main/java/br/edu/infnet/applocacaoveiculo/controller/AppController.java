package br.edu.infnet.applocacaoveiculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/barcos")
    public String listaBarcos() {
        return "lista";
    }
}
