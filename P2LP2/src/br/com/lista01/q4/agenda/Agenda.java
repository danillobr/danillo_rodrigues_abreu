package br.com.lista01.q4.agenda;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Nota> agenda = new ArrayList<>();
            
    public Agenda(){
    }
    
    public void adicionar(Nota nota){
        this.agenda.add(nota);
        System.out.print("Nota adicionda com sucesso!\n");
    }
    
    public void remover(String dono){
        for(Nota nota: agenda) {
            if(nota.getDono().equals(dono)){
                agenda.remove(nota);
                System.out.print("Nota removida com sucesso!\n");
                break;
            }
        }
    }
    
    public void atualizar(String dono, String novoDono, String novoTexto){
        for(Nota nota: agenda) {
            if(nota.getDono().equals(dono)){
                nota.setDono(novoDono);
                nota.setTexto(novoTexto);
                System.out.print("Nota atualizada com sucesso!\n");
                break;
            }
        }
    }
    
    public ArrayList listarTrue(){
        ArrayList lista = new ArrayList();
        for(Nota nota: agenda){
            if(nota.isEstado())
                lista.add(nota);
        }
        return lista;
    }
    
    public ArrayList listarFalse(){
        ArrayList lista = new ArrayList();
        for(Nota nota: agenda){
            if(!nota.isEstado())
                lista.add(nota);
        }
        return lista;
    }
    
    public void finalizar(String dono){
        for(Nota nota: agenda){
            if(nota.getDono().equals(dono)){
                nota.setEstado(false);
                System.out.print("Nota finalizada com sucesso!\n");
                break;
            }
        }
    }
    
    public void imprimir(){
        System.out.print(agenda);
    }

    @Override
    public String toString() {
        return "Agenda: " + agenda + "\n";
    }
    
}
