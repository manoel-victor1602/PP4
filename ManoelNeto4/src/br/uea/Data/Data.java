package br.uea.Data;

import javax.swing.JOptionPane;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String _toString(){
              
        String data;
        
        data = this.dia + "/" + this.mes + "/" + this.ano;
        
        return data;
    }
    
    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public boolean antes(Data data){
        
        if(this.dia < data.dia && this.mes <= data.mes && this.ano <= data.ano)
            return true;
        else
            return false;
    }
    
    public boolean depois(Data data){
        
        if(this.dia > data.dia && this.mes >= data.mes && this.ano >= data.ano)
            return true;
        else
            return false;
    }
    
    public boolean igual(Data data){
        
        if(this.dia == data.dia && this.mes == data.mes && this.ano == data.ano)
            return true;
        else
            return false;
    }
    
    public void dataHoje(){
        
        JOptionPane.showMessageDialog(null,_toString());
        
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
}
