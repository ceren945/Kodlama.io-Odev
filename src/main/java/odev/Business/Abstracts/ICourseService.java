package odev.Business.Abstracts;

import odev.Entities.Course;
import java.util.List;

public interface ICourseService {
    List<Course> GetAll();
    void Add(Course course);
    void deletebyId(int courseId);
}
