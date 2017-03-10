// Barbara Daniele
package br.com.controler;

public class Usuario {
    //Declaração de variaveis da classe Usuario
    private int id;
    private String login;
    private String senha;
    private String nome;
    private String endereco;
    private String telefone;
    private String perfil;

    //Obtem os dados do campo Login
    public String getLogin() {
        return login;
    }

    //Atribui os dados ao campo Login
    public void setLogin(String login) {
        this.login = login;
    }

    //Obtem os dados do campo Senha
    public String getSenha() {
        return senha;
    }

    //Atribui os dados ao campo Senha
    public void setSenha(String senha) {
        this.senha = senha;
    }

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

   //Obtem os dados do campo de Identificação do Usuario
    public int getId() {
        return id;
    }

    //Atribui os dados ao campo de Identificação do Usuario
    public void setId(int id) {
        this.id = id;
    }

    //Obtem os dados do campo Perfil
    public String getPerfil() {
        return perfil;
    }

    //Atribui os dados ao campo Perfil
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
}
