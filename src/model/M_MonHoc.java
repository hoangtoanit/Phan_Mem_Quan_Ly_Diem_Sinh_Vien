/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DB_Connect.ConnectionDB;
import java.sql.*;
import entity.MonHoc;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoangVanToan
 */
public class M_MonHoc {

    public M_MonHoc() {

    }

    //Hàm xử lý chức năng thêm môn học
    public boolean Create_MonHoc(MonHoc MH) {
        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();

            PreparedStatement addMonHoc = conn.prepareStatement("INSERT INTO MonHoc(MaMH,TenMH,SoTC,HocKy) VALUES (?,?,?,?)");
            addMonHoc.setString(1, MH.getMaMH());
            addMonHoc.setString(2, MH.getTenMH());
            addMonHoc.setInt(3, MH.getSoTC());
            addMonHoc.setInt(4, MH.getHocKy());

            addMonHoc.execute();
            addMonHoc.close();

            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(M_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(M_MonHoc.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;

    }

    //Hàm xử lý chức năng sửa thông tin môn học
    public boolean Update_MonHoc(MonHoc MH) {
        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();

            PreparedStatement updateMonHoc = conn.prepareStatement("UPDATE MonHoc SET TenMH = ?, SoTC = ?, HocKy = ? Where MaMH=?");
            updateMonHoc.setString(1, MH.getTenMH());
            updateMonHoc.setInt(2, MH.getSoTC());
            updateMonHoc.setInt(3, MH.getSoTC());
            updateMonHoc.setString(4, MH.getMaMH());

            updateMonHoc.execute();
            updateMonHoc.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(M_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(M_MonHoc.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

    //Hàm xử lý chức năng xóa môn học
    public boolean Delete_MonHoc(MonHoc MH) {
        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();

            PreparedStatement deleteMonHoc = conn.prepareStatement("DELETE FROM MonHoc WHERE MaMH = ?");
            deleteMonHoc.setString(1, MH.getMaMH());
            
            deleteMonHoc.execute();
            deleteMonHoc.close();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(M_MonHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(M_MonHoc.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }
}
