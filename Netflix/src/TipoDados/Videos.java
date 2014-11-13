/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoDados;

/**
 *
 * @author Adriano
 */


public class Videos {
    
    public enum Classificacao{
        LIVRE(0),
        MENOR10(10),
        MENOR12(12),
        MENOR16(16),
        MENOR18(18);
        
        public int idadeMinima;
        
        Classificacao(int idade){
            this.idadeMinima = idade;
        }
        
    }
    
    private String nome;
    private double duracao;
    private Classificacao classificacao;

    public Videos(String nome, double duracao, Classificacao classificacao) {
        this.nome = nome;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public Videos() {
        this.nome = "Sem Nome";
        this.duracao = 0.0;
        this.classificacao = Classificacao.LIVRE;
    }
   
    
    public final boolean reproduzirVideo( Videos video ){
        System.out.println( "Reproduzindo Video " + video.nome + "..." );
        return false;
        
    }
    public final void aboutVideo(){
        System.out.println( "Nome: " +  this.nome );
        System.out.println( "Duração: " +  this.duracao );
        System.out.println( "Classificação Indicativa: " + this.classificacao );
    }

    public String getNome() {
        return nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public final int getClassificacao() {
        return this.classificacao.idadeMinima;
    }
    
    
}
