package br.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {

    Connection con;// criacao do objeto conexao
    PreparedStatement ps;//criacao do objeto preparacao de ambiente
    ResultSet rs;// criacao do objeto que recebe resultados

    public void abrirBanco() throws SQLException {// criando metodo para acessar o banco
        try {
            Class.forName("com.mysql.jdbc.Driver");//classe para utilizacao do arquivo com configuracoes do serividor mysql
            String url = "jdbc:mysql://localhost/frango_express";// drive servidor e banco de dados a serem utilizados e indicacao do banco a ser utilizado
            String user = "root";// usuario do banco de dados
            String senha = "root";//senha do usuario do banco de dados    
            con = (Connection) DriverManager.getConnection(url, user, senha);//metodo que usa os parametros para conectar com o banco
            System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {//tratamento de erro de drive
            System.out.println("Classe nao encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {//tratamento de erro de SQL
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }

    public void fecharBanco() throws Exception {//criando metodo que fechao conexao com o banco
        if (ps != null) { //limpando os dados de conexaoo   
            ps.close();//fechando o ambiente de conexaoo
            System.out.println("Execucao da Query fechada\n");
        }
    }
}
