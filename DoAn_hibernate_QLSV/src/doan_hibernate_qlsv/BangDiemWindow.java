package doan_hibernate_qlsv;

import DAO.SinhVienDAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entities.*;
import DAO.*;
/**
 *
 * @author Admin
 */
public class BangDiemWindow extends javax.swing.JPanel {

    /**
     * Creates new form BangDiemWindow
     */
    String path="";
    String lineAll;
    double hon5=0;
    double kem5;
    double tongHS=0;
    SinhVienDAO svDAO=new SinhVienDAO();
    BangDiemDAO bdDAO=new BangDiemDAO();
    public BangDiemWindow() throws IOException {
        initComponents();
        load();
        
    }
    public void load() throws IOException{
        pnPhanTram.setVisible(false);
        try{
        loadData();
        loadCbLopHoc();
        }catch(Exception e){
            return;
        }
        
        
    }
    public void loadCbLopHoc()
    {
//        DefaultComboBoxModel model=new DefaultComboBoxModel();
//        //model.addElement(new Sinhvien(path));
//        for(entities.Sinhvien sv : this.svDAO.load_danhSach())
//        {
//            
//            model.addElement(new Sinhvien(sv.getMaLop()));
//            //cb_doiBong.addItem(db.getTenDoiBong());
//        }       
//
//        cbLop.setModel(model);
        cbLop.removeAllItems();
        List<String> lsCB=bdDAO.layMaLop();
        for(String s : lsCB){
            cbLop.addItem(s);
        }
        
    }
    private void loadData()
    {
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("STT");
        dtm.addColumn("Ma Lop");
        dtm.addColumn("Ma Mon");
        dtm.addColumn("Ma SV");
        dtm.addColumn("Ho Ten");
        dtm.addColumn("Diem GK");
        dtm.addColumn("Diem CK");
        dtm.addColumn("Diem Khac");
        dtm.addColumn("Diem Tong");
       
        for(entities.Bangdiem bd: this.bdDAO.load_danhSach())
        {
            dtm.addRow(new Object[]{bd.getStt(),bd.getId().getMaLop(),bd.getId().getMaMon(),bd.getId().getMaSv(),bd.getHoTen(),bd.getGk(),bd.getCk(),bd.getKhac(),bd.getTongDiem()});
            
        }
        this.tbBangDiem.setModel(dtm);
        this.tbBangDiem.repaint();
        this.tbBangDiem.revalidate();
    }
    public  void loadCbMonHoc(String maLop){
        cbDSMH.removeAllItems();
        List<String> lsCB=bdDAO.layMaMonHoc(maLop);
        for(int i=0;i<lsCB.size();i++){
            cbDSMH.addItem(lsCB.get(i));
        }
    }
    public void docFile(String p) throws FileNotFoundException, IOException{
        try{
        hon5=0;
        kem5=0;
        tongHS=0;
        DefaultTableModel dtm=new DefaultTableModel();       
         
        File fileDir = new File(p);
        String tenFile=fileDir.getName();
        String []dataTen=tenFile.split("_");
        String maLop=dataTen[0];
        String maMon=dataTen[1];
			
		BufferedReader br = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir), "UTF8"));
        String [] NameSV;
        String []dataSV;
        String line = br.readLine();
        NameSV=line.split(",");
        for(int i=0;i<NameSV.length;i++){
            dtm.addColumn(String.valueOf(NameSV[i]));
        }         
        line = br.readLine();
          while(line != null){
               dataSV = line.split(",");
            // tao doi tuong lop hoc
            Bangdiem bd=new Bangdiem();
            BangdiemId bangdiemId=new BangdiemId();
            bangdiemId.setMaLop(maLop);
            bangdiemId.setMaMon(maMon);
            bangdiemId.setMaSv(dataSV[1]);
            bd.setId(bangdiemId);
           bd.setStt(Integer.parseInt(dataSV[0]));
           bd.setHoTen(dataSV[2]);
           bd.setGk(Float.parseFloat(dataSV[3]));
           bd.setCk(Float.parseFloat(dataSV[4]));
           bd.setKhac(Float.parseFloat(dataSV[5]));
           bd.setTongDiem(Float.parseFloat(dataSV[6]));
           
           bdDAO.add(bd);          
           
            line = br.readLine();
          }
        br.close();
        //fr.close();
        this.tbBangDiem.setModel(dtm);
        this.tbBangDiem.repaint();
        this.tbBangDiem.revalidate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(cbLop,"Them That Bai");
        }
    }
    public void docFileDSMH(String p) throws FileNotFoundException, IOException{
   
        cbDSMH.removeAllItems();
        File fileDir = new File(p);
			
		BufferedReader br = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(fileDir), "UTF8"));
        
        String []dataSV;
        String line = br.readLine();
        line = br.readLine();
          while(line != null){
              dataSV=line.split(",");
               //dtm.addRow(new Object[]{dataSV[0],dataSV[1],dataSV[2],dataSV[3],dataSV[4]});
               cbDSMH.addItem(dataSV[2].toString());
              line =br.readLine();
          }
        br.close();
        //fr.close();
