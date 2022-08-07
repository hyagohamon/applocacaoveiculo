package br.edu.infnet.applocacaoveiculo.model.domain;

public class Moto extends Veiculo {

    public int qntdCilindradas;
    public int velocidadeMaxima;
    public int qntdMarchas;

    @Override
    public String toString() {
        return "Moto{" +
                "qntdCilindradas:" + qntdCilindradas +
                ", velocidadeMaxima:" + velocidadeMaxima +
                ", qntdMarchas:'" + qntdMarchas +
                "} " + super.toString();
    }
}
