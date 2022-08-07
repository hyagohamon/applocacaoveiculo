package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ClienteTest implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Cliente c1 = new Cliente("Mariana Cutrim Alencar", "05027864349", "99985453299");
        Cliente c2 = new Cliente("Italo Jose de Aquino", "01235345875", "99985256398");
        Cliente c3 = new Cliente("Kassia Hellen Silva", "12785445632", "99984453241");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println();

    }
}