/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.MonHoc;
import model.M_MonHoc;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HoangVanToan
 */
public class C_MonHoc {

    public C_MonHoc() {

    }

    M_MonHoc mh = new M_MonHoc();

    //Hàm xử lý chức năng thêm môn học
    public boolean ThemMonHoc(MonHoc MH) {

        return mh.Create_MonHoc(MH);
    }

    //Hàm xử lý chức năng sửa thông tin môn học
    public boolean SuaTTMonHoc(MonHoc MH) {
        return mh.Update_MonHoc(MH);
    }

    //Hàm xử lý chức năng xóa môn học
    public boolean XoaMonHoc(MonHoc MH) {
        return mh.Delete_MonHoc(MH);
    }
}
