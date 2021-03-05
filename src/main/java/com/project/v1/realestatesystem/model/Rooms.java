package com.project.v1.realestatesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rooms {
    @Id
    private int roomNumber;
    private String description;
    private String image;
    private Plots plot;

    public Rooms() {
    }

    public Rooms(int roomNumber, String description, String image, Plots plot) {
        this.roomNumber = roomNumber;
        this.description = description;
        this.image = image;
        this.plot = plot;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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

    public Plots getPlot() {
        return plot;
    }

    public void setPlot(Plots plot) {
        this.plot = plot;
    }
}
