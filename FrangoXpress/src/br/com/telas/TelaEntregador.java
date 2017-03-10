//Barbara Daniele
package br.com.telas;

import br.com.controler.Entregador;
import br.com.dao.CadastroEntregadorDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;

public class TelaEntregador extends JInternalFrame {
    
    //Iniciação dos componentes da tela
    public TelaEntregador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTnome = new javax.swing.JTextField();
        jTendereco = new javax.swing.JTextField();
        jLnome = new javax.swing.JLabel();
        jLendereco = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jLtelefone = new javax.swing.JLabel();
        jLinfo = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jBadicionar = new javax.swing.JButton();
        jBatualizar = new javax.swing.JButton();
        jBpesquisar = new javax.swing.JButton();
        jTpesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTentregadores = new javax.swing.JTable();
        jBlimpar = new javax.swing.JButton();
        jTtelefone = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Entregadores");
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLnome.setText("Nome*");

        jLendereco.setText("Endereço");

        jLtelefone.setText("Telefone*");

        jLinfo.setText("Campos com * são obrigatórios.");

        jLemail.setText("E-mail");

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

        jTentregadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereço", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTentregadores);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLinfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLendereco)
                                    .addComponent(jLnome))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLtelefone)
                                    .addComponent(jLemail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBadicionar)
                                .addGap(49, 49, 49)
                                .addComponent(jBatualizar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBpesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTpesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBlimpar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLinfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtelefone)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLemail)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLendereco)
                    .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBadicionar)
                    .addComponent(jBatualizar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBpesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBlimpar)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Função executada ao usar o botão Adicionar
    private void jBadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarActionPerformed
        try {
            //Verifica se os campos obrigatórios estão preenchidos
            if ((jTnome.getText().equals("")) || (jTtelefone.getText().equals("")) || (jTendereco.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Complete os campos nome, telefone e endereço.");
            } else {
                //Cria um novo objeto entregador e realiza seu cadastro
                Entregador entregador = new Entregador();
                CadastroEntregadorDAO cadastroEntregadorDAO = new CadastroEntregadorDAO();
                entregador.setNome(jTnome.getText());
                entregador.setEndereco(jTendereco.getText());
                entregador.setTelefone(jTtelefone.getText());
                entregador.setEmail(jTemail.getText());
                cadastroEntregadorDAO.inserir(entregador);
                //Limpa os campos apos a inserção e direciona o cursor para o campo nome
                jTnome.setText("");
                jTtelefone.setText("");
                jTendereco.setText("");
                jTemail.setText("");
                jTnome.requestFocus();
            }
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBadicionarActionPerformed

    //Função responsável pela pesquisa ao clicar no botão pesquisar
    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        try {
            //Cria um novo objeto cliente e liga a tabela entregador com a pesquisa de entregadores
            Entregador entregador = new Entregador();
            CadastroEntregadorDAO cadastroEntregadorDAO = new CadastroEntregadorDAO();
            DefaultTableModel entregadorpesque = (DefaultTableModel) jTentregadores.getModel();
            //Se o campo de pesquisa estiver vazio cria uma lista com os dados de todos os entregadores
            if (jTpesquisar.getText().equalsIgnoreCase("")) {
                ArrayList<Entregador> entregadores = cadastroEntregadorDAO.pesquisarTudo();
                for (int i = 0; i < entregadores.size(); i++) {
                    entregador = entregadores.get(i);
                    entregadorpesque.addRow(new Object[]{entregador.getNome(), entregador.getTelefone(), entregador.getEndereco(), entregador.getEmail()});
                }
            } else {
                //Realiza a pesquisa e coloca os dados em seus campos e na tabela
                entregador.setNome(jTpesquisar.getText());
                cadastroEntregadorDAO.pesquisar(entregador);
                jTnome.setText(entregador.getNome());
                jTendereco.setText(entregador.getEndereco());
                jTtelefone.setText(entregador.getTelefone());
                jTemail.setText(entregador.getEmail());
                entregadorpesque.addRow(new Object[]{entregador.getNome(), entregador.getTelefone(), entregador.getEndereco(), entregador.getEmail()});
            }
            //Limpa o campo pesquisa e redireciona o cursor para ele
            jTpesquisar.setText(null);
            jTpesquisar.requestFocus();
            
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBpesquisarActionPerformed

    //Função responsável pela atualização ao clicar no botão Atualizar
    private void jBatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatualizarActionPerformed
        try {
            //Verifica se os campos obrigatórios estão preenchidos
            if ((jTnome.getText().equals("")) || (jTtelefone.getText().equals("")) || (jTendereco.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Complete os campos nome, telefone e endereço.");
            } else {
                //Cria objeto entregador, conecta ao banco e atualiza os dados
                Entregador entregador = new Entregador();
                CadastroEntregadorDAO cadastroEntregadorDAO = new CadastroEntregadorDAO();
                entregador.setNome(jTnome.getText());
                entregador.setEndereco(jTendereco.getText());
                entregador.setTelefone(jTtelefone.getText());
                entregador.setEmail(jTemail.getText());
                cadastroEntregadorDAO.atualizar(entregador);
                //Limpa os campos e rediciona o cursor para o campo nome
                jTnome.setText("");
                jTendereco.setText("");
                jTtelefone.setText("");
                jTemail.setText("");
                jTnome.requestFocus();
            }
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBatualizarActionPerformed

    //Função responsável por limpar campos
    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        jTnome.setText("");
        jTtelefone.setText("");
        jTendereco.setText("");
        jTemail.setText("");
        //Limpa linhas da tabela
        DefaultTableModel tblRemove = (DefaultTableModel) jTentregadores.getModel();
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
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLendereco;
    private javax.swing.JLabel jLinfo;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLtelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTable jTentregadores;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTpesquisar;
    private javax.swing.JTextField jTtelefone;
    // End of variables declaration//GEN-END:variables
}
