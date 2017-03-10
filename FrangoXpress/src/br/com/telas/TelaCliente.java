//Barbara Daniele
package br.com.telas;

import br.com.controler.Cliente;
import br.com.dao.CadastroClienteDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;

public class TelaCliente extends JInternalFrame {

    //Iniciação dos componentes da tela
    public TelaCliente() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBadicionar = new javax.swing.JButton();
        jBatualizar = new javax.swing.JButton();
        jBpesquisar = new javax.swing.JButton();
        jLnome = new javax.swing.JLabel();
        jTtelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##) #####-####");

            jTtelefone = new javax.swing.JFormattedTextField(telefone);
        }catch(Exception e){
        }
        jLendereco = new javax.swing.JLabel();
        jTemail = new javax.swing.JTextField();
        jLtelefone = new javax.swing.JLabel();
        jLinfo = new javax.swing.JLabel();
        jLemail = new javax.swing.JLabel();
        jTendereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTclientes = new javax.swing.JTable();
        jBlimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jTpesquisar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes");
        setPreferredSize(new java.awt.Dimension(640, 480));

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

        jLnome.setText("Nome*");

        jLendereco.setText("Endereço*");

        jLtelefone.setText("Telefone*");

        jLinfo.setText("Campos com * são obrigatórios.");

        jLemail.setText("E-mail");

        jTclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Telefone", "Endereço", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTclientes);

        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLinfo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jBadicionar)
                                .addGap(55, 55, 55)
                                .addComponent(jBatualizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLnome))
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLendereco)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLemail)
                                    .addComponent(jLtelefone))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBpesquisar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBlimpar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLinfo)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtelefone)
                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLemail)
                    .addComponent(jTemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLendereco))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBadicionar)
                    .addComponent(jBatualizar))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBpesquisar)
                        .addGap(28, 28, 28)
                        .addComponent(jBlimpar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
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
                //Cria um novo objeto cliente e realiza seu cadastro
                Cliente cliente = new Cliente();
                CadastroClienteDAO cadastroClienteDAO = new CadastroClienteDAO();
                cliente.setNome(jTnome.getText());
                cliente.setEndereco(jTendereco.getText());
                cliente.setTelefone(jTtelefone.getText());
                cliente.setEmail(jTemail.getText());
                cadastroClienteDAO.inserir(cliente);
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
            //Cria um novo objeto cliente e liga a tabela cliente com a pesquisa de clientes
            Cliente cliente = new Cliente();
            CadastroClienteDAO cadastroClienteDAO = new CadastroClienteDAO();
            DefaultTableModel clientepesque = (DefaultTableModel) jTclientes.getModel();
            //Se o campo de pesquisa estiver vazio cria uma lista com os dados de todos os clientes
            if (jTpesquisar.getText().equalsIgnoreCase("")) {
                ArrayList<Cliente> clientes = cadastroClienteDAO.pesquisarTudo();
                for (int i = 0; i < clientes.size(); i++) {
                    cliente = clientes.get(i);
                    clientepesque.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getTelefone(), cliente.getEndereco(), cliente.getEmail()});
                }
            } else {
                //Realiza a pesquisa e coloca os dados em seus campos e na tabela
                cliente.setTelefone(jTpesquisar.getText());
                cliente.setNome(jTpesquisar.getText());
                cadastroClienteDAO.pesquisar(cliente);
                jTid.setText(Integer.toString(cliente.getId()));
                jTnome.setText(cliente.getNome());
                jTendereco.setText(cliente.getEndereco());
                jTtelefone.setText(cliente.getTelefone());
                jTemail.setText(cliente.getEmail());
                clientepesque.addRow(new Object[]{cliente.getId(), cliente.getNome(), cliente.getTelefone(), cliente.getEndereco(), cliente.getEmail()});
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
                //Cria objeto cliente, conecta ao banco e atualiza os dados
                Cliente cliente = new Cliente();
                CadastroClienteDAO cadastroClienteDAO = new CadastroClienteDAO();
                cliente.setNome(jTnome.getText());
                cliente.setEndereco(jTendereco.getText());
                cliente.setTelefone(jTtelefone.getText());
                cliente.setEmail(jTemail.getText());
                cadastroClienteDAO.atualizar(cliente);
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
        jTid.setText("");
        jTnome.setText("");
        jTtelefone.setText("");
        jTendereco.setText("");
        jTemail.setText("");
        //Limpa linhas da tabela
        DefaultTableModel tblRemove = (DefaultTableModel) jTclientes.getModel();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLemail;
    private javax.swing.JLabel jLendereco;
    private javax.swing.JLabel jLinfo;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLtelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTclientes;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTpesquisar;
    private javax.swing.JTextField jTtelefone;
    // End of variables declaration//GEN-END:variables
}
