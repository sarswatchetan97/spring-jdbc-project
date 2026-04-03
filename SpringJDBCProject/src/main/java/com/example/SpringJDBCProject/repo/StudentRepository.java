package com.example.SpringJDBCProject.repo;

import com.example.SpringJDBCProject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s) {

        String sql = "insert into student (rollno, subject, marks) values (?, ?, ?)";
        int row = jdbcTemplate.update(sql, s.getRollNo(), s.getSubject(), s.getMarks());
        System.out.println(row + " affected");

    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
