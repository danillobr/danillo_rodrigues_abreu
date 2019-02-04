package br.com.lista01.q5.base;

public class Basinha extends Base {
    public int c;
    public void fazerMetodo(){
       	a=b+c;
}
}

/* O metodo "fazerMetodo()" não ira funcionar, pois o atributo "b" da classe
"Base" está com o modificador de acesso "private", com isso só a class "Base"
tem acesso direto a esse atributo. Uma solução seria criar o metodo "getB()" na
class "Base", assim seria possivel acessar o valor do atributo "b" na class
"Basinha" fazendo uso do: "getB()" ao invés de "b".*/ 