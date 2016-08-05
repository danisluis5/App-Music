package model;

import bean.Song;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


import library.LibraryConnectDb;


public class ModelDanhMuc {

    private Connection conn;
    private LibraryConnectDb lcdb;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public ArrayList<Song> getList() {
        lcdb = new LibraryConnectDb();
        ArrayList<Song> alBaiHat = new ArrayList<>();

        //mở connect
        conn = lcdb.getConnectMySQL();
        String sql = "SELECT * FROM baihat";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Song song=new Song(rs.getInt("id_baihat"),rs.getString("ten"),rs.getString("tacgia"),rs.getInt("luotnghe"),rs.getString("xephang"));
                alBaiHat.add(song);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return alBaiHat;
    }

    public int addSong(Song item) {
        int result = 0;
        lcdb = new LibraryConnectDb();
        conn = lcdb.getConnectMySQL();

        String sql = "INSERT INTO baihat(ten,tacgia,luotnghe,xephang) VALUES (?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, item.getTenBaiHat());
            pst.setString(2, item.getTacGia());
            pst.setInt(3, item.getLuotNghe());
            pst.setString(4, item.getXepHang());
            pst.executeUpdate();
            
            //get last id
            rs = pst.getGeneratedKeys();
            if (rs.next()){
                result = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public int delSong(int sid) {
        int result = 0;
        lcdb = new LibraryConnectDb();
        conn = lcdb.getConnectMySQL();

        String sql = "DELETE FROM baihat WHERE id_baihat = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, sid);
            result = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public int editSong(Song s) {
        int result = 0;
        lcdb = new LibraryConnectDb();
        conn = lcdb.getConnectMySQL();

        String sql = "UPDATE baihat SET ten=?, tacgia = ?,luotnghe= ?,xephang=? WHERE id_baihat=? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, s.getTenBaiHat());
            pst.setString(2, s.getTacGia());
            pst.setInt(3, s.getLuotNghe());
            pst.setString(4,s.getXepHang());
            pst.setInt(5, s.getId());
            result = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    public ArrayList<Song> getListSearch(String id,String tenBaiHat,String tacGia,String xepHang){
        lcdb=new LibraryConnectDb();
        conn=lcdb.getConnectMySQL();
        ArrayList<Song> alSong = new ArrayList<Song>();
        String temp1 = "",temp2 = "",temp3 = "";
        if(id!=null){
            try {
                temp1 = "id_baihat = ? LIMIT 1";
                String sql="SELECT * FROM baihat WHERE "+temp1;
                pst = conn.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(id));
                rs=pst.executeQuery(sql);
                while(rs.next()){
                    alSong.add(new Song(rs.getInt("id_baihat"),rs.getString("ten"),rs.getString("tacgia"),rs.getInt("luotnghe"),rs.getString("xephang")));
                }
            } catch (SQLException ex) {
                Logger.getLogger(ModelDanhMuc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if(tenBaiHat!=null){
                temp1 = "ten LIKE %"+tenBaiHat+"%";
            }else{
                temp1 = "1";
            }              
            if(tacGia!=null){
                temp2 = "tacgia LIKE %"+tacGia+"%";
            }else{
                temp2 = "1";
            }
            if(xepHang!=null){
                temp3 = "xephang LIKE %"+xepHang+"%";
            }else{
                temp3 = "1";
            }
            String sql="SELECT * FROM baihat WHERE "+temp1+" AND "+temp2+" AND "+temp3;
            try {
                pst = conn.prepareStatement(sql);
                rs=pst.executeQuery(sql);
                while(rs.next()){
                    alSong.add(new Song(rs.getInt("id_baihat"),rs.getString("ten"),rs.getString("tacgia"),rs.getInt("luotnghe"),rs.getString("xephang")));
                }
            } catch (SQLException ex) {
                Logger.getLogger(ModelDanhMuc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return alSong;
    }
}
