package br.uea.Supermercado;

import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Produto.Produto;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private ArrayList<ItemProduto> itens;
    private SupermercadoWeb mercado = new SupermercadoWeb();
    private final Marca marca = new Marca();
    
    public void entraItem(ItemProduto item){
        itens.add(item);
    }
    
    public ItemProduto saiItem(ItemProduto item){
        
        itens.remove(item);
        
        return item;
    }
    
    public List getItens(Marca marca){

        ItemProduto[] items = new ItemProduto[itens.size()];
        ArrayList<ItemProduto> itensMarca = new ArrayList<ItemProduto>();
        
        
        itens.toArray(items);
        
        for(int i = 0; i < itens.size(); i++){
            if(items[i].getProduto().getMarca() == marca)
                itensMarca.add(items[i]);
        }
        
        return itensMarca;
        
    }
    
    public List getItens(Produto produto){
        
        ItemProduto[] items = new ItemProduto[itens.size()];
        ArrayList<ItemProduto> itensProduto = new ArrayList<ItemProduto>();
        
        
        itens.toArray(items);
        
        for(int i = 0; i < itens.size(); i++){
            if(items[i].getProduto() == produto)
                itensProduto.add(items[i]);
        }
        
        return itensProduto;
    }
    
    public List getItens(Genero genero){
        
        ItemProduto[] items = new ItemProduto[itens.size()];
        ArrayList<ItemProduto> itensGenero = new ArrayList<ItemProduto>();
        
        
        itens.toArray(items);
        
        for(int i = 0; i < itens.size(); i++){
            if(items[i].getProduto().getGenero() == genero)
                itensGenero.add(items[i]);
        }
        
        return itensGenero;
    }
    
    public List getItens(){
        return itens;
    }
    
    public int qtdItens(){
        return this.itens.size();
    }
    
}
