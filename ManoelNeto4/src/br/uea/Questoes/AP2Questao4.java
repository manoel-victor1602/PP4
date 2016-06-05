package br.uea.Questoes;

import br.uea.Data.Data;
import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Supermercado.Carrinho;
import br.uea.Supermercado.Estoque;
import br.uea.Supermercado.ItemProduto;
import br.uea.Supermercado.SupermercadoWeb;

public class AP2Questao4 {

    public static void main(String args[]){
        
        int i, qtdValido = 0, qtdInvalido = 0, soma = 0;
        
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
        
        for(i = 0; i < produtos.length; i++){
            if(produtos[i].getValidade().antes(data) == true)
                qtdValido++;
            else
                qtdInvalido++;
        }
        
        soma = qtdValido + qtdInvalido;
        
        System.out.println("Numero de itens valido: " + qtdValido + 
                           "\nNumero de itens invalidos: " + qtdInvalido +
                           "\nSoma dos validos e invalidos: " + soma +
                           "\nNumero de itens: " + i);
        
    }
    
}