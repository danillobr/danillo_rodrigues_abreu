package br.com.lista02.q4.imovel;

public class Novo extends Imovel{
    private float precoAdicional;

    public Novo(float precoAdicional, String endereco, float preco) {
        super(endereco, preco);
        this.precoAdicional = precoAdicional;
    }
    
    public float adicionalPreco(){
        return precoAdicional;
    }
    
}
