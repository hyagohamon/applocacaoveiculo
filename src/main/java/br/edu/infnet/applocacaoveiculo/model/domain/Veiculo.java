package br.edu.infnet.applocacaoveiculo.model.domain;

import java.time.LocalDate;

public class Veiculo {
    public String marca;
    public String modelo;
    public LocalDate ano;
    public float valor;

    @Override
    public String toString() {
        return "Veiculo{" + "marca:'" + marca  + ", modelo:'" + modelo + ", ano:" + ano.getYear() + ", valor:" + valor + '}';
    }
}
