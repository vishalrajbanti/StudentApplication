package com.geekster.Student.Controller;

import com.geekster.Student.Model.Course;
import com.geekster.Student.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    // add course
    @PostMapping("course")
    public String addCourse(@RequestBody Course mycourse){
        return courseService.addCourse(mycourse);
    }
    // get all courses
    @GetMapping("courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    // update course
    @PutMapping("course/id/{id}")
    public String updateCourse(@RequestParam String duration,@PathVariable Long id){
        return courseService.updateCourse(duration,id);
    }

    @DeleteMapping("course/id/{id}")
    public String deleteCourse(@PathVariable Long id){
        return courseService.deleteCourse(id);
    }
}
