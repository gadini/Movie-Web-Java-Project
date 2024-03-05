package br.com.gadini.github.movieweb.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int episodiosTemporada;
    private int minutosEpisodio;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodiosTemporada * minutosEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
