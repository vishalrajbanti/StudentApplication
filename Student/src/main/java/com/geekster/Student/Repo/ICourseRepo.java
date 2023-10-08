package com.geekster.Student.Repo;

import com.geekster.Student.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
