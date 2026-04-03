package com.example.SpringJDBCProject;

import com.example.SpringJDBCProject.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.SpringJDBCProject.model.Student;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcProjectApplication.class, args);

        Student student = context.getBean(Student.class);

        student.setMarks(90);
        student.setSubject("English");
        student.setMarks(101);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(student);
        service.getStudent();
	}
}
