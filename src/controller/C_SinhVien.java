/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DB_Connect.ConnectionDB;
import java.sql.*;

import entity.SinhVien;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author HoangVanToan
 */

public class C_SinhVien {
    
    public C_SinhVien(){
        
    }

    // xử lý chức năng Thêm thông tin Sinh Viên
    public boolean ThemSinhVien(SinhVien SV) {
        try {
            // kết nối đến cơ sở dữ liệu
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            // thực hiện câu lệnh truy vấn để thêm mới sinh viên vào cơ sở dữ liệu
            PreparedStatement statementadd = conn.prepareStatement("INSERT INTO SinhVien(MaSV,HoTenSV,NgaySinh,GioiTinh,DiaChi,TenLop,Email,SoDienThoai) VALUES(?,?,?,?,?,?,?,?)");
            // lấy giá trị điền vào từ form thông tin sinh viên và lưu vào cơ sở dữ liệu
            statementadd.setString(1, SV.getMaSV());
            statementadd.setString(2, SV.getHoTenSV());
            statementadd.setString(3, SV.getNgaySinh());
            statementadd.setString(4, SV.getGioiTinh());
            statementadd.setString(5, SV.getDiaChi());
            statementadd.setString(6, SV.getTenLop());
            statementadd.setString(7, SV.getEmail());
            statementadd.setString(8,SV.getSoDienThoai());
            // thực hiện câu lệnh truy vấn
            statementadd.execute();
            return true;
        
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(C_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(C_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            return false;
   
    }
    
    // xử lý chức năng Sửa thông tin Sinh Viên
    public boolean SuaTTSinhVien(SinhVien SV){
        try {
            // kết nối đến cơ sở dữ liệu
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            // thực hiện câu lệnh truy vấn để cập nhật thông tin vào cơ sở dữ liệu
            PreparedStatement statementupdate = conn.prepareStatement("UPDATE SinhVien SET HoTenSV = ?, NgaySinh = ?, GioiTinh = ?, DiaChi = ?, TenLop = ?, Email = ?, SoDienThoai = ? WHERE MaSV=?");
            statementupdate.setString(1, SV.getHoTenSV());
            statementupdate.setString(2, SV.getNgaySinh());
            statementupdate.setString(3, SV.getGioiTinh());
            statementupdate.setString(4, SV.getDiaChi());
            statementupdate.setString(5, SV.getTenLop());
            statementupdate.setString(6, SV.getEmail());
            statementupdate.setString(7,SV.getSoDienThoai());
            statementupdate.setString(8, SV.getMaSV());
            
            
            // thực hiện câu lệnh truy vấn
            statementupdate.execute();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(C_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(C_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
        
    }
    
     // xử lý chức năng Xóa Sinh Viên
    public boolean XoaSinhVien(SinhVien SV){
        try {
            // kết nối cơ sở dữ liệu
            Connection conn = null;
            conn = ConnectionDB.getConnectionDB();
            
            // thực hiện câu lệnh truy vấn để cập nhật thông tin vào cơ sở dữ liệu
            PreparedStatement statementdelete = conn.prepareStatement("DELETE FROM SinhVien Where MaSV=?");
            // tìm thấy mã sinh viên
            statementdelete.setString(1, SV.getMaSV());
            statementdelete.execute();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(C_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(C_SinhVien.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return false;
    }
    
    
       
}
