/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Films;
import java.sql.*;
import model.Genres;

/**
 *
 * @author mhien
 */
public class FilmsDAO extends DBContext {

    public List<Films> getAllFilms() {
        GenresDAO genreDAO = new GenresDAO();
        String sql = "select * from Films";
        List<Films> list = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Genres gerne = genreDAO.getGenresById(rs.getInt("GenreID"));
                //int fId, int gId, String title, String year

                list.add(new Films(rs.getInt("FilmID"), gerne, rs.getString(("Title")), rs.getString(("Year"))));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Films getFilmsById(int id) {
        GenresDAO genreDAO = new GenresDAO();
        
        String sql = "select * from Films where FilmId = ?";
        try {  
            PreparedStatement st = connection.prepareCall(sql);
            
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();

            Genres gerne = genreDAO.getGenresById(rs.getInt("GenreID"));
            
            Films film = (new Films(rs.getInt("FilmID"), gerne, rs.getString(("Title")), rs.getString(("Year"))));
            
            return  film;
        } catch (Exception e) {
        }
        return  null;
    }



}
