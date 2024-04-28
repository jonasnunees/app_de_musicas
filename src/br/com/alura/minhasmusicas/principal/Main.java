package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        System.out.println("Nome: " + minhaMusica.getTitulo());
        System.out.println("Artista: " + minhaMusica.getArtista());
        System.out.println("Total de reproduções: " + minhaMusica.getTotalReproducoes());
        System.out.println("Total de curtidas: " + minhaMusica.getTotalCurtidas());

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        System.out.println("Título: " + meuPodcast.getTitulo());
        System.out.println("Apresentador: " + meuPodcast.getApresentador());
        System.out.println("Total de reproduções: " + meuPodcast.getTotalReproducoes());
        System.out.println("Total de curtidas: " + meuPodcast.getTotalCurtidas());

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}