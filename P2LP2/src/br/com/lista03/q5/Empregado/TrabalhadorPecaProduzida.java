package br.com.lista03.q5.Empregado;

public class TrabalhadorPecaProduzida extends Empregado{
    
    private double remuneracao;
    private int quantidade;

    public TrabalhadorPecaProduzida(double remuneracao, int quantidade, String cpf, String nome, String rg) {
        super(cpf, nome, rg);
        this.remuneracao = remuneracao;
        this.quantidade = quantidade;
    }

    public double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public double calcularGanho() {
        return this.remuneracao * this.quantidade;
    }

    @Override
    public String toString() {
        return "Trabalhador Peca Produzida:\n" + super.toString() + ", remuneracao: " + remuneracao 
                + ", quantidade: " + quantidade + ", Ganho Total: " + this.calcularGanho();
    }
    
    
    
}
