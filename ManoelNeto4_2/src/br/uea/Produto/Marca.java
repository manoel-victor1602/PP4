package br.uea.Produto;

import br.uea.Supermercado.SupermercadoWeb;
import java.util.ArrayList;

public class Marca {

    private String nome;
    
    private ArrayList<Produto> produtos;
    private SupermercadoWeb mercado;
    
    public Marca(String nome){
        this.nome = nome;
    }

    public Marca() {

    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}