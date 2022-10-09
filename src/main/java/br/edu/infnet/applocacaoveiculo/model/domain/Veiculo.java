package br.edu.infnet.applocacaoveiculo.model.domain;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;
import br.edu.infnet.applocacaoveiculo.model.exceptions.CilindradaInvalidaException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.QntdDeckInvalidaException;
import br.edu.infnet.applocacaoveiculo.model.exceptions.ValorInvalidoException;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_veiculo")
@Inheritance(strategy =InheritanceType.JOINED )
public abstract class Veiculo implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer codigo;
    private String marca;
    private String modelo;
    private String ano;
    private float valor;
    @ManyToMany(mappedBy = "veiculos")
    private List<Locacao> locacoes;

    @ManyToOne()
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Override
    public String toString() {
        return "Veiculo{" + "marca:" + marca + ", modelo:'" + modelo + ", ano:" + ano + ", valor:" + valor + '}';
    }

    public abstract double valorLocacao() throws ValorInvalidoException, CilindradaInvalidaException, QntdDeckInvalidaException;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {

        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
