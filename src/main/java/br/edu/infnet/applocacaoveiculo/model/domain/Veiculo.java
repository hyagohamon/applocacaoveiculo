package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;
import br.edu.infnet.applocacaoveiculo.model.exceptions.CilindradaInvalidaException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.QntdDeckInvalidaException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.ValorInvalidoException;

import java.time.LocalDate;

public abstract class Veiculo implements IPrinter {

    private Integer codigo;
    private String marca;
    private String modelo;
    private String ano;
    private float valor;

    @Override
    public String toString() {
        return "Veiculo{" + "marca:" + marca + ", modelo:'" + modelo + ", ano:" + ano + ", valor:" + valor  + '}';
    }

    public abstract double valorLocacao() throws ValorInvalidoException, CilindradaInvalidaException, QntdDeckInvalidaException;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
