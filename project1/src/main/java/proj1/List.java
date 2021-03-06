/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proj1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tony
 */
public class List extends javax.swing.JFrame {

    String path = "/";

    /**
     * Creates new form List
     */
    public List() {
        initComponents();
        try {
            Process p = Runtime.getRuntime().exec("ls -a " + path);

            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String output = null;
            ArrayList al = new ArrayList();
            while ((output = br.readLine()) != null) {
                al.add(output);
            }

            DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
            for (Object i : al) {
                dcbm.addElement(i);
            }
            folders.setModel(dcbm);
        } catch (IOException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fType = new javax.swing.ButtonGroup();
        list = new javax.swing.JButton();
        folderPath = new javax.swing.JTextField();
        folders = new javax.swing.JComboBox<>();
        Return = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        delete_folder = new javax.swing.JButton();
        createfolder = new javax.swing.JButton();
        foldername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        f1 = new javax.swing.JRadioButton();
        f2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list.setText("List Files");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        folderPath.setEditable(false);
        folderPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folderPathActionPerformed(evt);
            }
        });

        folders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        folders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foldersActionPerformed(evt);
            }
        });

        Return.setText("<--");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Current path:");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        delete_folder.setText("Delete ");
        delete_folder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_folderActionPerformed(evt);
            }
        });

        createfolder.setText("Create File/ Folder");
        createfolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createfolderActionPerformed(evt);
            }
        });

        foldername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foldernameActionPerformed(evt);
            }
        });

        jLabel3.setText("File/Folder  Name:");

        fType.add(f1);
        f1.setText("File");

        fType.add(f2);
        f2.setText("Folder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(folders, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 44, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delete_folder, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(createfolder, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(foldername, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(f1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(folders, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list)
                    .addComponent(Return))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foldername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(f1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f2)
                .addGap(2, 2, 2)
                .addComponent(createfolder)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(delete_folder))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void folderPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folderPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_folderPathActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        menu m = new menu();
        m.setSize(400, 360);
        m.setLocation(400, 200);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
        if (folders.getSelectedItem() != null) {
            path += "/" + folders.getSelectedItem();
            folderPath.setText(path);
            try {
                Process p = Runtime.getRuntime().exec("ls -a " + path);

                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream())); // br to read command output

                String output = null; // store br//  in a string
                ArrayList al = new ArrayList();
                while ((output = br.readLine()) != null) {
                    al.add(output);
                }

                DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
                for (Object i : al) {
                    dcbm.addElement(i);
                }
                folders.setModel(dcbm);
            } catch (IOException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_listActionPerformed

    private void foldersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foldersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foldersActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        if (!(path.equals("/") || path.equals("//"))) {
            StringBuilder sb = new StringBuilder(path);
            sb.delete(sb.lastIndexOf("/"), sb.length());
            path = sb.toString();
            try {
                Process p = Runtime.getRuntime().exec("ls -a " + path);

                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream())); // br to read command output

                String output = null; // store br//  in a string
                ArrayList al = new ArrayList();
                while ((output = br.readLine()) != null) {
                    al.add(output);
                }

                DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
                for (Object i : al) {
                    dcbm.addElement(i);
                }
                folders.setModel(dcbm);
            } catch (IOException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "you are in root directory can not go anyfurther", "error", JOptionPane.ERROR_MESSAGE);
        }

        folderPath.setText(path);

    }//GEN-LAST:event_ReturnActionPerformed

    private void delete_folderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_folderActionPerformed
        if (folders.getSelectedItem() != null) {
            path += "/" + folders.getSelectedItem();
            try {
                Process p = Runtime.getRuntime().exec("rm -r " + path);

            } catch (IOException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_delete_folderActionPerformed

    private void foldernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foldernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foldernameActionPerformed

    private void createfolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createfolderActionPerformed
        if (foldername.getText() != null) {
            path += "/" + folders.getSelectedItem();
            String fdname = foldername.getText();

            try {
                if (f2.isSelected()) {
                    Process p = Runtime.getRuntime().exec("mkdir " + path + "/" + fdname);
                    javax.swing.JOptionPane.showMessageDialog(null, "Operation Success");
                } else if (f1.isSelected()) {
                    Process p = Runtime.getRuntime().exec("touch " + path + "/" + fdname);
                    javax.swing.JOptionPane.showMessageDialog(null, "Operation Success");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Please Select a Type");
                }

            } catch (IOException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Process p = Runtime.getRuntime().exec("ls -a " + path);

                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String output = null;
                ArrayList al = new ArrayList();
                while ((output = br.readLine()) != null) {
                    al.add(output);
                }

                DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
                for (Object i : al) {
                    dcbm.addElement(i);
                }
                folders.setModel(dcbm);
            } catch (IOException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else
            javax.swing.JOptionPane.showMessageDialog(null, "Enter File name", "Error", JOptionPane.ERROR_MESSAGE);
         }//GEN-LAST:event_createfolderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return;
    private javax.swing.JButton back;
    private javax.swing.JButton createfolder;
    private javax.swing.JButton delete_folder;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton f2;
    private javax.swing.ButtonGroup fType;
    private javax.swing.JTextField folderPath;
    private javax.swing.JTextField foldername;
    private javax.swing.JComboBox<String> folders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton list;
    // End of variables declaration//GEN-END:variables
}
