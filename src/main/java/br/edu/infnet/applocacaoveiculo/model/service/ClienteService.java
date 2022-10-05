package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import br.edu.infnet.applocacaoveiculo.model.domain.Usuario;
import br.edu.infnet.applocacaoveiculo.model.repositories.ClienteRepository;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public void incluir(Cliente cliente) {
        clienteRepository.save(cliente);

        AppImpressao.relatorio("Cliente " + cliente.getNome() + " cadastrado com sucesso", cliente);

    }

    public Collection<Cliente> obterLista() {
        return (Collection<Cliente>) clienteRepository.findAll();
    }

    public Collection<Cliente> obterLista(Usuario usuario) {
        return (Collection<Cliente>) clienteRepository.obterLista(usuario.getId());
    }


    public void excluir(Integer codigo) {
        clienteRepository.deleteById(codigo);
    }
}
