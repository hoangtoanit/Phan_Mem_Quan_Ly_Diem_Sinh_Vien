/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author HoangVanToan
 */
// import thư viện và các form cần sử dụng
import view.V_BanQuyen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.V_DangNhap;
import view.V_ThayDoiMatKhau;
import view.V_ThemDiem;
import view.V_ThemLop;
import view.V_ThemMonHoc;
import view.V_ThemSinhVien;
import view.V_ThemTaiKhoan;
import view.V_XoaDiem;
import view.V_XoaLop;
import view.V_XoaMonHoc;
import view.V_SuaSinhVien;
import view.V_XoaSinhVien;
import view.V_XoaTaiKhoan;
import view.V_SuaDiem;
import view.V_SuaLop;
import view.V_SuaMonHoc;
import view.V_SuaTaiKhoan;
import view.V_TimKiemMonHoc;
import view.V_TimKiemSinhVien;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GD_TrangChu extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form frm_main
     */
    public GD_TrangChu() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Phần Mềm Quản Lý Điểm Sinh Viên");
        Item_ThemSinhVien.addActionListener(this);
        Item_SuaTTSinhVien.addActionListener(this);
        Item_XoaSinhVien.addActionListener(this);
        Item_ThemMonHoc.addActionListener(this);
        Item_SuaTTMonHoc.addActionListener(this);
        Item_XoaMonHoc.addActionListener(this);
        Item_ThemDiem.addActionListener(this);
        Item_SuaTTDiem.addActionListener(this);
        Item_XoaDiem.addActionListener(this);
        Item_ThemLopHoc.addActionListener(this);
        Item_SuaTTLopHoc.addActionListener(this);
        Item_XoaLopHoc.addActionListener(this);
        Item_ThemLopHoc.addActionListener(this);
        Item_SuaTTLopHoc.addActionListener(this);
        Item_XoaLopHoc.addActionListener(this);
        Item_ThemTaiKhoan.addActionListener(this);
        Item_SuaTTTaiKhoan.addActionListener(this);
        Item_XoaTaiKhoan.addActionListener(this);
       
        
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        Item_ThemTaiKhoan = new javax.swing.JMenuItem();
        Item_SuaTTTaiKhoan = new javax.swing.JMenuItem();
        Item_XoaTaiKhoan = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Item_ThemSinhVien = new javax.swing.JMenuItem();
        Item_SuaTTSinhVien = new javax.swing.JMenuItem();
        Item_XoaSinhVien = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Item_ThemMonHoc = new javax.swing.JMenuItem();
        Item_SuaTTMonHoc = new javax.swing.JMenuItem();
        Item_XoaMonHoc = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        Item_ThemDiem = new javax.swing.JMenuItem();
        Item_SuaTTDiem = new javax.swing.JMenuItem();
        Item_XoaDiem = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        Item_ThemLopHoc = new javax.swing.JMenuItem();
        Item_SuaTTLopHoc = new javax.swing.JMenuItem();
        Item_XoaLopHoc = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        menu_TKSV = new javax.swing.JMenuItem();
        menu_TKMH = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_thayDoiMK = new javax.swing.JMenu();
        menu_banquyen = new javax.swing.JMenu();
        cmd_thoat = new javax.swing.JMenu();

        jMenuItem16.setText("jMenuItem16");

        jMenuItem18.setText("jMenuItem18");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/KMA.jpg"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 51, 51));
        jMenuBar1.setToolTipText("");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Quản Lý.png"))); // NOI18N
        jMenu6.setText("Quản Trị Hệ Thống");

        jMenu9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Người Dùng.png"))); // NOI18N
        jMenu9.setText("Quản Lý Tài Khoản");

        Item_ThemTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Thêm.png"))); // NOI18N
        Item_ThemTaiKhoan.setText("Thêm Tài Khoản");
        Item_ThemTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ThemTaiKhoanActionPerformed(evt);
            }
        });
        jMenu9.add(Item_ThemTaiKhoan);

        Item_SuaTTTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sửa.png"))); // NOI18N
        Item_SuaTTTaiKhoan.setText("Sửa Thông Tin Tài Khoản");
        Item_SuaTTTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SuaTTTaiKhoanActionPerformed(evt);
            }
        });
        jMenu9.add(Item_SuaTTTaiKhoan);

        Item_XoaTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Xóa.png"))); // NOI18N
        Item_XoaTaiKhoan.setText("Xóa Tài Khoản");
        Item_XoaTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_XoaTaiKhoanActionPerformed(evt);
            }
        });
        jMenu9.add(Item_XoaTaiKhoan);

        jMenu6.add(jMenu9);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Phân Quyền.png"))); // NOI18N
        jMenuItem2.setText("Phân Quyền Người Dùng");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar1.add(jMenu6);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Quản Lý.png"))); // NOI18N
        jMenu1.setText("Quản Lý Chức Năng");

        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sinh Viên.png"))); // NOI18N
        jMenu4.setText("Sinh Viên ");

        Item_ThemSinhVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        Item_ThemSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Thêm.png"))); // NOI18N
        Item_ThemSinhVien.setText("Thêm Sinh Viên");
        Item_ThemSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ThemSinhVienActionPerformed(evt);
            }
        });
        jMenu4.add(Item_ThemSinhVien);

        Item_SuaTTSinhVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        Item_SuaTTSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sửa.png"))); // NOI18N
        Item_SuaTTSinhVien.setText("Sửa Thông Tin Sinh Viên");
        Item_SuaTTSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SuaTTSinhVienActionPerformed(evt);
            }
        });
        jMenu4.add(Item_SuaTTSinhVien);

        Item_XoaSinhVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        Item_XoaSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Xóa.png"))); // NOI18N
        Item_XoaSinhVien.setText("Xóa Sinh Viên");
        Item_XoaSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_XoaSinhVienActionPerformed(evt);
            }
        });
        jMenu4.add(Item_XoaSinhVien);

        jMenu1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Môn Học.png"))); // NOI18N
        jMenu5.setText("Môn Học");

        Item_ThemMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Thêm.png"))); // NOI18N
        Item_ThemMonHoc.setText("Thêm Môn Học");
        Item_ThemMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ThemMonHocActionPerformed(evt);
            }
        });
        jMenu5.add(Item_ThemMonHoc);

        Item_SuaTTMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sửa.png"))); // NOI18N
        Item_SuaTTMonHoc.setText("Sửa Thông Tin Môn Học");
        Item_SuaTTMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SuaTTMonHocActionPerformed(evt);
            }
        });
        jMenu5.add(Item_SuaTTMonHoc);

        Item_XoaMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Xóa.png"))); // NOI18N
        Item_XoaMonHoc.setText("Xóa Môn Học");
        Item_XoaMonHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_XoaMonHocActionPerformed(evt);
            }
        });
        jMenu5.add(Item_XoaMonHoc);

        jMenu1.add(jMenu5);

        jMenu7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Điểm.png"))); // NOI18N
        jMenu7.setText("Điểm");

        Item_ThemDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Thêm.png"))); // NOI18N
        Item_ThemDiem.setText("Thêm Điểm");
        Item_ThemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ThemDiemActionPerformed(evt);
            }
        });
        jMenu7.add(Item_ThemDiem);

        Item_SuaTTDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sửa.png"))); // NOI18N
        Item_SuaTTDiem.setText("Sửa Thông Tin Điểm");
        Item_SuaTTDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SuaTTDiemActionPerformed(evt);
            }
        });
        jMenu7.add(Item_SuaTTDiem);

        Item_XoaDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Xóa.png"))); // NOI18N
        Item_XoaDiem.setText("Xóa Điểm");
        Item_XoaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_XoaDiemActionPerformed(evt);
            }
        });
        jMenu7.add(Item_XoaDiem);

        jMenu1.add(jMenu7);

        jMenu8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lớp.png"))); // NOI18N
        jMenu8.setText("Lớp Học");

        Item_ThemLopHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, 0));
        Item_ThemLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Thêm.png"))); // NOI18N
        Item_ThemLopHoc.setText("Thêm Lớp Học");
        Item_ThemLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ThemLopHocActionPerformed(evt);
            }
        });
        jMenu8.add(Item_ThemLopHoc);

        Item_SuaTTLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sửa.png"))); // NOI18N
        Item_SuaTTLopHoc.setText("Sửa Thông Tin Lớp Học");
        Item_SuaTTLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_SuaTTLopHocActionPerformed(evt);
            }
        });
        jMenu8.add(Item_SuaTTLopHoc);

        Item_XoaLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Xóa.png"))); // NOI18N
        Item_XoaLopHoc.setText("Xóa Lớp Học");
        Item_XoaLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_XoaLopHocActionPerformed(evt);
            }
        });
        jMenu8.add(Item_XoaLopHoc);

        jMenu1.add(jMenu8);

        jMenuBar1.add(jMenu1);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tìm Kiếm.png"))); // NOI18N
        jMenu10.setText("Tìm Kiếm Thông Tin ");

        menu_TKSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sinh Viên.png"))); // NOI18N
        menu_TKSV.setText("Tìm Kiếm Sinh Viên");
        menu_TKSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_TKSVActionPerformed(evt);
            }
        });
        jMenu10.add(menu_TKSV);

        menu_TKMH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Môn Học.png"))); // NOI18N
        menu_TKMH.setText("Tìm Kiếm Môn Học");
        menu_TKMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_TKMHActionPerformed(evt);
            }
        });
        jMenu10.add(menu_TKMH);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Điểm.png"))); // NOI18N
        jMenuItem1.setText("Tìm Kiếm Điểm Sinh Viên");
        jMenu10.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lớp.png"))); // NOI18N
        jMenuItem3.setText("Tìm Kiếm Lớp Học");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem3);

        jMenuBar1.add(jMenu10);

        menu_thayDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Thay Đổi Mật Khẩu.png"))); // NOI18N
        menu_thayDoiMK.setText("Thay Đổi Mật Khẩu");
        menu_thayDoiMK.setToolTipText("");
        menu_thayDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_thayDoiMKMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_thayDoiMK);

        menu_banquyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bản Quyền.png"))); // NOI18N
        menu_banquyen.setText("Bản quyển");
        menu_banquyen.setToolTipText("");
        menu_banquyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_banquyenMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_banquyen);

        cmd_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout-icon.png"))); // NOI18N
        cmd_thoat.setText("Thoát");
        cmd_thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmd_thoatMouseClicked(evt);
            }
        });
        jMenuBar1.add(cmd_thoat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // hiển thị form Thêm Sinh Viên
    private void Item_ThemSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ThemSinhVienActionPerformed

        // khai báo biến
        V_ThemSinhVien addSinhVien;

        try {
            addSinhVien = new V_ThemSinhVien();
            addSinhVien.setVisible(true); // hiển thị form thêm sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_ThemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Mời Bạn Thêm Thông Tin Sinh Viên Vào Hệ Thống", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_ThemSinhVienActionPerformed
    // hiển thị form Sửa thông tin sinh viên
    private void Item_SuaTTSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SuaTTSinhVienActionPerformed
        // khai báo biến
        V_SuaSinhVien editSinhVien;
        try {
            editSinhVien = new V_SuaSinhVien();
            editSinhVien.setVisible(true); // hiển thị form sửa thông tin sinh viên
            this.dispose(); // ẩn form main

        } catch (Exception ex) {
            Logger.getLogger(V_ThemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Lựa Chọn Sinh Viên Và Sửa Thông Tin Cần Thay Đổi", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_SuaTTSinhVienActionPerformed

    // hiển thị form Xóa sinh viên
    private void Item_XoaSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_XoaSinhVienActionPerformed
        // khai báo biến
        V_XoaSinhVien deleteSinhVien;
        try {
            deleteSinhVien = new V_XoaSinhVien();
            deleteSinhVien.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_ThemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Lựa Chọn Sinh Viên Cần Xóa", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_XoaSinhVienActionPerformed

    private void Item_ThemMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ThemMonHocActionPerformed
        // TODO add your handling code here:
        V_ThemMonHoc frm_addMonHoc;
        try {
            frm_addMonHoc = new V_ThemMonHoc();
            frm_addMonHoc.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_ThemMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Mời Bạn Thêm Thông Tin Môn Học Vào Hệ Thống", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_ThemMonHocActionPerformed

    private void Item_ThemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ThemDiemActionPerformed
        // TODO add your handling code here:
        V_ThemDiem frm_addDiem;
        try {
            frm_addDiem = new V_ThemDiem();
            frm_addDiem.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_ThemDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Mời Bạn Thêm Thông Tin Điểm Vào Hệ Thống", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_ThemDiemActionPerformed

    private void Item_XoaTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_XoaTaiKhoanActionPerformed
        // TODO add your handling code here:
        V_XoaTaiKhoan deleteTaiKhoan;
        try {
            deleteTaiKhoan = new V_XoaTaiKhoan();
            deleteTaiKhoan.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_XoaTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Lựa Chọn Tài Khoản Cần Xóa", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_XoaTaiKhoanActionPerformed

    private void Item_ThemTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ThemTaiKhoanActionPerformed
        // TODO add your handling code here:
         V_ThemTaiKhoan addTaiKhoan;

        try {
            addTaiKhoan = new V_ThemTaiKhoan();
            addTaiKhoan.setVisible(true); // hiển thị form thêm sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_ThemTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Mời Bạn Thêm Thông Tin Tài Khoản Vào Hệ Thống", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_ThemTaiKhoanActionPerformed

    private void cmd_thoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmd_thoatMouseClicked
        V_DangNhap frm_login;
        try {
            frm_login = new V_DangNhap();
            frm_login.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(GD_TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmd_thoatMouseClicked

    private void menu_banquyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_banquyenMouseClicked
        V_BanQuyen frmsv;
        frmsv = new V_BanQuyen();
        frmsv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menu_banquyenMouseClicked

    private void menu_thayDoiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_thayDoiMKMouseClicked
        // TODO add your handling code here:
        V_ThayDoiMatKhau frmsv;
        frmsv = new V_ThayDoiMatKhau();
        frmsv.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_menu_thayDoiMKMouseClicked

    private void menu_TKSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_TKSVActionPerformed
        // TODO add your handling code here:
        V_TimKiemSinhVien searchSinhVien;

        try {
            searchSinhVien = new V_TimKiemSinhVien();
            searchSinhVien.setVisible(true); // hiển thị form thêm sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_TimKiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_TKSVActionPerformed

    private void menu_TKMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_TKMHActionPerformed
        // TODO add your handling code here:
        V_TimKiemMonHoc searchMonHoc;

        try {
            searchMonHoc = new V_TimKiemMonHoc();
            searchMonHoc.setVisible(true); // hiển thị form thêm sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_TimKiemMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_TKMHActionPerformed

    private void Item_SuaTTLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SuaTTLopHocActionPerformed
        // TODO add your handling code here:
        V_SuaLop frm_editLop;
        try {
            frm_editLop = new V_SuaLop();
            frm_editLop.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_SuaLop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Item_SuaTTLopHocActionPerformed

    private void Item_SuaTTMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SuaTTMonHocActionPerformed
        // TODO add your handling code here:
        V_SuaMonHoc frm_editMonHoc;
        try {
            frm_editMonHoc = new V_SuaMonHoc();
            frm_editMonHoc.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_SuaMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Item_SuaTTMonHocActionPerformed

    private void Item_XoaMonHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_XoaMonHocActionPerformed
        // TODO add your handling code here:
        V_XoaMonHoc frm_deleteMonHoc;
        try {
            frm_deleteMonHoc = new V_XoaMonHoc();
            frm_deleteMonHoc.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_XoaMonHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Item_XoaMonHocActionPerformed

    private void Item_SuaTTDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SuaTTDiemActionPerformed
        // TODO add your handling code here:
        V_SuaDiem frm_editDiem;
        try {
            frm_editDiem = new V_SuaDiem();
            frm_editDiem.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_SuaDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Item_SuaTTDiemActionPerformed

    private void Item_XoaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_XoaDiemActionPerformed
        // TODO add your handling code here:
        V_XoaDiem frm_deleteDiem;
        try {
            frm_deleteDiem = new V_XoaDiem();
            frm_deleteDiem.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_XoaDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Item_XoaDiemActionPerformed

    private void Item_ThemLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ThemLopHocActionPerformed
        // TODO add your handling code here:
        V_ThemLop frm_addLop;
        try {
            frm_addLop = new V_ThemLop();
            frm_addLop.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_ThemLop.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Mời Bạn Thêm Lớp Học Vào Hệ Thống ", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_ThemLopHocActionPerformed

    private void Item_XoaLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_XoaLopHocActionPerformed
        // TODO add your handling code here:
        V_XoaLop frm_deleteLop;
        try {
            frm_deleteLop = new V_XoaLop();
            frm_deleteLop.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_XoaLop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Item_XoaLopHocActionPerformed

    private void Item_SuaTTTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_SuaTTTaiKhoanActionPerformed
        // TODO add your handling code here:
        V_SuaTaiKhoan frm_editTaiKhoan;
        try {
            frm_editTaiKhoan = new V_SuaTaiKhoan();
            frm_editTaiKhoan.setVisible(true); // hiển thị form xóa sinh viên
            this.dispose(); // ẩn form main
        } catch (Exception ex) {
            Logger.getLogger(V_SuaTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Lựa Chọn Tài Khoản Và Sửa Thông Tin Cần Thay Đổi", "Thông Báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_Item_SuaTTTaiKhoanActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(GD_TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GD_TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GD_TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GD_TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GD_TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Item_SuaTTDiem;
    private javax.swing.JMenuItem Item_SuaTTLopHoc;
    private javax.swing.JMenuItem Item_SuaTTMonHoc;
    private javax.swing.JMenuItem Item_SuaTTSinhVien;
    private javax.swing.JMenuItem Item_SuaTTTaiKhoan;
    private javax.swing.JMenuItem Item_ThemDiem;
    private javax.swing.JMenuItem Item_ThemLopHoc;
    private javax.swing.JMenuItem Item_ThemMonHoc;
    private javax.swing.JMenuItem Item_ThemSinhVien;
    private javax.swing.JMenuItem Item_ThemTaiKhoan;
    private javax.swing.JMenuItem Item_XoaDiem;
    private javax.swing.JMenuItem Item_XoaLopHoc;
    private javax.swing.JMenuItem Item_XoaMonHoc;
    private javax.swing.JMenuItem Item_XoaSinhVien;
    private javax.swing.JMenuItem Item_XoaTaiKhoan;
    private javax.swing.JMenu cmd_thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menu_TKMH;
    private javax.swing.JMenuItem menu_TKSV;
    private javax.swing.JMenu menu_banquyen;
    private javax.swing.JMenu menu_thayDoiMK;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

}
