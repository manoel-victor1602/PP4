package br.edu.uea.Supermercado;

import br.edu.uea.Data.Data;
import br.edu.uea.Genero.Achocolatado;
import br.edu.uea.Genero.Leite;
import br.edu.uea.Genero.Presunto;
import br.edu.uea.Produto.Genero;
import br.edu.uea.Produto.Marca;
import br.edu.uea.Produto.Produto;
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
        Marca pepsico = new Marca("Pepsico");
        Marca italac = new Marca("Italac");
        Marca ovomaltine = new Marca("Ovomaltine");
        Marca piracanjuba = new Marca("Piracanjuba");
        Marca elege = new Marca("Elege");
        Marca pamplona = new Marca("Pamplona");
        Marca aurora = new Marca("Aurora");
        
        
        marcas.add(sadia);
        marcas.add(perdigao);
        marcas.add(parmalat);
        marcas.add(itambe);
        marcas.add(nestle);
        marcas.add(seara);
        marcas.add(pepsico);
        marcas.add(italac);
        marcas.add(ovomaltine);
        marcas.add(piracanjuba);
        marcas.add(elege);
        marcas.add(pamplona);
        marcas.add(aurora);
        
       
        
        
        //*************************LEITES************************************///
        Produto leiteNinho = new Produto(1,"Ninho", (float) 7.50, nestle, leite);
        Produto leiteMolico = new Produto(2,"Molico",(float) 3.23, nestle, leite);
        Produto leiteNan = new Produto(3,"Nan", (float) 24.20, nestle, leite);
        Produto leiteIdeal = new Produto(4,"Ideal", (float) 12.60, nestle, leite);
        Produto leiteVida = new Produto(5,"Vida", (float) 4.20, parmalat, leite);
        Produto leiteZymil = new Produto(6,"Zymil", (float) 2.20, parmalat, leite);
        Produto leitePiracanjuba = new Produto(7,"Integral", (float) 3.33, piracanjuba, leite);
        Produto leitePiracanjubaDesna = new Produto(8,"Desnatado", (float) 2.14, piracanjuba, leite);
        Produto leiteElege = new Produto(9,"Elege", (float) 2.20, elege, leite);
        Produto leiteItalac = new Produto(10,"Italac", (float) 2.20, italac, leite);
        
        
        //*****************************FIM LEITE*********************************//
        
        //***************************PRESUNTO**************************************//
        Produto presuntoPerdigao = new Produto(11, "Perdigao", (float) 10.40, perdigao, presunto);
        Produto presuntoPerdigaoPorco = new Produto(12, "Suino", (float) 3.39, perdigao, presunto);
        Produto presuntoSeara = new Produto(13, "Defumado", (float) 7.39, seara, presunto);  
        Produto presuntoPeruSeara = new Produto(14, "Peru", (float) 5.23, seara, presunto);
        Produto presuntoCozido = new Produto(15, "Cozido", (float) 8.99, sadia, presunto);
        Produto presuntoFateado = new Produto(16, "Fateado", (float) 13.00, sadia, presunto);
        Produto presuntoPamplona = new Produto(17, "Pamplona", (float) 11.20, pamplona, presunto);
        Produto presuntoAurora = new Produto(18, "Aurora", (float) 4.70, aurora, presunto);
        Produto presuntoAuroraCozido = new Produto(19, "Cozido", (float) 9.99, aurora, presunto);
        Produto presuntoAuroraPorco = new Produto(20, "Suino", (float) 10.68, aurora, presunto);   
        //****************************FIM PRESUNTO***********************************//
        
        
        //*******************************ACHOCOLATADO************************************************
        Produto achocolatadoToddy = new Produto(21, "Toddy", (float) 6.24, pepsico, achocolatado);
        Produto achocolatadoMagico = new Produto(22, "Magico", (float) 8.89, pepsico, achocolatado);
        Produto achocolatadoToddynho = new Produto(23, "Toddynho", (float) 1.99, pepsico, achocolatado);
        Produto achocolatadoNescau = new Produto(24, "Nescau", (float) 5.69, nestle, achocolatado);
        Produto achocolatadoNescau2 = new Produto(25, "Nescau2.0", (float) 6.99, nestle, achocolatado);
        Produto achocolatadoNesquik = new Produto(26, "Nesquik", (float) 2.19, nestle, achocolatado);
        Produto achocolatadoPronto = new Produto(27, "Pronto", (float) 2.65, italac, achocolatado);
        Produto achocolatadoProntoPequeno = new Produto(28, "Italakinho", (float) 0.87, italac, achocolatado);
        Produto achocolatadoInstantaneo = new Produto(29, "Instantaneo", (float) 3.25, italac, achocolatado);
        Produto achocolatadoOvomaltine = new Produto(30, "Ovomaltine", (float) 12.99, ovomaltine, achocolatado);
        
