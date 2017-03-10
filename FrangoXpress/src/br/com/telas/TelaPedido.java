//Barbara Daniele
package br.com.telas;

import br.com.controler.Cliente;
import br.com.controler.Pedido;
import br.com.controler.Produto;
import br.com.dao.CadastroClienteDAO;
import br.com.dao.CadastroPedidoDAO;
import br.com.dao.CadastroProdutoDAO;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;

public class TelaPedido extends JInternalFrame {
    //Variável para usada para receber resultado da soma dos Produtos
    private long total = 0;

    //Iniciação dos componentes da tela
    public TelaPedido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLinfo = new javax.swing.JLabel();
        jLproduto = new javax.swing.JLabel();
        jLcliente = new javax.swing.JLabel();
        jTproduto = new javax.swing.JTextField();
        jTcliente = new javax.swing.JTextField();
        jBadicionar = new javax.swing.JButton();
        jBsomar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTinfo = new javax.swing.JTextArea();
        jBpesquisar = new javax.swing.JButton();
        jTnome = new javax.swing.JTextField();
        jBlimpar = new javax.swing.JButton();
        jBtotal = new javax.swing.JButton();
        jTtotal = new javax.swing.JTextField();
        jTsoma = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Pedidos");
        setPreferredSize(new java.awt.Dimension(640, 480));

        jLinfo.setText("Informações");

        jLproduto.setText("Produtos");
        jLproduto.setToolTipText("");

        jLcliente.setText("Cliente");

        jBadicionar.setText("Adicionar");
        jBadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadicionarActionPerformed(evt);
            }
        });

        jBsomar.setText("Valor");
        jBsomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsomarActionPerformed(evt);
            }
        });

        jTinfo.setColumns(20);
        jTinfo.setRows(5);
        jScrollPane1.setViewportView(jTinfo);

        jBpesquisar.setText("Pesquisar");
        jBpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarActionPerformed(evt);
            }
        });

        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });

        jBtotal.setText("Somar");
        jBtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBadicionar)
                        .addGap(104, 104, 104)
                        .addComponent(jBlimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLinfo)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLcliente)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jBpesquisar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLproduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTsoma)
                            .addComponent(jTproduto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBsomar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLinfo))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBadicionar)
                            .addComponent(jBlimpar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBpesquisar))
                                .addGap(18, 18, 18)
                                .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLcliente))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBsomar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLproduto)
                                .addComponent(jTproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTsoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jBtotal)
                        .addGap(18, 18, 18)
                        .addComponent(jTtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(173, 173, 173))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Função executada ao usar o botão Adicionar
    private void jBadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarActionPerformed
        try {
            //Verifica se os campos obrigatórios estão preenchidos
            if ((jTcliente.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Complete o campo cliente.");
            } else {
                //Cria um novo objeto pedido e realiza seu cadastro
                Pedido pedido = new Pedido();
                CadastroPedidoDAO cadastroPedidoDAO = new CadastroPedidoDAO();
                pedido.setInformacoes(jTinfo.getText());
                pedido.setIdCliente(Integer.valueOf(jTcliente.getText()));
                pedido.setValorPedido(Integer.valueOf(jTtotal.getText()));
                cadastroPedidoDAO.inserir(pedido);
                //Limpa os campos apos a inserção e direciona o cursor para o campo nome
                jTinfo.setText("");
                jTnome.setText("");
                jTproduto.setText("");
                jTsoma.setText("");
                jTcliente.setText("");
                jTtotal.setText("");
                jTproduto.requestFocus();
            }
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBadicionarActionPerformed
    
    //Função responsável pela soma do produtos ao clicar no botão somar
    private void jBsomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsomarActionPerformed
        try {
            //Cria um novo objeto produto, obtem seu valor e faz sua soma a medida que o botão somar é usado
            Produto produto = new Produto();
            CadastroProdutoDAO cadastroProdutoDAO = new CadastroProdutoDAO();
            produto.setId(Integer.valueOf(jTproduto.getText()));
            cadastroProdutoDAO.getValor(produto);
            jTsoma.setText(Integer.toString(produto.getValor()));     
        } catch (Exception e) {
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBsomarActionPerformed

    //Função responsável pela pesquisa ao clicar no botão pesquisar
    private void jBpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarActionPerformed
        try{
            //Cria objeto cliente, conecta ao banco e pesquisa os dados
            Cliente cliente = new Cliente();
            CadastroClienteDAO cadastroClienteDAO = new CadastroClienteDAO();
            cliente.setId(Integer.valueOf(jTcliente.getText()));
            cadastroClienteDAO.pesquisarCliente(cliente);
            jTnome.setText(cliente.getNome());
        }catch(Exception e){
            //Caso ocorra exception retorna mensagem com erro
            JOptionPane.showMessageDialog(this, "Erro de : " + e.getMessage());
        }
    }//GEN-LAST:event_jBpesquisarActionPerformed

    //Função responsável por limpar campos
    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        jTcliente.setText("");
        jTnome.setText("");
        jTsoma.setText("");
        jTinfo.setText("");
        jTproduto.setText("");
        jTtotal.setText("");
    }//GEN-LAST:event_jBlimparActionPerformed

    //Função que faz a soma dos valores dos produtos e retorna o total
    private void jBtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtotalActionPerformed
        String value = jTsoma.getText();
        long valueLong = Long.parseLong(value);
        this.total += valueLong;
        jTtotal.setText(Long.toString(this.total));
    }//GEN-LAST:event_jBtotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadicionar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBpesquisar;
    private javax.swing.JButton jBsomar;
    private javax.swing.JButton jBtotal;
    private javax.swing.JLabel jLcliente;
    private javax.swing.JLabel jLinfo;
    private javax.swing.JLabel jLproduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcliente;
    private javax.swing.JTextArea jTinfo;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTproduto;
    private javax.swing.JTextField jTsoma;
    private javax.swing.JTextField jTtotal;
    // End of variables declaration//GEN-END:variables
}
