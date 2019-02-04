package br.com.lista02.q1.ingressoVip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        IngressoVIP i1 = new IngressoVIP();
        i1.setValor(ler.nextFloat());
        i1.setValorAdcional(ler.nextFloat());
        System.out.print(i1);
        System.out.print("\n" + i1.getValor());
  
    }
}