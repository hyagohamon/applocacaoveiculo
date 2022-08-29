package br.edu.infnet.applocacaoveiculo.model.test;

import br.edu.infnet.applocacaoveiculo.controller.LocacaoController;
import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;
import br.edu.infnet.applocacaoveiculo.model.domain.*;
import br.edu.infnet.applocacaoveiculo.model.exceptions.CPFInvalidoException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.ClienteNuloException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.LocacaoSemVeiculoException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class AppImpressao {


    public static void relatorio(String mensagem, IPrinter printer) {
        System.out.println(mensagem);
        printer.impressao();

    }

    public static void main(String[] args) {


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
