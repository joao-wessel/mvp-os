package pages;

import dao.ClientDao;
import dao.OsDao;
import dao.PsDao;
import entities.Client;
import entities.Os;
import entities.Ps;
import entities.User;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class AddOs extends javax.swing.JInternalFrame {

    private OsDao osDao = new OsDao();
    private List<Os> osList;
    private Os osSelected;
    private int userId;

    private ClientDao clientDao = new ClientDao();
    private List<Client> clients;
    private Client clientSelected;

    private PsDao psDao = new PsDao();
    private List<Ps> psList;
    private Ps psSelected;

    public AddOs(User usuario) throws SQLException {
        initComponents();
        this.userId = usuario.getId();
        atualizarListaClientes();
        atualizarListaPs();
    }

    public void atualizarListaClientes() throws SQLException {
        ClientDao clientesDao = new ClientDao();
        List<Client> clientesList = clientesDao.read();
        DefaultTableModel model = (DefaultTableModel) clientsTable.getModel();
        model.setNumRows(0);

        for (int i = 0; i < clientesList.size(); i++) {
            Client cliente = clientesList.get(i);
            model.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getCep(), cliente.getRua(), cliente.getNumero(), cliente.getBairro(), cliente.getCidade(), cliente.getEstado(),});
        }
        this.clients = clientesList;
    }

    public void searchTableClients() {
        try {
            this.clients = this.clientDao.searchByName(searchClient.getText());
            DefaultTableModel model = (DefaultTableModel) clientsTable.getModel();
            model.setNumRows(0);
            for (int i = 0; i < clients.size(); i++) {
                Client cliente = clients.get(i);
                model.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getCep(), cliente.getRua(), cliente.getNumero(), cliente.getBairro(), cliente.getCidade(), cliente.getEstado(),});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void atualizarListaPs() throws SQLException {
        PsDao psDao = new PsDao();
        List<Ps> psLista = psDao.read();
        DefaultTableModel model = (DefaultTableModel) psTable.getModel();
        model.setNumRows(0);

        for (int i = 0; i < psLista.size(); i++) {
            Ps ps = psLista.get(i);
            model.addRow(new Object[]{ps.getNome(), ps.getCpf(), ps.getTelefone(), ps.getCep(), ps.getRua(), ps.getNumero(), ps.getBairro(), ps.getCidade(), ps.getEstado(),});
        }
        this.psList = psLista;
    }

    public void searchTablePs() {
        try {
            this.psList = this.psDao.searchByName(searchPs.getText());
            DefaultTableModel model = (DefaultTableModel) psTable.getModel();
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        searchClient = new javax.swing.JTextField();
        btnSearchClient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSearchPs = new javax.swing.JButton();
        searchPs = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        psTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputTextValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputTextNumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputTextDescricao = new javax.swing.JTextArea();
        inputTextData = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        jFormattedTextField2.setText("jFormattedTextField2");

        setClosable(true);
        setMaximizable(true);
        setTitle("Cadastro de O.S");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        btnSearchClient.setText("Pesquisar");
        btnSearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientActionPerformed(evt);
            }
        });

        clientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "CEP", "Rua", "Número", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(clientsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearchClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchClient)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchClient))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Prestador De Seviço"));

        btnSearchPs.setText("Pesquisar");
        btnSearchPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPsActionPerformed(evt);
            }
        });

        psTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "CEP", "Rua", "Número", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(psTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSearchPs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchPs))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchPs)
                    .addComponent(searchPs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("O.S"));

        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jLabel1.setText("Data");

        jLabel2.setText("Descrição");

        jLabel3.setText("Valor");

        jLabel4.setText("N° Solicitação");

        inputTextNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextNumberActionPerformed(evt);
            }
        });

        inputTextDescricao.setColumns(20);
        inputTextDescricao.setRows(5);
        jScrollPane2.setViewportView(inputTextDescricao);

        inputTextData.setText("  /  /   ");
        inputTextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputTextValor)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(inputTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastro)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(inputTextNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 20, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputTextNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputTextData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientActionPerformed
        searchTableClients();
    }//GEN-LAST:event_btnSearchClientActionPerformed

    private void btnSearchPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPsActionPerformed
        searchTablePs();
    }//GEN-LAST:event_btnSearchPsActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        int clientLine = clientsTable.getSelectedRow();
        int psLine = psTable.getSelectedRow();

        int clientLineSelected = this.clients.get(clientLine).getId();
        int psLineSelected = this.psList.get(psLine).getId();

        String number = inputTextNumber.getText();
        int user_id = userId;
        String date = inputTextData.getText();
        Double amount = Double.parseDouble(inputTextValor.getText());
        int client_id = clientLineSelected;
        int ps_id = psLineSelected;
        String descricao = inputTextDescricao.getText();

        if (number.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o número da solicitação.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (date.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a data.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (amount == 0) {
            JOptionPane.showMessageDialog(null, "Selecione o cliente.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (client_id == 0) {
            JOptionPane.showMessageDialog(null, "Selecione o cliente.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (ps_id == 0) {
            JOptionPane.showMessageDialog(null, "Selecione o prestador de serviço.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (descricao.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a descrição da ordem.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (osSelected == null) {
            Os os = new Os(number, user_id, date, amount, client_id, ps_id, descricao);
            try {
                osDao.create(os);
                JOptionPane.showMessageDialog(null, "Ordem de serviço cadastrada.");
                inputTextNumber.setText("");
                inputTextData.setText("");
                inputTextValor.setText("");
                inputTextDescricao.setText("");

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar ordem de serviço.", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            osSelected.setNumber(number);
            osSelected.setUser_id(user_id);
            osSelected.setDate(date);
            osSelected.setAmount(amount);
            osSelected.setClient_id(client_id);
            osSelected.setPs_id(ps_id);
            osSelected.setDescricao(descricao);
        }
        osSelected = null;
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void inputTextNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextNumberActionPerformed

    private void inputTextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnSearchClient;
    private javax.swing.JButton btnSearchPs;
    private javax.swing.JTable clientsTable;
    private javax.swing.JTextField inputTextData;
    private javax.swing.JTextArea inputTextDescricao;
    private javax.swing.JTextField inputTextNumber;
    private javax.swing.JTextField inputTextValor;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable psTable;
    private javax.swing.JTextField searchClient;
    private javax.swing.JTextField searchPs;
    // End of variables declaration//GEN-END:variables
}