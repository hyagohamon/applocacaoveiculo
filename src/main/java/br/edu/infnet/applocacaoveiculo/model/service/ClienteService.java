package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Cliente;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {

    private static final Map<Integer, Cliente> clientes = new HashMap<Integer, Cliente>();
    private static Integer id = 1;

    public void incluir(Cliente cliente) {
        cliente.setCodigo(id++);
        clientes.put(cliente.getCodigo(), cliente);
        AppImpressao.relatorio("Cliente " + cliente.getNome() + " cadastrado com sucesso", cliente);

    }

    public Collection<Cliente> obterLista() {
        return clientes.values();
    }


    public void excluir(Integer codigo) {
        clientes.remove(codigo);
    }
}
