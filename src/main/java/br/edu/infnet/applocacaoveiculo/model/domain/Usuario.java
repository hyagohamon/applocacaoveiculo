package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements IPrinter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String senha;
    private String email;
    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<Cliente> clientes;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public Usuario() {

    }

    @Override
    public String toString() {
        return "Usuário{" + "nome='" + nome + '\'' + ", senha='" + senha + '\'' + ", email='" + email + '\'' + '}';
    }

    @Override
    public void impressao() {
        System.out.println(this);

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
