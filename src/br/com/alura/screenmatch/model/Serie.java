package br.com.alura.screenmatch.model;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativas;
    private  int episodiosPorTemporadas;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtivas() {
        return ativas;
    }

    public void setAtivas(boolean ativas) {
        this.ativas = ativas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTempoadas) {
        this.episodiosPorTemporadas = episodiosPorTempoadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


}
