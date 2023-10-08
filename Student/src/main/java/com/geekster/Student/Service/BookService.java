package com.geekster.Student.Service;

import com.geekster.Student.Model.Book;
import com.geekster.Student.Repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;

    public String addBook(Book book) {
        iBookRepo.save(book);
        return "book added";
    }

    public List<Book> getAllBooks() {
        return iBookRepo.findAll();
    }

    public String deleteBook(Long id) {
        iBookRepo.deleteById(id);
        return "book deleted";
    }

    public String updateBook(Book book, Long id) {
        Book book1 = iBookRepo.findById(id).orElseThrow();
        book1.setPrice(book.getPrice());
        return "book updated";
    }
}
