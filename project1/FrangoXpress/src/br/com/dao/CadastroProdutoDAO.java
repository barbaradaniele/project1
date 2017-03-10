//Barbara Daniele
package br.com.dao;

import br.com.controler.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroProdutoDAO extends DAO {

    //Metodo que faz a criação de novos Produtos no banco de dados
    public void inserir(Produto a) throws Exception {
        abrirBanco();
        String query = "INSERT INTO tb_produtos (id_prod,nome_prod,valor_prod) values(null,?,?)";
        ps = con.prepareStatement(query);
        ps.setString(1, a.getNome());
        ps.setInt(2, a.getValor());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Produto Inserido com sucesso!");
        fecharBanco();
    }

    //Metodo que atualiza, no banco de dados, Produtos já existentes
    public void atualizar(Produto a) throws Exception {
        abrirBanco();
        String query = "Update tb_produtos set nome_prod=?,valor_prod=? where nome_prod = ?";
        ps = con.prepareStatement(query);
        ps.setString(1, a.getNome());
        ps.setInt(2, a.getValor());
        ps.setString(3, a.getNome());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
        fecharBanco();
    }

    //Método faz pesquisa dos produtos pelo nome
    public void pesquisar(Produto a) throws Exception {
        try {
            abrirBanco();
            String query = "select id_prod,nome_prod,valor_prod FROM tb_produtos where nome_prod=?";
            ps = con.prepareStatement(query);
            ps.setString(1, a.getNome());
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                a.setId(tr.getInt("id_prod"));
                a.setNome(tr.getString("nome_prod"));
                a.setValor(tr.getInt("valor_prod"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    //Métodos pesquisa produtos e retorna em uma lista
    public ArrayList<Produto> pesquisarTudo() throws Exception {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        try {
            abrirBanco();
            String query = "select id_prod,nome_prod,valor_prod FROM tb_produtos";
            ps = con.prepareStatement(query);
            ResultSet tr = ps.executeQuery();
            Produto a;
            while (tr.next()) {
                a = new Produto();
                a.setId(tr.getInt("id_prod"));
                a.setNome(tr.getString("nome_prod"));
                a.setValor(tr.getInt("valor_prod"));
                produtos.add(a);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return produtos;
    }
    
    //Metodo que busca o valor dos Produtos no banco de dados
    public void getValor(Produto a) throws Exception {
        try {
            abrirBanco();
            String query = "select valor_prod from tb_produtos where id_prod = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, a.getId());
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                a.setValor(tr.getInt("valor_prod"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
}
