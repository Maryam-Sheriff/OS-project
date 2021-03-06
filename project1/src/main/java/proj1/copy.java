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
public class copy extends javax.swing.JFrame {

    String path = "/";
    String path1 = "/";

    /**
     * Creates new form copy
     */
    public copy() {
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
            Logger.getLogger(copy.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Process p = Runtime.getRuntime().exec("ls -a " + path1);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String output = null;
            ArrayList al = new ArrayList();
            while ((output = br.readLine()) != null) {
                al.add(output);
            }

            DefaultComboBoxModel dcbm2 = new DefaultComboBoxModel();
            for (Object m : al) {
                dcbm2.addElement(m);
            }
            folders2.setModel(dcbm2);

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

        Return = new javax.swing.JButton();
        folders = new javax.swing.JComboBox<>();
        list = new javax.swing.JButton();
        folderPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        folders2 = new javax.swing.JComboBox<>();
        list1 = new javax.swing.JButton();
        folderPath2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Return1 = new javax.swing.JButton();
        list2 = new javax.swing.JButton();
        list3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Return.setText("<--");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        folders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        list.setText("Enter");
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        folderPath.setEditable(false);

        jLabel1.setText("Folder location");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Copy Directory");

        folders2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        folders2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folders2ActionPerformed(evt);
            }
        });

        list1.setText("Enter");
        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        folderPath2.setEditable(false);

        jLabel3.setText("Folder Copy Location");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setText("Paste Directory");

        Return1.setText("<--");
        Return1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return1ActionPerformed(evt);
            }
        });

        list2.setText("Confirm");
        list2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list2ActionPerformed(evt);
            }
        });

        list3.setText("Back");
        list3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(list3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(folderPath2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Return1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(folders, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(folders2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Return)
                    .addComponent(folders, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(folderPath, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Return1)
                            .addComponent(folders2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(list1))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(folderPath2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(list2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(list3)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list2ActionPerformed
        if (folders.getSelectedItem() != null && folders2.getSelectedItem() != null) {

            path += "/" + folders.getSelectedItem();
            path1 += "/" + folders2.getSelectedItem();
//            folderPath.setText(path);
//            folderPath2.setText(path1);
            try {
                Process p = Runtime.getRuntime().exec("cp -r " + path + " " + path1);
//
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream())); // br to read command output
                javax.swing.JOptionPane.showMessageDialog(null, "Copy Successful");
//                String output = null; // store br  in a string
//                ArrayList al = new ArrayList();
//                while ((output = br.readLine()) != null) {
//                    al.add(output);
//                }
//
//                DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
//                for (Object i : al) {
//                    dcbm.addElement(i);
//                }
//                folders.setModel(dcbm);
            } catch (IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Copy Failed");
            }
            path = "/";
            path1 = "/";
            folderPath.setText(path);
            folderPath2.setText(path1);
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
                Logger.getLogger(copy.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Process p = Runtime.getRuntime().exec("ls -a " + path1);
                BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

                String output = null;
                ArrayList al = new ArrayList();
                while ((output = br.readLine()) != null) {
                    al.add(output);
                }

                DefaultComboBoxModel dcbm2 = new DefaultComboBoxModel();
                for (Object m : al) {
                    dcbm2.addElement(m);
                }
                folders2.setModel(dcbm2);

            } catch (IOException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }

        };
    }//GEN-LAST:event_list2ActionPerformed

    private void list3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list3ActionPerformed
        // TODO add your handling code here:
        menu m = new menu();
        m.setSize(400, 360);
        m.setLocation(400, 200);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_list3ActionPerformed

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

        }    }//GEN-LAST:event_listActionPerformed

    private void folders2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folders2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_folders2ActionPerformed

    private void Return1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return1ActionPerformed
        if (!(path1.equals("/") || path1.equals("//"))) {
            StringBuilder sb = new StringBuilder(path1);
            sb.delete(sb.lastIndexOf("/"), sb.length());
            path1 = sb.toString();
            try {
                Process p = Runtime.getRuntime().exec("ls -a " + path1);

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
                folders2.setModel(dcbm);
            } catch (IOException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "you are in root directory can not go anyfurther", "error", JOptionPane.ERROR_MESSAGE);
        }
        folderPath2.setText(path1);    }//GEN-LAST:event_Return1ActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        if (folders2.getSelectedItem() != null) {

            path1 += "/" + folders2.getSelectedItem();
            folderPath2.setText(path1);
            try {
                Process k = Runtime.getRuntime().exec("ls -a " + path1);

                BufferedReader br2 = new BufferedReader(new InputStreamReader(k.getInputStream())); // br to read command output

                String output2 = null; // store br//  in a string
                ArrayList al2 = new ArrayList();
                while ((output2 = br2.readLine()) != null) {
                    al2.add(output2);
                }

                DefaultComboBoxModel dcbm2 = new DefaultComboBoxModel();
                for (Object m : al2) {
                    dcbm2.addElement(m);
                }
                folders2.setModel(dcbm2);
            } catch (IOException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }

        }    }//GEN-LAST:event_list1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(copy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(copy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(copy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(copy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new copy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return;
    private javax.swing.JButton Return1;
    private javax.swing.JTextField folderPath;
    private javax.swing.JTextField folderPath2;
    private javax.swing.JComboBox<String> folders;
    private javax.swing.JComboBox<String> folders2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton list;
    private javax.swing.JButton list1;
    private javax.swing.JButton list2;
    private javax.swing.JButton list3;
    // End of variables declaration//GEN-END:variables
}
