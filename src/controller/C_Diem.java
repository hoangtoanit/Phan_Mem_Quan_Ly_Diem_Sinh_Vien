/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DB_Connect.ConnectionDB;
import java.sql.*;
import entity.Diem;
import model.M_Diem;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HoangVanToan
 */
public class C_Diem {
    
    public C_Diem() {
        
    }
    
    M_Diem diem = new M_Diem();
    
    public boolean ThemDiem(Diem D){
        return diem.Create_Diem(D);
    }
        
    public boolean SuaDiem(Diem D){
        return diem.Update_Diem(D);
    }
}
