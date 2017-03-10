//Barbara Daniele
package br.com.telas;

import br.com.controler.Usuario;
import br.com.dao.CadastroUsuarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;

public class TelaUsuario extends JInternalFrame {

    //Iniciação dos componentes da tela
    public TelaUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLid = new javax.swing.JLabel();
        jLlogin = new javax.swing.JLabel();
        jLsenha = new javax.swing.JLabel();
        jLnome = new javax.swing.JLabel();
        jLendereco = new javax.swing.JLabel();
        jLtelefone = new javax.swing.JLabel();
        jLperfil = new javax.swing.JLabel();
        jBadicionar = new javax.swing.JButton();
        jBdeletar = new javax.swing.JButton();
        jBatualizar = new javax.swing.JButton();
        jBpesquisar = new javax.swing.JButton();
        jTid = new javax.swing.JTextField();
        jTlogin = new javax.swing.JTextField();
        jTsenha = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jTendereco = new javax.swing.JTextField();
        jTtelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##) #####-####");

            jTtelefone = new javax.swing.JFormattedTextField(telefone);
        }catch(Exception e){
        }
        jLinfo = new javax.swing.JLabel();
        jLinfo2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTusuarios = new javax.swing.JTable();
        jTpesquisar = new javax.swing.JTextField();
        jBlimpar = new javax.swing.JButton();
        jTperfil = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setVisible(true);

        jLid.setText("ID");

        jLlogin.setText("Login*");

        jLsenha.setText("Senha*");

        jLnome.setText("Nome*");

        jLendereco.setText("Endereço");

        jLtelefone.setText("Telefone");

        jLperfil.setText("Perfil*");

        jBadicionar.setText("Adicionar");
        jBadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicionarActionPerformed(evt);
            }
        });

        jBdeletar.setText("Deletar");
        jBdeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeletarActionPerformed(evt);
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

        jLinfo.setText("Os campos com * são obrigatórios.");

        jLinfo2.setText("Perfis são do tipo admin ou user.");

        jTusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Login", "Senha", "Nome", "Perfil", "Telefone", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTusuarios);

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 426, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLinfo2)
                            .addComponent(jLinfo))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLlogin)
                                            .addComponent(jLnome)
                                            .addComponent(jLid))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLsenha)
                                            .addComponent(jLperfil)
                                            .addComponent(jLendereco))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTperfil, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTsenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLtelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(392, 392, 392)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBadicionar)
                                    .addGap(44, 44, 44)
                                    .addComponent(jBdeletar)
                                    .addGap(57, 57, 57)
                                    .addComponent(jBatualizar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBpesquisar)
                                    .addComponent(jBlimpar))
                                .addGap(0, 22, Short.MAX_VALUE)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLid)
                        .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLinfo)
                        .addGap(2, 2, 2)
                        .addComponent(jLinfo2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLlogin)
                    .addComponent(jLsenha)
                    .addComponent(jTsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnome)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLperfil)
                    .addComponent(jTperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLendereco)
                    .addComponent(jLtelefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBadicionar)
                    .addComponent(jBdeletar)
                    .addComponent(jBatualizar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBpesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBlimpar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        setBounds(0, 0, 640, 480);
    }// </editor-fold>//GEN-END:initComponents

    //Função executada ao usar o botão Adicionar
    private void jBadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarActionPerformed
        try {
            //Verifica se os campos obrigatórios estão preenchidos
            if ((jTlogin.getText().equals("")) || (jTsenha.getText().equals("")) || (jTnome.getText().equals("")) || (jTtelefone.getText().equals("")) || (jTperfil.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Complete os campos login, senha, nome, telefone e perfil.");
            //Caso campo perfil seja preenchido com os perfis permitidos cria um novo objeto usuário e realiza seu cadastro
            } else if ((jTperfil.getText().equals("admin")) || (jTperfil.getText().equals("user"))) {
                Usuario usuario = new Usuario();
                CadastroUsuarioDAO cadastroUsuarioDAO = new CadastroUsuarioDAO();
                usuario.setLogin(jTlogin.getText());
                usuario.setSenha(jTsenha.getText());
                usuario.setNome(jTnome.getText());
                usuario.setEndereco(jTendereco.getText());
                usuario.setTelefone(jTtelefone.getText());
                usuario.setPerfil(jTperfil.getText());
                cadastroUsuarioDAO.inserir(usuario);
                //Limpa os campos apos a inserção e direciona o cursor para o campo nome
                jTid.setText("");
                jTlogin.setText("");
                jTsenha.setText("");
                jTnome.setText("");
                jTendereco.setText("");
                jTtelefone.setText("");
                jTperfil.setText("");
                jTnome.requestFocus();
            } else {
                //Caso o perfil não esteja correto, cria uma tela com a informação
                JOptionPane.showMessageDialog(null, "Usuarios são do tipo admin ou user");
            }
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBadicionarActionPerformed

    //Função responsável por deletar usuários
    private void jBdeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeletarActionPerformed
        try {
            //Cria objeto usuário, faz ligação com banco de dados e deleta o usuário
            Usuario usuario = new Usuario();
            CadastroUsuarioDAO cadastroUsuarioDAO = new CadastroUsuarioDAO();
            usuario.setId(Integer.valueOf(jTid.getText()));
            cadastroUsuarioDAO.deletar(usuario);
            //Limpa o campo de Identificação do usuário e retorna o foco para ele
            jTid.setText("");
            jTid.requestFocus();
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBdeletarActionPerformed

    //Função responsável pela pesquisa ao clicar no botão pesquisar
    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        try {
            //Cria objeto usuario, conecta ao banco e pesquisa os dados
            Usuario usuario = new Usuario();
            CadastroUsuarioDAO cadastroUsuarioDAO = new CadastroUsuarioDAO();
            DefaultTableModel usuariopesque = (DefaultTableModel) jTusuarios.getModel();
            //Se o campo de pesquisa estiver vazio cria uma lista com os dados de todos os usuarios
            if (jTpesquisar.getText().equalsIgnoreCase("")) {
                ArrayList<Usuario> usuarios = cadastroUsuarioDAO.pesquisarTudo();
                for (int i = 0; i < usuarios.size(); i++) {
                    usuario = usuarios.get(i);
                    usuariopesque.addRow(new Object[]{usuario.getId(), usuario.getLogin(), usuario.getSenha(), usuario.getNome(), usuario.getPerfil(), usuario.getTelefone(), usuario.getEndereco()});
                }
            } else {
                //Realiza a pesquisa e coloca os dados em seus campos e na tabela
                usuario.setNome(jTpesquisar.getText());
                cadastroUsuarioDAO.pesquisar(usuario);
                jTid.setText(Integer.toString(usuario.getId()));
                jTlogin.setText(usuario.getLogin());
                jTsenha.setText(usuario.getSenha());
                jTnome.setText(usuario.getNome());
                jTendereco.setText(usuario.getEndereco());
                jTtelefone.setText(usuario.getTelefone());
                jTperfil.setText(usuario.getPerfil());
                usuariopesque.addRow(new Object[]{usuario.getId(), usuario.getLogin(), usuario.getSenha(), usuario.getNome(), usuario.getPerfil(), usuario.getTelefone(), usuario.getEndereco()});
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
            if ((jTlogin.getText().equals("")) || (jTsenha.getText().equals("")) || (jTnome.getText().equals("")) || (jTtelefone.getText().equals("")) || (jTperfil.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Complete os campos login, senha, nome, telefone e perfil.");
            } else if ((jTperfil.getText().equals("admin")) || (jTperfil.getText().equals("user"))) {
                //Cria objeto usuario, conecta ao banco e atualiza os dados
                Usuario usuario = new Usuario();
                CadastroUsuarioDAO cadastroUsuarioDAO = new CadastroUsuarioDAO();
                usuario.setId(Integer.valueOf(jTid.getText()));
                usuario.setLogin(jTlogin.getText());
                usuario.setSenha(jTsenha.getText());
                usuario.setNome(jTnome.getText());
                usuario.setEndereco(jTendereco.getText());
                usuario.setTelefone(jTtelefone.getText());
                usuario.setPerfil(jTperfil.getText());
                cadastroUsuarioDAO.atualizar(usuario);
                //Limpa os campos e rediciona o cursor para o campo nome
                jTid.setText("");
                jTlogin.setText("");
                jTsenha.setText("");
                jTnome.setText("");
                jTendereco.setText("");
                jTtelefone.setText("");
                jTperfil.setText("");
                jTnome.requestFocus();
            } else {
                //Caso o perfil não esteja correto, cria uma tela com a informação
                JOptionPane.showMessageDialog(null, "Usuarios são do tipo admin ou user");
            }
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBatualizarActionPerformed

    //Função responsável por limpar campos
    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        jTid.setText("");
        jTlogin.setText("");
        jTsenha.setText("");
        jTnome.setText("");
        jTendereco.setText("");
        jTtelefone.setText("");
        jTperfil.setText("");
        //Limpa linhas da tabela
        DefaultTableModel tblRemove = (DefaultTableModel) jTusuarios.getModel();
        if (tblRemove.getRowCount() > 0) {
            for (int i = 0; i <= tblRemove.getRowCount(); i++) {
                tblRemove.removeRow(0);
            }
        }
    }//GEN-LAST:event_jBlimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadicionar;
    private javax.swing.JButton jBatualizar;
    private javax.swing.JButton jBdeletar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JLabel jLendereco;
    private javax.swing.JLabel jLid;
    private javax.swing.JLabel jLinfo;
    private javax.swing.JLabel jLinfo2;
    private javax.swing.JLabel jLlogin;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLperfil;
    private javax.swing.JLabel jLsenha;
    private javax.swing.JLabel jLtelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTlogin;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTperfil;
    private javax.swing.JTextField jTpesquisar;
    private javax.swing.JTextField jTsenha;
    private javax.swing.JTextField jTtelefone;
    private javax.swing.JTable jTusuarios;
    // End of variables declaration//GEN-END:variables
}
