package com.geekster.Student.Service;

import com.geekster.Student.Model.Course;
import com.geekster.Student.Repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ICourseRepo iCourseRepo;

    public String addCourse(Course mycourse) {
        iCourseRepo.save(mycourse);
        return "course added";
    }

    public List<Course> getAllCourses() {
        return iCourseRepo.findAll();
    }

    public String updateCourse(String duration, Long id) {
        Course course = iCourseRepo.findById(id).orElseThrow();
        course.setDuration(duration);
        iCourseRepo.save(course);
        return "course update";
    }

    public String deleteCourse(Long id) {
        iCourseRepo.deleteById(id);
        return "course deleted";
    }
}
