package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.Barco;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Order(4)
public class BarcoTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Barco b1 = new Barco();
        b1.marca = "MetalGlass";
        b1.ano = LocalDate.of(2022, 01, 01);
        b1.modelo = "M1";
        b1.qtdDeck = 3;
        b1.categoria = "Passeio";
        b1.motor = true ;
        b1.valor = 150000;
        System.out.println(b1);

        Barco b2 = new Barco();
        b2.marca = "Paranã";
        b2.ano = LocalDate.of(2021, 01, 01);
        b2.modelo = "P1";
        b2.qtdDeck = 2;
        b2.categoria = "Pesca";
        b2.motor = true;
        b2.valor = 50000;
        System.out.println(b2);

        Barco b3 = new Barco();
        b3.marca = "Levefort";
        b3.ano = LocalDate.of(2020, 01, 01);
        b3.modelo = "LF1";
        b3.categoria = "Passeio";
        b3.qtdDeck = 3;
        b3.motor = false;
        b3.valor = 160000;
        System.out.println(b3);
        System.out.println();

    }
}
