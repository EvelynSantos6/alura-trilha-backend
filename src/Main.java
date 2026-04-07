import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Crepusculo", 2006 );
        System.out.println("Duração do filme: ");
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.pegarMedia());
        System.out.println("------------------------------------------------------------------");

        Serie ahs = new Serie("American Horror Story", 2012);
        ahs.exibeFichaTecnica();
        ahs.setTemporadas(10);
        ahs.setEpisodiosPorTemporadas(8);
        ahs.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar AHS: " + ahs.getDuracaoEmMinutos());
        System.out.println("------------------------------------------------------------------");

        /*Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Ahs);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);*/

        var filmeEve = new Filme("Agente secreto", 2026);
        filmeEve.setDuracaoEmMinutos(200);
        filmeEve.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeEve);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do" +
                " filme: " + listaDeFilmes.get(0).toString());
    }
}
