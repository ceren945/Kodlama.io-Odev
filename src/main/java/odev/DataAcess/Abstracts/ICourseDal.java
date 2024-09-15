package odev.DataAcess.Abstracts;

import odev.Entities.Course;

import java.util.List;

public interface ICourseDal {
    List<Course> GetAll();
    void Add(Course course);
    void DeleteByID(int courseId);

}
