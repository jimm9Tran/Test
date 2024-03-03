/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Shows;
import java.sql.*;
import model.Films;
import model.Rooms;

/**
 *
 * @author mhien
 */
public class ShowsDAO extends FilmsDAO {

    public List<Shows> getAllShows() {
        List<Shows> list = new ArrayList<>();

        RoomsDAO roomDAO = new RoomsDAO();

        FilmsDAO filmsDAO = new FilmsDAO();

        String sql = "select * from Shows";

        try {
            PreparedStatement st = connection.prepareCall(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Rooms room = roomDAO.getRoomById(rs.getInt("RoomID"));

                Films film = filmsDAO.getFilmsById(rs.getInt("FilmID"));

                list.add(new Shows(rs.getInt("ShowID"), room, film, rs.getString("ShowDate"),
                        rs.getDouble("Price"),
                        rs.getBoolean("Status"),
                        rs.getInt("Slot")));

            }

        } catch (Exception e) {
        }
        return list;
    }

    public Shows getShowById(int id) {

        RoomsDAO roomDAO = new RoomsDAO();

        FilmsDAO filmsDAO = new FilmsDAO();

        String sql = "select * from Shows where ShowID = ?";

        try {
            PreparedStatement st = connection.prepareCall(sql);

            st.setInt(1, id);

            ResultSet rs = st.executeQuery();

            while (rs.next()) 
            {
                Rooms room = roomDAO.getRoomById(rs.getInt("RoomID"));

                Films film = filmsDAO.getFilmsById(rs.getInt("FilmID"));

                Shows show = new Shows(rs.getInt("ShowID"), room, film, rs.getString("ShowDate"),
                        rs.getDouble("Price"),
                        rs.getBoolean("Status"),
                        rs.getInt("Slot"));
                
                return show;
            }

        } catch (Exception e) {
        }
        return null;
    }
    
    public void addShow(int roomdId, int filmId, String showDate, double price, boolean status, int slot){
        String sql = ""
            + "INSERT INTO [dbo].[Shows]\n" +
"           ([RoomID]\n" +
"           ,[FilmID]\n" +
"           ,[ShowDate]\n" +
"           ,[Price]\n" +
"           ,[Status]\n" +
"           ,[Slot])\n" +
"     VALUES\n" +
"           (?,?,?,?,?,?)";
        
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, roomdId);           
            st.setInt(2, filmId);           
            st.setString(3, showDate);
            st.setDouble(4, price);
            st.setBoolean(5, status);
            st.setInt(6, slot);
            
           st.executeUpdate();
        } catch (Exception e) {
        }
    }

}
