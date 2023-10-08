package com.geekster.Student.Repo;

import com.geekster.Student.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Long> {
}
