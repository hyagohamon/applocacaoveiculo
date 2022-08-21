package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;

import java.time.LocalDateTime;
import java.util.Set;

public class Locacao implements IPrinter {

    private Integer codigo;
    private String descricao;
    private LocalDateTime data;
    private boolean web;

    private Set<Veiculo> veiculos;
    private Cliente cliente;


    public Locacao(Cliente cliente) {
        this.cliente = cliente;
        this.data = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return "Locacao{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", web=" + web +
                ", cliente=" + cliente +
                ", veiculos=" + veiculos.size() +
                '}';
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

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
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
