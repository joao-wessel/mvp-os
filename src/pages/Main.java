package pages;

import dao.ClientDao;
import entities.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {

    private ClientDao clienteDao;
    private DisplayClients telaListar;
    private User usuario;

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Main(User usuario) {
        initComponents();
        this.setUsuario(usuario);
//      this.clienteDao = new ClientesDao();
        System.out.print(this.usuario.getCargo());
        if (this.usuario.getCargo().equals("funcionario")) {
            this.menuRelatorios.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuCliente_cadastrar = new javax.swing.JMenuItem();
        menuCliente_Listar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cadastrarPS = new javax.swing.JMenuItem();
        listarPS = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRelatorios = new javax.swing.JMenu();
        menuRelatorios_Vendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas de Pedidos");
        setResizable(false);

        desktop.setPreferredSize(new java.awt.Dimension(750, 500));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        menuCliente.setText("Clientes");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });

        menuCliente_cadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuCliente_cadastrar.setText("Cadastrar");
        menuCliente_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliente_cadastrarActionPerformed(evt);
            }
        });
        menuCliente.add(menuCliente_cadastrar);

        menuCliente_Listar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuCliente_Listar.setText("Listar");
        menuCliente_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliente_ListarActionPerformed(evt);
            }
        });
        menuCliente.add(menuCliente_Listar);

        jMenuBar1.add(menuCliente);

        jMenu1.setText("Prestadores de Serviço");

        cadastrarPS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cadastrarPS.setText("Cadastrar");
        cadastrarPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPSActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarPS);

        listarPS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarPS.setText("Listar");
        listarPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPSActionPerformed(evt);
            }
        });
        jMenu1.add(listarPS);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ordens de Serviço");
        jMenuBar1.add(jMenu2);

        menuRelatorios.setText("Relatórios");

        menuRelatorios_Vendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        menuRelatorios_Vendas.setText("Vendas");
        menuRelatorios_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorios_VendasActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuRelatorios_Vendas);

        jMenuBar1.add(menuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(768, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed

    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuRelatorios_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorios_VendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelatorios_VendasActionPerformed

    private void menuCliente_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliente_cadastrarActionPerformed
        AddClient telaCadastro = new AddClient();
        telaCadastro.setVisible(true);
        desktop.add(telaCadastro);
    }//GEN-LAST:event_menuCliente_cadastrarActionPerformed

    private void menuCliente_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCliente_ListarActionPerformed
        DisplayClients telaListar;
        try {
            telaListar = new DisplayClients();
            telaListar.setVisible(true);
            desktop.add(telaListar);
            this.telaListar = telaListar;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuCliente_ListarActionPerformed

    private void cadastrarPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPSActionPerformed
        AddPs telaCadastroPs = new AddPs();
        telaCadastroPs.setVisible(true);
        desktop.add(telaCadastroPs);
    }//GEN-LAST:event_cadastrarPSActionPerformed

    private void listarPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarPSActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarPS;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listarPS;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuCliente_Listar;
    private javax.swing.JMenuItem menuCliente_cadastrar;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenuItem menuRelatorios_Vendas;
    // End of variables declaration//GEN-END:variables
}