package Construtores.scr;

public class Produto{
    private String nome;
    private double preco;

    public Produto(String nomeInicial, double precoInicial){
        this.nome = nomeInicial;
        this.preco = precoInicial;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setpreco(double precoNovo){
        if(precoNovo >= 0){
            this.preco = precoNovo;
        }
    }





}