package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;

import java.time.LocalDate;

public abstract class Veiculo implements IPrinter {
    private String marca;
    private String modelo;
    private LocalDate ano;
    private float valor;

    @Override
    public String toString() {
        return "Veiculo{" + "marca:" + marca + ", modelo:'" + modelo + ", ano:" + ano.getYear() + ", valor:" + valor + ", valor locação :" + valorLocacao() + '}';
    }

    public abstract double valorLocacao();

//    public double valorLocacao() {
//        return valor * 0.02;
//    }


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

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
