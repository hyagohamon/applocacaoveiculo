package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.controller.BarcoController;
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
        b1.setMarca("MetalGlass");
        b1.setAno(LocalDate.of(2022, 01, 01));
        b1.setModelo("M1");
        b1.setQtdDeck(3);
        b1.setCategoria("Passeio");
        b1.setMotor(true);
        b1.setValor(150000);
        BarcoController.incluir(b1);

        Barco b2 = new Barco();
        b2.setMarca("Paranã");
        b2.setAno(LocalDate.of(2021, 01, 01));
        b2.setModelo("P1");
        b2.setQtdDeck(2);
        b2.setCategoria("Pesca");
        b2.setMotor(true);
        b2.setValor(50000);
        BarcoController.incluir(b2);

        Barco b3 = new Barco();
        b3.setMarca("Levefort");
        b3.setAno(LocalDate.of(2020, 01, 01));
        b3.setModelo("LF1");
        b3.setCategoria("Passeio");
        b3.setQtdDeck(5);
        b3.setMotor(false);
        b3.setValor(1750000);
        BarcoController.incluir(b3);

    }
}
