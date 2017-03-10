//Barbara Daniele
package br.com.telas;

import javax.swing.JFrame;

public class TelaSobre extends JFrame {

    //Iniciação dos componentes da tela
    public TelaSobre() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLinfol1 = new javax.swing.JLabel();
        jLinfo2 = new javax.swing.JLabel();
        jLinfo3 = new javax.swing.JLabel();
        jLicon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sobre");

        jLinfol1.setText("Sistema para controle de entregas de pedidos");

        jLinfo2.setText("Desenvolvido por Barbara Daniele");

        jLinfo3.setText("Sob a licença GPL");

        jLicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/icones/gnu.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLicon)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLinfol1)
                        .addComponent(jLinfo3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLinfo2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLinfol1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLinfo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLinfo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLicon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Função para tela ficar sobreposta as outras
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLicon;
    private javax.swing.JLabel jLinfo2;
    private javax.swing.JLabel jLinfo3;
    private javax.swing.JLabel jLinfol1;
    // End of variables declaration//GEN-END:variables
}
