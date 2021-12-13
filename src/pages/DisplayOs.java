package pages;

import dao.OsDao;
import entities.Os;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class DisplayOs extends javax.swing.JInternalFrame {

    private OsDao osDao = new OsDao();
    private List<Os> osList;
    private Os osSelected;

    public DisplayOs() throws SQLException {
        initComponents();
        atualizarLista();
    }

    public void atualizarLista() throws SQLException {
        OsDao daoOs = new OsDao();
        List<Os> osLista = daoOs.read();
        DefaultTableModel model = (DefaultTableModel) tableOs.getModel();
        model.setNumRows(0);

        for (int i = 0; i < osLista.size(); i++) {
            Os os = osLista.get(i);
            model.addRow(new Object[]{os.getNumber(), os.getUser_id(), os.getDate(), os.getAmount(), os.getClient_id(), os.getPs_id(), os.getDescricao()});
        }
        this.osList = osLista;
    }

    public void searchTablePs() {
        try {
            this.osList = this.osDao.searchByNumber(searchOs.getText());
            DefaultTableModel model = (DefaultTableModel) tableOs.getModel();
            model.setNumRows(0);
            for (int i = 0; i < osList.size(); i++) {
                Os os = osList.get(i);
                model.addRow(new Object[]{os.getNumber(), os.getUser_id(), os.getDate(), os.getAmount(), os.getClient_id(), os.getPs_id(), os.getDescricao()});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableOs = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnSaveOs = new javax.swing.JButton();
        searchOs = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ordens de Serviço");

        tableOs.setAutoCreateRowSorter(true);
        tableOs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Solicitação", "Requisitante", "Data", "Valor", "Cliente", "Prestador de Serviço", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableOs.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableOs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableOs.setName(""); // NOI18N
        tableOs.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableOs.setShowGrid(true);
        tableOs.setSurrendersFocusOnKeystroke(true);
        tableOs.getTableHeader().setReorderingAllowed(false);
        tableOs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableOs);

        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSaveOs.setText("Salvar");
        btnSaveOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOsActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchOs, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveOs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnSaveOs)
                    .addComponent(searchOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableOsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableOsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int line = tableOs.getSelectedRow();

        if (line < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma ordem.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        osSelected = osList.get(line);

        try {
            osDao.remove(osSelected.getId());
            JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso.");
            atualizarLista();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        searchTablePs();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSaveOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOsActionPerformed
        int line = tableOs.getSelectedRow();

        if (line < 0) {
            JOptionPane.showMessageDialog(null, "Selecione uma Ordem.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        osSelected = osList.get(line);

        if (osSelected != null) {
            Os osEdited = new Os(tableOs.getValueAt(line, 0).toString(), Integer.parseInt(tableOs.getValueAt(line, 1).toString()), tableOs.getValueAt(line, 2).toString(), Double.parseDouble(tableOs.getValueAt(line, 3).toString()), Integer.parseInt(tableOs.getValueAt(line, 4).toString()), Integer.parseInt(tableOs.getValueAt(line, 5).toString()), tableOs.getValueAt(line, 6).toString());

            osEdited.setId(this.osList.get(line).getId());

            try {
                osDao.change(osEdited);
                JOptionPane.showMessageDialog(null, "Dados editados.");
                atualizarLista();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao editar.", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveOsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSaveOs;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchOs;
    private javax.swing.JTable tableOs;
    // End of variables declaration//GEN-END:variables
}