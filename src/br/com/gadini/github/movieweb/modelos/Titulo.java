package br.com.gadini.github.movieweb.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void setSomaAvaliacoes(double somaAvaliacoes) {
        this.somaAvaliacoes = somaAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
