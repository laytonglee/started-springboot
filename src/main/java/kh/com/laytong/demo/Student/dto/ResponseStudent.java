package kh.com.laytong.demo.Student.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.Nulls;
import kh.com.laytong.demo.Student.entity.StudentEntity;
import kh.com.laytong.demo.Student.entity.StudentStatus;
import lombok.*;

import java.time.LocalDate;

@Data
public class ResponseStudent {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("department_name")
    private String departmentName;

    @JsonProperty("status")
    private StudentStatus status;

    public static ResponseStudent fromEntity(StudentEntity student) {
        ResponseStudent responseStudent = new ResponseStudent();
        responseStudent.setId(student.getId());

        if (student.getDepartmentEntity() != null) {
            responseStudent.setDepartmentName(student.getDepartmentEntity().getName());
        }
        else {
           responseStudent.setDepartmentName(null);
        }
        responseStudent.setFirstName(student.getFirstName());
        responseStudent.setLastName(student.getLastName());
        responseStudent.setStatus(student.getStatus());
        return responseStudent;
    }

}
