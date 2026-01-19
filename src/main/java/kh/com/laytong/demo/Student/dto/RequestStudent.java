package kh.com.laytong.demo.Student.dto;

import kh.com.laytong.demo.Student.entity.StudentStatus;
import lombok.*;

import java.time.LocalDate;

@Data
public class RequestStudent {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate enrollmentDate;
    private Long departmentId;
    private StudentStatus status;
}
