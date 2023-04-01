/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.exercencapsulamento;

/**
 *
 * Faça um algoritmo que represente um Remédio. 
 * Ele deve ter nome, preço, descrição, posologia e nome técnico.

Crie uma classe de tela que permita ao usuário digitar os valores de um remédio;
* e que apresente os dados de um remédio na tela.

O método main deve instanciar um objeto de cada, pedir os valores e apresentá-los.
 */
public class Remedio {
    private String nome;
    private float preco;
    private String descricao;
    private int posologia;
    private String nometec;
    
//Os setters pegam a informação e acessam o local da variavel e setam o valor 
//lá dentro, já que nao da pra acessar de fora
    void setNome(String n){
        nome = n;
    }
    void setPreco(float p){
        preco = p;
    }
    void setDescricao(String d){
        descricao = d;
    }
    void setPosologia(int p){
        posologia = p;
    }
    void setNometec(String nt){
        nometec = nt;
    }
//Os getters acessam o lugar da informação e retornam
//o valor para a funcao
    String getNome(){
        return nome;
    }
    float getPreco(){
        return preco;
    }
    String getDescricao(){
        return descricao;
    }
    int getPosologia(){
        return posologia;
    }
    String getNometec(){
        return nometec;
    }
}

