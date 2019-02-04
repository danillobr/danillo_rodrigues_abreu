package br.com.lista03.q5.Empregado;

public class TralhadorHora extends Empregado{
    
    private double salarioHora;
    private int horas;

    public TralhadorHora(double salarioHora, int horas, String cpf, String nome, String rg) {
        super(cpf, nome, rg);
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcularGanho() {
        return this.salarioHora * this.horas;
    }

    @Override
    public String toString() {
        return "Tralhador Hora:\n" + super.toString() + ", salarioHora: " + salarioHora 
                + ", horas: " + horas + ", ganho total: " + this.calcularGanho();
    }
    
}
