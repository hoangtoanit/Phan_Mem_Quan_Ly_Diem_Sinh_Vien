/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DB_Connect.ConnectionDB;
import java.sql.*;
import model.M_TaiKhoan;
import entity.TaiKhoan;

/**
 *
 * @author HoangVanToan
 */
public class C_TaiKhoan {

    public C_TaiKhoan() {

    }

    // Hàm xử lý chức năng đăng nhập
    public boolean getLogin(String username, String password) {
        boolean check = false;
        try {
            //Kết nối đến cơ sở dữ liệu
            Connection conn = null;

            conn = ConnectionDB.getConnectionDB();

            //Thực hiện câu lệnh truy vấn
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM TaiKhoan where username = ? and password = ?");

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs != null && rs.next()) {
                check = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;

    }
    M_TaiKhoan tk = new M_TaiKhoan();

    //Hàm xử lý chức năng thêm tài khoản
    public boolean ThemTaiKhoan(TaiKhoan TK) {

        return tk.Create_TaiKhoan(TK);
    }

    public boolean XoaTaiKhoan(TaiKhoan TK) {
        return tk.Delete_TaiKhoan(TK);
    }

}
