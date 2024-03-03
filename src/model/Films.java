/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mhien
 */
public class Films {
    private int fId;
    private Genres gerne;
    private String title;
    private String year;

    public Films() {
    }

    public Films(int fId, Genres gerne, String title, String year) {
        this.fId = fId;
        this.gerne = gerne;
        this.title = title;
        this.year = year;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public Genres getGerne() {
        return gerne;
    }

    public void setGerne(Genres gerne) {
        this.gerne = gerne;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

   
    
}
