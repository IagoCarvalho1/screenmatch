package br.com.alura.atividades.atividadeAnimal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom(){
        System.out.println("au au au");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanando rabo");
    }
}
