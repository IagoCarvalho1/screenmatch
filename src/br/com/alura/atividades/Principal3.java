package br.com.alura.atividades;

import java.util.ArrayList;

public class Principal3 {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("João", 10);
        Pessoa pessoa2 = new Pessoa("Paulo",11);
        Pessoa pessoa3 = new Pessoa("Mateus",12);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista " + listaDePessoas.get(0));
        System.out.println("Lista completa " + listaDePessoas.get(0).toString());
        System.out.println(listaDePessoas);

    }
}
