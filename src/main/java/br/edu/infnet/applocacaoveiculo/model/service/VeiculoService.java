package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.domain.Veiculo;
import br.edu.infnet.applocacaoveiculo.model.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class VeiculoService {


    @Autowired
    private VeiculoRepository veiculoRepository;

    public Collection<Veiculo> obterLista(Usuario usuario) {
        return veiculoRepository.findAll(usuario.getId());

    }

    public void excluir(Integer codigo) {
        veiculoRepository.deleteById(codigo);
    }
}
