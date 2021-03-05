package com.project.v1.realestatesystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plots")
public class Plots {
    @Id
    @Column(name = "id")
    private int ID;
    @Column(name = "description")
    private String description;

    public Plots() {
    }

    public Plots(int ID, String description) {
        this.ID = ID;
        this.description = description;
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
}
