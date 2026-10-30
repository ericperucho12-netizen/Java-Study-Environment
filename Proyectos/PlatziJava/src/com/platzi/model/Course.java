package com.platzi.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String id;
    private String title;
    private String description;
    private List<Lesson> lessons;

    public Course(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.lessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
