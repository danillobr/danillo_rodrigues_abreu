package br.com.lista03.q3.operacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        List<Float> numeros = new ArrayList<Float>();
        float valor, valor1, valor2;
        
        while(true){
            valor = ler.nextFloat();
            if(valor!=0){
                numeros.add(new Float(valor));   
            }
            else
                break;
        }
        
        valor1 = ler.nextFloat();
        valor2 = ler.nextFloat();
            
        Operacao adicao = new Adicao();
        adicao.calcular(numeros);
        System.out.print("Adicao: "+adicao.calcular(valor1,valor2)+"\n");
        
        Operacao subtracao = new Subtracao();
        subtracao.calcular(numeros);
        System.out.print("Subtracao: "+subtracao.calcular(valor1,valor2)+"\n");
        
        Operacao divisao = new Divisao();
        divisao.calcular(numeros);
        System.out.print("Divisao: "+divisao.calcular(valor1,valor2)+"\n");
        
        Operacao multiplicacao = new Multiplicacao();
        multiplicacao.calcular(numeros);
        System.out.print("Multiplicacao: "+multiplicacao.calcular(valor1,valor2)+"\n");
        
    }
    
}
