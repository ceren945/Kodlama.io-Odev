package odev.Entities;

public class Instructor {
    private int instructorId;
    private String instructorName;
    private String instructorDescription;
    private String instructorImgUrl;

    public Instructor(int instructorId, String instructorName) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorDescription() {
        return instructorDescription;
    }

    public void setInstructorDescription(String instructorDescription) {
        this.instructorDescription = instructorDescription;
    }


}
