package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.app.Atributo;
import br.edu.infnet.applocacaoveiculo.model.domain.app.Classe;
import br.edu.infnet.applocacaoveiculo.model.domain.app.Projeto;
import br.edu.infnet.applocacaoveiculo.model.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
@Order(7)
public class AppTest implements ApplicationRunner {

    @Autowired
    private AppService appService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String diretorio = "C:/arquivos/";
        String arquivo = "app.txt";




        try {

            try {

                FileReader fileReader = new FileReader(diretorio + arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                List<Classe> classeList = null;
                List<Atributo> atributos = null;
                Projeto projeto = null;
                String linha = bufferedReader.readLine();
                while (linha != null) {
                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()) {

                        case "P":
                            classeList = new ArrayList<Classe>();
                            projeto = new Projeto();
                            projeto.setNome(campos[1]);
                            projeto.setDescricao(campos[2]);
                            projeto.setClasses(classeList);

                            break;

                        case "C":
                            atributos = new ArrayList<Atributo>();
                            Classe c = new Classe();
                            c.setNome(campos[1]);
                            c.setAtributos(atributos);
                            classeList.add(c);
                            break;

                        case "A":
                            Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);
                            atributos.add(atributo);
                            break;

                        default:

                            System.out.println("Opção inválida");

                            break;
                    }

                    linha = bufferedReader.readLine();
                }
                appService.incluir(projeto);
                bufferedReader.close();
                fileReader.close();

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } finally {
            System.out.println("Inserção de textos ok");
        }


    }
}


