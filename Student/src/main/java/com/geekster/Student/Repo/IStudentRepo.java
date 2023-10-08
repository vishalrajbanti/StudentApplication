package com.geekster.Student.Repo;

import com.geekster.Student.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Long> {
}
