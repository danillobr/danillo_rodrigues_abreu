package br.com.lista02.q2.empregado;

public class Gerente extends Empregado{
    private String departamento;

    public Gerente(String departamento, String nome, float salario) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return super.toString() + ", departamento: " + departamento;
    } 
    
}
