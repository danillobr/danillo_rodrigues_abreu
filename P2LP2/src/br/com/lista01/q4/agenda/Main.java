package br.com.lista01.q4.agenda;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        while(true){
            
            System.out.print("Digita a opcao:\n"
                + "1 - adicionar nota na agenda\n"
                + "2 - remover nota da agenda\n"
                + "3 - atualizar nota da agenda\n"
                + "4 - listar notas em aberto\n"
                + "5 - listar notas finalizadas\n"
                + "6 - finalizar nota\n"
                + "7 - imprimir agenda\n");
            int opcao = ler.nextInt();
            ler.nextLine();
            
            switch(opcao){
                case 1: 
                    System.out.print("Digite o nome do dono da nota: ");
                    String nome = ler.nextLine();
                    System.out.print("Digite o texto da nota: ");
                    String texto = ler.nextLine();
                    Nota nota = new Nota(nome,texto);
                    agenda.adicionar(nota);
                    break;
                case 2: 
                    System.out.print("Digite o nome do dono da nota que deseja remover"
                            + " da agenda: ");
                    nome = ler.nextLine();
                    agenda.remover(nome);
                    break;
                case 3:
                    System.out.print("Digite o nome do dono da nota: ");
                    nome = ler.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String nomeDovo = ler.nextLine();
                    System.out.print("Digite o novo texto: ");
                    String novoTexto = ler.nextLine();
                    agenda.atualizar(nome, nomeDovo, novoTexto);
                    break;
                case 4:
                    System.out.print(agenda.listarTrue());
                    break;
                case 5:
                    System.out.print(agenda.listarFalse());
                    break;
                case 6:
                    System.out.print("Digite o nome dono da nota que deseja finalizar: ");
                    nome = ler.nextLine();
                    agenda.finalizar(nome);
                    break;
                case 7:
                    agenda.imprimir();
                    break;
            }
        }
    }
}
