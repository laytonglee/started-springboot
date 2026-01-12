package kh.com.laytong.demo.Student.controller;

import kh.com.laytong.demo.Student.dto.RegisterStudent;
import kh.com.laytong.demo.Student.entity.StudentEntity;
import kh.com.laytong.demo.Student.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/register")
    public ResponseEntity<StudentEntity> addStudent(@RequestBody RegisterStudent request){
        StudentEntity student= studentService.registerStudent(request);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

}

