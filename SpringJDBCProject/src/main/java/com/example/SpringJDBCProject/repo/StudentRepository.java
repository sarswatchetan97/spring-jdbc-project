package com.example.SpringJDBCProject.repo;

import com.example.SpringJDBCProject.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    public void save(Student s) {
        System.out.println("Student data saved");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
