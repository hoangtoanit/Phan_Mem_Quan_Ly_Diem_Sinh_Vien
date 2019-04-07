/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import DB_Connect.ConnectionDB;
import entity.SinhVien;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoangVanToan
 */
public class M_SinhVien {

    public M_SinhVien() {

    }

    //Hàm xử lý chức năng thêm sinh viên
    public boolean Create_SinhVien(SinhVien SV) {

        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();

            PreparedStatement addSinhVien = conn.prepareStatement("INSERT INTO SinhVien(MaSV,HoTenSV,NgaySinh,GioiTinh,DiaChi,TenLop,Email,SoDienThoai) VALUES (?,?,?,?,?,?,?,?)");

            addSinhVien.setString(1, SV.getMaSV());
            addSinhVien.setString(2, SV.getHoTenSV());
            addSinhVien.setString(3, SV.getNgaySinh());
            addSinhVien.setString(4, SV.getGioiTinh());
            addSinhVien.setString(5, SV.getDiaChi());
            addSinhVien.setString(6, SV.getTenLop());
            addSinhVien.setString(7, SV.getEmail());
            addSinhVien.setString(8, SV.getSoDienThoai());

            addSinhVien.execute();
            return true;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(M_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(M_SinhVien.class.getName()).log(Level.SEVERE, null, ex);

        }

        return false;

    }

    //Hàm xử lý chức năng Sửa Thông Tin Sinh Viên
    public boolean Update_SinhVien(SinhVien SV) {
        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();

            PreparedStatement updateSinhVien = conn.prepareStatement("UPDATE SinhVien SET HoTenSV = ?, NgaySinh = ?, GioiTinh= ?, DiaChi = ?, TenLop = ?, Email = ?, SoDienThoai = ? WHERE MaSV = ?");

            updateSinhVien.setString(1, SV.getHoTenSV());
            updateSinhVien.setString(2, SV.getNgaySinh());
            updateSinhVien.setString(3, SV.getGioiTinh());
            updateSinhVien.setString(4, SV.getDiaChi());
            updateSinhVien.setString(5, SV.getTenLop());
            updateSinhVien.setString(6, SV.getEmail());
            updateSinhVien.setString(7, SV.getSoDienThoai());
            updateSinhVien.setString(8, SV.getMaSV());

            updateSinhVien.execute();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(M_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(M_SinhVien.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

    //Hàm xử lý chức năng Xóa Sinh Viên
    public boolean Delete_SinhVien(SinhVien SV) {
        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();

            PreparedStatement deleteSinhVien = conn.prepareStatement("DELETE FROM SinhVien WHERE MaSV = ?");

            deleteSinhVien.setString(1, SV.getMaSV());

            deleteSinhVien.execute();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(M_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(M_SinhVien.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;

    }

}
