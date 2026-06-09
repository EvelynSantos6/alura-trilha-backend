import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLista {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("Crepusculo", 2006 );
        meuFilme.avalia(10);
        var filmeEve = new Filme("Agente secreto", 2026);
        filmeEve.avalia(7);
        Serie ahs = new Serie("American Horror Story", 2012);
        ahs.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeEve);
        lista.add(meuFilme);
        lista.add(ahs);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() >2) {
                System.out.println("Classiicação: " + filme.getClassificacao());
            }
        }
    }
}







