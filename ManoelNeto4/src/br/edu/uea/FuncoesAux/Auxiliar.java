package br.edu.uea.FuncoesAux;

import br.edu.uea.Data.Data;
import br.edu.uea.Supermercado.ItemProduto;

public class Auxiliar {

    public static String valido(ItemProduto it, Data data){
        
        
        if(it.getValidade().depois(data))
            return "sim";
        else
            return "nao";
        
    }
    
    public static String mostraItemProduto(ItemProduto it, Data data, int op){
        
        String cod, nome, genero, marca, preco, validade, valido;
        
        
        cod = Integer.toString(it.getProduto().getCodigo());
        nome = it.getProduto().getNome();
        genero = it.getProduto().getGenero().getNome();
        marca = it.getProduto().getMarca().getNome();
        preco = "RS " + Float.toString(it.getProduto().getPreco());
        validade = Integer.toString(it.getValidade().getDia()) + "/" +
                   Integer.toString(it.getValidade().getMes()) + "/" +
                   Integer.toString(it.getValidade().getAno()) ;
        valido = valido(it, data);
        
        //formatando saido do codigo
        while(cod.length() < 3)
            cod += " ";
            
        cod += "\t";
        //fim codigo
        
        //formatando saida do nome
        while(nome.length() < 12)
            nome += " ";
        
        nome += "\t";
        //fim nome
        
        //formatando saida do genero
        while(genero.length() < 12)
            genero += " ";
        
        genero += "\t";
        //fim genero
        
        
        //formatando saida da marca
        while(marca.length() < 12)
            marca += " ";
        
        marca += "\t";
        //fim marca
        
        //formatando saida do preco        
        while(preco.length() < 12)
            preco += " ";
        
        preco += "\t";
        //fim preco
        
        //formatando saida da validade
        while(validade.length() < 12)
            validade += " ";
        
        validade += "\t";
        //fim da validade
        
        //formatando saida de valido
        while(valido.length() < 12)
            valido += " ";
        //fim valido
        if(op==0){
            System.out.println(cod + nome + genero + marca + preco + validade + valido);
            return null;
        }else{
            return (cod + nome + genero + marca + preco + validade + valido);
        }
        
    }
    
    public static void mostraMenu(int i){
        
        int carrinho = 2, estoque = 1;
        
        if(i == estoque)
            System.out.println("#####ESTOQUE#####");
        else
            System.out.println("#####CARRINHO#####");
        
        System.out.println("COD\tNOME\t\tGENERO\t\tMARCA\t\tPRECO\t\tVALIDADE\tVALIDO?");
        System.out.println("---\t------------\t------------\t----------\t---------\t------------\t------");
    }
    
}
