package br.com.alura.atividades.atividadeMusica;

public class Principal2 {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.artista = "Renato Russo";
        musica.titulo = "Faroeste Caboclo";
        musica.anoLancamento = 1993;

        musica.exibeFichaTecnica();
        musica.avalia(8);
        musica.avalia(1.5);
        musica.avalia(3.0);
        musica.avalia(1.5);
        System.out.println(musica.somaDaAvaliacao);
        System.out.println(musica.pegaMedia());
    }
}





    //atividade calculadora
    /*public static void main(String[] args) {
        br.com.alura.atividades.demaisAtividades.Calculadora calculadora = new br.com.alura.atividades.demaisAtividades.Calculadora();
        //br.com.alura.atividades.demaisAtividades.Calculadora calculadora = classe de onde estou puxando depois o nome que quero dar.
        // new calculadora() seria uma nova classe que estaria criando.
        int resultado = calculadora.dobrarnumero(5);
        /* aqui eu declarei uma variavel do tipo inteira dando o nome de resultado, posterior a isso, eu declarei o que gostaria de fazer. mas para fazer isso, preciso declarar a classe e o parâmetro a ser dado
        System.out.println(resultado);
    }
}*/


