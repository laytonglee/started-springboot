package kh.com.laytong.demo.Student.service;


import kh.com.laytong.demo.Student.dto.RegisterStudent;
import kh.com.laytong.demo.Student.entity.StudentEntity;
import kh.com.laytong.demo.Student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentEntity registerStudent (RegisterStudent request){
        StudentEntity student = new StudentEntity();
        student.setEmail(request.getEmail());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEnrollmentDate(request.getEnrollmentDate());

        return studentRepository.save(student);
    }
}
