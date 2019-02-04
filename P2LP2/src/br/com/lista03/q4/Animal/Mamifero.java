package br.com.lista03.q4.Animal;

public abstract class Mamifero extends Animal{

    public Mamifero(String descricao, String nome) {
        super(descricao, nome);
    }
    
    @Override
    public String getNome(){
        return getNome() + " é um mamífero"; 
    }
    
    @Override
    public void locomover(){
        
    }
    
    @Override
    public void alimentar(){
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
