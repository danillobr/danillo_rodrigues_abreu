package br.com.lista03.q1.funcionario;

public class Funcionario {
    private String nome, cpf, email, registroUnico, dataDeNascimento, funcao, senha;

    public Funcionario(String nome, String cpf, String email, String registroUnico, String dataDeNascimento, String funcao, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.registroUnico = registroUnico;
        this.dataDeNascimento = dataDeNascimento;
        this.funcao = funcao;
        this.senha = senha;
    }

    public Funcionario(String email, String registroUnico, String senha){
        this.email = email;
        this.registroUnico = registroUnico;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistroUnico() {
        return registroUnico;
    }

    public void setRegistroUnico(String registroUnico) {
        this.registroUnico = registroUnico;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean realizarLogin(String login, String senha){
        if((login == this.email || login == this.registroUnico) && senha == this.senha){
            return true;
        }else
            return false;
    }
    
    public String toString() {
        return "Funcionario:\n" + "nome: " + nome + "\ncpf:" + cpf + "\nemail: " + email + "\nregistro unico: " + registroUnico + "\ndata de nascimento: " + dataDeNascimento + "\n funcao:" + funcao + "\n senha: " + senha + " ";
    }
    
}
