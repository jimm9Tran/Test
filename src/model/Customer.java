/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mhien
 */
public class Customer {
    private int cid;
    
    private String name;
    
    private boolean isVip;

    public Customer() {
    }

    public Customer(int cid, String name, boolean isVip) {
        this.cid = cid;
        this.name = name;
        this.isVip = isVip;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsVip() {
        return isVip;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }
    
    
    
}
