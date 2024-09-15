package odev;

import odev.Business.Abstracts.ICourseService;
import odev.Business.CourseService;
import odev.DataAcess.Abstracts.ICourseDal;
import odev.DataAcess.CourseDal;
import odev.Entities.Course;
import odev.Entities.Instructor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ICourseDal courseDal = new CourseDal();
        ICourseService courseService = new CourseService(courseDal);

        // Kurs ekleme
        courseService.Add(new Course(1, "C# Course", "Beginner Level", new Instructor(1, "Engin Demiroğ")));
        courseService.Add(new Course(2, "Python Course", "Advanced Level", new Instructor(2, "Halit Enes Kalaycı")));
        courseService.Add(new Course(3, "Java Course", "Beginner Level", new Instructor(1, "Engin Demiroğ")));

        // Tüm kursları listele
        System.out.println("Kurslar:");
        List<Course> courses = courseService.GetAll();
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getCourseID() + ", Course Name: " + course.getCourseName() +
                    ", Course Description: " + course.getCourseDescription() +
                    ", Instructor ID: " + course.getInstructor().getInstructorId() +
                    ", Instructor Name: " + course.getInstructor().getInstructorName());
        }

        //Kurs Silme
        courseService.deletebyId(1);

        for (Course course : courses) {
            System.out.println("Course ID: " + course.getCourseID() + ", Course Name: " + course.getCourseName() +
                    ", Course Description: " + course.getCourseDescription() +
                    ", Instructor ID: " + course.getInstructor().getInstructorId() +
                    ", Instructor Name: " + course.getInstructor().getInstructorName());
        }

    }
}
