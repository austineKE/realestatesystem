package com.project.v1.realestatesystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "username")
    private String userName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @OneToOne(mappedBy = "users")
    @JoinColumn(name = "ID", referencedColumnName = "room_number")
    private Rooms roomNumber;
    @Column(name = "phonumber")
    private int phoneNumber;
    @OneToOne(mappedBy = "users")
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    private Role role;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "users")
    @JoinColumn(name = "ID", referencedColumnName = "id")
    private List<Plots> plot;

    public Users() {
    }

    public Users(int ID, String userName, String firstName, String lastName, Rooms roomNumber, int phoneNumber, Role role, String password, List<Plots> plot) {
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

    public List<Plots> getPlot() {
        return plot;
    }

    public void setPlot(List<Plots> plot) {
        this.plot = plot;
    }
}
