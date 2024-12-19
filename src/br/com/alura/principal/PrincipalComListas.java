package br.com.alura.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        var filmeDoIago = new Filme("Dogville", 2003);
        filmeDoIago.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoIago);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }


        }
    }
}
