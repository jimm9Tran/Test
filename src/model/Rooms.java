/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mhien
 */
public class Rooms {
    private int rId;
    
    private String name;
    
    private int numberRows;
    
    private int numberCols;

    public Rooms() {
    }

    public Rooms(int rId, String name, int numberRows, int numberCols) {
        this.rId = rId;
        this.name = name;
        this.numberRows = numberRows;
        this.numberCols = numberCols;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberRows() {
        return numberRows;
    }

    public void setNumberRows(int numberRows) {
        this.numberRows = numberRows;
    }

    public int getNumberCols() {
        return numberCols;
    }

    public void setNumberCols(int numberCols) {
        this.numberCols = numberCols;
    }
    
    
}
