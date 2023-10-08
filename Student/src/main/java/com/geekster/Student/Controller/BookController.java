package com.geekster.Student.Controller;

import com.geekster.Student.Model.Book;
import com.geekster.Student.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    // add a book
    @PostMapping("book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

// update book
    @PutMapping("book/id/{id}")
    public String updateBook(@RequestBody Book book,@PathVariable Long id){
        return  bookService.updateBook(book,id);
    }
    @DeleteMapping("book/id/{id}")
    public String deleteBook(@PathVariable Long id){
        return bookService.deleteBook(id);
    }
}
