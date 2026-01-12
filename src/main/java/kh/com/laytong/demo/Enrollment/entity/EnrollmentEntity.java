package kh.com.laytong.demo.Enrollment.entity;

import jakarta.persistence.*;
import kh.com.laytong.demo.Course.entity.CourseEntity;
import kh.com.laytong.demo.Student.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="enrollments")
public class EnrollmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "register_student_entity_id")
    private StudentEntity studentEntity;
    @ManyToOne
    @JoinColumn(name = "course_entity_id")
    private CourseEntity courseEntity;
    private LocalDate enrollmentDate;
    private char grade;

}
