package br.uea.Questoes;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import br.uea.Auxiliares.Auxiliar;
import br.uea.Data.Data;
import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Supermercado.Carrinho;
import br.uea.Supermercado.Estoque;
import br.uea.Supermercado.ItemProduto;
import br.uea.Supermercado.SupermercadoWeb;

public class AP2Questao7 {

	public AP2Questao7() {
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
        
        String entrada;
        
        entrada = JOptionPane.showInputDialog("Digite a marca que você procura");
        
        
        
        
        
        //Questao 06 Parte 1
        for(i = 0; i < produtos.length; i++){
            if(produtos[i].getValidade().depois(data)==true && produtos[i].getProduto().getMarca().getNome().equals(entrada))
                SPW.getCarrinho().adicionaItem(produtos[i], SPW.getEstoque());
        }
        
        //Questao 06 parte 2
        car = new ItemProduto[SPW.getCarrinho().getItens().size()];
        
        SPW.getCarrinho().getItens().toArray(car);
        
        Auxiliar.mostraMenu();
        
        
        for(i = 0; i < SPW.getCarrinho().getItens().size(); i++){
            Auxiliar.mostraItemProduto(car[i], data);
        }
        
        System.out.println("\nNumero de itens no carrinho: " + i);

	}

}
