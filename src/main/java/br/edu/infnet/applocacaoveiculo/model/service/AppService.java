package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.app.Projeto;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private Projeto projeto;


    public void incluir(Projeto projeto) {
        this.projeto = projeto;
        AppImpressao.relatorio("Exibição do projeto" + projeto.getNome() + "realizada com sucesso", projeto);
    }

    public Projeto obterProjeto(){
        return  projeto;
    }
}
