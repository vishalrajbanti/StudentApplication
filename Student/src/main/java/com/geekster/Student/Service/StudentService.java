package com.geekster.Student.Service;

import com.geekster.Student.Model.Student;
import com.geekster.Student.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;

    public String addStudents(Student mystudent) {
        iStudentRepo.save(mystudent);
        return "student added";
    }



    public List<Student> getAllStudents(){
        return iStudentRepo.findAll();
    }

    public String deleteStudent(Long id) {
        iStudentRepo.deleteById(id);
        return "student dleted";
    }

    public String updateStudent(Student student) {
        iStudentRepo.save(student);
        return "student updated";
    }
}
