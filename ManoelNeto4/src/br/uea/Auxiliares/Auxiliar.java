package br.uea.Auxiliares;

import br.uea.Data.Data;
import br.uea.Supermercado.ItemProduto;

public class Auxiliar {
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
				System.out.print(it.getProduto().getMarca().getNome() + "\tR$");
			}else{
				System.out.print(it.getProduto().getMarca().getNome() + "\t\tR$");
			}
		System.out.print(it.getProduto().getPreco() + "\t\t" +
						 it.getValidade()._toString() + " \t" +
					     it.getValidade().depois(data));
		System.out.println("");
    }
    
    public static String stringItemProduto(ItemProduto it, Data data) {
    		String saida="";
        	saida += it.getProduto().getCodigo() + "\t";
    			if (it.getProduto().getNome().length()>6){
    				saida+=it.getProduto().getNome() + "\t";
    			}else{
    				saida+=it.getProduto().getNome() + "\t\t";
    			}
    			if( it.getProduto().getGenero().getNome().length()>6){
    				saida+=it.getProduto().getGenero().getNome() + "\t";
    			}else{
    				saida+=it.getProduto().getGenero().getNome() + "\t\t";
    			}
    			if(it.getProduto().getMarca().getNome().length()>6){
    				saida+=it.getProduto().getMarca().getNome() + "\tR$";
    			}else{
    				saida+=it.getProduto().getMarca().getNome() + "\t\tR$";
    			}
    			saida+=it.getProduto().getPreco() + "\t\t" +
    						 it.getValidade()._toString() + " \t" +
    					     it.getValidade().depois(data);
        	return saida;
    }
    
    public static void mostraMenu(){
        System.out.println("#####ESTOQUE#####");
        System.out.println("COD\tNOME\t\tGENERO\t\tMARCA\t\tPRECO\t\tVALIDADE\tVALIDO?");
        System.out.println("---\t------------\t------------\t----------\t---------\t------------\t------");
    }
    
}
