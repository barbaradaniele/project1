//Barbara Daniele
package br.com.dao;

import br.com.controler.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroClienteDAO extends DAO {

    //Metodo que faz a criação de novos Clientes no banco de dados
    public void inserir(Cliente a) throws Exception {
        abrirBanco();
        String query = "INSERT INTO tb_clientes (id_cli,nome_cli,end_cli,fone_cli,email_cli) values(null,?,?,?,?)";
        ps = con.prepareStatement(query);
        ps.setString(1, a.getNome());
        ps.setString(2, a.getEndereco());
        ps.setString(3, a.getTelefone());
        ps.setString(4, a.getEmail());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Cliente Inserido com sucesso!");
        fecharBanco();
    }

    //Metodo que atualiza, no banco de dados, Clientes já existentes
    public void atualizar(Cliente a) throws Exception {
        abrirBanco();
        String query = "Update tb_clientes set nome_cli=?,end_cli=?,fone_cli=?, email_cli=? where nome_cli=?";
        ps = con.prepareStatement(query);
        ps.setString(1, a.getNome());
        ps.setString(2, a.getEndereco());
        ps.setString(3, a.getTelefone());
        ps.setString(4, a.getEmail());
        ps.setString(5, a.getNome());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
        fecharBanco();
    }

    //Métodos que pesquisa clientes pelo nome ou telefone
    public void pesquisar(Cliente a) throws Exception {
        try {
            abrirBanco();
            String query = "select id_cli, nome_cli, end_cli, fone_cli, email_cli FROM tb_clientes where fone_cli = ? || nome_cli = ? ";
            ps = con.prepareStatement(query);
            ps.setString(1, a.getTelefone());
            ps.setString(2, a.getNome());
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                a.setId(tr.getInt("id_cli"));
                a.setNome(tr.getString("nome_cli"));
                a.setEndereco(tr.getString("end_cli"));
                a.setTelefone(tr.getString("fone_cli"));
                a.setEmail(tr.getString("email_cli"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    //Método que pesquisa de cliente pelo nome, usado na tela pedidos para localizar o Identificador
    public void pesquisarCliente(Cliente a) throws Exception {
        try {
            abrirBanco();
            String query = "select nome_cli FROM tb_clientes where id_cli = ? ";
            ps = con.prepareStatement(query);
            ps.setInt(1, a.getId());
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                a.setNome(tr.getString("nome_cli"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    //Método que pesquisa todos os clientes e devolve em uma lista
    public ArrayList<Cliente> pesquisarTudo() throws Exception {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        try {
            abrirBanco();
            String query = "select id_cli, nome_cli, end_cli, fone_cli, email_cli FROM tb_clientes";
            ps = con.prepareStatement(query);
            ResultSet tr = ps.executeQuery();
            Cliente a;
            while (tr.next()) {
                a = new Cliente();
                a.setId(tr.getInt("id_cli"));
                a.setNome(tr.getString("nome_cli"));
                a.setEndereco(tr.getString("end_cli"));
                a.setTelefone(tr.getString("fone_cli"));
                a.setEmail(tr.getString("email_cli"));
                clientes.add(a);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return clientes;
    }

}
