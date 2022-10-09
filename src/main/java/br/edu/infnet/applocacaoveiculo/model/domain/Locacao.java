package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;
import br.edu.infnet.applocacaoveiculo.model.exceptions.ClienteNuloException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.LocacaoSemVeiculoException;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "tb_locacao")
public class Locacao implements IPrinter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<Veiculo> veiculos;
    private String descricao;
    private LocalDateTime data;
    private boolean web;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Locacao() {
        this.data = LocalDateTime.now();
        this.web = true;
    }

    public Locacao(Cliente cliente, Set<Veiculo> veiculos) throws ClienteNuloException, LocacaoSemVeiculoException {
        if (cliente == null) {
            throw new ClienteNuloException("O cliente não pode ser nulo");
        }

//


        this.veiculos = veiculos;
        this.cliente = cliente;
        this.data = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return "Locacao{" + "descricao='" + descricao + '\'' + ", data=" + data + ", web=" + web + ", cliente=" + cliente + ", veiculos=" + veiculos.size() + '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }


    @Override
    public void impressao() {
        System.out.println(this);
    }


    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
