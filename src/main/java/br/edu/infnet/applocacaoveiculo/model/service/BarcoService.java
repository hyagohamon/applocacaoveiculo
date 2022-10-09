package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Barco;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.repositories.BarcoRepository;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BarcoService {

    @Autowired
    private BarcoRepository barcoRepository;

    public void incluir(Barco barco) {
        barcoRepository.save(barco);
        AppImpressao.relatorio("Barco " + barco.getModelo() + " cadastrado com sucesso", barco);

    }

    public Collection<Barco> obterLista(Usuario usuario) {
        return barcoRepository.findAll(usuario.getId());
    }


    public void excluir(Integer codigo) {
        barcoRepository.deleteById(codigo);
    }

}
