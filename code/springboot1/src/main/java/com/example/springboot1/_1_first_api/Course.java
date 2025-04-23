package com.example.springboot1._1_first_api;

public class Course {
    private Integer id;
    private String course;
    private String author;
    
    public Course(Integer id, String course, String author) {
        this.id = id;
        this.course = course;
        this.author = author;
    }
    public Integer getId() {
        return id;
    }
    public String getCourse() {
        return course;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Course [id=" + id + ", course=" + course + ", author=" + author + "]";
    }
}
