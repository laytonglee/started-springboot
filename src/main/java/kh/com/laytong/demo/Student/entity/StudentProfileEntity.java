package kh.com.laytong.demo.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "profiles")

public class StudentProfileEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="bio")
    private String bio;

    @Column(name="linkedinUrl")
    private String linkedinUrl;

    @OneToOne(mappedBy = "profile")
    private StudentEntity student;

}
