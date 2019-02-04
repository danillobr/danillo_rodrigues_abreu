package br.com.lista02.q3.fatorial;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String [] args){
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um valor valor: "));
        Fatorial f1 = new FatorialRecursivo(valor1); 
        Fatorial f2 = new FatorialIterativo(valor2);
        f1.calcular();
        f2.calcular();
    }
}
