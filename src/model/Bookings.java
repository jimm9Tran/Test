/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mhien
 */
public class Bookings {
    private int bId;
    private Shows show;
    private Customer customer;
    private boolean seatStatus;
    private int amount;

    public Bookings() {
    }

    public Bookings(int bId, Shows show, Customer customer, boolean seatStatus, int amount) {
        this.bId = bId;
        this.show = show;
        this.customer = customer;
        this.seatStatus = seatStatus;
        this.amount = amount;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public Shows getShow() {
        return show;
    }

    public void setShow(Shows show) {
        this.show = show;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(boolean seatStatus) {
        this.seatStatus = seatStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

  
    
}
