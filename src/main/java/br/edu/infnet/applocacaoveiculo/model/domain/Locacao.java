package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;
import br.edu.infnet.applocacaoveiculo.model.exceptions.ClienteNuloException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.LocacaoSemVeiculoException;

import java.time.LocalDateTime;
import java.util.Set;

public class Locacao implements IPrinter {

    private final Cliente cliente;
    private final Set<Veiculo> veiculos;
    private Integer codigo;
    private String descricao;
    private LocalDateTime data;
    private boolean web;


    public Locacao(Cliente cliente, Set<Veiculo> veiculos) throws ClienteNuloException, LocacaoSemVeiculoException {
        if (cliente == null) {
            throw new ClienteNuloException("O cliente não pode ser nulo");
        }

//


        this.veiculos = veiculos;
        this.cliente = cliente;
        this.data = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return "Locacao{" + "descricao='" + descricao + '\'' + ", data=" + data + ", web=" + web + ", cliente=" + cliente + ", veiculos=" + veiculos.size() + '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }


    @Override
    public void impressao() {
        System.out.println(this);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
