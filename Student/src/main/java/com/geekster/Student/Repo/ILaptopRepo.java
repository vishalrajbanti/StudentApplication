package com.geekster.Student.Repo;

import com.geekster.Student.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
}
