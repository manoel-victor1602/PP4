package br.uea.Produto;

import br.uea.Supermercado.SupermercadoWeb;
import java.util.ArrayList;

public class Marca {

    private final String nome;
    private SupermercadoWeb mercado = new SupermercadoWeb();
    
    private ArrayList<Produto> produtos;
    
    public Marca(String nome){
        this.nome = nome;
    }

    public Marca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
