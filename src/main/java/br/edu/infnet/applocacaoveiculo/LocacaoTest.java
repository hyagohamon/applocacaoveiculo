package br.edu.infnet.applocacaoveiculo;

import br.edu.infnet.applocacaoveiculo.model.domain.Locacao;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Order(5)
public class LocacaoTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Locacao l1 = new Locacao();
        l1.setData(LocalDate.now());
        l1.setDescricao("Locação de Carro");
        l1.setWeb(true);

        Locacao l2 = new Locacao();
        l2.setData(LocalDate.now());
        l2.setDescricao("Locação de Moto");
        l2.setWeb(false);

        Locacao l3 = new Locacao();
        l3.setData(LocalDate.now());
        l3.setDescricao("Locação de Barco");
        l3.setWeb(true);

        AppImpressao.relatorio("### INCLUSAO LOCAÇÃO CARRO", l1);
        AppImpressao.relatorio("### INCLUSAO LOCAÇÃO MOTO", l2);
        AppImpressao.relatorio("### INCLUSAO LOCAÇÃO BARCO", l3);


    }
}
