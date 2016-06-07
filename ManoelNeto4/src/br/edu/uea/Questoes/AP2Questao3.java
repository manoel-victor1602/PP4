package br.edu.uea.Questoes;

import br.edu.uea.FuncoesAux.Auxiliar;
import br.edu.uea.Data.Data;
import br.edu.uea.Produto.Genero;
import br.edu.uea.Produto.Marca;
import br.edu.uea.Supermercado.ItemProduto;
import br.edu.uea.Supermercado.SupermercadoWeb;
import java.util.Scanner;

public class AP2Questao3 {
    
    public static void main(String args[]){
        
        int i, j, k, qtd = 0;
        Data data = new Data(20, 5, 2010);
        SupermercadoWeb SPW = new SupermercadoWeb();
        
        SPW.iniciaSupermercado();
        
        Marca[] marcas = new Marca[SPW.getMarcas().size()];
        ItemProduto[] produtos = new ItemProduto[SPW.getProdutos().size()];
        Genero[] generos = new Genero[SPW.getGeneros().size()];
       
        SPW.getMarcas().toArray(marcas);
        SPW.getProdutos().toArray(produtos);
        SPW.getGeneros().toArray(generos);
        
        Scanner s = new Scanner(System.in);
        
        Auxiliar.mostraMenu(1);
        
        for(i = 0; i < generos.length; i++){
            for(j = 0; j < marcas.length; j++){
                for(k = 0; k < produtos.length; k++){                    
                    if(generos[i].getNome().equals(produtos[k].getProduto().getGenero().getNome())
                       && marcas[j].getNome().equals(produtos[k].getProduto().getMarca().getNome())
                       && produtos[k].getValidade().depois(data)){
                    	Auxiliar.mostraItemProduto(produtos[k],data,0);
                        qtd++;
                    }
                    
                }
            }
        }
        
        System.out.println("\nTOTAL: " + qtd + " itens.");
        
    }
}
