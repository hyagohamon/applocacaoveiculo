package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;
import br.edu.infnet.applocacaoveiculo.model.exceptions.CPFInvalidoException;

import javax.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class Cliente implements IPrinter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nome;
    private String cpf;
    private String email;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


    public Cliente(String nome, String cpf, String email) throws CPFInvalidoException {
        if (cpf == null) {
            throw new CPFInvalidoException("O cpf do cliente não pode ser nulo");
        }
        if (cpf.isEmpty()) {
            throw new CPFInvalidoException("O cpf do cliente não pode ser vazio");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Cliente() {

    }

    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", e-mail='" + email + '\'' + '}';
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

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
