package dev.model;

public class Course {
    private int courceId;
    private String title;
    private String description;
    private String link;

    public Course(int courceId, String title, String description, String link){
        this.courceId=courceId;
        this.title = title;
        this.description =description;
        this.link = link;
    }
}
