package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.Carro;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Order(2)
public class CarroTest implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

        Carro c1 = new Carro();
        c1.marca = "FORD";
        c1.modelo = "KA";
        c1.ano = LocalDate.of(2010,1,1);
        c1.valor = 25000.00f;
        c1.qntdPortas=2;
        c1.qntdCavalos = 136;
        c1.velocidadeMaxima = 200;

        System.out.println(c1);

        Carro c2 = new Carro();
        c2.marca = "HYUNDAI";
        c2.modelo = "HB20S";
        c2.ano = LocalDate.of(2015,1,1);
        c2.valor = 60000.00f;
        c2.qntdPortas=4;
        c2.qntdCavalos = 130;
        c2.velocidadeMaxima = 280;

        System.out.println(c2);

        Carro c3 = new Carro();
        c3.marca = "FIAT";
        c3.modelo = "ARGO";
        c3.ano = LocalDate.of(2017,1,1);
        c3.valor = 67900.90f;
        c3.qntdPortas=4;
        c3.qntdCavalos = 139;
        c3.velocidadeMaxima = 300;

        System.out.println(c3);
        System.out.println();

    }
}
