package com.project.v1.realestatesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Property {
    @Id
    private int ID;
    private String image;
    private String location;
    private Seller seller;
    private String titleDeed;

    public Property() {
    }

    public Property(int ID, String image, String location, Seller seller, String titleDeed) {
        this.ID = ID;
        this.image = image;
        this.location = location;
        this.seller = seller;
        this.titleDeed = titleDeed;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getTitleDeed() {
        return titleDeed;
    }

    public void setTitleDeed(String titleDeed) {
        this.titleDeed = titleDeed;
    }
}
