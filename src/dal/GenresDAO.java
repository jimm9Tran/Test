/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.Genres;
import java.sql.*;
/**
 *
 * @author mhien
 */
public class GenresDAO extends DBContext{
    
    public Genres getGenresById(int id){
        Genres genre = new Genres();
        String sql = "select * from Genres where GenreID = ?";
        
        try {
            PreparedStatement st = connection.prepareCall(sql);
            
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            genre.setName(rs.getString("Name"));
            genre.setgId(rs.getInt("GenreID"));
            
        } catch (Exception e) {
        }    
        return genre;
    }

}
