package pages;

import dao.ClientDao;
import entities.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {

    private ClientDao clienteDao;
    private DisplayClients telaListar;
    private DisplayPs telaListarPs;
    private DisplayOs telaListarOs;
    private OsRecord relatorioOs;
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
        menuPs = new javax.swing.JMenu();
        cadastrarPS = new javax.swing.JMenuItem();
        listarPS = new javax.swing.JMenuItem();
        menuOs = new javax.swing.JMenu();
        cadastrarOs = new javax.swing.JMenuItem();
        listarOs = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRelatorios_Vendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas de Pedidos");

        desktop.setBackground(new java.awt.Color(51, 51, 51));
        desktop.setPreferredSize(new java.awt.Dimension(750, 500));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        menuCliente.setText("Clientes");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });

        menuCliente_cadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCliente_cadastrar.setText("Cadastrar");
        menuCliente_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliente_cadastrarActionPerformed(evt);
            }
        });
        menuCliente.add(menuCliente_cadastrar);

        menuCliente_Listar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCliente_Listar.setText("Listar");
        menuCliente_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCliente_ListarActionPerformed(evt);
            }
        });
        menuCliente.add(menuCliente_Listar);

        jMenuBar1.add(menuCliente);

        menuPs.setText("Prestadores de Serviço");

        cadastrarPS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cadastrarPS.setText("Cadastrar");
        cadastrarPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPSActionPerformed(evt);
            }
        });
        menuPs.add(cadastrarPS);

        listarPS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarPS.setText("Listar");
        listarPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPSActionPerformed(evt);
            }
        });
        menuPs.add(listarPS);

        jMenuBar1.add(menuPs);

        menuOs.setText("Ordens de Serviço");

        cadastrarOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cadastrarOs.setText("Cadastrar");
        cadastrarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarOsActionPerformed(evt);
            }
        });
        menuOs.add(cadastrarOs);

        listarOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        listarOs.setText("Listar");
        listarOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarOsActionPerformed(evt);
            }
        });
        menuOs.add(listarOs);

        jMenuBar1.add(menuOs);

        menuRelatorios.setText("Relatórios");

        menuRelatorios_Vendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuRelatorios_Vendas.setText("Ordens de Serviço");
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
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1006, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed

    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuRelatorios_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorios_VendasActionPerformed
        try {
            OsRecord relatorioOs;
            relatorioOs = new OsRecord();
            relatorioOs.setVisible(true);
            desktop.add(relatorioOs);
            this.relatorioOs = relatorioOs;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        DisplayPs telaListarPs;
        try {
            telaListarPs = new DisplayPs();
            telaListarPs.setVisible(true);
            desktop.add(telaListarPs);
            this.telaListarPs = telaListarPs;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listarPSActionPerformed

    private void cadastrarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarOsActionPerformed
        try {
            AddOs telaCadastroOs = new AddOs(this.usuario);
            telaCadastroOs.setVisible(true);
            desktop.add(telaCadastroOs);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadastrarOsActionPerformed

    private void listarOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarOsActionPerformed
        DisplayOs telaListarOs;
        try {
            telaListarOs = new DisplayOs();
            telaListarOs.setVisible(true);
            desktop.add(telaListarOs);
            this.telaListarOs = telaListarOs;
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listarOsActionPerformed

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
    private javax.swing.JMenuItem cadastrarOs;
    private javax.swing.JMenuItem cadastrarPS;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listarOs;
    private javax.swing.JMenuItem listarPS;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuCliente_Listar;
    private javax.swing.JMenuItem menuCliente_cadastrar;
    private javax.swing.JMenu menuOs;
    private javax.swing.JMenu menuPs;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenuItem menuRelatorios_Vendas;
    // End of variables declaration//GEN-END:variables
}