/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DB_Connect.ConnectionDB;

import java.sql.*;
import main.GD_TrangChu;
import controller.C_MonHoc;
import entity.MonHoc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;

/**
 *
 * @author HoangVanToan
 */
public class V_ThemMonHoc extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form frm_addMonHoc
     */
   
    C_MonHoc mh = new C_MonHoc();

    public V_ThemMonHoc() throws SQLException {
        initComponents();
        setTitle("Quản Lý Môn Học");
        setLocationRelativeTo(null);
        btn_LuuMonHoc.addActionListener(this);
        btn_NhapLai.addActionListener(this);
        btn_Thoat.addActionListener(this);
        Load_Data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_MaMH = new javax.swing.JTextField();
        txt_TenMH = new javax.swing.JTextField();
        txt_SoTC = new javax.swing.JTextField();
        btn_LuuMonHoc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_Thoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_HocKy = new javax.swing.JTextField();
        btn_NhapLai = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Data = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel15.setText("QUẢN LÝ MÔN HỌC");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo KMA.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel17)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Mã Môn Học");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Tên Môn Học");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Số Tín Chỉ");

        txt_MaMH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txt_TenMH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txt_SoTC.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btn_LuuMonHoc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_LuuMonHoc.setForeground(new java.awt.Color(255, 51, 51));
        btn_LuuMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Thêm.png"))); // NOI18N
        btn_LuuMonHoc.setText("Lưu Môn học");
        btn_LuuMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuMonHocActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 102));
        jLabel6.setText("THÔNG TIN MÔN HỌC");

        btn_Thoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Thoát.png"))); // NOI18N
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Học Kỳ");

        txt_HocKy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btn_NhapLai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_NhapLai.setText("Nhập Lại");
        btn_NhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhapLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_TenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_MaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_SoTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_HocKy, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_LuuMonHoc)
                                .addGap(92, 92, 92)
                                .addComponent(btn_NhapLai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(btn_Thoat))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel6)))
                .addGap(92, 92, 92))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_HocKy, txt_MaMH, txt_SoTC, txt_TenMH});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_MaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_TenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_SoTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_HocKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_LuuMonHoc)
                    .addComponent(btn_Thoat)
                    .addComponent(btn_NhapLai))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_HocKy, txt_MaMH, txt_SoTC, txt_TenMH});

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("BẢNG DANH SÁCH MÔN HỌC");

        Table_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Môn Học", "Tên Môn Học", "Số Tín Chỉ", "Học Kỳ"
            }
        ));
        jScrollPane2.setViewportView(Table_Data);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private DefaultTableModel table = new DefaultTableModel();

    // hàm xử lý Hiển thị dữ liệu lên Table
    public void Load_Data() {
        // kết nối đến cơ sở dữ liệu
        Connection conn = null;
        Statement stm = null;

        table = new DefaultTableModel();
        // đặt tiêu đề cho các cột trong bảng
        table.addColumn("Mã Môn Học");
        table.addColumn("Tên Môn Học");
        table.addColumn("Số Tín Chỉ");
        table.addColumn("Học Kỳ");

        // thực hiện câu lệnh truy vấn đến bảng sinh viên
        String SQLSelectTable = "SELECT * FROM MonHoc";
        try {
            conn = ConnectionDB.getConnectionDB();
            // khởi tạo đối tượng statement
            stm = conn.createStatement();
            // thực hiện truy vấn để lấy ra dữ liệu
            ResultSet kq = stm.executeQuery(SQLSelectTable);
            while (kq.next()) {
                // lấy dữ liệu ở các cột trong table SinhVien
                String MaMH = kq.getString("MaMH");
                String TenMH = kq.getString("TenMH");
                String SoTC = kq.getString("SoTC");
                String HocKy = kq.getString("HocKy");

                // khai báo và sử dụng class Vector
                Vector row = new Vector();

                row.addElement(MaMH);
                row.addElement(TenMH);
                row.addElement(SoTC);
                row.addElement(HocKy);

                // gán giá trị của sinhvien vào các cột tương ứng
                table.addRow(row);
                // hiển thị dữ liệu lên bảng
                Table_Data.setModel(table);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        GD_TrangChu main; // khai báo biến
        main = new GD_TrangChu();
        main.setVisible(true); // hiển thị form main
        this.dispose(); // ẩn form thêm sinh viên
    }//GEN-LAST:event_btn_ThoatActionPerformed

    private void btn_LuuMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuMonHocActionPerformed
        if (KiemTraTT() == true) {
            JOptionPane.showMessageDialog(null, "Yêu Cầu Nhập Đầy Đủ Thông Tin Của Môn Học", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            try {
                MonHoc MH = new MonHoc();
                MH.setMaMH(txt_MaMH.getText());
                MH.setTenMH(txt_TenMH.getText());
                MH.setSoTC(Integer.parseInt(txt_SoTC.getText()));
                MH.setHocKy(Integer.parseInt(txt_HocKy.getText()));

                mh.ThemMonHoc(MH);
                JOptionPane.showMessageDialog(this, "Thêm Môn Học Thành Công");
                Load_Data();
                Reset_Form();
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_btn_LuuMonHocActionPerformed

    private void btn_NhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhapLaiActionPerformed
      Reset_Form();
    }//GEN-LAST:event_btn_NhapLaiActionPerformed

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
            java.util.logging.Logger.getLogger(V_ThemMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_ThemMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_ThemMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_ThemMonHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new V_ThemMonHoc().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(V_XoaSinhVien.class.getName()).log(Level.SEVERE, null, ex);

                }
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Data;
    private javax.swing.JButton btn_LuuMonHoc;
    private javax.swing.JButton btn_NhapLai;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_HocKy;
    private javax.swing.JTextField txt_MaMH;
    private javax.swing.JTextField txt_SoTC;
    private javax.swing.JTextField txt_TenMH;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    public boolean KiemTraTT() {
        if (txt_MaMH.getText().equals("") || txt_TenMH.getText().equals("") || txt_SoTC.getText().equals("") || txt_HocKy.equals("")) {
            return true;
        }
        return false;
    }

    public void Reset_Form() {
        txt_MaMH.setText("");
        txt_TenMH.setText("");
        txt_SoTC.setText("");
        txt_HocKy.setText("");
    }
}
