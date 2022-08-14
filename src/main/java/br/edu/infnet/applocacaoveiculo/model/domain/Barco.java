package br.edu.infnet.applocacaoveiculo.model.domain;

public class Barco extends Veiculo {

    private boolean motor;
    private int qtdDeck;
    private String categoria;


    @Override
    public String toString() {
        return "Barco {" + "motor:" + motor + ", qntdDeck:'" + qtdDeck + ", categoria:" + categoria + "} " + super.toString();
    }

    public double valorLocacao() {
        return getValor() * 0.03;
    }


    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public int getQtdDeck() {
        return qtdDeck;
    }

    public void setQtdDeck(int qtdDeck) {
        this.qtdDeck = qtdDeck;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void impressao() {
        System.out.println("Classe Barco");
        System.out.println(this);
    }
}
