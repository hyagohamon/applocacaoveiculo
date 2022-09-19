package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Locacao;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class LocacaoService {

    private static final Map<Integer, Locacao> locacoes = new HashMap<Integer, Locacao>();
    private static Integer id = 1;

    public void incluir(Locacao locacao) {
        locacao.setCodigo(id++);
        locacoes.put(locacao.getCodigo(), locacao);
        AppImpressao.relatorio("Locação " + locacao.getDescricao() + " cadastrada com sucesso", locacao);

    }

    public Collection<Locacao> obterLista() {
        return locacoes.values();
    }

    public void excluir(Integer codigo) {
        locacoes.remove(codigo);
    }

}
