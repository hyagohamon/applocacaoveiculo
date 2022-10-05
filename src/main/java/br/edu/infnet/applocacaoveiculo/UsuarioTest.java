package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
@Order(1)
public class UsuarioTest implements ApplicationRunner {
    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String diretorio = "C:/arquivos/";
        String arquivo = "usuarios.txt";

        Usuario admin = new Usuario("admin","123","admin@gmail.com");
        usuarioService.incluir(admin);

        try {
            try {
                FileReader fileReader = new FileReader(diretorio + arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linha = bufferedReader.readLine();
                while (linha != null) {
                    String[] campos = linha.split(";");
                    Usuario usuario = new Usuario(campos[0], campos[1], campos[2]);

                    usuarioService.incluir(usuario);

                    linha = bufferedReader.readLine();
                }
                bufferedReader.close();
                fileReader.close();
                System.out.println(diretorio + arquivo);

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } finally {
            System.out.println("inserção via txt de usuários concluída com sucesso");
        }
    }
}
