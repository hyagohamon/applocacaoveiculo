package br.edu.infnet.applocacaoveiculo.model.domain;

public class Carro extends Veiculo {

    public int qntdPortas;
    public int qntdCavalos;
    public int velocidadeMaxima;


    @Override
    public String toString() {
        return "Carro{" + "qntdPortas:" + qntdPortas + ", qntdCavalos:" + qntdCavalos + ", velocidadeMaxima:" + velocidadeMaxima + "} " + super.toString();
    }
}
