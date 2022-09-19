package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Carro;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarroService {

    private static final Map<Integer, Carro> carros = new HashMap<Integer, Carro>();
    private static Integer id = 1;

    public void incluir(Carro carro) {
        carro.setCodigo(id++);
        carros.put(carro.getCodigo(), carro);
        AppImpressao.relatorio("Carro " + carro.getModelo() + " cadastrado com sucesso", carro);

    }

    public Collection<Carro> obterLista() {
        return carros.values();
    }


    public void excluir(Integer codigo) {
        carros.remove(codigo);
    }

}
