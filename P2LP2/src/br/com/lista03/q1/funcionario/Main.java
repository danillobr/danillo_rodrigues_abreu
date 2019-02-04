package br.com.lista03.q1.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
         
        Funcionario fun1 = new Funcionario("dan", "01", "01");
        String login=ler.next(), senha=ler.next();
        if(fun1.realizarLogin(login, senha)){
            System.out.print("YOU WIN!");
        }else
            System.out.print("YOU LOSER!");
    }
}
