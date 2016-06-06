package br.uea.Genero;

import br.uea.Produto.Genero;

public class Presunto extends Genero {

    public Presunto(String nome) {
        super(nome);
    }

    @Override
    public String getNome(){
        return this.nome;
    }
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
