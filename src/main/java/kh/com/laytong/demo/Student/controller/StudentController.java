package kh.com.laytong.demo.Student.controller;

import kh.com.laytong.demo.Student.dto.RegisterStudent;
import kh.com.laytong.demo.Student.entity.StudentEntity;
import kh.com.laytong.demo.Student.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

}

