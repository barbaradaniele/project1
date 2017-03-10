//Barbara Daniele
package br.com.dao;

import br.com.controler.Entregador;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroEntregadorDAO extends DAO {

    //Metodo que faz a criação de novos Entregadores no banco de dados
    public void inserir(Entregador a) throws Exception {
        abrirBanco();
        String query = "INSERT INTO tb_entregadores (id_ent,nome_ent,end_ent,fone_ent,email_ent) values(null,?,?,?,?)";
        ps = con.prepareStatement(query);
        ps.setString(1, a.getNome());
        ps.setString(2, a.getEndereco());
        ps.setString(3, a.getTelefone());
        ps.setString(4, a.getEmail());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Entregador Inserido com sucesso!");
        fecharBanco();
    }

    //Metodo que atualiza, no banco de dados, entregadores já existentes
    public void atualizar(Entregador a) throws Exception {
        abrirBanco();
        String query = "Update tb_entregadores set nome_ent=?,end_ent=?,fone_ent=?, email_ent=? where nome_ent=?";
        ps = con.prepareStatement(query);
        ps.setString(1, a.getNome());
        ps.setString(2, a.getEndereco());
        ps.setString(3, a.getTelefone());
        ps.setString(4, a.getEmail());
        ps.setString(5, a.getNome());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Entregador atualizado com sucesso!");
        fecharBanco();
    }

    //Método que retorna o resultado de pesquisa da tabela entregadores pelo nome
    public void pesquisar(Entregador a) throws Exception {
        try {
            abrirBanco();
            String query = "select id_ent,nome_ent,end_ent,fone_ent,email_ent FROM tb_entregadores where nome_ent like ?";
            ps = con.prepareStatement(query);
            ps.setString(1, a.getNome() + "%");
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                a.setNome(tr.getString("nome_ent"));
                a.setEndereco(tr.getString("end_ent"));
                a.setTelefone(tr.getString("fone_ent"));
                a.setEmail(tr.getString("email_ent"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    //Método que pesquisa todos os entregadores e devolve resultado em uma lista
    public ArrayList<Entregador> pesquisarTudo() throws Exception {
        ArrayList<Entregador> entregadores = new ArrayList<Entregador>();
        try {
            abrirBanco();
            String query = "select nome_ent, end_ent, fone_ent, email_ent FROM tb_entregadores";
            ps = con.prepareStatement(query);
            ResultSet tr = ps.executeQuery();
            Entregador a;
            while (tr.next()) {
                a = new Entregador();
                a.setNome(tr.getString("nome_ent"));
                a.setEndereco(tr.getString("end_ent"));
                a.setTelefone(tr.getString("fone_ent"));
                a.setEmail(tr.getString("email_ent"));
                entregadores.add(a);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        return entregadores;
    }
}