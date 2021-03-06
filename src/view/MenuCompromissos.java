package view;

import DAO.BuscarInfoDAO;
import controller.CompromissosController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Formatar;
import model.Compromisso;

public class MenuCompromissos extends javax.swing.JDialog {

    BuscarInfoDAO buscarInfo;
    CompromissosController compromissosController;

    public MenuCompromissos(java.awt.Frame parent, boolean modal, Compromisso tarefa) {
        super(parent, modal);
        initComponents();
        buscarInfo = new BuscarInfoDAO();

        fillComboBoxesAgendar();
        compromissosController = new CompromissosController();
        txtNomeTarefa.setText(tarefa.getNomeTarefa());
        txtDescricao.setText(tarefa.getDescricaoTarefa());
        jComboMateria.setSelectedItem(buscarInfo.getMateriaByCod(tarefa.getCodMateria()));
        jComboPrioridade.setSelectedItem(buscarInfo.getPrioridadeByCod(tarefa.getPrioridadeTarefa()));
        jComboTipoTarefa.setSelectedItem(buscarInfo.getTipoTarefaByCod(tarefa.getTipoTarefa()));
        jComboPrioridade.setSelectedItem(buscarInfo.getPrioridadeByCod(tarefa.getPrioridadeTarefa()));
        jLabelCod.setText(String.valueOf(tarefa.getCodigoTarefa()));
        jLabelCod.setVisible(false);
    }

    private void fillComboBoxesAgendar() {
        //Limpa todos os combo boxes do painel Agendar
        jComboMateria.removeAllItems();
        jComboTipoTarefa.removeAllItems();
        jComboPrioridade.removeAllItems();

        //Preenche ArrayLists com os dados e preenche os comboboxes dentro de cada for.
        ArrayList<String> materias = buscarInfo.getMateriasCadastradas();
        for (String materia : materias) {
            //Preenche o combobox materia com as matérias cadastradas
            jComboMateria.addItem(materia);
        }
        ArrayList<String> tiposTarefas = buscarInfo.getTiposCadastrados();
        for (String tipo : tiposTarefas) {
            //preenche o combobox tipoTarefa com os tipos cadastrados
            jComboTipoTarefa.addItem(tipo);
        }
        ArrayList<String> prioridades = buscarInfo.getPrioridadesCadstradas();
        for (String prioridade : prioridades) {
            //preenche o combobox de prioridades com as prioridades cadastradas
            jComboPrioridade.addItem(prioridade);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agendar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboTipoTarefa = new javax.swing.JComboBox<>();
        jComboMateria = new javax.swing.JComboBox<>();
        jComboPrioridade = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomeTarefa = new javax.swing.JTextField();
        btnAtualizarTarefa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        jComboHora = new javax.swing.JComboBox<>();
        jComboMinuto = new javax.swing.JComboBox<>();
        jCallendarAgendar = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        btnExcluirTarefa = new javax.swing.JButton();
        jLabelCod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalhes do Compromisso");
        setResizable(false);

        agendar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel6.setText("Descrição");

        jComboTipoTarefa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboTipoTarefa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarefa", "Estudar", "Trabalho", "Prova" }));

        jComboMateria.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N

        jComboPrioridade.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Média", "Baixa" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel9.setText("Tipo");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel10.setText("Matéria");

        txtNomeTarefa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtNomeTarefa.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));

        btnAtualizarTarefa.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizarTarefa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAtualizarTarefa.setText("Atualizar");
        btnAtualizarTarefa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarTarefa.setPreferredSize(new java.awt.Dimension(76, 25));
        btnAtualizarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTarefaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel4.setText("Horário");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel12.setText("Prioridade");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDescricao.setColumns(20);
        txtDescricao.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(5);
        txtDescricao.setWrapStyleWord(true);
        txtDescricao.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txtDescricao.setMaximumSize(new java.awt.Dimension(204, 84));
        txtDescricao.setMinimumSize(new java.awt.Dimension(204, 84));
        jScrollPane1.setViewportView(txtDescricao);

