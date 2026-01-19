package kh.com.laytong.demo.Student.dto;

import kh.com.laytong.demo.Student.entity.StudentEntity;
import kh.com.laytong.demo.Student.entity.StudentStatus;
import lombok.*;

import java.time.LocalDate;

@Data
public class ResponseStudent {
    private Long id;
    private String firstName;
    private String lastName;
    private String departmentName;
    private StudentStatus status;

    public static ResponseStudent fromEntity(StudentEntity student) {
        ResponseStudent responseStudent = new ResponseStudent();
        responseStudent.setId(student.getId());
        responseStudent.setDepartmentName(student.getDepartmentEntity().getName());
        responseStudent.setFirstName(student.getFirstName());
        responseStudent.setStatus(student.getStatus());
        return responseStudent;
    }
}
