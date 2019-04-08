/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.TaiKhoan;
import java.sql.*;
import DB_Connect.ConnectionDB;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HoangVanToan
 */
public class M_TaiKhoan {
    
    public M_TaiKhoan() {
        
    }
    
    public boolean getLogin(String username, String password){
        try {
            Connection conn = null;
            
            conn = ConnectionDB.getConnectionDB();
            
            PreparedStatement pr = conn.prepareStatement("SELECT * FROM TaiKhoan WHERE Username = ? and Password = ?");
            pr.setString(1, username);
            pr.setString(2, password);
            
            ResultSet rs = pr.executeQuery();
             if (rs != null && rs.next()) {
                return true;
            }
         
        } catch (Exception e) {
            
        }
        return false;
       
    }
    
    //Hàm xử lý chức năng thêm tài khoản 
    public boolean Create_TaiKhoan(TaiKhoan TK){
        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            
            PreparedStatement addTaiKhoan = conn.prepareStatement("INSERT INTO TaiKhoan(Username, Password) VALUES(?,?)");
            
            addTaiKhoan.setString(1,TK.getUsername());
            addTaiKhoan.setString(2, TK.getPassword());
            
            addTaiKhoan.execute();
            addTaiKhoan.close();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(M_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(M_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }
    
    //Hàm xử lý chức năng xóa tài khoản
    public boolean Delete_TaiKhoan(TaiKhoan TK){
        try {
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            
            PreparedStatement deleteTaiKhoan = conn.prepareStatement("DELETE FROM TaiKhoan Where Username = ?");
            
            deleteTaiKhoan.setString(1, TK.getUsername());
            deleteTaiKhoan.execute();
            
            deleteTaiKhoan.close();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(M_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(M_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
        
    }
    
}
