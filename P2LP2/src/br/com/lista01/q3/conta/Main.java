package br.com.lista01.q3.conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
       
        Conta conta1 = new Conta("11", 300);
        conta1.depositar("11", 600);
        System.out.print(conta1+"\n");
        conta1.saque("11", 900);
        System.out.print(conta1+"\n");
    }
}