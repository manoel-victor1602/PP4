package br.uea.Produto;

import br.uea.Supermercado.ItemProduto;
import br.uea.Supermercado.SupermercadoWeb;
import java.util.ArrayList;

public class Produto {

    private int codigo;
    private String nome;
    private float preco;
    
    private ArrayList<ItemProduto> itens;
    private Marca marca = new Marca();
    private Genero genero = new Genero();
    
    private SupermercadoWeb mercado = new SupermercadoWeb();

    Produto(int codigo, String nome, float preco, Marca marca){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    public Produto() {
    }
    
    public Marca getMarca(){
        return this.marca;
    }
    
    public Genero getGenero(){
        return this.genero;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
}
