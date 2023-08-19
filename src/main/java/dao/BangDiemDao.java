/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BangDiem;

/**
 *
 * @author OS
 */
public class BangDiemDao {
    public static BangDiem findById(String maSinhVien){
        String sql = "select * from ketqua where masinhvien = ? ";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maSinhVien);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                BangDiem bangDiem = createBangDiem(rs);
                return bangDiem;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<BangDiem> findAll(){
        String sql = "select * from ketqua";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            List<BangDiem> list = new ArrayList<>();
            while(rs.next()){
                BangDiem bangDiem = createBangDiem(rs);
                list.add(bangDiem);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static List<BangDiem> findTopBangDiem(int soluong){
        String sql = "SELECT *, (tienganh + tinhoc + gdtc) / 3 AS tb FROM ketqua ORDER BY tb DESC LIMIT ?";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, soluong);
            ResultSet rs = pstmt.executeQuery();
            List<BangDiem> list = new ArrayList<>();
            while(rs.next()){
                BangDiem bangDiem = createBangDiem(rs);
                list.add(bangDiem);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private static BangDiem createBangDiem(ResultSet rs) throws SQLException {
        BangDiem bangDiem = new BangDiem();
        bangDiem.setMa(rs.getInt(1));
        bangDiem.setMaSinhVien(rs.getString(2));
        bangDiem.setTiengAnh(rs.getFloat(3));
        bangDiem.setTinHoc(rs.getFloat(4));
        bangDiem.setGDTC(rs.getFloat(5));
        return bangDiem;
    }
    
    public static boolean saveBangDiem(BangDiem bangDiem){
        String sql = "insert into ketqua(masinhvien,tienganh,tinhoc,gdtc) values (?,?,?,?)";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, bangDiem.getMaSinhVien());
            pstmt.setFloat(2, bangDiem.getTiengAnh());
            pstmt.setFloat(3, bangDiem.getTinHoc());
            pstmt.setFloat(4, bangDiem.getGDTC());
            
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean updateBangDiem(BangDiem bangDiem){
        String sql = "update ketqua set tienganh = ?, tinhoc = ?, gdtc = ? where masinhvien = ?";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setFloat(1, bangDiem.getTiengAnh());
            pstmt.setFloat(2, bangDiem.getTinHoc());
            pstmt.setFloat(3, bangDiem.getGDTC());
            pstmt.setString(4, bangDiem.getMaSinhVien());
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteBangDiem(String maSinhVien){
        String sql = "delete from ketqua where masinhvien = ?";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, maSinhVien);
            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
