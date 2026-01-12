package kh.com.laytong.demo.Course.controller;

import kh.com.laytong.demo.Course.dto.RegisterCourse;
import kh.com.laytong.demo.Course.entity.CourseEntity;
import kh.com.laytong.demo.Course.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/register")
    public ResponseEntity<CourseEntity> addCourse (@RequestBody RegisterCourse reqeust){
        CourseEntity course = courseService.addCourse(reqeust);

        return new ResponseEntity<>(course,HttpStatus.CREATED);
    }
}
