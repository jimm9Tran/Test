/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mhien
 */
public class Shows {
    private int sId;
    
    private Rooms rooms;
    
    private Films films;
    
    private String showDate;
    
    private double price;
    
    private boolean status;
    
    private int slot;

    public Shows() {
    }

    public Shows(int sId, Rooms rooms, Films films, String showDate, double price, boolean status, int slot) {
        this.sId = sId;
        this.rooms = rooms;
        this.films = films;
        this.showDate = showDate;
        this.price = price;
        this.status = status;
        this.slot = slot;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }

    public Films getFilms() {
        return films;
    }

    public void setFilms(Films films) {
        this.films = films;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    
    
    
}
