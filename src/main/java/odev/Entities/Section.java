package odev.Entities;

import java.util.Date;
import java.util.List;

public class Section {
    int sectionId;
    private Date registeredDate;
    private List<Lesson> lessons;
    private List<Homework> homeworks;
    private Rating rating;
}
