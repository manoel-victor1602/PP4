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

    public Produto() {
    
    }

    public Produto(int cod, String nome, float preco, Marca marca) {
        this.codigo = cod;
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
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
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}
