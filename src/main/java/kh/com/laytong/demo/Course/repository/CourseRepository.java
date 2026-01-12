package kh.com.laytong.demo.Course.repository;

import kh.com.laytong.demo.Course.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
