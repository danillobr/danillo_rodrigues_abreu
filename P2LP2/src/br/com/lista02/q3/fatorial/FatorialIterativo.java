package br.com.lista02.q3.fatorial;

public class FatorialIterativo implements Fatorial{
    private int valor;

    public FatorialIterativo(int valor) {
        this.valor = valor;
    }
    
    @Override
    public void calcular() {
        for(int aux = valor-1; aux < valor && aux >= 2; aux--){
            valor = valor*aux;
        }
        System.out.print("Fatorial com funcao interativa: "+valor+"\n");
    }
}
