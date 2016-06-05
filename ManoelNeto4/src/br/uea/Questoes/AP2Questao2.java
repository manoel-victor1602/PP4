package br.uea.Questoes;

import br.uea.Data.Data;
import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Supermercado.Carrinho;
import br.uea.Supermercado.Estoque;
import br.uea.Supermercado.ItemProduto;
import br.uea.Supermercado.SupermercadoWeb;
import java.util.Scanner;

public class AP2Questao2 {

    public static void mostraItemProduto(ItemProduto it, Data data){
        System.out.println(it.getCodigo() + "   " +
                           it.getProduto().getNome() + "        " +
                           it.getProduto().getMarca() + "    " +
                           it.getProduto().getPreco() + "     " +
                           it.getValidade() + " " +
                           it.getValidade().antes(data));
    }
    
    public static void main(String args[]){
        
        int i, j;
        
        SupermercadoWeb SPW = new SupermercadoWeb();
        
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
        
        System.out.println("#####ESTOQUE#####");
        System.out.println("COD NOME          GENERO        MARCA     PRECO   VALIDADE   VALIDO?");
        System.out.println("--- ----          ------        -----     -----   --------   -------");
        
        for(i = 0; i < generos.length; i++){
            for(j = 0; j < produtos.length; j++){
                if(produtos[j].getProduto().getGenero() == generos[i]){
                    mostraItemProduto(produtos[j],data);
                }
            }
            
            System.out.println("TOTAL: " + j + "itens.");
        }
        
        System.out.println("TOTAL: " + i + "itens.");
        
    }
}
