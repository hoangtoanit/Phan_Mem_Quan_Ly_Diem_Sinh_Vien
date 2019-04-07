/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.M_SinhVien;
import entity.SinhVien;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoangVanToan
 */
public class C_SinhVien {
    
    public C_SinhVien() {
        
    }
    M_SinhVien sv = new M_SinhVien();

    // xử lý chức năng Thêm thông tin Sinh Viên
    public boolean ThemSinhVien(SinhVien SV) {
        
        return sv.Create_SinhVien(SV);
    }

    // xử lý chức năng Sửa thông tin Sinh Viên
    public boolean SuaTTSinhVien(SinhVien SV) {
        
        return sv.Update_SinhVien(SV);
        
    }

    // xử lý chức năng Xóa Sinh Viên
    public boolean XoaSinhVien(SinhVien SV) {
        
        return sv.Delete_SinhVien(SV);
    }
    
}
