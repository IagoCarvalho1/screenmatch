package br.com.alura.atividades;

public class ContaBancaria {

    protected double saldo;

    public void depositar(double valor){
        saldo += valor; //Equivalente a saldo = saldo + "valor"
        System.out.println("Depósito de " + valor + "realizado. Saldo atual:");
    }

    public void sacar (double valor){
        if (valor <= saldo){ //if é equivalente a "Se"
            saldo -= valor; //Equivalente a saldo = saldo - "valor"
            System.out.println("Saque de " + valor + "realizado. Saldo atual: ");
        } else { //else é equivalente a "Se não"
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

}
 /*
 linha 12 a 18 quer dizer:
    Se(if) o valor do saque for maior ou igual ao valor do saldo, ele vai fazer o cálculo que equivale
    a 'saldo = saldo - "valor"' e imprimir a mensagem que está no "System..."
    Se não(else), ele vai imprimir a mensagem que consta no "System...";

    Public void indica que o metodo não retorna nenhum valor, ou seja, ele executa uma ação, mas não entrega
    um resultado;
  */