// Barbara Daniele
package br.com.controler;

public class Pedido {
    //Declaração de variaveis da classe Pedido
    private int idPedido;
    private String data;
    private String informacoes;
    private int valorPedido;
    private int idCliente;
    
    //Obtem os dados do campo Informacoes
    public String getInformacoes() {
        return informacoes;
    }

    //Atribui os dados ao campo Informacoes
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    //Obtem os dados do campo de Identificação do Pedido
    public int getIdPedido() {
        return idPedido;
    }

    //Atribui os dados ao campo de Identificação do Pedido
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    //Obtem os dados do campo Data
    public String getData() {
        return data;
    }

    //Atribui os dados ao campo Data
    public void setData(String data) {
        this.data = data;
    }

    //Obtem os dados do campo de Identificação do Cliente
    public int getIdCliente() {
        return idCliente;
    }

    //Atribui os dados ao campo de Identificação do Cliente
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    //Obtem os dados do campo correspondente ao Valor do Pedido
    public int getValorPedido() {
        return valorPedido;
    }

    //Atribui os dados ao campo correspondente ao Valor do Pedido
    public void setValorPedido(int valorPedido) {
        this.valorPedido = valorPedido;
    }
}