//        ***************************FIM ACHOCOLATADO*****************************************************
        
        
        
        //***************DATA*******************
        Data validade1 = new Data(11,4,2010);
        Data validade2 = new Data(11,10,2010);
        Data validade3 = new Data(26,11,2010);
        Data validade4 = new Data(30,12,2011);
        Data validade5 = new Data(8,11,2008);
        Data validade6 = new Data(12,6,2009);
        Data validade7 = new Data(30,11,2012);
        Data validade8 = new Data(20,12,2010);
        Data validade9 = new Data(31,12,2014);
        Data validade10 = new Data(30,2,2009);
        Data validade11= new Data(23,5,2011);
        Data validade12 = new Data(25,12,2004);
        Data validade13 = new Data(13,11,2001);
        Data validade14 = new Data(21,12,2011);
        Data validade15 = new Data(1,1,2012);
        Data validade16 = new Data(4,5,2013);
        Data validade17 = new Data(16,7,2014);
        Data validade18 = new Data(11,12,2013);
        Data validade19 = new Data(30,11,2000);
        Data validade20 = new Data(31,2,2009);
        Data validade21 = new Data(22,5,2010);
        Data validade22 = new Data(23,6,2011);
        Data validade23 = new Data(4,6,2013);
        Data validade24 = new Data(19,7,2003);
        Data validade25 = new Data(16,4,2011);
        Data validade26 = new Data(14,2,2010);
        Data validade27 = new Data(8,12,2013);
        Data validade28 = new Data(9,9,2015);
        Data validade29 = new Data(21,11,2009);
        Data validade30 = new Data(31,10,2008);
        
        //**************FIM DATAS******************************//
        
        
        
        //*********************ITENS********************************************//
        
        
        
        //leite 
        ItemProduto item1 = new ItemProduto(validade1, leiteNinho);
        ItemProduto item2 = new ItemProduto(validade2, leiteMolico);
        ItemProduto item3 = new ItemProduto(validade3, leiteVida);
        ItemProduto item4 = new ItemProduto(validade15, leiteNan);
        ItemProduto item5 = new ItemProduto(validade16, leiteIdeal);
        ItemProduto item6 = new ItemProduto(validade17, leiteZymil);
        ItemProduto item7 = new ItemProduto(validade18, leitePiracanjuba);
        ItemProduto item8 = new ItemProduto(validade19, leitePiracanjubaDesna);
        ItemProduto item9 = new ItemProduto(validade20, leiteElege);
        ItemProduto item10 = new ItemProduto(validade21, leiteItalac);  
 
        //presunto
        
        ItemProduto item11 = new ItemProduto(validade4, presuntoPerdigao);
        ItemProduto item12 = new ItemProduto(validade26, presuntoPamplona);
        ItemProduto item13 = new ItemProduto(validade27, presuntoAurora);
        ItemProduto item14 = new ItemProduto(validade28, presuntoAuroraCozido);
        ItemProduto item15 = new ItemProduto(validade29, presuntoAuroraPorco);
        ItemProduto item16 = new ItemProduto(validade30, presuntoPerdigaoPorco);
        ItemProduto item17 = new ItemProduto(validade5, presuntoSeara);
        ItemProduto item18 = new ItemProduto(validade6, presuntoPeruSeara);
        ItemProduto item19 = new ItemProduto(validade7, presuntoFateado);
        ItemProduto item20 = new ItemProduto(validade8, presuntoCozido);
        
        
        
        //achocolatado
        ItemProduto item21= new ItemProduto(validade9, achocolatadoToddy );
        ItemProduto item22 = new ItemProduto(validade10, achocolatadoMagico);
        ItemProduto item23 = new ItemProduto(validade11, achocolatadoToddynho );
        ItemProduto item24 = new ItemProduto(validade12, achocolatadoNescau );
        ItemProduto item25 = new ItemProduto(validade13, achocolatadoNescau2);
        ItemProduto item26 = new ItemProduto(validade14, achocolatadoNesquik);         
        ItemProduto item27 = new ItemProduto(validade22, achocolatadoPronto);
        ItemProduto item28 = new ItemProduto(validade23, achocolatadoProntoPequeno);
        ItemProduto item29 = new ItemProduto(validade24, achocolatadoInstantaneo);
        ItemProduto item30 = new ItemProduto(validade25, achocolatadoOvomaltine);

        
        //**********************************FIM ITENS**************************//
        
        //****************************COLOCANDO ITENS NO ESTOQUE***************//
        
        estoque.entraItem(item1);
        estoque.entraItem(item2);
        estoque.entraItem(item3);
        estoque.entraItem(item4);
        estoque.entraItem(item5);
        estoque.entraItem(item6);
        estoque.entraItem(item7);
        estoque.entraItem(item8);
        estoque.entraItem(item9);
        estoque.entraItem(item10);
        estoque.entraItem(item11);
        estoque.entraItem(item12);
        estoque.entraItem(item13);
        estoque.entraItem(item14);
        estoque.entraItem(item15);
        estoque.entraItem(item16);
        estoque.entraItem(item17);
        estoque.entraItem(item18);
        estoque.entraItem(item19);
        estoque.entraItem(item20);
        estoque.entraItem(item21);
        estoque.entraItem(item22);
        estoque.entraItem(item23);
        estoque.entraItem(item24);
        estoque.entraItem(item25);
        estoque.entraItem(item26);
        estoque.entraItem(item27);
        estoque.entraItem(item28);
        estoque.entraItem(item29);
        estoque.entraItem(item30);
        
        //*******************************FIM DO ESTOQUE***********************//
        
        //****************************ADICIONANDO ITENS***********************//
        
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);
        itens.add(item5);
        itens.add(item6);
        itens.add(item7);
        itens.add(item8);
        itens.add(item9);
        itens.add(item10);
        itens.add(item11);
        itens.add(item12);
        itens.add(item13);
        itens.add(item14);
        itens.add(item15);
        itens.add(item16);
        itens.add(item17);
        itens.add(item18);
        itens.add(item19);
        itens.add(item20);
        itens.add(item21);
        itens.add(item22);
        itens.add(item23);
        itens.add(item24);
        itens.add(item25);
        itens.add(item26);
        itens.add(item27);
        itens.add(item28);
        itens.add(item29);
        itens.add(item30);
        
        //*************************FIM DE ADICICOES***************************//
        
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