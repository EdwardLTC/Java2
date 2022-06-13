/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ASM;

import java.beans.EventHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javafx.stage.FileChooser;

/**
 *
 * @author Edward
 */
public class formUX extends javax.swing.JFrame {

    private final staffInterface sys = new systemFile();
    private int pos = 0;

    /**
     * Creates new form formUX
     */
    public formUX() {
        setTitle("Le Thanh Cong");
        initComponents();
        setLocationRelativeTo(null);
    }

    // @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        fistBtn = new javax.swing.JButton();
        previousBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        recordLable = new javax.swing.JLabel();
        lastBtn = new javax.swing.JButton();
        txtSalary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        findBtn = new javax.swing.JButton();
        openBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        sortBtn = new javax.swing.JButton();
        savetofilebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("Email");

        fistBtn.setText("|<");
        fistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fistBtnActionPerformed(evt);
            }
        });

        previousBtn.setText("<<");
        previousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBtnActionPerformed(evt);
            }
        });

        nextBtn.setText(">>");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        recordLable.setForeground(new java.awt.Color(255, 0, 0));
        recordLable.setText("Record: ");

        lastBtn.setText(">|");
        lastBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBtnActionPerformed(evt);
            }
        });

        txtSalary.setActionCommand("<Not Set>");
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID", "Name", "Age", "Mail", "Salary"
                }));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel11.setText("Lương");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        DelBtn.setText("Del");
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        findBtn.setText("Find");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        openBtn.setText("Open");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    openBtnActionPerformed(evt);
                } catch (ClassNotFoundException | IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        sortBtn.setText("Sort");
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });

        savetofilebtn.setText("save2file");
        savetofilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    savetofilebtnActionPerformed(evt);
                } catch (ClassNotFoundException | IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(savetofilebtn)
                                        .addComponent(DelBtn)
                                        .addComponent(saveBtn)
                                        .addComponent(newBtn)
                                        .addComponent(findBtn)
                                        .addComponent(openBtn)
                                        .addComponent(exitBtn)
                                        .addComponent(sortBtn))
                                .addContainerGap(18, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DelBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(findBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(openBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sortBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(savetofilebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11,
                                        Short.MAX_VALUE)
                                .addComponent(exitBtn)
                                .addGap(35, 35, 35)));

        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel4.setText("Mã Nhân Viên");

        jLabel8.setText("Họ Và Tên");

        jLabel9.setText("Tuổi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(fistBtn)
                                                .addGap(38, 38, 38)
                                                .addComponent(previousBtn)
                                                .addGap(35, 35, 35)
                                                .addComponent(nextBtn)
                                                .addGap(45, 45, 45)
                                                .addComponent(lastBtn)
                                                .addGap(30, 30, 30)
                                                .addComponent(recordLable, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(225, 225, 225)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtID,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 382,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel9,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtAge,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 382,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel10,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtMail,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 382,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtName,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 382,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel11,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtSalary,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 382,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(43, 43, 43)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                41, Short.MAX_VALUE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fistBtn)
                                        .addComponent(previousBtn)
                                        .addComponent(nextBtn)
                                        .addComponent(lastBtn)
                                        .addComponent(recordLable, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fillDataToTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (staff obj : sys.getList()) {
            Object[] row = new Object[5];
            row[0] = obj.getId();
            row[1] = obj.getName();
            row[2] = obj.getAge();
            row[3] = obj.getMail();
            row[4] = obj.getSalary();
            model.addRow(row);
        }
    }

    public void setObj(staff tempObj) {
        txtAge.setText(String.valueOf(tempObj.getAge()));
        txtID.setText(tempObj.getId());
        txtMail.setText(tempObj.getMail());
        txtName.setText(tempObj.getName());
        txtSalary.setText(String.valueOf(tempObj.getSalary()));
    }

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {
        int row = table.getSelectedRow();
        if (row >= 0) {
            String id = (String) table.getValueAt(row, 0);
            staff tempObj = sys.find(id);
            setObj(tempObj);
            recordLable.setText(
                    "Record: " + (sys.getPosObj(tempObj.getId()) + 1) + " of  " + sys.listSize());
        }
    }

    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {
        sys.sortBySalary();
        fillDataToTable();
    }

    private void fistBtnActionPerformed(java.awt.event.ActionEvent evt) {
        staff tempObj = sys.getObj(0);
        setObj(tempObj);

    }

    private void previousBtnActionPerformed(java.awt.event.ActionEvent evt) {
        pos--;
        if (pos <= 0)
            pos = 0;
        setObj(sys.getObj(pos));
    }

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {
        pos++;
        if (pos <= 0)
            pos = 0;
        setObj(sys.getObj(pos));
    }

    private void lastBtnActionPerformed(java.awt.event.ActionEvent evt) {
        staff tempObj = sys.getObj(sys.listSize() - 1);
        setObj(tempObj);
    }

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {
        txtAge.setText("");
        txtID.setText("");
        txtMail.setText("");
        txtName.setText("");
        txtSalary.setText("");
    }

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (sys.delete(txtID.getText()))
            JOptionPane.showMessageDialog(this, "Delete success!");
        else
            JOptionPane.showMessageDialog(this, "Delete false! check id lable");

        newBtnActionPerformed(evt);
        fillDataToTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "delete false! check id lable");
        }
        
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            staff obj = new staff(txtID.getText(), txtName.getText(), txtMail.getText(),
                    Double.parseDouble(txtSalary.getText()), Integer.parseInt(txtAge.getText()));

            if (obj.getAge() < 16 || obj.getAge() > 55) {
                JOptionPane.showMessageDialog(this, "save false! check age lable");
                return;
            }
            if (obj.getSalary() < 5000000) {
                JOptionPane.showMessageDialog(this, "save false! check salary lable");
                return;
            }
            if (!obj.getMail().matches("^(.+)@(.+)$*")) {
                JOptionPane.showMessageDialog(this, "save false! check email lable");
                return;
            }
            if (sys.find(obj.getId()) != null) {
                int check = JOptionPane.showConfirmDialog(this,
                        "Received the presence of: ' " + obj.getId()
                                + "' in list! Do you want to update this Object");
                if (check == JOptionPane.YES_OPTION)
                    sys.update(sys.getPosObj(obj.getId()), obj);
                else {
                    newBtnActionPerformed(evt);
                    return;
                }

            } else
                sys.save(obj);

            newBtnActionPerformed(evt);
            fillDataToTable();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro " + e.getMessage());
        }

    }

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {
        staff obj = sys.find(txtID.getText());
        if (obj != null)
            setObj(obj);
        else
            JOptionPane.showMessageDialog(this, "Find false! check id lable");

    }

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt)
            throws FileNotFoundException, ClassNotFoundException, IOException {
                // FileChooser fileChooser = new FileChooser();
                // fileChooser.showOpenDialog(null);
        sys.fileOpen();
        fillDataToTable();
    }

    private void savetofilebtnActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, ClassNotFoundException, IOException {// GEN-FIRST:event_savetofilebtnActionPerformed
        sys.fileSave();
        JOptionPane.showMessageDialog(this, "Save succes");
    }// GEN-LAST:event_savetofilebtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int check = JOptionPane.showConfirmDialog(this, "Do you want to exit!");
        if (check == JOptionPane.YES_OPTION)
            System.exit(0);
        else
            return;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formUX.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formUX.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formUX.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formUX.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formUX().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton findBtn;
    private javax.swing.JButton fistBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lastBtn;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton previousBtn;
    private javax.swing.JLabel recordLable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton savetofilebtn;
    private javax.swing.JButton sortBtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
