package odev.DataAcess;

import odev.DataAcess.Abstracts.ICourseDal;
import odev.Entities.Course;
import odev.Entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class CourseDal implements ICourseDal {

    List<Course> courses=new ArrayList<>();

    @Override
    public List<Course> GetAll() {
        return courses;
    }

    @Override
    public void Add(Course course) {
      courses.add(course);
    }

    @Override
    public void DeleteByID(int courseId) {
        courses.removeIf(course -> course.getCourseID() == courseId);
    }


}
