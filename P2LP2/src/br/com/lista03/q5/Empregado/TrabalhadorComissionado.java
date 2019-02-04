package br.com.lista03.q5.Empregado;

public class TrabalhadorComissionado extends Empregado{
    
    private double salario;
    private double comissao;
    private int quantVendas;

    public TrabalhadorComissionado(double salario, double comissao, int quantVendas, String cpf, String nome, String rg) {
        super(cpf, nome, rg);
        this.salario = salario;
        this.comissao = comissao;
        this.quantVendas = quantVendas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    }

    @Override
    public double calcularGanho() {
        return this.salario + (this.comissao * this.quantVendas);
    }

    @Override
    public String toString() {
        return "Trabalhador Comissionado:\n" + super.toString() + ", salario: " + salario + ", comissao: " 
                + comissao + ", quantidade de vendas=" + quantVendas + ", Ganho Total: " + this.calcularGanho();
    }
    
}
