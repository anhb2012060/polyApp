/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NguoiDung;

/**
 *
 * @author OS
 */
public class NguoiDungDao {
    public static NguoiDung checkLogin(String username, String password){
        String sql = "select TenDangNhap, MatKhau, VaiTro from nguoidung where TenDangNhap = ? and MatKhau = ?";
        try {
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                NguoiDung nd = new NguoiDung();
                nd.setTenDangNhap(username);
                nd.setVaiTro(rs.getString("VaiTro"));
                return nd;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
}
