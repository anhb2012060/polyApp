/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.DatabaseHelper;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;
import model.SinhVien;

/**
 *
 * @author OS
 */
public class SinhVienDao {
    public static boolean insertStudent(SinhVien sv){
        String sql = "insert into sinhvien(masinhvien,hoten,email,sodienthoai,gioitinh,diachi,hinh) values (?,?,?,?,?,?,?)";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sv.getMaSinhVien());
            pstmt.setString(2, sv.getHoTen());
            pstmt.setString(3, sv.getEmail());
            pstmt.setString(4, sv.getSoDienThoai());
            pstmt.setInt(5, sv.getGioiTinh());
            pstmt.setString(6, sv.getDiaChi());
            if(sv.getHinh()!=null){
                Blob hinh = new SerialBlob(sv.getHinh());
                pstmt.setBlob(7, hinh);
            } else {
                Blob hinh = null;
                pstmt.setBlob(7, hinh);
            }
            return pstmt.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static SinhVien findByIdStudent(String maSinhVien){
        String sql = "select * from sinhvien where masinhvien = ?";
        try {
            Connection con  = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maSinhVien);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                SinhVien sv = createSinhVien(rs);
                return sv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static List<SinhVien> findAll(){
        String sql = "select * from sinhvien";
        try {
            Connection con  = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            List<SinhVien> list = new ArrayList<>();
            while(rs.next()){
                SinhVien sv = createSinhVien(rs);
                list.add(sv);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    } 

    private static SinhVien createSinhVien(ResultSet rs) throws SQLException {
        SinhVien sv = new SinhVien();
        sv.setMaSinhVien(rs.getString(1));
        sv.setHoTen(rs.getString(2));
        sv.setEmail(rs.getString(3));
        sv.setSoDienThoai(rs.getString(4));
        sv.setGioiTinh(rs.getInt(5));
        sv.setDiaChi(rs.getString(6));
        Blob blob =  rs.getBlob("hinh");
        if(blob != null){
            sv.setHinh(blob.getBytes(1, (int) blob.length()));
        }
        return sv;
    }
    
    public static boolean updateStudent(SinhVien sv){
        String sql = "update sinhvien set hoten = ?, email = ?, sodienthoai = ?, gioitinh = ?, diachi = ?, hinh = ? where masinhvien = ?";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, sv.getHoTen());
            pstmt.setString(2, sv.getEmail());
            pstmt.setString(3, sv.getSoDienThoai());
            pstmt.setInt(4, sv.getGioiTinh());
            pstmt.setString(5, sv.getDiaChi());
            if(sv.getHinh()!=null){
                Blob hinh = new SerialBlob(sv.getHinh());
                pstmt.setBlob(6, hinh);
            } else {
                Blob hinh = null;
                pstmt.setBlob(6, hinh);
            }
            pstmt.setString(7, sv.getMaSinhVien());
            return pstmt.executeUpdate()>0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteStudent(String maSinhVien){
        String sql = "delete from sinhvien where masinhvien = ?";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maSinhVien);
            return pstmt.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
