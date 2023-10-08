package com.geekster.Student.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;


    @OneToOne
   private Address address;

    @OneToOne
 private  Laptop laptop;

    @OneToMany(mappedBy = "student")
  private   Set<Book> bookSet;

    @ManyToMany(mappedBy = "studentSet")

   private Set<Course> courseSet;

}
