package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;

import java.time.LocalDate;

public class Locacao implements IPrinter {
    private String descricao;
    private LocalDate data;
    private boolean web;

    @Override
    public String toString() {
        return "Locacao{" + "descricao='" + descricao + '\'' + ", data=" + data + ", web=" + web + '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    @Override
    public void impressao() {
        System.out.println("# Classe locação");
        System.out.println(this);
    }


}
