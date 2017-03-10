// Barbara Daniele
package br.com.dao;

import br.com.controler.Usuario;
import br.com.telas.TelaPrincipal;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroUsuarioDAO extends DAO {

    //Metodo que faz a criação de novos Usuarios no banco de dados
    public void inserir(Usuario a) throws Exception {
        abrirBanco();
        String query = "INSERT INTO tb_usuarios (id_usu,login,senha,nome_usu,end_usu,fone_usu, perfil) values(null,?,?,?,?,?, ?)";
        ps = con.prepareStatement(query);
        ps.setString(1, a.getLogin());
        ps.setString(2, a.getSenha());
        ps.setString(3, a.getNome());
        ps.setString(4, a.getEndereco());
        ps.setString(5, a.getTelefone());
        ps.setString(6, a.getPerfil());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Usuário Inserido com sucesso!");
        fecharBanco();
    }

    //Metodo que atualiza, no banco de dados, Usuarios já existentes
    public void atualizar(Usuario a) throws Exception {
        abrirBanco();
        String query = "Update tb_usuarios set id_usu=?,login=?,senha=?,nome_usu=?,end_usu=?,fone_usu=?, perfil=? where id_usu=?";
        ps = con.prepareStatement(query);
        ps.setInt(1, a.getId());
        ps.setString(2, a.getLogin());
        ps.setString(3, a.getSenha());
        ps.setString(4, a.getNome());
        ps.setString(5, a.getEndereco());
        ps.setString(6, a.getTelefone());
        ps.setString(7, a.getPerfil());
        ps.setInt(8, a.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
        fecharBanco();
    }

    //Método exclui usuários do banco de dados
    public void deletar(Usuario a) throws Exception {
        abrirBanco();
        String query = "delete from tb_usuarios where id_usu=?";
        ps = con.prepareStatement(query);
        ps.setInt(1, a.getId());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso");
        fecharBanco();
    }

    //Método pesquisa usuários pelo nome
    public void pesquisar(Usuario a) throws Exception {
        try {
            abrirBanco();
            String query = "select id_usu, login, senha, nome_usu, end_usu, fone_usu, perfil FROM tb_usuarios where nome_usu = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, a.getNome());
            ResultSet tr = ps.executeQuery();
            if (tr.next()) {
                a.setId(tr.getInt("id_usu"));
                a.setLogin(tr.getString("login"));
                a.setSenha(tr.getString("senha"));
                a.setNome(tr.getString("nome_usu"));
                a.setEndereco(tr.getString("end_usu"));
                a.setTelefone(tr.getString("fone_usu"));
                a.setPerfil(tr.getString("perfil"));
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado");
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }

    //Método pesquisa entre usuários e retorna uma lista
    public ArrayList<Usuario> pesquisarTudo() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            abrirBanco();
            String query = "select id_usu,login,senha,nome_usu,end_usu,fone_usu, perfil FROM tb_usuarios";
            ps = con.prepareStatement(query);
            ResultSet tr = ps.executeQuery();
            Usuario a;
            while (tr.next()) {
                a = new Usuario();
                a.setId(tr.getInt("id_usu"));
                a.setLogin(tr.getString("login"));
                a.setSenha(tr.getString("senha"));
                a.setNome(tr.getString("nome_usu"));
                a.setEndereco(tr.getString("end_usu"));
                a.setTelefone(tr.getString("fone_usu"));
                a.setPerfil(tr.getString("perfil"));
                usuarios.add(a);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }

        return usuarios;
    }

    //Método faz a validação do login do usuário
    public void logar(Usuario a) throws Exception {
        try {
            abrirBanco();
            String query = "select * from tb_usuarios where login=? and senha=?";
            ps = con.prepareStatement(query);
            ps.setString(1, a.getLogin());
            ps.setString(2, a.getSenha());
            ps.execute();
            rs = ps.executeQuery();
            if (rs.next()) {
                String perfil = rs.getString("perfil");
                if (perfil.equals("admin")) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.MenuRelatorio.setEnabled(true);
                    TelaPrincipal.MenuCadastroUsuario.setEnabled(true);
                    TelaPrincipal.MenuCadastroEntregador.setEnabled(true);
                    TelaPrincipal.jLusuario.setText(rs.getString("nome_usu"));
                } else {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.jLusuario.setText(rs.getString("nome_usu"));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s), tente novamente.");
            }
            fecharBanco();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
    }
}
