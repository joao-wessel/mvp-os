package pages;

import dao.PsDao;
import entities.Ps;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class AddPs extends javax.swing.JInternalFrame {

    private PsDao psDao = new PsDao();
    List<Ps> psList;
    private Ps psSelected;

    public AddPs() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputTxtEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputTxtName = new javax.swing.JTextField();
        inputTxtCidade = new javax.swing.JTextField();
        inputTxtNumero = new javax.swing.JTextField();
        inputTxtRua = new javax.swing.JTextField();
        inputTxtCep = new javax.swing.JTextField();
        inputTxtTelefone = new javax.swing.JTextField();
        inputTxtCpf = new javax.swing.JTextField();
        inputTxtBairro = new javax.swing.JTextField();
        buttonCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadatrar Prestador De Serviço");
        setInheritsPopupMenu(true);
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Telefone");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cpf");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Rua");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cep");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Numero");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Bairro");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cidade");

        inputTxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTxtNameActionPerformed(evt);
            }
        });

        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputTxtBairro)
                            .addComponent(inputTxtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTxtRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputTxtNumero)
                            .addComponent(inputTxtCep)
                            .addComponent(inputTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(inputTxtCpf)
                    .addComponent(inputTxtName)
                    .addComponent(inputTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCadastrar)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputTxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputTxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputTxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inputTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(inputTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(inputTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCadastrar)
                        .addGap(84, 84, 84))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTxtNameActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        String nome = inputTxtName.getText();
        String cpf = inputTxtCpf.getText();
        String telefone = inputTxtTelefone.getText();
        String cep = inputTxtCep.getText();
        String estado = inputTxtEstado.getText();
        String rua = inputTxtRua.getText();
        String bairro = inputTxtBairro.getText();
        String cidade = inputTxtCidade.getText();
        int numero = Integer.parseInt(inputTxtNumero.getText());

        try {
            numero = Integer.parseInt(inputTxtNumero.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número não informado.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (nome.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o nome.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cpf.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o CPF.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (telefone.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o telefone.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cep.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o CEP.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (estado.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o estado.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (rua.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe a rua.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (bairro.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o bairro.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cidade.length() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o bairro.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (psSelected == null) {
            Ps ps = new Ps(nome, cpf, telefone, cep, rua, numero, bairro, cidade, estado);
            try {
                psDao.create(ps);
                JOptionPane.showMessageDialog(null, "Dados cadastrados.");
                inputTxtName.setText("");
                inputTxtCpf.setText("");
                inputTxtTelefone.setText("");
                inputTxtCep.setText("");
                inputTxtEstado.setText("");
                inputTxtRua.setText("");
                inputTxtNumero.setText("");
                inputTxtBairro.setText("");
                inputTxtCidade.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            psSelected.setNome(nome);
            psSelected.setCpf(cpf);
            psSelected.setTelefone(telefone);
            psSelected.setCep(cep);
            psSelected.setEstado(estado);
            psSelected.setRua(rua);
            psSelected.setNumero(numero);
            psSelected.setBairro(bairro);
            psSelected.setCidade(cidade);
        }
        psSelected = null;
    }//GEN-LAST:event_buttonCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JTextField inputTxtBairro;
    private javax.swing.JTextField inputTxtCep;
    private javax.swing.JTextField inputTxtCidade;
    private javax.swing.JTextField inputTxtCpf;
    private javax.swing.JTextField inputTxtEstado;
    private javax.swing.JTextField inputTxtName;
    private javax.swing.JTextField inputTxtNumero;
    private javax.swing.JTextField inputTxtRua;
    private javax.swing.JTextField inputTxtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}