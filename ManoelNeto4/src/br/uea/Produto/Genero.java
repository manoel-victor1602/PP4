package br.uea.Produto;

import br.uea.Supermercado.SupermercadoWeb;
import java.util.ArrayList;

public class Genero { //Genero é classe abstrata, mas nao faz sentido na classe produto a funçao getGenero
                      // pedir uma instancia de Genero.

    protected String nome;
    
    private ArrayList<Produto> produtos;
    private SupermercadoWeb mercado = new SupermercadoWeb();
            
    public Genero(String nome){
        this.nome = nome;
    }

    Genero() {
       
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
