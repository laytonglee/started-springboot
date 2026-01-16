package kh.com.laytong.demo.Department.repository;

import kh.com.laytong.demo.Department.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
