/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import helper.SharedData;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author OS
 */
public class MainForm extends javax.swing.JFrame {
    private StudentManagementPanel nStudentPanel;
    private GPAManagementPanel nGPAPanel;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        setTitle("Hệ thống quản lý sinh viên");
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
    }  
    
    //PHÂN QUYỀN TRUY CẬP CHO NGƯỜI DÙNG
    public void processLoginSuccessful(){
        jLabel_TenDangNhap.setText(SharedData.nguoiDangNhap.getTenDangNhap());
        jLabel_VaiTro.setText(SharedData.nguoiDangNhap.getVaiTro());
        jTabbedPane.removeAll();
        if(SharedData.nguoiDangNhap.getVaiTro().equals("Giảng viên")){
            jMenuItem_QLD.setEnabled(true);
            jMenuItem_QLSV.setEnabled(false);
            jButton_QLSV.setEnabled(false);
            jButton_QLD.setEnabled(true);
        } else if(SharedData.nguoiDangNhap.getVaiTro().equals("Đào tạo")){
            jMenuItem_QLD.setEnabled(false);
            jMenuItem_QLSV.setEnabled(true);
            jButton_QLD.setEnabled(false);
            jButton_QLSV.setEnabled(true);
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

        jToolBar1 = new javax.swing.JToolBar();
        jButton_Dangxuat = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton_QLSV = new javax.swing.JButton();
        jButton_QLD = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton_GioiThieu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel_TenDangNhap = new javax.swing.JLabel();
        jLabel_VaiTro = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_DangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_Thoat = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_QLSV = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_QLD = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_GioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton_Dangxuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/logout.png"))); // NOI18N
        jButton_Dangxuat.setText("Đăng xuất");
        jButton_Dangxuat.setFocusable(false);
        jButton_Dangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_Dangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_Dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_Dangxuat);
        jToolBar1.add(jSeparator4);

        jButton_QLSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_QLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/QLSV.png"))); // NOI18N
        jButton_QLSV.setText("Quản lý sinh viên");
        jButton_QLSV.setFocusable(false);
        jButton_QLSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_QLSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_QLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QLSVActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_QLSV);

        jButton_QLD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_QLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/scoreStudent.png"))); // NOI18N
        jButton_QLD.setText("Quản lý điểm");
        jButton_QLD.setFocusable(false);
        jButton_QLD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_QLD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_QLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QLDActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_QLD);
        jToolBar1.add(jSeparator5);

        jButton_GioiThieu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_GioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/them.png"))); // NOI18N
        jButton_GioiThieu.setText("Giới thiệu");
        jButton_GioiThieu.setFocusable(false);
        jButton_GioiThieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_GioiThieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_GioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GioiThieuActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton_GioiThieu);

        jScrollPane1.setViewportView(jTabbedPane);

        jLabel_TenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel_TenDangNhap.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_TenDangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_VaiTro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel_VaiTro.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_VaiTro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_VaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jLabel_TenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_VaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu5.setText("Hệ thống");

        jMenuItem_DangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_DangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/logout.png"))); // NOI18N
        jMenuItem_DangXuat.setText("Đăng xuất");
        jMenuItem_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DangXuatActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_DangXuat);
        jMenu5.add(jSeparator1);

        jMenuItem_Thoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/exit.png"))); // NOI18N
        jMenuItem_Thoat.setText("Thoát");
        jMenuItem_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ThoatActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_Thoat);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Quản lý");

        jMenuItem_QLSV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_QLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/QLSV.png"))); // NOI18N
        jMenuItem_QLSV.setText("Quản lý sinh viên");
        jMenuItem_QLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_QLSVActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_QLSV);
        jMenu6.add(jSeparator2);

        jMenuItem_QLD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_QLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/scoreStudent.png"))); // NOI18N
        jMenuItem_QLD.setText("Quản lý điểm");
        jMenuItem_QLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_QLDActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_QLD);

        jMenuBar2.add(jMenu6);

        jMenu1.setText("Trợ giúp");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/them.png"))); // NOI18N
        jMenuItem6.setText("Nội dung");
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator3);

        jMenuItem_GioiThieu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem_GioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icon/help.png"))); // NOI18N
        jMenuItem_GioiThieu.setText("Giới thiệu");
        jMenuItem_GioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_GioiThieuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_GioiThieu);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_ThoatActionPerformed

    private void jMenuItem_QLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_QLDActionPerformed
        if(nGPAPanel == null){
            nGPAPanel = new GPAManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/icon/scoreStudent.png"));
            jTabbedPane.addTab("Quản lý điểm", icon,nGPAPanel,"Quản lý điểm");
        }
        jTabbedPane.setSelectedComponent(nGPAPanel);
    }//GEN-LAST:event_jMenuItem_QLDActionPerformed

    private void jButton_QLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QLSVActionPerformed
        if(nStudentPanel  == null){
            nStudentPanel = new StudentManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/icon/QLSV.png"));
            jTabbedPane.addTab("Quản lý sinh viên", icon,nStudentPanel,"Quản lý sinh viên");
        }
        jTabbedPane.setSelectedComponent(nStudentPanel);
    }//GEN-LAST:event_jButton_QLSVActionPerformed

    private void jMenuItem_QLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_QLSVActionPerformed
        if(nStudentPanel  == null){
            nStudentPanel = new StudentManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/icon/QLSV.png"));
            jTabbedPane.addTab("Quản lý sinh viên", icon,nStudentPanel,"Quản lý sinh viên");
        }
        jTabbedPane.setSelectedComponent(nStudentPanel);
        
    }//GEN-LAST:event_jMenuItem_QLSVActionPerformed

    private void jButton_QLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QLDActionPerformed
        if(nGPAPanel == null){
            nGPAPanel = new GPAManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/icon/scoreStudent.png"));
            jTabbedPane.addTab("Quản lý điểm", icon,nGPAPanel,"Quản lý điểm");
        }
        jTabbedPane.setSelectedComponent(nGPAPanel);
    }//GEN-LAST:event_jButton_QLDActionPerformed

    private void jButton_GioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GioiThieuActionPerformed
        AboutUseDialog aud = new AboutUseDialog(this, true);
        aud.setVisible(true);
    }//GEN-LAST:event_jButton_GioiThieuActionPerformed

    private void jMenuItem_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DangXuatActionPerformed
        LoginDialog loginDialog = new LoginDialog(this, true);
        loginDialog.setVisible(true);
        processLoginSuccessful();
    }//GEN-LAST:event_jMenuItem_DangXuatActionPerformed

    private void jButton_DangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangxuatActionPerformed
        jMenuItem_DangXuatActionPerformed(evt);
        processLoginSuccessful();
    }//GEN-LAST:event_jButton_DangxuatActionPerformed

    private void jMenuItem_GioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_GioiThieuActionPerformed
        jButton_GioiThieuActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem_GioiThieuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoginDialog loginDialog = new LoginDialog(this, true);
        loginDialog.setVisible(true);
        processLoginSuccessful();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Dangxuat;
    private javax.swing.JButton jButton_GioiThieu;
    private javax.swing.JButton jButton_QLD;
    private javax.swing.JButton jButton_QLSV;
    private javax.swing.JLabel jLabel_TenDangNhap;
    private javax.swing.JLabel jLabel_VaiTro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem_DangXuat;
    private javax.swing.JMenuItem jMenuItem_GioiThieu;
    private javax.swing.JMenuItem jMenuItem_QLD;
    private javax.swing.JMenuItem jMenuItem_QLSV;
    private javax.swing.JMenuItem jMenuItem_Thoat;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
