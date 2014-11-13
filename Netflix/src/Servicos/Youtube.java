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
public class Youtube extends Servico implements Streaming{
    private boolean status;
    private Usuario usuario;
    private static ArrayList<Videos> listaVideos = new ArrayList<>();

    public Youtube(boolean status, Usuario usuario) {
        this.status = status;
        this.usuario = usuario;
    }
    
    public static void adicionarFilme(Videos video){
        listaVideos.add(video);
    }

    public final int pesquisarVideos(Videos video){
        for( int i = 0; i < listaVideos.size(); i++ ){
            if( listaVideos.get(i).equals(video) ){
                return i;
            }
        }
        return 0;
    }

    @Override
    public boolean logarServico() {
        if( status == false ){
            status = true;
            usuario.aboutUser();
        }
        else{
            System.out.println("Usuario já está Logado!");
            usuario.aboutUser();
        }
        
        return true;
    }
    
    @Override
    public void mensagemBoasVindas() {
        super.mensagemBoasVindas();
        System.out.print("ao YouTube!");
    }

    @Override 
    public boolean reproduzirMidia(Videos video) {            
        if (video.getClassificacao() <= usuario.getIdade()){
            System.out.println("Carregando Video...");
            System.out.println("Video " + video.getNome() + "em reprodução");
            return true;
        }
        else{
            System.out.println("Fora da classificação Indicativa");
            return false;
        }        
    } 
    public final void aboutYouTube(){
        usuario.aboutUser();
        if(status == true){
            System.out.println("Status: Logado");
        }
        else{
            System.out.println("Status: off");
        }
    }
}
