package kh.com.laytong.demo.Student.repository;

import kh.com.laytong.demo.Student.entity.StudentEntity;
import kh.com.laytong.demo.Student.entity.StudentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    List<StudentEntity> findAllByEmail(String email);
    List<StudentEntity> findAllByDepartmentEntity_Id(Long departmentId);

    List<StudentEntity> findByStatusIsNull();

    @Query("SELECT s FROM StudentEntity s WHERE s.status = ?1")
    List<StudentEntity> findByStatus(StudentStatus status);

    List<StudentEntity> findByDepartmentEntity_IdAndStatus(Long departmentId, StudentStatus status);

}
