package pages;

import dao.PsDao;
import entities.Ps;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DisplayPs extends javax.swing.JInternalFrame {

    private PsDao psDao = new PsDao();
    private List<Ps> psList;
    private Ps psSelected;

    public DisplayPs() throws SQLException {
        initComponents();
        atualizarLista();
    }

    public void atualizarLista() throws SQLException {
        PsDao psDao = new PsDao();
        List<Ps> psLista = psDao.read();
        DefaultTableModel model = (DefaultTableModel) tablePs.getModel();
        model.setNumRows(0);

        for (int i = 0; i < psLista.size(); i++) {
            Ps ps = psLista.get(i);
            model.addRow(new Object[]{ps.getNome(), ps.getCpf(), ps.getTelefone(), ps.getCep(), ps.getRua(), ps.getNumero(), ps.getBairro(), ps.getCidade(), ps.getEstado(),});
        }
        this.psList = psLista;
    }

    public void searchTablePs() {
        try {
            this.psList = this.psDao.searchByName(searchField.getText());
            DefaultTableModel model = (DefaultTableModel) tablePs.getModel();
            model.setNumRows(0);
            for (int i = 0; i < psList.size(); i++) {
                Ps ps = psList.get(i);
                model.addRow(new Object[]{ps.getNome(), ps.getCpf(), ps.getTelefone(), ps.getCep(), ps.getRua(), ps.getNumero(), ps.getBairro(), ps.getCidade(), ps.getEstado(),});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablePs = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSalvarPs = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Prestadores de Serviço");

        tablePs.setAutoCreateRowSorter(true);
        tablePs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "CEP", "Rua", "Número", "Bairro", "Cidade", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePs.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablePs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablePs.setName(""); // NOI18N
        tablePs.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tablePs.setShowGrid(true);
        tablePs.setSurrendersFocusOnKeystroke(true);
        tablePs.getTableHeader().setReorderingAllowed(false);
        tablePs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablePs);

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSalvarPs.setText("Salvar");
        btnSalvarPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarPs)
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
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnSalvarPs))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int line = tablePs.getSelectedRow();

        if (line < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um prestador de serviço.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        psSelected = psList.get(line);

        try {
            psDao.remove(psSelected.getId());
            JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso.");
            atualizarLista();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchTablePs();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSalvarPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPsActionPerformed
        int line = tablePs.getSelectedRow();

        if (line < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um Prestador de Serviço.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        psSelected = psList.get(line);

        if (psSelected != null) {
            Ps psEdited = new Ps(tablePs.getValueAt(line, 0).toString(), tablePs.getValueAt(line, 1).toString(), tablePs.getValueAt(line, 2).toString(), tablePs.getValueAt(line, 3).toString(), tablePs.getValueAt(line, 4).toString(), Integer.parseInt(tablePs.getValueAt(line, 5).toString()), tablePs.getValueAt(line, 6).toString(), tablePs.getValueAt(line, 7).toString(), tablePs.getValueAt(line, 8).toString());

            psEdited.setId(this.psList.get(line).getId());

            try {
                psDao.change(psEdited);
                JOptionPane.showMessageDialog(null, "Dados editados.");
                atualizarLista();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao editar.", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarPsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSalvarPs;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable tablePs;
    // End of variables declaration//GEN-END:variables
}