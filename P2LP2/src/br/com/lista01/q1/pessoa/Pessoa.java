package br.com.lista01.q1.pessoa;

public class Pessoa {
    private String nome, cpf, sobrenome;
    private int idade;

    public Pessoa(String nome, String cpf, String sobrenome, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public String getNomeCompleto(){
        return this.nome+" "+this.sobrenome;
    }

    public String toString() {
        return "nome: " + nome + ", cpf: " + cpf + ", sobrenome: " + sobrenome + ", idade: " + idade;
    }
    
    
}
