package br.uea.Questoes;

import br.uea.Auxiliares.Auxiliar;
import br.uea.Data.Data;
import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Produto.Produto;
import br.uea.Supermercado.Carrinho;
import br.uea.Supermercado.Estoque;
import br.uea.Supermercado.ItemProduto;
import br.uea.Supermercado.SupermercadoWeb;
import java.util.ArrayList;
import java.util.Scanner;

public class AP2Questao3 {
    
    public static void main(String args[]){
        
        int i, j, k, qtd = 0;
        
        SupermercadoWeb SPW = new SupermercadoWeb();
        
        SPW.iniciaSupermercado();
        
        Carrinho carrinho = new Carrinho();
        Estoque estoque = new Estoque();
        Marca[] marcas = new Marca[SPW.getMarcas().size()];
        ItemProduto[] produtos = new ItemProduto[SPW.getProdutos().size()];
        Genero[] generos = new Genero[SPW.getGeneros().size()];
        
        Data data = new Data(20,5,2010);

        carrinho = SPW.getCarrinho();
        estoque = SPW.getEstoque();
        SPW.getMarcas().toArray(marcas);
        SPW.getProdutos().toArray(produtos);
        SPW.getGeneros().toArray(generos);
        
        Scanner s = new Scanner(System.in);
        
        Auxiliar.mostraMenu();
        
        for(i = 0; i < generos.length; i++){
            for(j = 0; j < marcas.length; j++){
                for(k = 0; k < produtos.length; k++){
                    
                    if(generos[i].getNome().equals(produtos[k].getProduto().getGenero().getNome())
                       && marcas[j].getNome().equals(produtos[k].getProduto().getMarca().getNome())
                       && produtos[k].getValidade().depois(data)){
                    	Auxiliar.mostraItemProduto(produtos[k],data);
                        qtd++;
                    }
                    
                }
            }
        }
        
        System.out.println("\nTOTAL: " + qtd + " itens.");
        
    }
}
