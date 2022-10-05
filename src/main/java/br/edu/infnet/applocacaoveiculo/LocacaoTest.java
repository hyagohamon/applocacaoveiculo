package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.*;
import br.edu.infnet.applocacaoveiculo.model.exceptions.CPFInvalidoException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.ClienteNuloException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.LocacaoSemVeiculoException;
import br.edu.infnet.applocacaoveiculo.model.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@Order(6)
public class LocacaoTest implements CommandLineRunner {

    @Autowired
    private LocacaoService locacaoService;

    @Override
    public void run(String... args) {


        String diretorio = "C:/arquivos/";
        String arquivo = "locacoes.txt";

        try {
            try {
                FileReader fileReader = new FileReader(diretorio + arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                Set<Veiculo> listaVeiculos = null;
                List<Locacao> locacoes = new ArrayList<Locacao>();

                String linha = bufferedReader.readLine();
                while (linha != null) {
                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()) {
                        case "L":
                            try {
                                listaVeiculos = new HashSet<Veiculo>();
                                Cliente c1 = new Cliente(campos[3], campos[4], campos[5]);
                                Locacao locacao = new Locacao(c1, listaVeiculos);
                                locacao.setDescricao(campos[1]);
                                locacao.setWeb(Boolean.parseBoolean(campos[2]));
                                locacoes.add(locacao);
                            } catch (CPFInvalidoException | ClienteNuloException | LocacaoSemVeiculoException e) {
                                System.out.println("Error " + e.getMessage());
                            }
                            break;

                        case "M":
                            Moto moto = new Moto();
                            moto.setAno(campos[1]);
                            moto.setMarca(campos[2]);
                            moto.setModelo(campos[3]);
                            moto.setValor(Float.parseFloat(campos[4]));
                            moto.setVelocidadeMaxima(Integer.parseInt(campos[5]));
                            moto.setQntdCilindradas(Integer.parseInt(campos[6]));
                            moto.setQntdMarchas(Integer.parseInt(campos[7]));

                            listaVeiculos.add(moto);

                            break;

                        case "C":
                            Carro carro = new Carro();
                            carro.setMarca(campos[1]);
                            carro.setModelo(campos[2]);
                            carro.setAno(campos[3]);
                            carro.setValor(Float.parseFloat(campos[4]));
                            carro.setQntdPortas(Integer.parseInt(campos[5]));
                            carro.setQntdCavalos(Integer.parseInt(campos[6]));
                            carro.setVelocidadeMaxima(Integer.parseInt(campos[7]));

                            listaVeiculos.add(carro);

                            break;

                        case "B":
                            Barco barco = new Barco();
                            barco.setMarca(campos[1]);
                            barco.setAno(campos[2]);
                            barco.setModelo(campos[3]);
                            barco.setCategoria(campos[4]);
                            barco.setQtdDeck(Integer.parseInt(campos[5]));
                            barco.setMotor(Boolean.parseBoolean(campos[6]));
                            barco.setValor(Float.parseFloat(campos[7]));

                            listaVeiculos.add(barco);

                            break;
                    }


                    linha = bufferedReader.readLine();
                }

                for (Locacao l : locacoes) {
                    System.out.println(":::::::::::::::::::>>>>>>>." + l.getCodigo());
                    System.out.println(":::::::::::::::::::>>>>>>>."+l.getCliente());
                    System.out.println(":::::::::::::::::::>>>>>>>."+l.getDescricao());

                    locacaoService.incluir(l);

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
