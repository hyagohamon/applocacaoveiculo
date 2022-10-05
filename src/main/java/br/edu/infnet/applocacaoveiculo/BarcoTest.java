package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.Barco;
import br.edu.infnet.applocacaoveiculo.model.exceptions.QntdDeckInvalidaException;
import br.edu.infnet.applocacaoveiculo.model.service.BarcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(5)
public class BarcoTest implements CommandLineRunner {

    @Autowired
    private BarcoService barcoService;

    @Override
    public void run(String... args) {


        try {
            Barco b1 = new Barco();
            b1.setMarca("MetalGlass");
            b1.setAno("2014");
            b1.setModelo("M1");
            b1.setQtdDeck(3);
            b1.setCategoria("Passeio");
            b1.setMotor(true);
            b1.setValor(150000);
            System.out.println("Calculo locação:" + b1.valorLocacao());
            barcoService.incluir(b1);

        } catch (QntdDeckInvalidaException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        try {
            Barco b2 = new Barco();
            b2.setMarca("Paranã");
            b2.setAno("2010");
            b2.setModelo("P1");
            b2.setQtdDeck(2);
            b2.setCategoria("Pesca");
            b2.setMotor(true);
            b2.setValor(150000);
            System.out.println("Calculo locação:" + b2.valorLocacao());
            barcoService.incluir(b2);

        } catch (QntdDeckInvalidaException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        try {
            Barco b3 = new Barco();
            b3.setMarca("Levefort");
            b3.setAno("2022");
            b3.setModelo("LF1");
            b3.setCategoria("Passeio");
            b3.setQtdDeck(4);
            b3.setMotor(false);
            b3.setValor(1750000);
            System.out.println("Calculo locação:" + b3.valorLocacao());
            barcoService.incluir(b3);

        } catch (QntdDeckInvalidaException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        try {
            Barco b4 = new Barco();
            b4.setMarca("Levefort");
            b4.setAno("2021");
            b4.setModelo("LF2");
            b4.setCategoria("Passeio");
            b4.setQtdDeck(20);
            b4.setMotor(false);
            b4.setValor(190000);
            System.out.println("Calculo locação:" + b4.valorLocacao());
            barcoService.incluir(b4);

        } catch (QntdDeckInvalidaException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        String diretorio = "C:/arquivos/";
        String arquivo = "veiculos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(diretorio + arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linha = bufferedReader.readLine();
                while (linha != null) {
                    String[] campos = linha.split(";");
                    if ("B".equalsIgnoreCase(campos[0])) {
                        try {
                            Barco b4 = new Barco();
                            b4.setMarca(campos[1]);
                            b4.setAno(campos[2]);
                            b4.setModelo(campos[3]);
                            b4.setCategoria(campos[4]);
                            b4.setQtdDeck(Integer.parseInt(campos[5]));
                            b4.setMotor(Boolean.parseBoolean(campos[6]));
                            b4.setValor(Float.parseFloat(campos[7]));
                            System.out.println("Calculo locação:" + b4.valorLocacao());
                            barcoService.incluir(b4);

                        } catch (QntdDeckInvalidaException e) {
                            System.out.println("[ERRO]" + e.getMessage());
                        }
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
