package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Moto;
import br.edu.infnet.applocacaoveiculo.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MotoService {

    private static final Map<Integer, Moto> motos = new HashMap<Integer, Moto>();
    private static Integer id = 1;

    public void incluir(Moto moto) {
        moto.setCodigo(id++);
        motos.put(moto.getCodigo(), moto);
        AppImpressao.relatorio("Moto " + moto.getModelo() + " cadastrada com sucesso", moto);

    }

    public Collection<Moto> obterLista() {
        return motos.values();
    }


    public void excluir(Integer codigo) {
        motos.remove(codigo);
    }

}
