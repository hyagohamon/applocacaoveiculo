package br.edu.infnet.applocacaoveiculo.model.domain.app;

import br.edu.infnet.applocacaoveiculo.interfaces.IPrinter;

import java.util.List;

public class Classe implements IPrinter {
    private String nome;
    List<Atributo> atributos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }


    @Override
    public void impressao() {
        System.out.println("- - " + nome);
        for (Atributo atributo:atributos){
           atributo.impressao();
        }
    }
}
