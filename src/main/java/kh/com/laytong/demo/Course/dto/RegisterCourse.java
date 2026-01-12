package kh.com.laytong.demo.Course.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterCourse {
    private Long id;
    private String title;
    private int credits;
    private String description;
}
