package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.controller.CarroController;
import br.edu.infnet.applocacaoveiculo.controller.ClienteController;
import br.edu.infnet.applocacaoveiculo.model.domain.Carro;
import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import br.edu.infnet.applocacaoveiculo.model.exceptions.ValorInvalidoException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

@Component
@Order(2)
public class CarroTest implements CommandLineRunner {


    @Override
    public void run(String... args) {


        try {
            Carro c1 = new Carro();
            c1.setMarca("FORD");
            c1.setModelo("KA");
            c1.setAno(LocalDate.of(2010, 1, 1));
            c1.setValor(65000.00f);
            c1.setQntdPortas(2);
            c1.setQntdCavalos(136);
            c1.setVelocidadeMaxima(200);
            System.out.println("Calculo locação:" + c1.valorLocacao());
            CarroController.incluir(c1);

        } catch (ValorInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }



        try {
            Carro c2 = new Carro();
            c2.setMarca("HYUNDAI");
            c2.setModelo("HB20S");
            c2.setAno(LocalDate.of(2015, 1, 1));
            c2.setValor(70000.00f);
            c2.setQntdPortas(4);
            c2.setQntdCavalos(130);
            c2.setVelocidadeMaxima(280);
            System.out.println("Calculo locação:" + c2.valorLocacao());
            CarroController.incluir(c2);

        } catch (ValorInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        try {
            Carro c3 = new Carro();
            c3.setMarca("FIAT");
            c3.setModelo("ARGO");
            c3.setAno(LocalDate.of(2017, 1, 1));
            c3.setValor(67900.90f);
            c3.setQntdPortas(4);
            c3.setQntdCavalos(139);
            c3.setVelocidadeMaxima(300);
            System.out.println("Calculo locação:" + c3.valorLocacao());
            CarroController.incluir(c3);

        } catch (ValorInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        try {
            Carro c4 = new Carro();
            c4.setMarca("Honda");
            c4.setModelo("City");
            c4.setAno(LocalDate.of(2017, 1, 1));
            c4.setValor(0);
            c4.setQntdPortas(4);
            c4.setQntdCavalos(200);
            c4.setVelocidadeMaxima(325);
            System.out.println("Calculo locação:" + c4.valorLocacao());
            CarroController.incluir(c4);

        } catch (ValorInvalidoException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        String diretorio = "C:/arquivos/";
        String arquivo = "carros.txt";

        try {
            try {
                FileReader fileReader = new FileReader(diretorio + arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linha = bufferedReader.readLine();
                while (linha != null) {
                    String[] campos = linha.split(";");
                    try {
                        Carro c4 = new Carro();
                        c4.setMarca(campos[0]);
                        c4.setModelo(campos[1]);
                        c4.setAno(LocalDate.parse(campos[2]));
                        c4.setValor(Float.parseFloat(campos[3]));
                        c4.setQntdPortas(Integer.parseInt(campos[4]));
                        c4.setQntdCavalos(Integer.parseInt(campos[5]));
                        c4.setVelocidadeMaxima(Integer.parseInt(campos[6]));
                        System.out.println("Calculo locação:" + c4.valorLocacao());
                        CarroController.incluir(c4);

                    } catch (ValorInvalidoException e) {
                        System.out.println("[ERRO]" + e.getMessage());
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
