//Barbara Daniele
package br.com.telas;

import br.com.controler.Produto;
import br.com.dao.CadastroProdutoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;

public class TelaProduto extends JInternalFrame {

    //Iniciação dos componentes da tela
    public TelaProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLid = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jLvalor = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jTvalor = new javax.swing.JTextField();
        jBadicionar = new javax.swing.JButton();
        jBatualizar = new javax.swing.JButton();
        jBpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTproduto = new javax.swing.JTable();
        jBlimpar = new javax.swing.JButton();
        jTpesquisar = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Produtos");
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLid.setText("ID");

        jLnome.setText("Nome*");

        jLvalor.setText("Valor*");

        jBadicionar.setText("Adicionar");
        jBadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicionarActionPerformed(evt);
            }
        });

        jBatualizar.setText("Atualizar");
        jBatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatualizarActionPerformed(evt);
            }
        });

        jBpesquisar.setText("Pesquisar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        jTproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTproduto);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBlimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBadicionar)
                                .addGap(49, 49, 49)
                                .addComponent(jBatualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBpesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLid)
                                    .addComponent(jLnome)
                                    .addComponent(jLvalor))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLid)
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLnome)
                            .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLvalor)
                            .addComponent(jTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBadicionar)
                    .addComponent(jBatualizar)
                    .addComponent(jBpesquisar)
                    .addComponent(jTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBlimpar)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Função executada ao usar o botão Adicionar
    private void jBadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarActionPerformed
        try {
            //Verifica se os campos obrigatórios estão preenchidos
            if ((jTnome.getText().equals("")) || (jTvalor.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Complete os campos nome e valor.");
            } else {
                //Cria um novo objeto produto e realiza seu cadastro
                Produto produto = new Produto();
                CadastroProdutoDAO cadastroProdutoDAO = new CadastroProdutoDAO();
                produto.setNome(jTnome.getText());
                produto.setValor(Integer.valueOf(jTvalor.getText()));
                cadastroProdutoDAO.inserir(produto);
                //Limpa os campos apos a inserção e direciona o cursor para o campo nome
                jTnome.setText("");
                jTvalor.setText("");
                jTid.setText("");
                jTnome.requestFocus();
            }
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBadicionarActionPerformed

    //Função responsável pela atualização ao clicar no botão Atualizar
    private void jBatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatualizarActionPerformed
        try {
            //Verifica se os campos obrigatórios estão preenchidos
            if ((jTnome.getText().equals("")) || (jTvalor.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Complete os campos nome e valor.");
            } else {
                //Cria objeto produto, conecta ao banco e atualiza os dados
                Produto produto = new Produto();
                CadastroProdutoDAO cadastroProdutoDAO = new CadastroProdutoDAO();
                produto.setNome(jTnome.getText());
                produto.setValor(Integer.valueOf(jTvalor.getText()));
                cadastroProdutoDAO.atualizar(produto);
                //Limpa os campos e rediciona o cursor para o campo nome
                jTnome.setText("");
                jTvalor.setText("");
                jTid.setText("");
                jTnome.requestFocus();
            }
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBatualizarActionPerformed

    //Função responsável pela pesquisa ao clicar no botão pesquisar
    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        try {
            //Cria objeto produto, conecta ao banco e pesquisa os dados
            Produto produto = new Produto();
            CadastroProdutoDAO cadastroProdutoDAO = new CadastroProdutoDAO();
            DefaultTableModel produtopesque = (DefaultTableModel) jTproduto.getModel();
            //Se o campo de pesquisa estiver vazio cria uma lista com os dados de todos os produtos
            if (jTpesquisar.getText().equalsIgnoreCase("")) {
                ArrayList<Produto> produtos = cadastroProdutoDAO.pesquisarTudo();
                for (int i = 0; i < produtos.size(); i++) {
                    produto = produtos.get(i);
                    produtopesque.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getValor()});
                }
            } else {
                //Realiza a pesquisa e coloca os dados em seus campos e na tabela
                produto.setNome(jTpesquisar.getText());
                cadastroProdutoDAO.pesquisar(produto);
                jTid.setText(Integer.toString(produto.getId()));
                jTvalor.setText(Integer.toString(produto.getValor()));
                jTnome.setText(produto.getNome());
                produtopesque.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getValor()});
            }
            //Limpa o campo pesquisa e redireciona o cursor para ele
            jTpesquisar.setText(null);
            jTpesquisar.requestFocus();
        } catch (Exception e) {
           //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }

    }//GEN-LAST:event_jBpesquisarActionPerformed

    //Função responsável por limpar campos
    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        jTnome.setText("");
        jTvalor.setText("");
        jTid.setText("");
        //Limpa linhas da tabela
        DefaultTableModel tblRemove = (DefaultTableModel) jTproduto.getModel();
        if (tblRemove.getRowCount() > 0) {
            for (int i = 0; i <= tblRemove.getRowCount(); i++) {
                tblRemove.removeRow(0);
            }
        }
    }//GEN-LAST:event_jBlimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadicionar;
    private javax.swing.JButton jBatualizar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLvalor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTpesquisar;
    private javax.swing.JTable jTproduto;
    private javax.swing.JTextField jTvalor;
    // End of variables declaration//GEN-END:variables
}
