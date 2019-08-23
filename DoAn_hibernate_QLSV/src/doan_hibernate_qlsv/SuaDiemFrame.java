/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan_hibernate_qlsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import entities.*;
import DAO.*;
/**
 *
 * @author Admin
 */
public class SuaDiemFrame extends javax.swing.JFrame {

    /**
     * Creates new form SuaDiemFrame
     */
    String lineAll="";
    String dongCu="";
    //String dongSua="";
    float dt=0;
    BangDiemDAO bdDAO=new BangDiemDAO();
    public SuaDiemFrame() {
        initComponents();
    }
    public SuaDiemFrame(String stt,String maLop,String maMon,String mssv,String hoTen,String gk,String ck,String dk,String td) {
        initComponents();
        txtSTT.setText(stt);
        txtMSSV.setText(mssv);
        txtHoTen.setText(hoTen);
        txtGK.setText(gk);
        txtCK.setText(ck);
        txtDiemKhac.setText(dk);
        lbtd.setText(td);
        
       txtMaLop.setText(maLop);
       txtMaMon.setText(maMon);
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        lbThongBao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CK = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSTT = new javax.swing.JTextField();
        txtMSSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtGK = new javax.swing.JTextField();
        txtCK = new javax.swing.JTextField();
        txtDiemKhac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbtd = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        btnThem.setText("Sửa Điểm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        lbThongBao.setText("Sửa  Điểm Sinh Viên ");

        jLabel1.setText("STT");

        jLabel2.setText("MSSV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("GK");

        CK.setText("CK");

        jLabel6.setText("Điểm Khac");

        txtSTT.setEditable(false);

        txtMSSV.setEditable(false);

        txtHoTen.setEditable(false);

        txtGK.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtGKComponentAdded(evt);
            }
        });
        txtGK.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtGKCaretUpdate(evt);
            }
        });
        txtGK.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txtGKHierarchyChanged(evt);
            }
        });
        txtGK.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtGKInputMethodTextChanged(evt);
            }
        });
        txtGK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGKActionPerformed(evt);
            }
        });
        txtGK.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtGKPropertyChange(evt);
            }
        });
        txtGK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGKKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGKKeyReleased(evt);
            }
        });
        txtGK.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtGKVetoableChange(evt);
            }
        });

        txtCK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCKKeyReleased(evt);
            }
        });

        txtDiemKhac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiemKhacKeyReleased(evt);
            }
        });

        jLabel7.setText("Tổng Điểm :");

        lbtd.setText("TD");

        jLabel8.setText("Mã Lớp");

        jLabel9.setText("Mã Môn ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(lbThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMSSV, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(txtHoTen)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel8))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSTT, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(txtMaMon)
                                            .addComponent(txtMaLop))))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CK, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel7)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbtd, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGK)
                                .addComponent(txtCK)
                                .addComponent(txtDiemKhac, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtSTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CK)
                    .addComponent(txtCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiemKhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbtd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       String maLop=txtMaLop.getText();
       String maMon=txtMaMon.getText();
       int stt =Integer.parseInt(txtSTT.getText());
       String maSV = txtMSSV.getText();
       String hoTen = txtHoTen.getText();
       float gk =Float.parseFloat(txtGK.getText());
       float ck=Float.parseFloat(txtCK.getText());
       float dk=Float.parseFloat(txtDiemKhac.getText());
       float td=Float.parseFloat(lbtd.getText());       
        try {
              BangdiemId bangdiemId=new BangdiemId(maLop,maMon,maSV);
              Bangdiem bd=bdDAO.load(bangdiemId);
              bd.setHoTen(hoTen);
              bd.setStt(stt);
              bd.setGk(gk);
              bd.setCk(ck);
              bd.setKhac(dk);
              bd.setTongDiem(td);
              System.out.println(" kq"+ bd);
            //Bangdiem bd=new Bangdiem(bangdiemId,stt, hoTen, gk, ck, dk, td);
            if(bdDAO.update(bd)){
                JOptionPane.showMessageDialog(thoat,"Cap Nhap Thanh Cong");
            }else{
                JOptionPane.showMessageDialog(thoat,"Cap Nhap That Bai");
            }
        } catch (Exception e) {
            
        }
                 
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtGKPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtGKPropertyChange

    }//GEN-LAST:event_txtGKPropertyChange

    private void txtGKVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtGKVetoableChange
               
    }//GEN-LAST:event_txtGKVetoableChange

    private void txtGKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGKActionPerformed
       
    }//GEN-LAST:event_txtGKActionPerformed

    private void txtGKCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtGKCaretUpdate
       
    }//GEN-LAST:event_txtGKCaretUpdate

    private void txtGKComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtGKComponentAdded
        
    }//GEN-LAST:event_txtGKComponentAdded

    private void txtGKHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtGKHierarchyChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtGKHierarchyChanged

    private void txtGKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGKKeyPressed
     //  JOptionPane.showMessageDialog(thoat, "con ga con");
