package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.controller.LocacaoController;
import br.edu.infnet.applocacaoveiculo.model.domain.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
@Order(5)
public class LocacaoTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Moto m1 = new Moto();
        m1.setCodigo(1);
        m1.setAno(LocalDate.of(2018, 01, 01));
        m1.setMarca("Honda");
        m1.setModelo("Hornet");
        m1.setValor(47000.00f);
        m1.setVelocidadeMaxima(350);
        m1.setQntdCilindradas(600);
        m1.setQntdMarchas(6);

        Carro ca1 = new Carro();
        ca1.setCodigo(1);
        ca1.setMarca("FORD");
        ca1.setModelo("KA");
        ca1.setAno(LocalDate.of(2010, 1, 1));
        ca1.setValor(25000.00f);
        ca1.setQntdPortas(2);
        ca1.setQntdCavalos(136);
        ca1.setVelocidadeMaxima(200);

        Barco b1 = new Barco();
        b1.setCodigo(1);
        b1.setMarca("MetalGlass");
        b1.setAno(LocalDate.of(2022, 01, 01));
        b1.setModelo("M1");
        b1.setQtdDeck(3);
        b1.setCategoria("Passeio");
        b1.setMotor(true);
        b1.setValor(150000);


        Set<Veiculo> listaLocacao1 = new HashSet<Veiculo>();
        listaLocacao1.add(ca1);
        listaLocacao1.add(b1);
        listaLocacao1.add(m1);
        Set<Veiculo> listaLocacao2 = new HashSet<Veiculo>();
        listaLocacao2.add(m1);
        listaLocacao2.add(b1);

        Set<Veiculo> listaLocacao3 = new HashSet<Veiculo>();
        listaLocacao3.add(b1);


        Cliente c1 = new Cliente("Mariana Cutrim Alencar", "05027864349", "99985453299");
        Cliente c2 = new Cliente("Italo Jose de Aquino", "01235345875", "99985256398");
        Cliente c3 = new Cliente("Kassia Hellen Silva", "12785445632", "99984453241");


        Locacao l1 = new Locacao(c1);
        l1.setDescricao("Locação de Carro");
        l1.setWeb(true);
        l1.setVeiculos(listaLocacao1);

        Locacao l2 = new Locacao(c2);
        l2.setDescricao("Locação de Moto");
        l2.setWeb(false);
        l2.setVeiculos(listaLocacao2);

        Locacao l3 = new Locacao(c3);
        l3.setDescricao("Locação de Barco");
        l3.setWeb(true);
        l3.setVeiculos(listaLocacao3);

        LocacaoController.incluir(l1);
        LocacaoController.incluir(l2);
        LocacaoController.incluir(l3);

    }
}
