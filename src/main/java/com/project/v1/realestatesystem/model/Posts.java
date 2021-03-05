package com.project.v1.realestatesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Posts {
    @Id
    private int ID;
    private String description;
    private String image;
    private String postTime;
    private Property property;

    public Posts() {
    }

    public Posts(int ID, String description, String image, String postTime, Property property) {
        this.ID = ID;
        this.description = description;
        this.image = image;
        this.postTime = postTime;
        this.property = property;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
