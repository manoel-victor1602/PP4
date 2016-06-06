package br.uea.Questoes;

import br.uea.Auxiliares.Auxiliar;
import br.uea.Data.Data;
import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Supermercado.Carrinho;
import br.uea.Supermercado.Estoque;
import br.uea.Supermercado.ItemProduto;
import br.uea.Supermercado.SupermercadoWeb;
import java.util.ArrayList;

public class AP2Questao5 {

    public static void main(String args[]){
        
        int i;
        
        SupermercadoWeb SPW = new SupermercadoWeb();
        
        SPW.iniciaSupermercado();
        
        Carrinho carrinho = new Carrinho();
        Estoque estoque = new Estoque();
        Marca[] marcas = new Marca[SPW.getMarcas().size()];
        ItemProduto[] produtos = new ItemProduto[SPW.getProdutos().size()];
        Genero[] generos = new Genero[SPW.getGeneros().size()];
        ItemProduto[] car;
        
        Data data = new Data(20,5,2010);

        carrinho = SPW.getCarrinho();
        estoque = SPW.getEstoque();
        SPW.getMarcas().toArray(marcas);
        SPW.getProdutos().toArray(produtos);
        SPW.getGeneros().toArray(generos);
        
        for(i = 0; i < produtos.length; i++){
            if((produtos[i].getCodigo() % 2) != 0)
                SPW.getCarrinho().adicionaItem(produtos[i], SPW.getEstoque());
        }
        
        car = new ItemProduto[SPW.getCarrinho().getItens().size()];
        
        SPW.getCarrinho().getItens().toArray(car);
        
        for(i = 0; i < SPW.getCarrinho().getItens().size(); i++){
            Auxiliar.mostraItemProduto(car[i], data);
        }
        
        System.out.println("Numero de itens no carrinho: " + i);
        
        System.out.println("Total a pagar: RS" + SPW.getCarrinho().totalAPagar());
        
    }
    
}