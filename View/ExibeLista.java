package View;

import Controller.ControlAluno;
import Controller.ControlArquivoBinario;
import Model.Aluno;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luiz Galhardo
 */
public class ExibeLista extends javax.swing.JFrame {

    
    private static ExibeLista exibeListaUnico;
    private ControlArquivoBinario controller = new ControlArquivoBinario();
    private Aluno aluno;
    
    public ExibeLista() {
        initComponents();
    }
    
    // Inicio Singleton
    public static ExibeLista getExibeLista(){
        if(exibeListaUnico == null){
            exibeListaUnico = new ExibeLista();
        }
        return exibeListaUnico;
    }

    // Fim Singleton
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAluno = new javax.swing.JTable();
        butSair = new javax.swing.JButton();
        butAbrirArq = new javax.swing.JButton();
        butAtualizar = new javax.swing.JButton();
        butSalvarArq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE NOTAS - MEDIA FINAL");

        tabAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "ALUNO", "MÉDIA FINAL"
            }
        ));
        jScrollPane1.setViewportView(tabAluno);

        butSair.setText("SAIR");
        butSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSairActionPerformed(evt);
            }
        });

        butAbrirArq.setText("ABRIR ARQUIVO");
        butAbrirArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAbrirArqActionPerformed(evt);
            }
        });

        butAtualizar.setText("ATUALIZAR");
        butAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAtualizarActionPerformed(evt);
            }
        });

        butSalvarArq.setText("SALVAR ARQUIVO");
        butSalvarArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSalvarArqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(butAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butSalvarArq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butAbrirArq)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(butSair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAbrirArq)
                    .addComponent(butAtualizar)
                    .addComponent(butSalvarArq))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSairActionPerformed
        sair();
    }//GEN-LAST:event_butSairActionPerformed

    private void butAbrirArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAbrirArqActionPerformed
        abrirArquivo();
        
    }//GEN-LAST:event_butAbrirArqActionPerformed

    private void butAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAtualizarActionPerformed
       listTab();
       carregaComboAluno();
    }//GEN-LAST:event_butAtualizarActionPerformed

    private void butSalvarArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSalvarArqActionPerformed
        salvarArquivo();
    }//GEN-LAST:event_butSalvarArqActionPerformed

    // Tabela Configuracao//
    public void listTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabAluno.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        for(Aluno c1 : ControlAluno.getControlAluno().getBdAluno()){
            modelo.insertRow(posLin, new Object[]{c1.getCdAluno(),c1.getNome(),c1.getMediaFinal()});
            posLin++;
        }
    }
    
    public void carregaComboAluno(){
        CalcMedia.comboAluno.removeAllItems();
        CalcMedia.comboAluno.addItem("Escolha uma Pessoa");
        
        ControlAluno.getControlAluno().getBdAluno().forEach(_item -> {
            CalcMedia.comboAluno.addItem("CODIGO: "+aluno.getCdAluno()+ " - NOME: "+aluno.getNome()+ " - MEDIA FINAL: "+aluno.getMediaFinal());
        });
    }
    
    public void sair() {
        int respSair = JOptionPane.showConfirmDialog(
                null,
                "DESEJA REALMENTE SAIR ?",
                "SAIR  - CADASTRO",
                JOptionPane.YES_NO_OPTION
        );

        if (respSair == 0) {
            dispose();
        }
    }
    
    public boolean abrirArquivo() {
        controller.setArquivo("Abrir");
        if (controller.getArquivo() != null) {
            if (controller.ler()){
                listTab();
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
     public boolean salvarArquivo() {
        controller.setArquivo("Salvar");
        if (controller.getArquivo() != null) {
            controller.escrever(false);
            return true;
        } else {
            return false;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAbrirArq;
    private javax.swing.JButton butAtualizar;
    private javax.swing.JButton butSair;
    private javax.swing.JButton butSalvarArq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabAluno;
    // End of variables declaration//GEN-END:variables

private static class comboAluno {

        private static void removeAllItems() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void addItem(String escolha_uma_Pessoa) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public comboAluno() {
        }
    }



}
