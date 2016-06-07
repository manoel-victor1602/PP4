package br.edu.uea.Questoes;

import br.edu.uea.FuncoesAux.Auxiliar;
import br.edu.uea.Data.Data;
import br.edu.uea.Produto.Genero;
import br.edu.uea.Produto.Marca;
import br.edu.uea.Produto.Produto;
import br.edu.uea.Supermercado.Carrinho;
import br.edu.uea.Supermercado.Estoque;
import br.edu.uea.Supermercado.ItemProduto;
import br.edu.uea.Supermercado.SupermercadoWeb;
import java.util.ArrayList;
import java.util.Scanner;

public class AP2Questao2 {
    
    public static void main(String args[]){
        
        int i, j, qtdTotal = 0, qtdLocal = 0;
        
        Data data = new Data(20, 5, 2010);
        SupermercadoWeb SPW = new SupermercadoWeb();
        
        SPW.iniciaSupermercado();
        
        Carrinho carrinho = new Carrinho();
        Estoque estoque = new Estoque();
        Marca[] marcas = new Marca[SPW.getMarcas().size()];
        ItemProduto[] produtos = new ItemProduto[SPW.getProdutos().size()];
        Genero[] generos = new Genero[SPW.getGeneros().size()];


        carrinho = SPW.getCarrinho();
        estoque = SPW.getEstoque();
        SPW.getMarcas().toArray(marcas);
        SPW.getProdutos().toArray(produtos);
        SPW.getGeneros().toArray(generos);
        
        Scanner s = new Scanner(System.in);

        Auxiliar.mostraMenu(1);

        for(i = 0; i < generos.length; i++){
            for(j = 0,qtdLocal = 0; j < produtos.length; j++){
                    if(generos[i].getNome().equals(produtos[j].getProduto().getGenero().getNome())){
                    	Auxiliar.mostraItemProduto(produtos[j],data,0);
                        qtdTotal++;
                        qtdLocal++;
                    }
            }
            if(qtdLocal != 0){
                System.out.println("\nTOTAL: " + qtdLocal + " itens.\n");
            }
        }
        
        System.out.println("\nTOTAL: " + qtdTotal + " itens.");
        
    }
}
