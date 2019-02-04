package br.com.lista02.q2.empregado;

public class Vendedor extends Empregado{
    
    private float percentualComissao;
    
    public Vendedor(float percentualComissao, String nome, float salario){
        super(nome, salario);
        this.percentualComissao = percentualComissao; 
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public float calcularSalario(){
        return getSalario() + percentualComissao;
    }

    public String toString() {
        return "Vendedor\n" + "nome: " + getNome() + ", salário: " + getSalario() 
                + ", salário com comissão: " + calcularSalario() 
                + ", percentual de comissão: " + percentualComissao;
    }
    
}
