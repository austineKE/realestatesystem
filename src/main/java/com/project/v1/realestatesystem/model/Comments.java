package com.project.v1.realestatesystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comments {
    @Id
    private int ID;
    private String description;
    private String commentTime;
    private Posts post;

    public Comments() {
    }

    public Comments(int ID, String description, String commentTime, Posts post) {
        this.ID = ID;
        this.description = description;
        this.commentTime = commentTime;
        this.post = post;
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

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public Posts getPost() {
        return post;
    }

    public void setPost(Posts post) {
        this.post = post;
    }
}
