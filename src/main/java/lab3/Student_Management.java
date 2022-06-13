/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edward
 */
public class Student_Management extends javax.swing.JFrame {

        /**
         * Creates new form Student_Management
         */
        public Student_Management() {
                initComponents();
                setLocationRelativeTo(null);
                initTempData();
                fillDataTotable();
                setTitle("PS23247-Thanh Cong");
        }
        private static Map<String,Student> listStudent = new HashMap<>();

        @SuppressWarnings("unchecked")

      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JTextField();
        rankLabel = new javax.swing.JTextField();
        majorLabel = new javax.swing.JComboBox<>();
        scoreLabel = new javax.swing.JTextField();
        bonusCheckbox = new javax.swing.JCheckBox();
        addBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        NewBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        sortname = new javax.swing.JButton();
        sortscore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Full Name");

        jLabel2.setText("Score");

        jLabel3.setText("Majors");

        jLabel4.setText("Rank");

        rankLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankLabelActionPerformed(evt);
            }
        });

        majorLabel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Technology", "Computer Progamer" }));

        scoreLabel.setActionCommand("<Not Set>");
        scoreLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        scoreLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreLabelActionPerformed(evt);
            }
        });

        bonusCheckbox.setText("bonus ?");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        DelBtn.setText("Delete");
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        NewBtn.setText("New");
        NewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Full Name", "Score", "Majors", "Rank", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Student Mangement By Edward :>");

        sortname.setText("sort by name");
        sortname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortnameActionPerformed(evt);
            }
        });

        sortscore.setText("sort by score");
        sortscore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortscoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(majorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bonusCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DelBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UpdateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NewBtn)))))
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(sortname, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sortscore, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(majorLabel)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bonusCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(DelBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(NewBtn))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortname)
                    .addComponent(sortscore))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortnameActionPerformed
        // Collections.sort(listStudent, (a, b) -> a.getName().compareTo(b.getName()));
    }//GEN-LAST:event_sortnameActionPerformed

    private void sortscoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortscoreActionPerformed
        // y
    }//GEN-LAST:event_sortscoreActionPerformed

    
    private void fillDataTotable() {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            Collection<Student> myStudent =  listStudent.values();
            for (Student obj : myStudent) {
                    Object[] row = new Object[5];
                    row[0] = obj.getName();
                    row[1] = obj.getScore();
                    row[2] = obj.getMajor();
                    row[3] = obj.getRank();
                    row[4] = obj.isBonus();
                    model.addRow(row);
            }
    }

    private void initTempData() {
            listStudent.put("TC1",new Student("TC1", (float) 10.0, "cntt"));
            listStudent.put("TC2",new Student("TC2", (float) 10.0, "cntt"));
            listStudent.put("TC3",new Student("TC3", (float) 10.0, "cntt"));
            listStudent.put("TC4",new Student("TC4", (float) 10.0, "cntt"));
            listStudent.put("TC5",new Student("TC5", (float) 10.0, "cntt"));
    }

    private int getIndexObj(String name) {
            for (int i = 0; i < listStudent.size(); i++) {
                    if (listStudent.get(i).getName().equals(name)) {
                            return i;
                    }
            }
             return -1;
    }

    private void scoreLabelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_scoreLabelActionPerformed
            // TODO add your handling code here:
    }// GEN-LAST:event_scoreLabelActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_UpdateBtnActionPerformed
            try {
                    int pos = getIndexObj(nameLabel.getText());
                    if (pos != -1) {
                            int check = JOptionPane.showConfirmDialog(this,
                                            "Received the presence of: '  " + nameLabel.getText()
                                                            + " ' in list! Do you want to update this Object");
                            if (check == JOptionPane.YES_OPTION) {
                                    listStudent.get(pos).setName(nameLabel.getText());
                                    listStudent.get(pos).setScore((float) Double.parseDouble(scoreLabel.getText()));
                                    fillDataTotable();
                                    NewBtnActionPerformed(evt);
                            }
                    } else {
                            JOptionPane.showMessageDialog(this, nameLabel.getText() + " not exited", "Error",
                                            JOptionPane.ERROR_MESSAGE);
                            return;
                    }
            } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Erro " + e.getMessage());
            }

    }// GEN-LAST:event_UpdateBtnActionPerformed

    private void NewBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NewBtnActionPerformed
            nameLabel.setText("");
            scoreLabel.setText("");
            rankLabel.setText("");
            bonusCheckbox.setSelected(false);

    }// GEN-LAST:event_NewBtnActionPerformed

    private void rankLabelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rankLabelActionPerformed
            // TODO add your handling code here:
    }// GEN-LAST:event_rankLabelActionPerformed

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DelBtnActionPerformed
            // String name = nameLabel.getText();
            // int pos = getIndexObj(name);
            // if (pos != -1) {
            //         listStudent.remove(pos);
            //         JOptionPane.showMessageDialog(this, "remove success");
            // } else {
            //         JOptionPane.showMessageDialog(this, name + " not exited", "Error",
            //                         JOptionPane.ERROR_MESSAGE);
            //         return;
            // }
            // fillDataTotable();
    }// GEN-LAST:event_DelBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addBtnActionPerformed
            // try {
            //         String name = nameLabel.getText();
            //         float score = (float) Double.parseDouble(scoreLabel.getText());
            //         String major = (String) majorLabel.getSelectedItem();
            //         Student student = new Student(name, score, major);
            //         listStudent.add(student);
            //         JOptionPane.showMessageDialog(this, "add success");
            // } catch (Exception e) {
            //         e.printStackTrace();
            //         JOptionPane.showMessageDialog(this, "Erro " + e.getMessage());
            // }
            // fillDataTotable();
        }// GEN-LAST:event_addBtnActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Student_Management.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Student_Management.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Student_Management.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Student_Management.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Student_Management().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBtn;
    private javax.swing.JButton NewBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JCheckBox bonusCheckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> majorLabel;
    private javax.swing.JTextField nameLabel;
    private javax.swing.JTextField rankLabel;
    private javax.swing.JTextField scoreLabel;
    private javax.swing.JButton sortname;
    private javax.swing.JButton sortscore;
    // End of variables declaration//GEN-END:variables
}
