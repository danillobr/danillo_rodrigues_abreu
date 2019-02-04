/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista01.q1.pessoa;

/**
 *
 * @author Kiko Abreu
 */
public class Main {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Danillo", "118.111.333-05", "Rodrigues", 21);
        System.out.print("O seu nome completo eh: " + p.getNomeCompleto());
        System.out.print("\n\nTodos os dados Pessoas de " + p.getNome()+ "\n" + p);
    }
    
}
