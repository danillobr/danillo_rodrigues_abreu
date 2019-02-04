package br.com.lista02.q3.fatorial;

public class FatorialRecursivo implements Fatorial{
    private int valor, aux;

    public FatorialRecursivo(int valor) {
        this.valor = valor;
        this.aux = (valor-1);
    }
    
    @Override
    public void calcular() {
        if((aux < valor) && (aux >= 2)){
            valor = valor*aux;
            aux -= 1;
            calcular();
        }else{
            System.out.print("Fatorial com funcao recursiva: "+valor+"\n");
        }
        
    }
    
}
