package br.edu.uea.Questoes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import br.edu.uea.FuncoesAux.Auxiliar;
import br.edu.uea.Data.Data;
import br.edu.uea.Produto.Genero;
import br.edu.uea.Produto.Marca;
import br.edu.uea.Supermercado.Carrinho;
import br.edu.uea.Supermercado.Estoque;
import br.edu.uea.Supermercado.ItemProduto;
import br.edu.uea.Supermercado.SupermercadoWeb;

public class AP2Questao6 {

	public AP2Questao6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	      int i;
	        
	      	ArrayList<String> random = new ArrayList<>();
	      	String strauxshuffle; 
	        SupermercadoWeb SPW = new SupermercadoWeb();
	        
	        SPW.iniciaSupermercado();
	        
	        Carrinho carrinho = new Carrinho();
	        Estoque estoque = new Estoque();
	        Marca[] marcas = new Marca[SPW.getMarcas().size()];
	        ItemProduto[] produtos = new ItemProduto[SPW.getProdutos().size()];
	        Genero[] generos = new Genero[SPW.getGeneros().size()];
	        ItemProduto[] car;
	        ItemProduto[] estoqueAux = new ItemProduto[SPW.getEstoque().qtdItens()];
	        
	        Data data = new Data(20,5,2010);

	        carrinho = SPW.getCarrinho();
	        estoque = SPW.getEstoque();
	        SPW.getMarcas().toArray(marcas);
	        SPW.getProdutos().toArray(produtos);
	        SPW.getGeneros().toArray(generos);
	        
	        
	        //Questao 06 Parte 1
	        for(i = 0; i < produtos.length; i++){
	            if(produtos[i].getValidade().depois(data)==true)
	                SPW.getCarrinho().adicionaItem(produtos[i], SPW.getEstoque());
	        }
	        

	        //Questao 06 parte 2
	        car = new ItemProduto[SPW.getCarrinho().getItens().size()];
	        
	        SPW.getCarrinho().getItens().toArray(car);
	        
	        Auxiliar.mostraMenu();
	        
	        
	        for(i = 0; i < SPW.getCarrinho().getItens().size(); i++){
	            strauxshuffle= Auxiliar.mostraItemProduto(car[i], data);
	            random.add(strauxshuffle);
	        }
	        
	        Collections.shuffle(random);
	        
	        for (int j = 0; j < random.size(); j++) {
	        	
	        	System.out.println(random.get(j));
				
			}
	        
	        System.out.println("\nNumero de itens no carrinho: " + i);

	        
	        //Questao 6 parte 3
	        
	        SPW.getEstoque().getItens().toArray(estoqueAux);
	        
	        Auxiliar.mostraMenu();
	        
	        for(i = 0; i < SPW.getEstoque().qtdItens(); i++){
	            Auxiliar.mostraItemProduto(estoqueAux[i],data);
	        }
	        
	        System.out.println("Total de itens no estoque: " + i);
	        
	        
	        
	        //System.out.println(random.get(3));
        	
	}

}
