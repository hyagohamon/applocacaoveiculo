package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.controller.LocacaoController;
import br.edu.infnet.applocacaoveiculo.model.domain.*;
import br.edu.infnet.applocacaoveiculo.model.exceptions.CPFInvalidoException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.ClienteNuloException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.LocacaoSemVeiculoException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
@Order(5)
public class LocacaoTest implements CommandLineRunner {
    @Override
    public void run(String... args)  {

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

        try {
            Set<Veiculo> listaLocacao1 = new HashSet<Veiculo>();
            listaLocacao1.add(ca1);
            listaLocacao1.add(b1);
            listaLocacao1.add(m1);
            Cliente c1 = new Cliente("Mariana Cutrim Alencar", "05027864349", "99985453299");
            Locacao l1 = new Locacao(c1, listaLocacao1);
            l1.setDescricao("Locação de Carro");
            l1.setWeb(true);
            LocacaoController.incluir(l1);
        } catch (CPFInvalidoException | ClienteNuloException | LocacaoSemVeiculoException e) {
            System.out.println("Error" + e.getMessage());
        }


        try {
            Set<Veiculo> listaLocacao2 = new HashSet<Veiculo>();
            listaLocacao2.add(m1);
            listaLocacao2.add(b1);
            Cliente c2 = new Cliente("Italo Jose de Aquino", "01235345875", "99985256398");
            Locacao l2 = new Locacao(c2, listaLocacao2);
            l2.setDescricao("Locação de Moto");
            l2.setWeb(false);
            LocacaoController.incluir(l2);
        } catch (CPFInvalidoException | ClienteNuloException | LocacaoSemVeiculoException e) {
            System.out.println("Error" + e.getMessage());
        }


        try {
            Set<Veiculo> listaLocacao3 = new HashSet<Veiculo>();
            listaLocacao3.add(b1);
            Cliente c3 = new Cliente("Kassia Hellen Silva", "12785445632", "99984453241");
            Locacao l3 = new Locacao(c3, listaLocacao3);
            l3.setDescricao("Locação de Barco");
            l3.setWeb(true);
            LocacaoController.incluir(l3);
        } catch (CPFInvalidoException | ClienteNuloException | LocacaoSemVeiculoException e) {
            System.out.println("Error" + e.getMessage());
        }

        try {
            Set<Veiculo> listaLocacao4 = new HashSet<Veiculo>();
            Cliente c4 = new Cliente("Hugo Pedro", "9878855", "25365214558");
            Locacao l4 = new Locacao(c4, listaLocacao4);
            l4.setDescricao("Locação de Barco");
            l4.setWeb(true);
            LocacaoController.incluir(l4);
        } catch (CPFInvalidoException | ClienteNuloException | LocacaoSemVeiculoException e) {
            System.out.println("Error " + e.getMessage());
        }


//        try {
//            Set<Veiculo> listaLocacao5 = new HashSet<Veiculo>();
//            Cliente c5 = new Cliente("Paloma Oliveira", "2525242423", "0202030501");
//            Locacao l5 = new Locacao(null, listaLocacao5);
//            l5.setDescricao("Locação de Barco");
//            l5.setWeb(true);
//            LocacaoController.incluir(l5);
//        } catch (CPFInvalidoException | ClienteNuloException | LocacaoSemVeiculoException e) {
//            System.out.println("Error " + e.getMessage());
//        }
//
//        try {
//            Set<Veiculo> listaLocacao6 = null;
//            Cliente c6 = new Cliente("Jessica Oliveira", "1810181", "3636353535");
//            Locacao l6 = new Locacao(c6, listaLocacao6);
//            l6.setDescricao("Locação de Barco");
//            l6.setWeb(true);
//            LocacaoController.incluir(l6);
//        } catch (CPFInvalidoException | ClienteNuloException | LocacaoSemVeiculoException e) {
//            System.out.println("Error " + e.getMessage());
//        }

        String diretorio = "C:/arquivos/";
        String arquivo = "locacoes.txt";

        try {
            try {
                FileReader fileReader = new FileReader(diretorio + arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linha = bufferedReader.readLine();
                while (linha != null) {
                    String[] campos = linha.split(";");
                    try {
                        Set<Veiculo> listaLocacao1 = new HashSet<Veiculo>();
                        listaLocacao1.add(b1);
                        listaLocacao1.add(ca1);
                        Cliente c1 = new Cliente(campos[2], campos[3], campos[4]);
                        Locacao l5 = new Locacao(c1, listaLocacao1);
                        l5.setDescricao(campos[0]);
                        l5.setWeb(Boolean.parseBoolean(campos[1]));
                        LocacaoController.incluir(l5);
                    } catch (CPFInvalidoException | ClienteNuloException | LocacaoSemVeiculoException e) {
                        System.out.println("Error " + e.getMessage());
                    }


                    linha = bufferedReader.readLine();
                }
                bufferedReader.close();
                fileReader.close();
                System.out.println(diretorio + arquivo);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } finally {
            System.out.println("acabou");
        }




    }
}
