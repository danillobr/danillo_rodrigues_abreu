package br.com.lista03.q4.Animal;

public abstract class Ave extends Animal{

    public Ave(String descricao, String nome) {
        super(descricao, nome);
    }
    
    @Override
    public String getNome(){
        return getNome() + " é uma ave"; 
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
