package com.project.v1.realestatesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    private int ID;
    private String userName;
    private String firstName;
    private String lastName;
    private Rooms roomNumber;
    private int phoneNumber;
    private Role role;
    private String password;
    private Plots plot;

    public Users() {
    }

    public Users(int ID, String userName, String firstName, String lastName, Rooms roomNumber, int phoneNumber, Role role, String password, Plots plot) {
        this.ID = ID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roomNumber = roomNumber;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.password = password;
        this.plot = plot;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Rooms getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Rooms roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Plots getPlot() {
        return plot;
    }

    public void setPlot(Plots plot) {
        this.plot = plot;
    }
}
