package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Locacao;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.repositories.LocacaoRepository;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository locacaoRepository;

    public void incluir(Locacao locacao) {
        locacaoRepository.save(locacao);
        AppImpressao.relatorio("Locação " + locacao.getDescricao() + " cadastrada com sucesso", locacao);

    }

    public Collection<Locacao> obterLista() {
        return (Collection<Locacao>) locacaoRepository.findAll();
    }

    public Collection<Locacao> obterLista(Usuario usuario) {
        return locacaoRepository.findAll(usuario.getId());
    }

    public void excluir(Integer codigo) {
        locacaoRepository.deleteById(codigo);
    }

}
