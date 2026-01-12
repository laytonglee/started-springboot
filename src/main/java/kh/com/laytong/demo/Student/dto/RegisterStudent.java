package kh.com.laytong.demo.Student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterStudent {
    private Long id;
    private String userNAme;
    private String lastName;
    private String email;
    private LocalDate enrollmentDate;
}
