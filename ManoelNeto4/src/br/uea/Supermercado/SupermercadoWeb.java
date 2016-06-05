package br.uea.Supermercado;

import br.uea.Data.Data;
import br.uea.Genero.Achocolatado;
import br.uea.Genero.Leite;
import br.uea.Genero.Presunto;
import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Produto.Produto;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class SupermercadoWeb {

    private Carrinho carrinho;
    private Estoque estoque;
    private ArrayList<Marca> marcas;
    private ArrayList<Produto> produtos;
    private ArrayList<Genero> generos;
    private ArrayList<ItemProduto> itens;
    
    private void iniciaSupermercado(){
        this.carrinho = new Carrinho();
        this.estoque = new Estoque();
        this.marcas = new ArrayList<Marca>();
        this.produtos = new ArrayList<Produto>();
        this.generos = new ArrayList<Genero>();
        this.itens = new ArrayList<ItemProduto>();
        
        Genero leite = new Leite("leite");
        Genero presunto = new Presunto("presunto");
        Genero achocolatado = new Achocolatado("achocolatado");
        
        generos.add(leite);
        generos.add(presunto);
        generos.add(achocolatado);
        
        Marca sadia = new Marca("Sadia");
        Marca perdigao = new Marca("Perdigao");
        Marca parmalat = new Marca("Parmalat");
        Marca itambe = new Marca("Itambe");
        Marca nestle = new Marca("Nestle");
        
        marcas.add(sadia);
        marcas.add(perdigao);
        marcas.add(parmalat);
        marcas.add(itambe);
        
        Produto leiteNinho = new Produto(1,"Ninho", (float) 7.50, nestle);
        Produto leiteMolico = new Produto(2,"Molico",(float) 3.23, nestle);
        Produto leiteVida = new Produto(3,"Vida", (float) 4.20, parmalat);
        
        Data validade1 = new Data(11,4,2010);
        Data validade2 = new Data(11,10,2010);
        Data validade3 = new Data(26,11,2010);
        
        
        ItemProduto item1 = new ItemProduto(validade1,leiteNinho);
        ItemProduto item2 = new ItemProduto(validade2, leiteMolico);
        ItemProduto item3 = new ItemProduto(validade3, leiteVida);
        
    }
    
    public SupermercadoWeb(){
        iniciaSupermercado();
    }
    
    public List getMarcas(){
        return this.marcas;
    }
    
    public List getProdutos(){
        return this.itens;
    }
    
    public Estoque getEstoque(){
        return this.estoque;
    }
    
    public Carrinho getCarrinho(){
        return this.carrinho;
    }   
}