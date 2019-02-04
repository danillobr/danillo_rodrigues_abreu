package br.com.lista02.q2.empregado;

public class Empregado {
    private String nome;
    protected float salario;

    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Funcionario\n" + "nome: " + nome + ", salario: " + salario;
    }
    
}
