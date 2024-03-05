package br.com.gadini.github.movieweb.modelos;

import br.com.gadini.github.movieweb.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
