package br.edu.uea.Questoes;

import br.edu.uea.Data.Data;
import br.edu.uea.Produto.Genero;
import br.edu.uea.Produto.Marca;
import br.edu.uea.Produto.Produto;
import br.edu.uea.Supermercado.Carrinho;
import br.edu.uea.Supermercado.Estoque;
import br.edu.uea.Supermercado.ItemProduto;
import br.edu.uea.Supermercado.SupermercadoWeb;
import br.edu.uea.FuncoesAux.Auxiliar;
import java.util.ArrayList;
import java.util.Scanner;

public class AP2Questao1 {
    
    public static void main(String args[]){
        
        int i;
        Data data = new Data(20, 5, 2010);
        SupermercadoWeb SPW = new SupermercadoWeb();
        
        SPW.iniciaSupermercado();
        
        
        Marca[] marcas = new Marca[SPW.getMarcas().size()];
        ItemProduto[] produtos = new ItemProduto[SPW.getProdutos().size()];
        
        SPW.getMarcas().toArray(marcas);
        SPW.getProdutos().toArray(produtos);
        
        Scanner s = new Scanner(System.in);
        
        Auxiliar.mostraMenu(1);

        for(i = 0; i < produtos.length; i++)
            Auxiliar.mostraItemProduto(produtos[i], data,0);
       
        System.out.println("\nTOTAL: " + i + " itens.");
        
    }
}
