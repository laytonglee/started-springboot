package kh.com.laytong.demo.Student.repository;

import kh.com.laytong.demo.Student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
