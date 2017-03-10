// Barbara Daniele
package br.com.controler;

public class Produto {
    //Declaração de variaveis da classe Produto
    private int id; 
    private String nome;
    private int valor;

    //Obtem os dados do campo Nome
    public String getNome() {
        return nome;
    }

    //Atribui os dados ao campo Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Obtem os dados do campo Valor
    public int getValor() {
        return valor;
    }

    //Atribui os dados ao campo Valor
    public void setValor(int valor) {
        this.valor = valor;
    }

    //Obtem os dados do campo de Identificação do Produto
    public int getId() {
        return id;
    }

    //Atribui os dados ao campo de Identificação do Produto
    public void setId(int id) {
        this.id = id;
    }

}
