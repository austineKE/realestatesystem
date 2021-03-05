package com.project.v1.realestatesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    private int ID;
    private String roleName;

    public Role() {
    }

    public Role(int ID, String roleName) {
        this.ID = ID;
        this.roleName = roleName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
