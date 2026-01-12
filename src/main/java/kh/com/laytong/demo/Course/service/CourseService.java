package kh.com.laytong.demo.Course.service;

import kh.com.laytong.demo.Course.dto.RegisterCourse;
import kh.com.laytong.demo.Course.entity.CourseEntity;
import kh.com.laytong.demo.Course.repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseEntity addCourse (RegisterCourse request){
        CourseEntity course = new CourseEntity();
        course.setTitle(request.getTitle());
        course.setCredits(request.getCredits());
        course.setDescription(request.getDescription());

        return courseRepository.save(course);


    }
}
