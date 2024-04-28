package br.com.alura.minhasmusicas.modelos;

public class Audio {

    private String titulo;
    private int totalReproducoes = 0;
    private int totalCurtidas = 0;
    private int classificacao = 0;

    // métodos getters
    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    // métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // outros métodos
    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
}
