package br.edu.uea.Questoes;

import br.edu.uea.Data.Data;
import br.edu.uea.Produto.Genero;
import br.edu.uea.Produto.Marca;
import br.edu.uea.Supermercado.ItemProduto;
import br.edu.uea.Supermercado.SupermercadoWeb;

public class AP2Questao4 {

    public static int contvalido(ItemProduto[] it, Data data,int op){
        int qtdValido=0,qtdInvalido=0,i;
        
        for(i = 0; i < it.length; i++){
            if(it[i].getValidade().depois(data) == true)
                qtdValido++;
            else
                qtdInvalido++;
           
        }
        switch (op) {
            case 0:
                return qtdValido;
            case 1:
                return qtdInvalido;
            default:
                return i;
        }
    }
    public static void main(String args[]){
        
        int i, qtdValido = 0, qtdInvalido = 0, soma,total;
        
        SupermercadoWeb SPW = new SupermercadoWeb();
        
        SPW.iniciaSupermercado();
        
        Marca[] marcas = new Marca[SPW.getMarcas().size()];
        ItemProduto[] produtos = new ItemProduto[SPW.getProdutos().size()];
        Genero[] generos = new Genero[SPW.getGeneros().size()];
        
        Data data = new Data(20,5,2010);

        SPW.getMarcas().toArray(marcas);
        SPW.getProdutos().toArray(produtos);
        SPW.getGeneros().toArray(generos);
        
        qtdValido   = contvalido(produtos,data,0);
        qtdInvalido = contvalido(produtos,data,1);
        total = contvalido(produtos,data,2);
        
        soma = qtdValido + qtdInvalido;
        
        System.out.println("Numero de itens valido: " + qtdValido + 
                           "\nNumero de itens invalidos: " + qtdInvalido +
                           "\nSoma dos validos e invalidos: " + soma +
                           "\nNumero de itens: " + total);
        
    }
    
}