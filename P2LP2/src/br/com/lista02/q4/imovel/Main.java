package br.com.lista02.q4.imovel;

public class Main {
    
    public static void main(String [] args){
        Imovel imovell = new Imovel("qualquer lugar", 10000);
        Novo imovel2 = new Novo(500 ,"outro lugar", 20000);
        Velho imovel3 = new Velho(400 ,"arapiraca", 40000);
        System.out.print(imovell.getPreco()+"\n");
        System.out.print(imovel2.getPreco() + imovel2.adicionalPreco()+"\n");
        System.out.print(imovel3.getPreco() - imovel3.descontoPreco()+"\n");
    }
    
}
