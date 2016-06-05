package br.uea.Supermercado;

import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Produto.Produto;
import java.util.ArrayList;
import java.util.List;

public class SupermercadoWeb {

    private Carrinho carrinho;
    private Estoque estoque;
    private ArrayList<Marca> marcas;
    private ArrayList<Produto> produtos;
    private ArrayList<Genero> generos;
    
    public void iniciaSupermercado(){
        
    }
    
    public List getMarcas(){
        return this.marcas;
    }
    
    public List getProdutos(){
        return this.produtos;
    }
    
    public Estoque getEstoque(){
        return this.estoque;
    }
    
    public Carrinho getCarrinho(){
        return this.carrinho;
    }   
}