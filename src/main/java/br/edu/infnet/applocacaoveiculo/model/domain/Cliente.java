package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;
import br.edu.infnet.applocacaoveiculo.model.exceptions.CPFInvalidoException;

public class Cliente implements IPrinter {

    private Integer codigo;
    private String nome;
    private String cpf;
    private String telefone;


    public Cliente(String nome, String cpf, String telefone) throws CPFInvalidoException {
        if (cpf == null) {
            throw new CPFInvalidoException("O cpf do cliente não pode ser nulo");
        }
        if (cpf.isEmpty()) {
            throw new CPFInvalidoException("O cpf do cliente não pode ser vazio");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", telefone='" + telefone + '\'' + '}';
    }

    @Override
    public void impressao() {
        System.out.println(this);

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
