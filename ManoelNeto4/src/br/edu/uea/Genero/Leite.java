package br.edu.uea.Genero;

import br.edu.uea.Produto.Genero;

public class Leite extends Genero{

    public Leite(String nome) {
        super(nome);
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
