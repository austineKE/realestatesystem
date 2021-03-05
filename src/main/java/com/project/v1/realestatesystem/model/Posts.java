package com.project.v1.realestatesystem.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "description ")
    private String description;
    @Column(name = "image ")
    private String image;
    @Column(name = "post_time")
    private String postTime;
    @OneToMany(mappedBy = "posts")
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    private List<Property> property;

    public Posts() {
    }

    public Posts(int ID, String description, String image, String postTime, List<Property> property) {
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

    public List<Property> getProperty() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }
}
