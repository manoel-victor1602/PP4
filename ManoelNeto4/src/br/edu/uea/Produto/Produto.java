package br.edu.uea.Produto;

import br.edu.uea.Supermercado.ItemProduto;
import br.edu.uea.Supermercado.SupermercadoWeb;
import java.util.ArrayList;

public class Produto {

    private int codigo;
    private String nome;
    private float preco;
    
    private ArrayList<ItemProduto> itens;
    private Marca marca = new Marca();
    private Genero genero = new Genero();

    public Produto() {
    
    }

    public Produto(int cod, String nome, float preco, Marca marca, Genero genero) {
        this.codigo = cod;
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.genero = genero;
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
