package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Barco;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BarcoService {

    private static final Map<Integer, Barco> barcos = new HashMap<Integer, Barco>();
    private static Integer id = 1;

    public void incluir(Barco barco) {
        barco.setCodigo(id++);
        barcos.put(barco.getCodigo(), barco);
        AppImpressao.relatorio("Barco " + barco.getModelo() + " cadastrado com sucesso", barco);

    }

    public Collection<Barco> obterLista() {
        return barcos.values();
    }


    public void excluir(Integer codigo) {
        barcos.remove(codigo);
    }

}
