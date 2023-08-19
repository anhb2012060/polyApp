/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author OS
 */
public class BangDiem {
    private int ma;
    private String maSinhVien;
    private float tiengAnh, tinHoc, GDTC;

    public BangDiem() {
    }

    public BangDiem(int ma, String maSinhVien, float tiengAnh, float tinHoc, float GDTC) {
        this.ma = ma;
        this.maSinhVien = maSinhVien;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public float getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(float tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public float getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }

    public float getGDTC() {
        return GDTC;
    }

    public void setGDTC(float GDTC) {
        this.GDTC = GDTC;
    }
    
    public float diemTrungBinh(){
        return (this.tiengAnh + this.tinHoc + this.GDTC)/3;
    }
}
