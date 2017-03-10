//Barbara Daniele
package br.com.dao;

import br.com.controler.Pedido;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroPedidoDAO extends DAO {

    //Metodo que faz a criação de novos Pedidos no banco de dados
    public void inserir(Pedido a) throws Exception {
        abrirBanco();
        String query = "INSERT INTO tb_pedidos (id_ped,data_ped,info_ped, valor_ped, id_cli) values(null,null,?,?,?)";
        ps = con.prepareStatement(query);
        ps.setString(1, a.getInformacoes());
        ps.setInt(2, a.getValorPedido());
        ps.setInt(3, a.getIdCliente());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Pedido Inserido com sucesso!");
        fecharBanco();
    }

    //Método que retorna lista de Pedidos
    public ArrayList<Pedido> gerarRelatorio() throws Exception {
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        try {
            abrirBanco();
            String query = "select id_ped, data_ped, info_ped, valor_ped, id_cli FROM tb_pedidos";
            ps = con.prepareStatement(query);
            ResultSet tr = ps.executeQuery();
            while (tr.next()) {
                Pedido b = new Pedido();
                b.setIdPedido(tr.getInt("id_ped"));
                b.setData(tr.getString("data_ped"));
                b.setInformacoes(tr.getString("info_ped"));
                b.setValorPedido(tr.getInt("valor_ped"));
                b.setIdCliente(tr.getInt("id_cli"));
                pedidos.add(b);
            }
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }

        return pedidos;
    }
}
