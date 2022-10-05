package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(2)
public class ClienteTest implements CommandLineRunner {
    @Autowired
    ClienteService clienteService;

    @Override
    public void run(String... args) {

        Usuario admin = new Usuario();
        admin.setId(1);

        try {
            Cliente c1 = new Cliente("Mariana Cutrim Alencar", "05027864349", "99985453299");
            c1.setUsuario(admin);
            clienteService.incluir(c1);

        } catch (Exception e) {
            System.out.println("[ERRO]" + e.getMessage());
        }


        try {
            Cliente c2 = new Cliente("Italo Jose de Aquino", "01235345875", "99985256398");
            c2.setUsuario(admin);

            clienteService.incluir(c2);

        } catch (Exception e) {
            System.out.println("[ERRO]" + e.getMessage());
        }

        try {
            Cliente c3 = new Cliente("Kassia Hellen Silva", "12785445632", "99984453241");
            c3.setUsuario(admin);

            clienteService.incluir(c3);

        } catch (Exception e) {
            System.out.println("[ERRO]" + e.getMessage());

        }

        try {
            Cliente c4 = new Cliente("Joao Alcadieno", "", "87885421");
            c4.setUsuario(admin);

            clienteService.incluir(c4);

        } catch (Exception e) {
            System.out.println("[ERRO]" + e.getMessage());

        }

        try {
            Cliente c5 = new Cliente("Maria Clara", null, "99984453241");
            c5.setUsuario(admin);

            clienteService.incluir(c5);

        } catch (Exception e) {
            System.out.println("[ERRO]" + e.getMessage());

        }


        String diretorio = "C:/arquivos/";
        String arquivo = "clientes.txt";


        try {
            try {
                FileReader fileReader = new FileReader(diretorio + arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linha = bufferedReader.readLine();
                while (linha != null) {
                    String[] campos = linha.split(";");
                    try {
                        Cliente c5 = new Cliente(campos[0], campos[1], campos[2]);
                        c5.setUsuario(admin);
                        clienteService.incluir(c5);

                    } catch (Exception e) {
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