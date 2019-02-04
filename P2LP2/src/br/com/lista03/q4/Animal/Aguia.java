package br.com.lista03.q4.Animal;

public class Aguia extends Ave{
    private String tipo;

    public Aguia(String tipo, String descricao, String nome) {
        super(descricao, nome);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo: " + tipo;
    }  
}
