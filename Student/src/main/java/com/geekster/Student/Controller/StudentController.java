package com.geekster.Student.Controller;

import com.geekster.Student.Model.Student;
import com.geekster.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    // add a student
    @PostMapping("student")
    public String addStudent(@RequestBody Student mystudent){
        return studentService.addStudents(mystudent);

    }
    // get all students
    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // update student
    @PutMapping("student")
    public String updateStudent(@RequestBody Student student){
        return  studentService.updateStudent(student);
    }

// delete student by id
    @DeleteMapping("student/id/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }
}
