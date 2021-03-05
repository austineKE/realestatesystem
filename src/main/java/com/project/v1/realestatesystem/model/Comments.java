package com.project.v1.realestatesystem.model;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "description")
    private String description;
    @Column(name = "comment_time")
    private String commentTime;
    @ManyToOne
    @JoinColumn(name = "ID", referencedColumnName = "ID")
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
