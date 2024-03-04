package br.com.gadini.github.movieweb.calculos;

import br.com.gadini.github.movieweb.modelos.Titulo;

public class CalculadoraTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}
