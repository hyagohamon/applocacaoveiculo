package br.edu.infnet.applocacaoveiculo.model.domain;

import java.time.LocalDate;

public class Barco extends Veiculo {

    public boolean motor;
    public int qtdDeck;
    public String categoria;

    @Override
    public String toString() {
        return "Barco {" + "motor:'" + motor + ", qntdDeck:'" + qtdDeck + ", categoria:'" + categoria + "} " + super.toString();
    }
}
