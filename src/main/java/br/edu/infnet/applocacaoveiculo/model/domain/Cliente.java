package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;

public class Cliente implements IPrinter {
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

    @Override
    public void impressao() {
        System.out.println("# Classe cliente");
        System.out.println(this);

    }

}
