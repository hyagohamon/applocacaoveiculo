package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.model.exceptions.ValorInvalidoException;

public class Carro extends Veiculo {

    private int qntdPortas;
    private int qntdCavalos;
    private int velocidadeMaxima;


    @Override
    public String toString() {
        return "Carro{" + "qntdPortas:" + qntdPortas + ", qntdCavalos:" + qntdCavalos + ", velocidadeMaxima:" + velocidadeMaxima + "} " + super.toString();
    }

    @Override
    public double valorLocacao() throws ValorInvalidoException {
        if (getValor() <= 0) {
            throw new ValorInvalidoException("Valor do veiculo nao pode ser menor ou igual a zero");
        }
        return getValor() * 0.04;
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }

    public int getQntdPortas() {
        return qntdPortas;
    }

    public void setQntdPortas(int qntdPortas) {
        this.qntdPortas = qntdPortas;
    }

    public int getQntdCavalos() {
        return qntdCavalos;
    }

    public void setQntdCavalos(int qntdCavalos) {
        this.qntdCavalos = qntdCavalos;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
