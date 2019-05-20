/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DB_Connect.ConnectionDB;
import java.sql.*;
import entity.Diem;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HoangVanToan
 */
public class C_Diem {
    
    public C_Diem() {
        
    }
    
    public boolean ThemDiem(Diem D) {
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
        } catch (Exception e) {
            
        }
        
        return false;
    }
    
}
