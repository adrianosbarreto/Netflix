/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Usuario.Pessoa;
import java.util.Scanner;

/**
 *
 * @author Adriano
 * 
 */
public class Usuario extends Pessoa{
    
    private String nomeUsuario;
    
    public Usuario() {
        this.nomeUsuario = "Sem Nome";
    }

    public Usuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    
    public Usuario(String nome, String endereco, int idade, String nomeUsuario) {
        super(nome, endereco, idade);
        //this.nomeUsuario = nomeUsuario;
        setNomeUsuario(nomeUsuario);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        if(nomeUsuario.length() <= 15){
            this.nomeUsuario = nomeUsuario;
        }
    }
    
    public void aboutUser(){
        System.out.println("Nome Usuario: " + this.nomeUsuario);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);   
    }
    public static Usuario novoUser(){
        Scanner sc = new Scanner(System.in);
        String nome1;
        String endereco1;
        String nomeUser1;
        int idade1;

        System.out.println("Digite seu nome: ");
        nome1 = sc.next();
        System.out.println("Digite sua Idade: ");
        idade1 = sc.nextInt();
        System.out.println("Digite seu Endereço: ");
        endereco1 = sc.next();
        System.out.println("Digite seu Nome de Usuario: ");
        nomeUser1 = sc.next();
        
        return new Usuario(nome1, endereco1, idade1, nomeUser1);     
    }
}
