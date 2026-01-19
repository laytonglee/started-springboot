package kh.com.laytong.demo.Student.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import kh.com.laytong.demo.Student.entity.StudentProfileEntity;
import kh.com.laytong.demo.Student.entity.StudentStatus;
import lombok.*;

import java.time.LocalDate;

@Data
public class RequestStudent {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("enrollment_date")
    private LocalDate enrollmentDate;

    @JsonProperty("department_id")
    private Long departmentId;

    @JsonProperty("status")
    private StudentStatus status;

    @JsonProperty("profile")
    private StudentProfileEntity profile;
}
