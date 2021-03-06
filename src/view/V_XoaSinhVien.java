/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author HoangVanToan
 */
// import các thư viện và form hiển thị 
import DB_Connect.ConnectionDB;
import DB_Connect.Test_ConnectionDB;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.*;
import main.GD_TrangChu;
import controller.C_SinhVien;
import entity.SinhVien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class V_XoaSinhVien extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form frm_deleteSinhVien
     */
    C_SinhVien SinhVien = new C_SinhVien();

    SinhVien SV = new SinhVien();

    public V_XoaSinhVien() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        btn_XoaSinhVien.addActionListener(this);
        btn_Thoat.addActionListener(this);
        setTitle("Xóa Sinh Viên");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Data = new javax.swing.JTable();
        btn_XoaSinhVien = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo KMA.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 102));
        jLabel5.setText("XÓA SINH VIÊN");

        Table_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sinh Viên", "Họ Tên Sinh Viên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Tên Lớp", "Email", "Số Điện Thoại"
            }
        ));
        jScrollPane1.setViewportView(Table_Data);

        btn_XoaSinhVien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_XoaSinhVien.setForeground(new java.awt.Color(255, 0, 51));
        btn_XoaSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Xóa.png"))); // NOI18N
        btn_XoaSinhVien.setText("XÓA SINH VIÊN");
        btn_XoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaSinhVienActionPerformed(evt);
            }
        });

        btn_Thoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Thoát.png"))); // NOI18N
        btn_Thoat.setText("Thoát");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("BẢNG DANH SÁCH SINH VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btn_XoaSinhVien)
                        .addGap(89, 89, 89)
                        .addComponent(btn_Thoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_XoaSinhVien)
                    .addComponent(btn_Thoat))
                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        GD_TrangChu TrangChu;
        try {
            TrangChu = new GD_TrangChu();
            TrangChu.setVisible(true); // hiển thị form thêm sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_XoaSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ThoatActionPerformed
    // hàm xóa sinh viên


    private void btn_XoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaSinhVienActionPerformed
        SV.getMaSV();

        //hiển thị thông báo hỏi 
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn Có Chắc Chắn Muốn Xóa Sinh Viên Không?","Thông Báo",JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            if (SinhVien.XoaSinhVien(SV)) {//gửi mã sinh viên sang class M_Diem trong model
                Load_Data();//load lại form
                 JOptionPane.showMessageDialog(this, "Xóa Sinh Viên Thành Công");
                
            } else {
                JOptionPane.showMessageDialog(this, "Xóa Sinh Viên Thất Bại");//thông báo khi xóa dữ liệu thất bại
            }
        }


    }//GEN-LAST:event_btn_XoaSinhVienActionPerformed

    private DefaultTableModel table = new DefaultTableModel();

    // hàm xử lý Hiển thị dữ liệu lên Table
    public void Load_Data() {
        // kết nối đến cơ sở dữ liệu
        Connection conn = null;
        Statement stm = null;

        table = new DefaultTableModel();
        // đặt tiêu đề cho các cột trong bảng
        table.addColumn("Mã Sinh Viên");
        table.addColumn("Họ Tên Sinh Viên");
        table.addColumn("Ngày Sinh");
        table.addColumn("Giới Tính");
        table.addColumn("Địa Chỉ");
        table.addColumn("Tên Lớp");
        table.addColumn("Email");
        table.addColumn("Số Điện Thoại");

        // thực hiện câu lệnh truy vấn đến bảng sinh viên
        String SQLSelectTable = "SELECT * FROM SinhVien";
        try {
            conn = ConnectionDB.getConnectionDB();
            // khởi tạo đối tượng statement
            stm = conn.createStatement();
            // thực hiện truy vấn để lấy ra dữ liệu
            ResultSet kq = stm.executeQuery(SQLSelectTable);
            while (kq.next()) {
                // lấy dữ liệu ở các cột trong table SinhVien
                String MaSV = kq.getString("MaSV");
                String HoTenSV = kq.getString("HoTenSV");
                String NgaySinh = kq.getString("NgaySinh");
                String GioiTinh;
                if (kq.getString("GioiTinh").equals("Nam")) {
                    GioiTinh = "Nam";
                } else {
                    GioiTinh = "Nữ";
                }

                String DiaChi = kq.getString("DiaChi");
                String TenLop = kq.getString("TenLop");
                String Email = kq.getString("Email");
                String SoDienThoai = kq.getString("SoDienThoai");

                // khai báo và sử dụng class Vector
                Vector row = new Vector();
                row.addElement(MaSV);
                row.addElement(HoTenSV);
                row.addElement(NgaySinh);
                row.addElement(GioiTinh);
                row.addElement(DiaChi);
                row.addElement(TenLop);
                row.addElement(Email);
                row.addElement(SoDienThoai);

                // gán giá trị của sinhvien vào các cột tương ứng
                table.addRow(row);
                // hiển thị dữ liệu lên bảng

            }
            Table_Data.setModel(table);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Table_Data.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (Table_Data.getSelectedRow() >= 0) {
                    SV.setMaSV(Table_Data.getValueAt(Table_Data.getSelectedRow(), 0).toString());
                }
            }

        });
    }

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
            java.util.logging.Logger.getLogger(V_XoaSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_XoaSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_XoaSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_XoaSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new V_XoaSinhVien().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(V_XoaSinhVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Data;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_XoaSinhVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
