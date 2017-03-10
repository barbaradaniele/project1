//Barbara Daniele
package br.com.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class TelaPrincipal extends JFrame {

    //Iniciação dos componentes da tela
    public TelaPrincipal() {
        initComponents();
    }
    //Essa classe cria os guias superioses da Tela Principal e a invoca
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        jLusuario = new javax.swing.JLabel();
        jLdata = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadastroCliente = new javax.swing.JMenuItem();
        MenuCadastroPedido = new javax.swing.JMenuItem();
        MenuCadastroProduto = new javax.swing.JMenuItem();
        MenuCadastroEntregador = new javax.swing.JMenuItem();
        MenuCadastroUsuario = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MenuRelatorioPedidos = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuAjudaSobre = new javax.swing.JMenuItem();
        MenuOpcoes = new javax.swing.JMenu();
        MenuOpcaoSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frango Express - Sistema para Controle");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jLusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLusuario.setText("Usuário");

        jLdata.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLdata.setText("Data");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/back.png"))); // NOI18N

        MenuCadastro.setText("Cadastro");
        MenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroActionPerformed(evt);
            }
        });

        MenuCadastroCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenuCadastroCliente.setText("Cliente");
        MenuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroCliente);

        MenuCadastroPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        MenuCadastroPedido.setText("Pedido");
        MenuCadastroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroPedidoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroPedido);

        MenuCadastroProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        MenuCadastroProduto.setText("Produto");
        MenuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroProdutoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroProduto);

        MenuCadastroEntregador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        MenuCadastroEntregador.setText("Entregador");
        MenuCadastroEntregador.setEnabled(false);
        MenuCadastroEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroEntregadorActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroEntregador);

        MenuCadastroUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        MenuCadastroUsuario.setText("Usuário");
        MenuCadastroUsuario.setEnabled(false);
        MenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroUsuario);

        jMenuBar1.add(MenuCadastro);

        MenuRelatorio.setText("Relatório");
        MenuRelatorio.setEnabled(false);
        MenuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioActionPerformed(evt);
            }
        });

        MenuRelatorioPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenuRelatorioPedidos.setText("Pedidos");
        MenuRelatorioPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRelatorioPedidosActionPerformed(evt);
            }
        });
        MenuRelatorio.add(MenuRelatorioPedidos);

        jMenuBar1.add(MenuRelatorio);

        MenuAjuda.setText("Ajuda");

        MenuAjudaSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        MenuAjudaSobre.setText("Sobre");
        MenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuAjudaSobre);

        jMenuBar1.add(MenuAjuda);

        MenuOpcoes.setText("Opções");

        MenuOpcaoSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenuOpcaoSair.setText("Sair");
        MenuOpcaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpcaoSairActionPerformed(evt);
            }
        });
        MenuOpcoes.add(MenuOpcaoSair);

        jMenuBar1.add(MenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLdata)
                            .addComponent(jLusuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLusuario)
                .addGap(30, 30, 30)
                .addComponent(jLdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(854, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroProdutoActionPerformed
        TelaProduto produto = new TelaProduto();
        produto.setVisible(true);
        desktop.add(produto);
    }//GEN-LAST:event_MenuCadastroProdutoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //as linhas abaixo substituem a label lblData pela data atual
        //sistema ao iniciar o form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        jLdata.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void MenuOpcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpcaoSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_MenuOpcaoSairActionPerformed

    private void MenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaSobreActionPerformed
        //chamando a tela Sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_MenuAjudaSobreActionPerformed

    private void MenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroUsuarioActionPerformed
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_MenuCadastroUsuarioActionPerformed

    private void MenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroActionPerformed
        //as linhas abaixo abrir o form TelaUsuario dentro do  desktop pane
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_MenuCadastroActionPerformed

    private void MenuCadastroEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroEntregadorActionPerformed
        TelaEntregador entregador = new TelaEntregador();
        entregador.setVisible(true);
        desktop.add(entregador);
    }//GEN-LAST:event_MenuCadastroEntregadorActionPerformed

    private void MenuCadastroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroPedidoActionPerformed
        TelaPedido pedido = new TelaPedido();
        pedido.setVisible(true);
        desktop.add(pedido);
    }//GEN-LAST:event_MenuCadastroPedidoActionPerformed

    private void MenuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroClienteActionPerformed
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_MenuCadastroClienteActionPerformed

    private void MenuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioActionPerformed

    }//GEN-LAST:event_MenuRelatorioActionPerformed

    private void MenuRelatorioPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRelatorioPedidosActionPerformed
        TelaRelatorio relatorio = new TelaRelatorio();
        relatorio.setVisible(true);
        desktop.add(relatorio);
    }//GEN-LAST:event_MenuRelatorioPedidosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenuItem MenuAjudaSobre;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuCadastroCliente;
    public static javax.swing.JMenuItem MenuCadastroEntregador;
    private javax.swing.JMenuItem MenuCadastroPedido;
    private javax.swing.JMenuItem MenuCadastroProduto;
    public static javax.swing.JMenuItem MenuCadastroUsuario;
    private javax.swing.JMenuItem MenuOpcaoSair;
    private javax.swing.JMenu MenuOpcoes;
    public static javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenuItem MenuRelatorioPedidos;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLdata;
    public static javax.swing.JLabel jLusuario;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