        jComboHora.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jComboMinuto.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jComboMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel7.setText("Dia");

        btnExcluirTarefa.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirTarefa.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnExcluirTarefa.setText("Excluir");
        btnExcluirTarefa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirTarefa.setPreferredSize(new java.awt.Dimension(76, 25));
        btnExcluirTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTarefaActionPerformed(evt);
            }
        });

        jLabelCod.setText("jLabel2");

        javax.swing.GroupLayout agendarLayout = new javax.swing.GroupLayout(agendar);
        agendar.setLayout(agendarLayout);
        agendarLayout.setHorizontalGroup(
            agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCod)
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(btnAtualizarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(txtNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addComponent(jComboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCallendarAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboTipoTarefa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboPrioridade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58))))
        );
        agendarLayout.setVerticalGroup(
            agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboMinuto)
                                    .addComponent(jComboHora)))))
                    .addGroup(agendarLayout.createSequentialGroup()
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboTipoTarefa))
                        .addGap(18, 18, 18)
                        .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addComponent(jCallendarAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(agendarLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))))
                .addGap(31, 31, 31)
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(agendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTarefaActionPerformed
        //Método para atualizar uma tarefa

        //Se o nome da tarefa ou a data estiverem em branco, informa o usuário solicitando que ele insira os dados. Esses dados são obrigatórios
        if (txtNomeTarefa.getText().isEmpty() || jCallendarAgendar.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, tenha certeza de ter preenchido o campo Nome e ter escolhido uma data");
        } else {
            //Cria uma nova tarefa do tipo Compromisso
            Compromisso tarefa = new Compromisso();

            //Faz a atribuição dos dados
            tarefa.setCodigoTarefa(Integer.parseInt(jLabelCod.getText()));
            tarefa.setNomeTarefa(txtNomeTarefa.getText());
            tarefa.setDescricaoTarefa(txtDescricao.getText());
            tarefa.setTipoTarefa(buscarInfo.getCodTipoTarefaByName(jComboTipoTarefa.getSelectedItem().toString()));
            tarefa.setCodMateria(buscarInfo.getCodMateriaByName(jComboMateria.getSelectedItem().toString()));
            tarefa.setDataTarefa(Formatar.formatarParaMySql(jCallendarAgendar.getDate()));
            tarefa.setHorarioTarefa(jComboHora.getSelectedItem().toString() + ":" + jComboMinuto.getSelectedItem().toString());
            tarefa.setPrioridadeTarefa(buscarInfo.getCodPrioridadeByName(jComboPrioridade.getSelectedItem().toString()));

            //Chama o metodo agendarTarefas da classe AgendarController, passando a tarefa criada.
            String status = compromissosController.atualizarTarefa(tarefa);
            if (status.equals("sucesso")) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnAtualizarTarefaActionPerformed

    private void btnExcluirTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTarefaActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir a tarefa?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            Compromisso tarefa = new Compromisso();
            tarefa.setCodigoTarefa(Integer.parseInt(jLabelCod.getText()));
            String status = compromissosController.excluirTarefa(tarefa);
            if (status.equals("sucesso")) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnExcluirTarefaActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuCompromissos dialog = new MenuCompromissos(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel agendar;
    private javax.swing.JButton btnAtualizarTarefa;
    private javax.swing.JButton btnExcluirTarefa;
    private com.toedter.calendar.JDateChooser jCallendarAgendar;
    private javax.swing.JComboBox<String> jComboHora;
    private javax.swing.JComboBox<String> jComboMateria;
    private javax.swing.JComboBox<String> jComboMinuto;
    private javax.swing.JComboBox<String> jComboPrioridade;
    private javax.swing.JComboBox<String> jComboTipoTarefa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNomeTarefa;
    // End of variables declaration//GEN-END:variables
}
