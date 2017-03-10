// Barbara Daniele
package br.com.controler;

public class Entregador {
    //Declaração de variaveis da classe Entregador
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    //Obtem os dados do campo Nome
    public String getNome() {
        return nome;
    }

    //Atribui os dados ao campo Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Obtem os dados do campo Endereco
    public String getEndereco() {
        return endereco;
    }

    //Atribui os dados ao campo Endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Obtem os dados do campo Telefone
    public String getTelefone() {
        return telefone;
    }

    //Atribui os dados ao campo Telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Obtem os dados do campo Email
    public String getEmail() {
        return email;
    }

    //Atribui os dados ao campo Email
    public void setEmail(String email) {
        this.email = email;
    }

    //Obtem os dados do campo de Identificação do Entregador
    public int getId() {
        return id;
    }

    //Atribui os dados ao campo de Identificação do Entregador
    public void setId(int id) {
        this.id = id;
    }
}