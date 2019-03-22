/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DB_Connect.ConnectionDB;
import java.sql.*;
import entity.MonHoc;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoangVanToan
 */
public class C_MonHoc {

    public C_MonHoc() {

    }

    public boolean ThemMonHoc(MonHoc MH) {
        try {
            // kết nối đến cơ sở dữ liệu
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            // thực hiện câu lệnh truy vấn để thêm mới sinh viên vào cơ sở dữ liệu
            PreparedStatement statementadd = conn.prepareStatement("INSERT INTO MonHoc(MaMH,TenMH,SoTC) VALUES (?,?,?)");
            // lấy giá trị điền vào từ form thông tin sinh viên và lưu vào cơ sở dữ liệu
            statementadd.setString(1, MH.getMaMH());
            statementadd.setString(2, MH.getTenMH());
            statementadd.setInt(3, MH.getSoTC());

            statementadd.execute();
            return true;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(C_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(C_MonHoc.class.getName()).log(Level.SEVERE, null, ex);

        }

        return false;
    }
}
