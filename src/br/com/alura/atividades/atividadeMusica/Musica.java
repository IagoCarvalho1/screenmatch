package br.com.alura.atividades.atividadeMusica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int totalDeAvaliacao;
    double somaDaAvaliacao;
    double numAvaliacao;

    void exibeFichaTecnica(){
        System.out.println("Artista: " + artista);
        System.out.println("A música é: " + titulo);
        System.out.println("Seu lançamento foi no ano de: " + anoLancamento);
    }

    void avalia(double nota){
        somaDaAvaliacao += nota;
        totalDeAvaliacao++;
    }
    double pegaMedia(){
        return somaDaAvaliacao / totalDeAvaliacao;
    }
}
