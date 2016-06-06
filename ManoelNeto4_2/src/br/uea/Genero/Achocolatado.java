package br.uea.Genero;

import br.uea.Produto.Genero;

public class Achocolatado extends Genero {

    public Achocolatado(String nome) {
        super(nome);
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
}
