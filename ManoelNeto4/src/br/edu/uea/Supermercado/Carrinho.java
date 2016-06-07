package br.edu.uea.Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho{
    
    private ArrayList<ItemProduto> itens = new ArrayList<ItemProduto>();
    
    public void adicionaItem(ItemProduto item, Estoque estoque){
        
        itens.add(item);
        
        estoque.saiItem(item);
             
    }
    
    public void removeItem(ItemProduto item, Estoque estoque){
        
        itens.remove(item);
        
        estoque.entraItem(item);
        
    }
    
    public List getItens(){
        return itens;
    }
    
    public double totalAPagar(){
        
        double total = 0;
        
        ItemProduto[] items = new ItemProduto[itens.size()];
        
        itens.toArray(items);
        
        for(int i = 0; i < itens.size(); i++){
            total += items[i].getProduto().getPreco();
        }
        
        return total;
        
    }
}
