package com.project.v1.realestatesystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "agent")
public class Agent {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "username ")
    private String userName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname ")
    private String lastName;
    @Column(name = "phonumber")
    private int phoneNumber;
    @Column(name = "password")
    private String password;
    @OneToOne(mappedBy = "agent")
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    private Regions regions;
    @OneToOne(mappedBy = "agent")
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    private Role role;
    @OneToMany(mappedBy = "plots")
    @JoinColumn(name = "ID", referencedColumnName = "id")
    private List<Plots> plot;

    public Agent() {
    }

    public Agent(int ID, String userName, String firstName, String lastName, int phoneNumber, String password, Regions regions, Role role, List<Plots> plot) {
        this.ID = ID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Plots> getPlot() {
        return plot;
    }

    public void setPlot(List<Plots> plot) {
        this.plot = plot;
    }
}
