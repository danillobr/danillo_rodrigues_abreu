package br.com.lista02.q4.imovel;

public class Velho extends Imovel{
    private float descontoPreco;

    public Velho(float descontoPreco, String endereco, float preco) {
        super(endereco, preco);
        this.descontoPreco = descontoPreco;
    }
    
    public float descontoPreco(){
        return descontoPreco;
    }
    
}
