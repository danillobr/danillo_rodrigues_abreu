package br.com.lista02.q2.empregado;

public class Main {
    public static void main(String [] args){
        Gerente g1 = new Gerente("departamento qualquer", "joão", 5000);
        System.out.print(g1);
        System.out.print("\n\n");
        Vendedor v1 = new Vendedor(500, "josé", 1000);
        System.out.print(v1);
    }
}
