package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.model.exceptions.CilindradaInvalidaException;

public class Moto extends Veiculo {

    private int qntdCilindradas;
    private int velocidadeMaxima;
    private int qntdMarchas;

    @Override
    public String toString() {
        return "Moto{" +
                "qntdCilindradas:" + qntdCilindradas +
                ", velocidadeMaxima:" + velocidadeMaxima +
                ", qntdMarchas:'" + qntdMarchas +
                "} " + super.toString();
    }

    @Override
    public double valorLocacao() throws CilindradaInvalidaException {
        if(qntdCilindradas>1500){
            throw new CilindradaInvalidaException(" a quantidade de cilindradas nao pode ser maior que 1500");
        }
        return getValor() * 0.02 + (qntdCilindradas / 2);
    }

    @Override
    public void impressao() {
        System.out.println(this);
    }

    public int getQntdCilindradas() {
        return qntdCilindradas;
    }

    public void setQntdCilindradas(int qntdCilindradas) {
        this.qntdCilindradas = qntdCilindradas;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getQntdMarchas() {
        return qntdMarchas;
    }

    public void setQntdMarchas(int qntdMarchas) {
        this.qntdMarchas = qntdMarchas;
    }
}
