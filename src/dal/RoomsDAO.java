/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.Rooms;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Shows;
/**
 *
 * @author mhien
 */
public class RoomsDAO extends DBContext{
    
    public Rooms getRoomById(int id){
        String sql = "select * from Rooms where RoomID = ?";
        
        try {
            PreparedStatement st = connection.prepareCall(sql);
            
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Rooms room = new Rooms(id, rs.getString("Name"), rs.getInt("NumberRows"), rs.getInt("NumberCols"));
                return room;
            }
        } catch (Exception e) {
        }
        return null;
    }

}
