package br.edu.uea.Questoes;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import br.edu.uea.FuncoesAux.Auxiliar;
import br.edu.uea.Data.Data;
import br.edu.uea.Produto.Genero;
import br.edu.uea.Produto.Marca;
import br.edu.uea.Supermercado.Carrinho;
import br.edu.uea.Supermercado.Estoque;
import br.edu.uea.Supermercado.ItemProduto;
import br.edu.uea.Supermercado.SupermercadoWeb;

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
        
        entrada = JOptionPane.showInputDialog("Digite a marca que voc� procura");
        
        

        for(i = 0; i < produtos.length; i++){
            if(produtos[i].getValidade().depois(data)==true && produtos[i].getProduto().getMarca().getNome().equals(entrada))
                SPW.getCarrinho().adicionaItem(produtos[i], SPW.getEstoque());
        }

        car = new ItemProduto[SPW.getCarrinho().getItens().size()];
        
        SPW.getCarrinho().getItens().toArray(car);
        
        Auxiliar.mostraMenu();
        
        
        for(i = 0; i < SPW.getCarrinho().getItens().size(); i++){
            Auxiliar.mostraItemProduto(car[i], data);
        }
        
        System.out.println("\nNumero de itens no carrinho: " + i);

	}

}
