package com.project.v1.realestatesystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seller")
public class Seller {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "username")
    private String userName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "phonenumber")
    private int phoneNumber;
    @Column(name = "password")
    private String password;
    @Column(name = "property_type")
    private String propertyType;
    @ManyToMany(mappedBy = "seller")
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    private List<Regions> region;

    public Seller() {
    }

    public Seller(int ID, String userName, String firstName, String lastName, int phoneNumber, String password, String propertyType, List<Regions> region) {
        this.ID = ID;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.propertyType = propertyType;
        this.region = region;
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

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public List<Regions> getRegion() {
        return region;
    }

    public void setRegion(List<Regions> region) {
        this.region = region;
    }
}