//         float tk=0;
//         String kq= txtGK.getText();
//         float ck=Float.parseFloat( txtCK.getText());
//         float dt=Float.parseFloat( txtDiemKhac.getText());
         //JOptionPane.showMessageDialog(thoat,kq);
    }//GEN-LAST:event_txtGKKeyPressed

    private void txtGKInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtGKInputMethodTextChanged
          
    }//GEN-LAST:event_txtGKInputMethodTextChanged

    private void txtGKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGKKeyReleased
            double tk=0;
            String  gk=txtGK.getText();
            double kq1=Double.parseDouble(gk);
            double kq2=Float.parseFloat( txtCK.getText());
            double kq3=Float.parseFloat( txtDiemKhac.getText());
        
         tk=(kq1+kq2+kq3)/3;
         tk=Math.round(tk);
         // lam tron
//         String dt=String.valueOf(tk);
//         String []data=dt.split("\\.");
//         double a=Float.parseFloat(data[0]);
//         double b=Float.parseFloat(data[1]);
//         double x=Math.round(b);
//         double kq=a+x;
         //JOptionPane.showMessageDialog(thoat,"jwhjahfk"+data[1]+"kq="+a);
         lbtd.setText(""+tk);
    }//GEN-LAST:event_txtGKKeyReleased

    private void txtCKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCKKeyReleased
          float tk=0;
            String  gk=txtGK.getText();
            float kq1=Float.parseFloat(gk);
            float kq2=Float.parseFloat( txtCK.getText());
            float kq3=Float.parseFloat( txtDiemKhac.getText());
         tk=(kq1+kq2+kq3)/3;
         tk=Math.round(tk);
         // lam tron
//         String dt=String.valueOf(tk);
//         String []data=dt.split("\\.");
//         double a=Float.parseFloat(data[0]);
//         double b=Float.parseFloat(data[1]);
//         double x=Math.round(b);
//         double kq=a+x;
         //JOptionPane.showMessageDialog(thoat,"jwhjahfk"+data[1]+"kq="+a);
         lbtd.setText(""+tk);
    }//GEN-LAST:event_txtCKKeyReleased

    private void txtDiemKhacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiemKhacKeyReleased
            double tk=0;
            String  gk=txtGK.getText();
            double kq1=Double.parseDouble(gk);
            double kq2=Float.parseFloat( txtCK.getText());
            double kq3=Float.parseFloat( txtDiemKhac.getText());
        
          tk=(kq1+kq2+kq3)/3;
         tk=Math.round(tk);
         // lam tron
//         String dt=String.valueOf(tk);
//         String []data=dt.split("\\.");
//         double a=Float.parseFloat(data[0]);
//         double b=Float.parseFloat(data[1]);
//         double x=Math.round(b);
//         double kq=a+x;
         //JOptionPane.showMessageDialog(thoat,"jwhjahfk"+data[1]+"kq="+a);
         lbtd.setText(""+tk);
    }//GEN-LAST:event_txtDiemKhacKeyReleased

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_thoatActionPerformed

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
            java.util.logging.Logger.getLogger(SuaDiemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaDiemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaDiemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaDiemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaDiemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CK;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JLabel lbtd;
    private javax.swing.JButton thoat;
    private javax.swing.JTextField txtCK;
    private javax.swing.JTextField txtDiemKhac;
    private javax.swing.JTextField txtGK;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtSTT;
    // End of variables declaration//GEN-END:variables
}
