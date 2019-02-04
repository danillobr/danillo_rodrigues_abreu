package br.com.lista02.q1.ingressoVip;

public class Ingresso {
    protected float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public Ingresso() {
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Ingresso\n" + "valor: " + valor + " ";
    }    
}
