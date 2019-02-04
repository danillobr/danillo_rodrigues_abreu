package br.com.lista03.q5.Empregado;

public class Chefe extends Empregado{
    
    private double salarioMensal;

    public Chefe(double salarioMensal, String cpf, String nome, String rg) {
        super(cpf, nome, rg);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public double calcularGanho(){
        return this.salarioMensal;
    }

    @Override
    public String toString() {
        return "Chefe:\n" + super.toString()+ ", salario Mensal=" + salarioMensal 
                + ", ganho total: " + this.calcularGanho();
    }
 
}
