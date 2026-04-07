import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;

import java.util.ArrayList;

public class MainLista {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("Crepusculo", 2006 );
        var filmeEve = new Filme("Agente secreto", 2026);
        Serie ahs = new Serie("American Horror Story", 2012);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeEve);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do" +
                " filme: " + listaDeFilmes.get(0).toString());
    }
}
