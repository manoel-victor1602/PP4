package br.uea.Supermercado;

import br.uea.Data.Data;
import br.uea.Genero.Achocolatado;
import br.uea.Genero.Leite;
import br.uea.Genero.Presunto;
import br.uea.Produto.Genero;
import br.uea.Produto.Marca;
import br.uea.Produto.Produto;
import java.util.ArrayList;
import java.util.List;

public class SupermercadoWeb {

    private final Carrinho carrinho = new Carrinho();
    private final Estoque estoque = new Estoque();
    private final ArrayList<Marca> marcas = new ArrayList<>();
	private final ArrayList<Produto> produtos = new ArrayList<>();
    private final ArrayList<Genero> generos = new ArrayList<>();
    private final ArrayList<ItemProduto> itens = new ArrayList<>();
    
    public void iniciaSupermercado(){
  
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
        Marca seara = new Marca("Seara");
        
        marcas.add(sadia);
        marcas.add(perdigao);
        marcas.add(parmalat);
        marcas.add(itambe);
        marcas.add(nestle);
        marcas.add(seara);
        
        Produto presuntoSeara = new Produto(5, "Defumado", (float) 7.39, seara, presunto);
        Produto presuntoPeruSeara = new Produto(5, "Peru", (float) 5.23, seara, presunto);
        Produto presuntoPerdigao = new Produto(4, "Perdigao", (float) 10.4, perdigao, presunto);
        Produto leiteNinho = new Produto(1,"Ninho", (float) 7.50, nestle, leite);
        Produto leiteMolico = new Produto(2,"Molico",(float) 3.23, nestle, leite);
        Produto leiteVida = new Produto(3,"Vida", (float) 4.20, parmalat, leite);
        
        
        
        Data validade1 = new Data(11,4,2010);
        Data validade2 = new Data(11,10,2010);
        Data validade3 = new Data(26,11,2010);
        Data validade4 = new Data(30,12,2011);
        Data validade5 = new Data(8,11,2013);
        Data validade6 = new Data(12,6,2009);
        
        ItemProduto item1 = new ItemProduto(validade1, leiteNinho);
        ItemProduto item2 = new ItemProduto(validade2, leiteMolico);
        ItemProduto item3 = new ItemProduto(validade3, leiteVida);
        ItemProduto item4 = new ItemProduto(validade4, presuntoPerdigao);
        ItemProduto item5 = new ItemProduto(validade5, presuntoSeara);
        ItemProduto item6 = new ItemProduto(validade6, presuntoPeruSeara);
        
        
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);
        itens.add(item5);
        itens.add(item6);
    }
    
    public SupermercadoWeb(){
        
    }
    
    public List<Marca> getMarcas(){
        return this.marcas;
    }
    
    public List<ItemProduto> getProdutos(){
        return this.itens;
    }
    
    public Estoque getEstoque(){
        return this.estoque;
    }
    
    public Carrinho getCarrinho(){
        return this.carrinho;
    }   
    
    public List<Genero> getGeneros(){
        return this.generos;
    }
}