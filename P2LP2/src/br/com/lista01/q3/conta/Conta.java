package br.com.lista01.q3.conta;


import java.util.Scanner;

public class Conta {
    private String numeroDaConta;
    private float saldo;

    public Conta(String numeroDaConta, float saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(String numero, float valor){
        Scanner ler = new Scanner(System.in);
        
        if(validarConta(numero)){    
            this.saldo += valor;
            System.out.print("Operacao realizado com sucesso! \n");
        }else{
            System.out.print("ERRO! tentar de novo? (1 - SIM | 2 - NAO)\n");
            int opcao = ler.nextInt();
            if(opcao==1){
                System.out.print("Digite o numero da Conta: ");
                depositar(ler.next(), valor);
            }else{
                System.out.print("TRANSACAO FINALIZADA!\n");
            }
        }
    }
    
    public void saque(String numero, float valor){
        Scanner ler = new Scanner(System.in);
        
        if(validarConta(numero)){
            if(validarSaque(valor)){
                this.saldo -= valor;
                System.out.print("Operacao realizado com sucesso!\n");
            }else{
                System.out.print("Valor excede Saldo!");
            }
        }else{
            System.out.print("ERRO! tentar de novo? (1 - SIM | 2 - NAO)\n");
            int opcao = ler.nextInt();
            if(opcao==1){
                System.out.print("Digite o nuemro da Conta: ");
                saque(ler.next(), valor);
            }else{
                System.out.print("TRANSACAO FINALIZADA!\n");
            }
        }  
    }
    
    private boolean validarSaque(float valor){
        if(valor <= this.saldo){
            return true;
        }else{
            return false;
        }
    } 
    
    private boolean validarConta(String numero){
        if(numero.equals(this.numeroDaConta)){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString() {
        return "Conta:\n" + "numero da Conta: " + numeroDaConta + "\nsaldo: " + saldo + " ";
    }
    
    
}
