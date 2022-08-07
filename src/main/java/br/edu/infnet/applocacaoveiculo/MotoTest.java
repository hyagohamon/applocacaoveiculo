package br.edu.infnet.applocacaoveiculo;

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
        m1.ano= LocalDate.of(2018,01,01);
        m1.marca="Honda";
        m1.modelo="Hornet";
        m1.valor=47000.00f;
        m1.velocidadeMaxima = 350;
        m1.qntdCilindradas = 600;
        m1.qntdMarchas=6;
        System.out.println(m1);

        Moto m2 = new Moto();
        m2.ano= LocalDate.of(2019,01,01);
        m2.marca="Yamaha";
        m2.modelo="R3";
        m2.valor=24000.00f;
        m2.velocidadeMaxima = 299;
        m2.qntdCilindradas = 300;
        m2.qntdMarchas=6;
        System.out.println(m2);

        Moto m3 = new Moto();
        m3.ano= LocalDate.of(2022,01,01);
        m3.marca="Kawasaki";
        m3.modelo="Ninja 400";
        m3.valor=23000.00f;
        m3.velocidadeMaxima = 350;
        m3.qntdCilindradas = 400;
        m3.qntdMarchas=6;
        System.out.println(m3);
        System.out.println();

    }
}
