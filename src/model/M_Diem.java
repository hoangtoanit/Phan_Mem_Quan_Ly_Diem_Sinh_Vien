/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DB_Connect.ConnectionDB;
import java.sql.*;
import entity.Diem;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HoangVanToan
 */
public class M_Diem {
    public M_Diem() {
        
    }
    
    public boolean Create_Diem(Diem D) {
        try {
            //kết nối đến cơ sở dữ liệu
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            
            //thực hiện câu lệnh truy vấn để thêm điểm vào cơ sở dữ liệu
            PreparedStatement statement = conn.prepareStatement("INSERT INTO Diem(MaSV,MaMH,TP1,TP2,THI,TKHP,XepLoai) VALUES(?,?,?,?,?,?,?)");
            statement.setString(1, D.getMaSV());
            statement.setString(2, D.getMaMH());
            statement.setString(3, D.getTP1());
            statement.setString(4, D.getTP2());
            statement.setString(5, D.getTHI());
            statement.setString(6, D.getTKHP());
            statement.setString(7, D.getXepLoai());
            //thực hiện câu lệnh truy vấn
            statement.execute();
            return true;
        } catch (Exception e) {
            
        }
        
        return false;
    }
    
    public boolean Update_Diem(Diem D) {
        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            
            PreparedStatement statement = conn.prepareStatement("UPDATE Diem SET TP1 = ?, TP2 = ?, THI = ?, TKHP = ?, XepLoai = ? WHERE MaSV=? and MaMH=?");
            statement.setString(1, D.getTP1());
            statement.setString(2, D.getTP2());
            statement.setString(3, D.getTHI());
            statement.setString(4, D.getTKHP());
            statement.setString(5, D.getXepLoai());
            statement.setString(6, D.getMaSV());
            statement.setString(7, D.getMaMH());
            
            statement.execute();
            
        } catch (Exception e) {
        }
        return false;
    }
}
