package br.edu.uea.Genero;

import br.edu.uea.Produto.Genero;

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
