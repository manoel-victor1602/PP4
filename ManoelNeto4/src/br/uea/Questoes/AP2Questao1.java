package br.uea.Questoes;

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

public class AP2Questao1 {

    public static void mostraItemProduto(ItemProduto it, Data data){
        System.out.println(it.getProduto().getCodigo() + "   " +
                           it.getProduto().getNome() + "        " +
                           it.getProduto().getGenero().getNome() + "        " +
                           it.getProduto().getMarca().getNome() + "    " +
                           it.getProduto().getPreco() + "     " +
                           it.getValidade()._toString() + "       " +
                           it.getValidade().depois(data));
    }
    
    public static void main(String args[]){
        
        int i;
        
        SupermercadoWeb SPW = new SupermercadoWeb();
        
        SPW.iniciaSupermercado();
        
        Carrinho carrinho = new Carrinho();
        Estoque estoque = new Estoque();
        Marca[] marcas = new Marca[SPW.getMarcas().size()];
        ItemProduto[] produtos = new ItemProduto[SPW.getProdutos().size()];
        
        Data data = new Data(20,5,2010);

        carrinho = SPW.getCarrinho();
        estoque = SPW.getEstoque();
        SPW.getMarcas().toArray(marcas);
        SPW.getProdutos().toArray(produtos);
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("#####ESTOQUE#####");
        System.out.println("COD NOME          GENERO        MARCA     PRECO   VALIDADE   VALIDO?");
        System.out.println("--- ----          ------        -----     -----   --------   -------");
        
        for(i = 0; i < produtos.length; i++){
            mostraItemProduto(produtos[i], data);
        }
        
        System.out.println("TOTAL: " + i + " itens.");
        
    }
}
