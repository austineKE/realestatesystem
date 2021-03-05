package com.project.v1.realestatesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {
    @Id
    private int ID;
    private String useName;
    private String firstName;
    private String lastName;
    private Rooms roomNumber;
    private int phoneNumber;
    private Regions regions;
    private Role role;
    private Plots plot;

    public Agent() {
    }

    public Agent(int ID, String useName, String firstName, String lastName, Rooms roomNumber, int phoneNumber, Regions regions, Role role, Plots plot) {
        this.ID = ID;
        this.useName = useName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roomNumber = roomNumber;
        this.phoneNumber = phoneNumber;
        this.regions = regions;
        this.role = role;
        this.plot = plot;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
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

    public Regions getRegions() {
        return regions;
    }

    public void setRegions(Regions regions) {
        this.regions = regions;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Plots getPlot() {
        return plot;
    }

    public void setPlot(Plots plot) {
        this.plot = plot;
    }
}
