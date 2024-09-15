package odev.Entities;

import java.util.List;

public class Course {

    private int courseID;
    private String courseName;
    private String courseDescription;
    private Instructor instructor;
    private boolean isPaid;
    private double price;
    private String courseImgUrl;
    private List<Section> sections;
    private int progressPercantage;



    public Course(int courseID, String courseName, String courseDescription, Instructor instructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.instructor = instructor;

    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }




}
