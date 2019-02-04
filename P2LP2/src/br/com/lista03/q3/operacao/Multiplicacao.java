package br.com.lista03.q3.operacao;

import java.util.List;

public class Multiplicacao implements Operacao{

    @Override
    public float calcular(float num1, float num2) {
        return num1*num2;
    }

    @Override
    public void calcular(List<Float> numeros) {
        float total = 1;
        for(float num: numeros){
            total *= num;
        }
        System.out.print("Multiplicacao: "+total+"\n");
    }
}
