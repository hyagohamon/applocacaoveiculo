package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.exceptions.CilindradaInvalidaException;
import br.edu.infnet.applocacaoveiculo.model.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(3)
public class MotoTest implements CommandLineRunner {

    @Autowired
    private MotoService motoService;

    @Override
    public void run(String... args) {


        Usuario usuario = new Usuario();
        usuario.setId(1);

        try {
            Moto m1 = new Moto();
            m1.setAno("2018");
            m1.setMarca("Honda");
            m1.setModelo("Hornet");
            m1.setValor(47000.00f);
            m1.setVelocidadeMaxima(350);
            m1.setQntdCilindradas(600);
            m1.setQntdMarchas(5);
            m1.setUsuario(usuario);
            System.out.println(m1.valorLocacao());
            motoService.incluir(m1);

        } catch (CilindradaInvalidaException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        try {
            Moto m2 = new Moto();
            m2.setAno("2019");
            m2.setMarca("Yamaha");
            m2.setModelo("R3");
            m2.setValor(24000.00f);
            m2.setVelocidadeMaxima(299);
            m2.setQntdCilindradas(300);
            m2.setQntdMarchas(6);
            m2.setUsuario(usuario);

            System.out.println(m2.valorLocacao());
            motoService.incluir(m2);

        } catch (CilindradaInvalidaException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        try {
            Moto m3 = new Moto();
            m3.setAno("2022");
            m3.setMarca("Kawasaki");
            m3.setModelo("Ninja 400");
            m3.setValor(23000.00f);
            m3.setVelocidadeMaxima(350);
            m3.setQntdCilindradas(400);
            m3.setQntdMarchas(6);
            m3.setUsuario(usuario);

            System.out.println(m3.valorLocacao());
            motoService.incluir(m3);
        } catch (CilindradaInvalidaException e) {
            System.out.println("[ERRO]" + e.getMessage());
        }

        try {
            Moto m4 = new Moto();
            m4.setAno("2021");
            m4.setMarca("Suzuki");
            m4.setModelo("sz2000");
            m4.setValor(23000.00f);
            m4.setVelocidadeMaxima(350);
            m4.setQntdCilindradas(2000);
            m4.setQntdMarchas(6);
            m4.setUsuario(usuario);

            System.out.println(m4.valorLocacao());
            motoService.incluir(m4);
        } catch (CilindradaInvalidaException e) {
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
                    if ("M".equalsIgnoreCase(campos[0])) {
                        try {
                            Moto m4 = new Moto();
                            m4.setAno(campos[1]);
                            m4.setMarca(campos[2]);
                            m4.setModelo(campos[3]);
                            m4.setValor(Float.parseFloat(campos[4]));
                            m4.setVelocidadeMaxima(Integer.parseInt(campos[5]));
                            m4.setQntdCilindradas(Integer.parseInt(campos[6]));
                            m4.setQntdMarchas(Integer.parseInt(campos[7]));
                            m4.setUsuario(usuario);
                            System.out.println(m4.valorLocacao());
                            motoService.incluir(m4);
                        } catch (CilindradaInvalidaException e) {
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
