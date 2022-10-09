package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Carro;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.repositories.CarroRepository;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Collection;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public void incluir(Carro carro) {

        carroRepository.save(carro);
        AppImpressao.relatorio("Carro " + carro.getModelo() + " cadastrado com sucesso", carro);

    }

    public Collection<Carro> obterLista(@SessionAttribute("loggedUser") Usuario usuario) {
        return carroRepository.findAll(usuario.getId());
    }


    public void excluir(Integer codigo) {
        carroRepository.deleteById(codigo);
    }

}
