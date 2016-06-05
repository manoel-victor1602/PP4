package br.uea.Supermercado;

import br.uea.Data.Data;
import br.uea.Produto.Produto;
import java.util.Scanner;

public class ItemProduto {

    Long codigo;
    
    private Data validade = new Data();
    private Produto produto = new Produto();
    private Carrinho carrinho = new Carrinho();
    
    public Produto getProduto(){
        return this.produto;
    }
    
    public boolean valido(){
        
        Data hoje = new Data();
        Scanner s = new Scanner(System.in);
        
        int dia, mes, ano;
        
        dia = s.nextInt();
        mes = s.nextInt();
        ano = s.nextInt();
        
        hoje.setData(dia, mes, ano);
        
        if(hoje.antes(this.validade))
            return true;
        else
            return false;
        
    }
    
    public Long getCodigo(){
        return this.codigo;
    }
    
}