//         this.tbMonHoc.setModel(dtm);
//        this.tbMonHoc.repaint();
//        this.tbMonHoc.revalidate();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbThongBao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnImpỏt = new javax.swing.JButton();
        lbDuongDan = new javax.swing.JLabel();
        cbMonHoc = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbLop = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbDSMH = new javax.swing.JComboBox();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBangDiem = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnPhanTram = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbdau = new javax.swing.JLabel();
        lbrot = new javax.swing.JLabel();
        lbdaupt = new javax.swing.JLabel();
        lbrotpt = new javax.swing.JLabel();

        setLayout(null);

        lbThongBao.setText("Quản Lý Bảng Điểm Sinh Viên");
        add(lbThongBao);
        lbThongBao.setBounds(260, 10, 420, 28);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Chọn File Điểm Cần Import");

        btnImpỏt.setText("File Import");
        btnImpỏt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpỏtActionPerformed(evt);
            }
        });

        lbDuongDan.setText("URL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImpỏt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbDuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnImpỏt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 65, 278, 380);

        cbMonHoc.setLayout(null);

        jLabel2.setText("Lớp");
        cbMonHoc.add(jLabel2);
        jLabel2.setBounds(20, 20, 30, 16);

        cbLop.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLopItemStateChanged(evt);
            }
        });
        cbLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLopActionPerformed(evt);
            }
        });
        cbMonHoc.add(cbLop);
        cbLop.setBounds(80, 10, 110, 30);

        jLabel3.setText("Môn Học");
        cbMonHoc.add(jLabel3);
        jLabel3.setBounds(270, 20, 49, 16);

        cbMonHoc.add(cbDSMH);
        cbDSMH.setBounds(380, 10, 154, 30);

        btnTimKiem.setBackground(new java.awt.Color(255, 102, 102));
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        cbMonHoc.add(btnTimKiem);
        btnTimKiem.setBounds(600, 10, 100, 35);

        tbBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbBangDiem);

        cbMonHoc.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 750, 333);

        add(cbMonHoc);
        cbMonHoc.setBounds(300, 50, 780, 399);

        jButton2.setText("Sửa Điểm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(428, 463, 89, 30);

        jButton3.setText("Thống Kê");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(593, 463, 87, 30);

        pnPhanTram.setBackground(new java.awt.Color(255, 204, 255));

        jLabel4.setText("Đậu :");

        jLabel5.setText("Rớt :");

        lbdau.setText("jLabel6");

        lbrot.setText("jLabel6");

        lbdaupt.setText("jLabel6");

        lbrotpt.setText("jLabel6");

        javax.swing.GroupLayout pnPhanTramLayout = new javax.swing.GroupLayout(pnPhanTram);
        pnPhanTram.setLayout(pnPhanTramLayout);
        pnPhanTramLayout.setHorizontalGroup(
            pnPhanTramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhanTramLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnPhanTramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(pnPhanTramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPhanTramLayout.createSequentialGroup()
                        .addComponent(lbrot)
                        .addGap(18, 18, 18)
                        .addComponent(lbrotpt))
                    .addGroup(pnPhanTramLayout.createSequentialGroup()
                        .addComponent(lbdau)
                        .addGap(18, 18, 18)
                        .addComponent(lbdaupt)))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        pnPhanTramLayout.setVerticalGroup(
            pnPhanTramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhanTramLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPhanTramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPhanTramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbdau)
                        .addComponent(lbdaupt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(pnPhanTramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbrot)
                    .addComponent(lbrotpt)))
        );

        add(pnPhanTram);
        pnPhanTram.setBounds(720, 440, 250, 80);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImpỏtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpỏtActionPerformed
        
        JFileChooser file =new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        // FileNameExtensionFilter fileter=new FileNameExtensionFilter("*.images","jpg","png");
        //file.addChoosableFileFilter(fileter);
        int result=file.showSaveDialog(this);
        if(result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile=file.getSelectedFile();
            path=selectedFile.getAbsolutePath();
            //lbImg.setIcon(ResizeImage(path,null));
            //lbPath.setText(path);
        }
        else{
            System.out.println("NO file select");
        }
        try {
            docFile(path);
            JOptionPane.showMessageDialog(cbLop,"Thêm Thành công");
            loadData();
            loadCbLopHoc();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(cbLop,"loi them du lieu");
        }
        //loadData();
        
        
    }//GEN-LAST:event_btnImpỏtActionPerformed
    public void loadcb1(String p) throws FileNotFoundException, IOException{
//        
//         DefaultComboBoxModel model=new DefaultComboBoxModel();
//      
//        File fileDir = new File(p);
//			
//		BufferedReader br = new BufferedReader(
//		   new InputStreamReader(
//                      new FileInputStream(fileDir), "UTF8"));
//        
//        String []dataSV;
//        String line = br.readLine();
//        line = br.readLine();
//          while(line != null){
//              dataSV=line.split(",");
//               model.addElement(new MonHoc(dataSV[1],dataSV[2]));
//               //cbDSMH.addItem(dataSV[2].toString());
//              line =br.readLine();
//          }
//        br.close();
//        //fr.close();
//
//        cbDSMH.setModel(model);
    }
    private void cbLopItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLopItemStateChanged

    }//GEN-LAST:event_cbLopItemStateChanged
    public static void copyFile(Path source, Path destination) throws IOException {
		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
	}
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
//         String ma=((MonHoc)cbDSMH.getSelectedItem()).getMaMH();
//        String name=cbLop.getSelectedItem().toString();
//        String file="D:\\File CSV\\"+name+"_"+ma+"_KQ.csv";
//        lineAll=file;
//       JOptionPane.showMessageDialog(cbLop,file);
//        try {
//            docFile(file);
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(cbLop,"chua co bang diem");
//        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//       try{          
//        String stt=tbBangDiem.getValueAt(tbBangDiem.getSelectedRow(),0).toString();
//        String mssv=tbBangDiem.getValueAt(tbBangDiem.getSelectedRow(),1).toString();
//        String ht=tbBangDiem.getValueAt(tbBangDiem.getSelectedRow(),2).toString();
//        String gk=tbBangDiem.getValueAt(tbBangDiem.getSelectedRow(),3).toString();
//        String ck=tbBangDiem.getValueAt(tbBangDiem.getSelectedRow(),4).toString();
//        String dk=tbBangDiem.getValueAt(tbBangDiem.getSelectedRow(),5).toString();
//        String td=tbBangDiem.getValueAt(tbBangDiem.getSelectedRow(),6).toString();
//       String l=lineAll;
//        SuaDiemFrame sdf=new SuaDiemFrame(stt, mssv, ht, gk, ck, dk, td,l);
//        sdf.show(true);
//        }
//       catch(Exception e){
//           JOptionPane.showMessageDialog(cbLop,"Chon dong Sinh Vien Can Sua");
//       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pnPhanTram.setVisible(true);
        lbdau.setText(String.valueOf(hon5));
        lbrot.setText(String.valueOf(kem5));
        double kq1=Math.round((hon5/tongHS)*100);
        double kq2=Math.round((kem5/tongHS)*100);
        lbdaupt.setText(String.valueOf(kq1)+"%");
        lbrotpt.setText(String.valueOf(kq2)+"%");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLopActionPerformed
          if(cbLop.getSelectedItem()!=null){
            String maLop = cbLop.getSelectedItem().toString();
           // JOptionPane.showMessageDialog(cbLop,"kq="+maLop);
            loadCbMonHoc(maLop);
        }
    }//GEN-LAST:event_cbLopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpỏt;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox cbDSMH;
    private javax.swing.JComboBox cbLop;
    private javax.swing.JPanel cbMonHoc;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDuongDan;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JLabel lbdau;
    private javax.swing.JLabel lbdaupt;
    private javax.swing.JLabel lbrot;
    private javax.swing.JLabel lbrotpt;
    private javax.swing.JPanel pnPhanTram;
    private javax.swing.JTable tbBangDiem;
    // End of variables declaration//GEN-END:variables
}
