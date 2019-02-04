/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lista03.q4.Animal;

/**
 *
 * @author Kiko Abreu
 */
public abstract class Animal {
    private String descricao, nome;

    public Animal(String descricao, String nome) {
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome + " é um animal";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void locomover(){
        
    }
    
    public void alimentar(){
        
    }
                
    @Override
    public String toString() {
        return "descricao: " + descricao + ", nome: " + nome;
    }
    
}
