package br.edu.infnet.applocacaoveiculo.model.domain;

public class Cliente {
    public String nome;
    public String cpf;
    public String telefone;


    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome:'" + nome + '\'' +
                ", cpf:'" + cpf + '\'' +
                ", telefone:'" + telefone + '\'' +
                '}';
    }
}
