package br.com.lista03.q2.funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
         
        Funcionario fun1 = new Funcionario("dan", "111.222.333-04", "email@email", "resUni01", "06/06/1996", "Gerente", "senha012345");
        Funcionario fun2 = new Funcionario("ze", "444.222.555-40", "email2@email", "resUni02", "07/07/199", "Atendente", "senha01234567");
        
        String login1=ler.next(), senha1=ler.next();
        if(fun1.realizarLogin(login1, senha1))
            System.out.print("Login realizado com sucesso!\n");
        else
            System.out.print("Login e /ou senha incorretos\n");
        
        String login2=ler.next(), senha2=ler.next();
        if(fun2.realizarLogin(login2, senha2))
            System.out.print("Login realizado com sucesso!\n");
        else
            System.out.print("Login e /ou senha incorretos\n");
    }
}
