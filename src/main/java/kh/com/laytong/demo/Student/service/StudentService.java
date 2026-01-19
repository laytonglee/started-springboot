package kh.com.laytong.demo.Student.service;

import kh.com.laytong.demo.Student.dto.RequestStudent;
import kh.com.laytong.demo.Student.dto.ResponseStudent;
import kh.com.laytong.demo.Student.entity.StudentStatus;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface StudentService {

    ResponseStudent registerStudent(RequestStudent request);

    List<ResponseStudent> queryByEmail(String email);

    List<ResponseStudent> queryByDepartmentId (Long departmentId);

    List<ResponseStudent> queryByNullStatus();

    List<ResponseStudent> queryByStatus (StudentStatus status);

    List<ResponseStudent> queryByDepartmentIdAndStatus (Long departmentId, StudentStatus status);
}
