/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import Servicos.Netflix.FormaPagamento;
import TipoDados.Videos;
import Usuario.Usuario;
//import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Criando e Adicionando Filmes...
        Videos novo1 = new Videos("As Aventuras de Pi", 1.45, Videos.Classificacao.LIVRE);
        Videos novo2 = new Videos("O Senhor dos Aneis", 3.20, Videos.Classificacao.MENOR12);
        Videos novo3 = new Videos("Harry Potter", 2.15, Videos.Classificacao.MENOR16);
        Videos novo4 = new Videos("O Robbit", 3.12, Videos.Classificacao.MENOR18);

        int opcao;

        Youtube.adicionarFilme(novo1);
        Youtube.adicionarFilme(novo2);
        Youtube.adicionarFilme(novo3);
        Youtube.adicionarFilme(novo4);

        System.out.println("1 - Adquirir Servico");
        System.out.println("2 - Logar em Servico");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                int opcao1;
                System.out.println("1 - Youtube");
                System.out.println("2 - Netflix");
                opcao1 = sc.nextInt();
                switch (opcao1) {
                    case 1:
                        Youtube a;
                        
                        Usuario b = Usuario.novoUser();
                        a = new Youtube(true, b);
                        
                        break;
                        
                    case 2:
                        Netflix d;
                        Usuario c = Usuario.novoUser();
                        if(Netflix.getNumeroAtualAparelhos() < Netflix.getNUM_MAX_APARELHOS_ONLINE()){
                            d = new Netflix(c,FormaPagamento.BOLETO, true);
                        }
                        else{
                            System.out.println("Limite de Aparelhos online");
                        }
                        break;
                }

                break;           
            default:
                break;
        }


    }
}
