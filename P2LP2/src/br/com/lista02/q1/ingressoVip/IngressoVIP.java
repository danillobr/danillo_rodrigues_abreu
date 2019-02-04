package br.com.lista02.q1.ingressoVip;

public class IngressoVIP extends Ingresso{
    private float valorAdcional;

    public IngressoVIP(float valorAdcional, float valor) {
        super(valor);
        this.valorAdcional = valorAdcional;
    }

    public IngressoVIP() {
    }

    public float getValorAdcional() {
        return valorAdcional;
    }

    public void setValorAdcional(float valorAdcional) {
        this.valorAdcional = valorAdcional;
    }
    
    public float getValor(){
        return this.valor + this.valorAdcional;
    }

    public String toString() {
        return super.toString() + "valor com Adcional: " + getValor();
    }
}
