/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author LINNGUYEN
 */
public class Song {
    private int id;
    private String tenBaiHat;
    private String tacGia;
    private int luotNghe;
    private String xepHang;

    public Song(int id, String tenBaiHat, String tacGia, int luotNghe, String xepHang) {
        this.id = id;
        this.tenBaiHat = tenBaiHat;
        this.tacGia = tacGia;
        this.luotNghe = luotNghe;
        this.xepHang = xepHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getLuotNghe() {
        return luotNghe;
    }

    public void setLuotNghe(int luotNghe) {
        this.luotNghe = luotNghe;
    }

    public String getXepHang() {
        return xepHang;
    }

    public void setXepHang(String xepHang) {
        this.xepHang = xepHang;
    }
    
    
}
