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
}
