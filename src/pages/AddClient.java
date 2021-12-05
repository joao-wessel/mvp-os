package pages;

import dao.ClientDao;
import entities.Client;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class AddClient extends javax.swing.JInternalFrame {

    private ClientDao clientDao = new ClientDao();
    List<Client> clients;
    private Client clientSelected;

    public AddClient() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputTxtNome = new javax.swing.JTextField();
        inputTxtRua = new javax.swing.JTextField();
        inputTxtEstado = new javax.swing.JTextField();
        inputTxtBairro = new javax.swing.JTextField();
        inputTxtNumero = new javax.swing.JTextField();
        inputTxtCep = new javax.swing.JTextField();
        inputTextTelefone = new javax.swing.JTextField();
        inputTextCpf = new javax.swing.JTextField();
        inputTextCidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Clientes");
        setPreferredSize(new java.awt.Dimension(750, 500));

        jLabel1.setText("Nome");

        jLabel2.setText("Estado");

        jLabel3.setText("Bairro");

        jLabel4.setText("Rua");

        jLabel5.setText("Número");

        jLabel6.setText("CEP");

        jLabel8.setText("Telefone");

        jLabel9.setText("CPF");

        inputTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTxtNomeActionPerformed(evt);
            }
        });

        inputTxtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTxtEstadoActionPerformed(evt);
            }
        });

        inputTxtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTxtCepActionPerformed(evt);
            }
        });

        inputTextCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextCidadeActionPerformed(evt);
            }
        });

        jLabel10.setText("Cidade");

        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTextCpf))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTxtRua))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(inputTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(inputTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(inputTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(inputTxtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputTxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(inputTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(inputTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastro))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        setBounds(0, 0, 752, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void inputTxtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTxtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTxtEstadoActionPerformed

    private void inputTxtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTxtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTxtCepActionPerformed

    private void inputTextCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTextCidadeActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        String nome = inputTxtNome.getText();
        String cpf = inputTextCpf.getText();
        String telefone = inputTextTelefone.getText();
        String cep = inputTxtCep.getText();
        String estado = inputTxtEstado.getText();
        String rua = inputTxtRua.getText();
        String bairro = inputTxtBairro.getText();
        String cidade = inputTextCidade.getText();
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

        if (clientSelected == null) {
            Client cliente = new Client(nome, cpf, telefone, cep, rua, numero, bairro, cidade, estado);
            try {
                clientDao.create(cliente);
                JOptionPane.showMessageDialog(null, "Dados cadastrados.");
                inputTxtNome.setText("");
                inputTextCpf.setText("");
                inputTextTelefone.setText("");
                inputTxtCep.setText("");
                inputTxtEstado.setText("");
                inputTxtRua.setText("");
                inputTxtNumero.setText("");
                inputTxtBairro.setText("");
                inputTextCidade.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            clientSelected.setNome(nome);
            clientSelected.setCpf(cpf);
            clientSelected.setTelefone(telefone);
            clientSelected.setCep(cep);
            clientSelected.setEstado(estado);
            clientSelected.setRua(rua);
            clientSelected.setNumero(numero);
            clientSelected.setBairro(bairro);
            clientSelected.setCidade(cidade);
        }
        clientSelected = null;
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void inputTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTxtNomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JTextField inputTextCidade;
    private javax.swing.JTextField inputTextCpf;
    private javax.swing.JTextField inputTextTelefone;
    private javax.swing.JTextField inputTxtBairro;
    private javax.swing.JTextField inputTxtCep;
    private javax.swing.JTextField inputTxtEstado;
    private javax.swing.JTextField inputTxtNome;
    private javax.swing.JTextField inputTxtNumero;
    private javax.swing.JTextField inputTxtRua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}