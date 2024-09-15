package odev.Business;

import odev.Business.Abstracts.ICourseService;
import odev.DataAcess.Abstracts.ICourseDal;
import odev.Entities.Course;

import java.util.List;

public class CourseService implements ICourseService {

    private final ICourseDal courseDal;
    public CourseService(ICourseDal courseDal) {
        this.courseDal = courseDal;
    }


    @Override
    public List<Course> GetAll() {
        return courseDal.GetAll();
    }

    @Override
    public void Add(Course course) {
        courseDal.Add(course);
    }

    @Override
    public void deletebyId(int courseId) {
        courseDal.DeleteByID(courseId);
    }


}
