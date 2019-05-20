/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import DB_Connect.ConnectionDB;
import java.sql.*;

import entity.LopHoc;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HoangVanToan
 */
public class C_LopHoc {
    
    public C_LopHoc(){
    
    }
    
    public boolean ThemLopHoc(LopHoc LH) {
        try {
            // kết nối đến cơ sở dữ liệu
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            // thực hiện câu lệnh truy vấn để thêm mới sinh viên vào cơ sở dữ liệu
            PreparedStatement statementadd = conn.prepareStatement("INSERT INTO LopHoc(TenLop,Khoa,KhoaHoc) VALUES(?,?,?)");
            // lấy giá trị điền vào từ form thông tin sinh viên và lưu vào cơ sở dữ liệu
            statementadd.setString(1, LH.getTenLop());
            statementadd.setString(2, LH.getTenKhoa());
            statementadd.setString(3, LH.getKhoaHoc());
            // thực hiện câu lệnh truy vấn
            statementadd.execute();
            return true;
        
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(C_LopHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(C_LopHoc.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            return false;
   
    }
}
