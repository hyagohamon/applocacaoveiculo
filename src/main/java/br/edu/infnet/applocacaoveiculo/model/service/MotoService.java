package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.repositories.MotoRepository;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MotoService {
    @Autowired
    private MotoRepository motoRepository;


    public void incluir(Moto moto) {
        motoRepository.save(moto);
        AppImpressao.relatorio("Moto " + moto.getModelo() + " cadastrada com sucesso", moto);

    }

    public Collection<Moto> obterLista() {
        return (Collection<Moto>) motoRepository.findAll();

    }

    public Collection<Moto> obterLista(Usuario usuario) {
        return motoRepository.findAll(usuario.getId());

    }


    public void excluir(Integer codigo) {
        motoRepository.deleteById(codigo);
    }

}
