package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.controller.CarroController;
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
        c1.setMarca("FORD");
        c1.setModelo("KA");
        c1.setAno(LocalDate.of(2010, 1, 1));
        c1.setValor(25000.00f);
        c1.setQntdPortas(2);
        c1.setQntdCavalos(136);
        c1.setVelocidadeMaxima(200);
        CarroController.incluir(c1);

        Carro c2 = new Carro();
        c2.setMarca("HYUNDAI");
        c2.setModelo("HB20S");
        c2.setAno(LocalDate.of(2015, 1, 1));
        c2.setValor(60000.00f);
        c2.setQntdPortas(4);
        c2.setQntdCavalos(130);
        c2.setVelocidadeMaxima(280);
        CarroController.incluir(c2);


        Carro c3 = new Carro();
        c3.setMarca("FIAT");
        c3.setModelo("ARGO");
        c3.setAno(LocalDate.of(2017, 1, 1));
        c3.setValor(67900.90f);
        c3.setQntdPortas(4);
        c3.setQntdCavalos(139);
        c3.setVelocidadeMaxima(300);
        CarroController.incluir(c3);


    }
}
