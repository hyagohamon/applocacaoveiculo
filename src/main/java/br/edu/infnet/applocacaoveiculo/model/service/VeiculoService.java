package br.edu.infnet.applocacaoveiculo.model.service;

import br.edu.infnet.applocacaoveiculo.model.domain.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private CarroService carroService;
    @Autowired
    private MotoService motoService;
    @Autowired
    private BarcoService barcoService;

    public List<Veiculo> obterLista() {


        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.addAll(carroService.obterLista());
        veiculos.addAll(motoService.obterLista());
        veiculos.addAll(barcoService.obterLista());
        return veiculos;
    }

}
