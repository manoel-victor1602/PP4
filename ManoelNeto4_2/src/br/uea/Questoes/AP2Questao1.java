package br.uea.Questoes;

import br.uea.Data.Data;
import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Produto.Produto;
import br.uea.Supermercado.Carrinho;
import br.uea.Supermercado.Estoque;
import br.uea.Supermercado.ItemProduto;
import br.uea.Supermercado.SupermercadoWeb;
import br.uea.Auxiliares.Auxiliar;
import java.util.ArrayList;
import java.util.Scanner;


public class AP2Questao1 {

    public static void mostraItemProduto(ItemProduto it, Data data){
    	System.out.print(it.getProduto().getCodigo() + "\t");
        		if (it.getProduto().getNome().length()>6){
        			System.out.print(it.getProduto().getNome() + "\t");
        		}else{
        			System.out.print(it.getProduto().getNome() + "\t\t");
        		}
        		if( it.getProduto().getGenero().getNome().length()>6){
        			System.out.print(it.getProduto().getGenero().getNome() + "\t");
        		}else{
        			System.out.print(it.getProduto().getGenero().getNome() + "\t\t");
        		}
        		if(it.getProduto().getMarca().getNome().length()>6){
        			System.out.print(it.getProduto().getMarca().getNome() + "\t");
        		}else{
        			System.out.print(it.getProduto().getMarca().getNome() + "\t\t");
        		}
    		System.out.print(it.getProduto().getPreco() + "\t\t" +
    						 it.getValidade()._toString() + " \t" +
    					     it.getValidade().depois(data));
        System.out.println("");
        		
        		
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
        System.out.println("COD\tNOME\t\tGENERO\t\tMARCA\t\tPRECO\t\tVALIDADE\tVALIDO?");
        System.out.println("---\t------------\t------------\t----------\t---------\t------------\t------");

        for(i = 0; i < produtos.length; i++){
        	Auxiliar.mostraItemProduto(produtos[i], data);
        }
        
        System.out.println("TOTAL: " + i + " itens.");
        
    }
}
