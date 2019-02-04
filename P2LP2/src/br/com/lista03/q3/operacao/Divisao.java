package br.com.lista03.q3.operacao;

import java.util.ArrayList;
import java.util.List;

public class Divisao implements Operacao{

    @Override
    public float calcular(float num1, float num2) {
        return num1/num2;
    }

    @Override
    public void calcular(List<Float> numeros) {
        List<Float> numerosCopia = new ArrayList(numeros);
        float total = numerosCopia.get(0);
        numerosCopia.remove(0);
        for(float num: numerosCopia){
            total /= num;
        }
        System.out.print("Divisao: "+total+"\n");
    }
}
