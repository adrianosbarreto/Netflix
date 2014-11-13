/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import TipoDados.Videos;
import Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Adriano
 */
public class Netflix {
    
    public enum FormaPagamento{
        CREDITO,
        DEBITO,
        BOLETO;
    }
    
    private static final int NUM_MAX_APARELHOS_ONLINE = 4;
    private static int numeroAtualAparelhos = 0;
    private static ArrayList <Videos> filmesDisponiveis = new ArrayList<>();
    private ArrayList <Videos> filmesAssistidos = new ArrayList<>();
    private ArrayList <Videos> minhaLista = new ArrayList<>();
    private Usuario cliente;
    private FormaPagamento formaPagamento;
    private boolean status;

    public Netflix(Usuario cliente, FormaPagamento forma, boolean status) {
        this.cliente = cliente;
        this.status = status;
        this.setNumeroAtualAparelhos();
        formaPagamento = forma;
   
    }

    public Netflix() {
        this.cliente = new Usuario();
        this.formaPagamento = FormaPagamento.BOLETO;
        this.status = false;
        
    }
    

    public static int getNumeroAtualAparelhos() {
        return numeroAtualAparelhos;
    }

    public final void setNumeroAtualAparelhos() {
        if (numeroAtualAparelhos < Netflix.NUM_MAX_APARELHOS_ONLINE){
            numeroAtualAparelhos++;
        }
    }
 
    public ArrayList<Videos> getFilmesAssistidos() {
        return filmesAssistidos;
    }

    public ArrayList<Videos> getMinhaLista() {
        return minhaLista;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
            this.formaPagamento = formaPagamento;
    }
    
    public boolean adicionarAMinhaLista(Videos video){
        if(!this.minhaLista.contains(video)){
            this.minhaLista.add(video);
            return true;
        }
        else{
            System.out.println("Minha Lista já contem esse Video");
            return false;
        }  
    }

    public static int getNUM_MAX_APARELHOS_ONLINE() {
        return NUM_MAX_APARELHOS_ONLINE;
    }
    
    public static void adicionarVideos(Videos video){
        filmesDisponiveis.add(video);
    }
    
    public static void mostrarFilmesDisponiveis(){
        for(Videos sim : filmesDisponiveis){
          sim.aboutVideo();
        }
    }
    public void mostrarFilmesAssistidos(){
        for(Videos sim : this.filmesAssistidos ){
            sim.aboutVideo();
        }
    }
    public final int procurarFilme(Videos video){
        for( int i = 0; i < filmesDisponiveis.size(); i++ ){
            if (filmesDisponiveis.get(i).getNome().equals(video.getNome())){
                return i;
            }
        }
        return -1;
    }
    public boolean conectarAparelho(){
        if(numeroAtualAparelhos < Netflix.NUM_MAX_APARELHOS_ONLINE){
            numeroAtualAparelhos++;
            System.out.println("Aparelho Conetado");
            return true;
        }
        else{
            return false;  
        }
    }
    /*
    public void menuNetflix(){
        sout("");
        
    }

*/  
    
}
