/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Connect;
import java.sql.*;

/**
 *
 * @author HoangVanToan
 */

public class Test_ConnectionDB {
    static ConnectionDB connect = new ConnectionDB();
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = connect.getConnectionDB();
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM SinhVien";
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next()){
                System.out.println("MaSV: "+rs.getString(1)+ "\tHoTenSV: "+rs.getString(2)+ "\tNgaySinh: "+rs.getString(3)+ "\tGioiTinh: "+rs.getString(4)+ "\tDiaChi: "+rs.getString(5)+ "\tTenLop: "+rs.getString(6)+ "\tEmail: "+rs.getString(7)+ "\tSoDienThoai: "+rs.getString(8));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
