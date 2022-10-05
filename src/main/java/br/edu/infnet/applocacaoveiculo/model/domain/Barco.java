package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.model.exceptions.QntdDeckInvalidaException;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_barco")
public class Barco extends Veiculo {
    private boolean motor;
    private int qtdDeck;
    private String categoria;


    @Override
    public String toString() {
        return "Barco {" + "motor:" + motor + ", qntdDeck:'" + qtdDeck + ", categoria:" + categoria + "} " + super.toString();
    }

    public double valorLocacao() throws QntdDeckInvalidaException {
        if(qtdDeck>=5){
            throw new QntdDeckInvalidaException("A quantidade de decks nao pode ser igual ou superior a 5");
        }
        return getValor() * 0.02;
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
        System.out.println(this);
    }

}
