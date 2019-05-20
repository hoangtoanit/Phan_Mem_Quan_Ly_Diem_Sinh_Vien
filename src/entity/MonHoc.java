/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author HoangVanToan
 */
public class MonHoc extends SinhVien_MonHoc_Lop{

    private String TenMH;
    private Integer SoTC;
    private Integer HocKy;
    
    public MonHoc() {
        
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public Integer getSoTC() {
        return SoTC;
    }

    public void setSoTC(Integer SoTC) {
        this.SoTC = SoTC;
    }

    public Integer getHocKy() {
        return HocKy;
    }

    public void setHocKy(Integer HocKy) {
        this.HocKy = HocKy;
    }
    
    

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }
    
    

   
    
        
    
}
