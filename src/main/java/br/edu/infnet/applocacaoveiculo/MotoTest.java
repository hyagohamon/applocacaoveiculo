package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.controller.MotoController;
import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Order(3)
public class MotoTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Moto m1 = new Moto();
        m1.setAno(LocalDate.of(2018, 01, 01));
        m1.setMarca("Honda");
        m1.setModelo("Hornet");
        m1.setValor(47000.00f);
        m1.setVelocidadeMaxima(350);
        m1.setQntdCilindradas(600);
        m1.setQntdMarchas(5);


        Moto m2 = new Moto();
        m2.setAno(LocalDate.of(2019, 01, 01));
        m2.setMarca("Yamaha");
        m2.setModelo("R3");
        m2.setValor(24000.00f);
        m2.setVelocidadeMaxima(299);
        m2.setQntdCilindradas(300);
        m2.setQntdMarchas(6);


        Moto m3 = new Moto();
        m3.setAno(LocalDate.of(2022, 01, 01));
        m3.setMarca("Kawasaki");
        m3.setModelo("Ninja 400");
        m3.setValor(23000.00f);
        m3.setVelocidadeMaxima(350);
        m3.setQntdCilindradas(400);
        m3.setQntdMarchas(6);

        MotoController.incluir(m1);
        MotoController.incluir(m2);
        MotoController.incluir(m3);

    }
}
