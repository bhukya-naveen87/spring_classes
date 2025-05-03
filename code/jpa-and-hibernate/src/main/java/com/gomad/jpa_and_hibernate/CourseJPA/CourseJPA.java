package com.gomad.jpa_and_hibernate.CourseJPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// @Entity // if table name and class name are same use this.
@Entity(name = "Course")
public class CourseJPA {

    @Id // For primary key
    private long id;

    @Column(name = "name")
    private String name;

    // @Column(name = "author") but it is not needed.
    private String author;

    public CourseJPA() {
    }
    
    public CourseJPA(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }

}
