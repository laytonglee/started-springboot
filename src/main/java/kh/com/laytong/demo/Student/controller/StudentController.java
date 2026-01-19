package kh.com.laytong.demo.Student.controller;

import kh.com.laytong.demo.Student.dto.RequestStudent;
import kh.com.laytong.demo.Student.dto.ResponseStudent;
import kh.com.laytong.demo.Student.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/register")
    public ResponseEntity<ResponseStudent> addStudent(@RequestBody RequestStudent request){
        ResponseStudent registerStudent = studentService.registerStudent(request);
        return new ResponseEntity<>(registerStudent, HttpStatus.CREATED);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<List<ResponseStudent>> getByEmail(@PathVariable String email){
        List<ResponseStudent> studentsWithMail = studentService.queryByEmail(email);
        return new ResponseEntity<>(studentsWithMail, HttpStatus.OK);
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity<List<ResponseStudent>> getByDepartment (@PathVariable Long departmentId){
        List<ResponseStudent> studentsWithDpId = studentService.queryByDepartmentId(departmentId);
        return new ResponseEntity<>(studentsWithDpId, HttpStatus.OK);
    }


}

