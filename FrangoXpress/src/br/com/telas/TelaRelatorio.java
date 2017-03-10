//Barbara Daniele
package br.com.telas;

import br.com.controler.Pedido;
import br.com.dao.CadastroPedidoDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class TelaRelatorio extends JInternalFrame {

    //Iniciação dos componentes da tela
    public TelaRelatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTrelatorio = new javax.swing.JTable();
        jBlimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Relatórios");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(640, 480));

        jBpesquisar.setText("Gerar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        jTrelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Data", "Informações", "Valor Total", "Id Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTrelatorio.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTrelatorioComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTrelatorio);

        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBpesquisar)
                        .addGap(35, 35, 35)
                        .addComponent(jBlimpar)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBpesquisar)
                    .addComponent(jBlimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Função executada ao usar o botão Pesquisar
    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed

        try {
            //Cria um objeto Pedido, faz conecção com banco, pesquisa, e preenche a tabela com os dados retornados
            Pedido pedido = new Pedido();
            CadastroPedidoDAO ca = new CadastroPedidoDAO();
            DefaultTableModel relatoriopesque = (DefaultTableModel) jTrelatorio.getModel();
            ArrayList<Pedido> relatorio = ca.gerarRelatorio();
            for (int i = 0; i < relatorio.size(); i++) {
                pedido = relatorio.get(i);
                relatoriopesque.addRow(new Object[]{pedido.getIdPedido(), pedido.getData(), pedido.getInformacoes(), pedido.getValorPedido(), pedido.getIdCliente()});
            }

        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBpesquisarActionPerformed

    private void jTrelatorioComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTrelatorioComponentAdded
        // Ação da Tabela Relatório
    }//GEN-LAST:event_jTrelatorioComponentAdded

    //Função responsável por limpar linhas da tabela
    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        DefaultTableModel tblRemove = (DefaultTableModel) jTrelatorio.getModel();
        if (tblRemove.getRowCount() > 0) {
            for (int i = 0; i <= tblRemove.getRowCount(); i++) {
                tblRemove.removeRow(0);
            }
        }
    }//GEN-LAST:event_jBlimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTrelatorio;
    // End of variables declaration//GEN-END:variables
}
