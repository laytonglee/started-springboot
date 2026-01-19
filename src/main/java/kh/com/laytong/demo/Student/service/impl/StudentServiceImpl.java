package kh.com.laytong.demo.Student.service.impl;

import kh.com.laytong.demo.Department.entity.DepartmentEntity;
import kh.com.laytong.demo.Department.repository.DepartmentRepository;
import kh.com.laytong.demo.Student.dto.RequestStudent;
import kh.com.laytong.demo.Student.dto.ResponseStudent;
import kh.com.laytong.demo.Student.entity.StudentEntity;
import kh.com.laytong.demo.Student.entity.StudentStatus;
import kh.com.laytong.demo.Student.repository.StudentRepository;
import kh.com.laytong.demo.Student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;

    public StudentServiceImpl(StudentRepository studentRepository,
                          DepartmentRepository departmentRepository) {
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
    }
    @Override
    public ResponseStudent registerStudent(RequestStudent request) {


        DepartmentEntity department = departmentRepository.findById(request.getDepartmentId())
                .orElseThrow(() -> new RuntimeException(
                        "Department not found with id: " + request.getDepartmentId()
                ));

        StudentEntity student = new StudentEntity();
        student.setEmail(request.getEmail());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEnrollmentDate(request.getEnrollmentDate());
        student.setDepartmentEntity(department);
        student.setStatus(request.getStatus());
        student.setProfile(request.getProfile());

        StudentEntity saved = studentRepository.save(student);

        ResponseStudent response = new ResponseStudent();
        response.setId(student.getId());
        response.setFirstName(saved.getFirstName());
        response.setLastName(saved.getLastName());
        response.setDepartmentName(department.getName());
        response.setStatus(saved.getStatus());

        return response;

    }

    @Override
    public List<ResponseStudent> queryByEmail(String email){
        List<StudentEntity> students = studentRepository.findAllByEmail(email);

        //            ResponseStudent res = new ResponseStudent();
        //
        //            res.setId(student.getId());
        //            res.setFirstName(student.getFirstName());
        //            res.setLastName(student.getLastName());
        //            res.setDepartmentName(student.getDepartmentEntity().getName());
        //
        //            return res;
        return students.stream().map(ResponseStudent::fromEntity).toList();
    }

    @Override
    public List<ResponseStudent> queryByDepartmentId (Long departmentId){
        List<StudentEntity> results = studentRepository.findAllByDepartmentEntity_Id(departmentId);

        return results.stream().map(ResponseStudent::fromEntity).toList();

    }

    @Override
    public List<ResponseStudent> queryByNullStatus() {

        List<StudentEntity> students = studentRepository.findByStatusIsNull();

        return students.stream().map(ResponseStudent::fromEntity).toList();
    }

    @Override
    public List<ResponseStudent> queryByStatus (StudentStatus status){

        List<StudentEntity> students = studentRepository.findByStatus(status);

        return students.stream().map(ResponseStudent::fromEntity).toList();
    }

    @Override
    public List<ResponseStudent> queryByDepartmentIdAndStatus (Long departmentId, StudentStatus status) {
        List<StudentEntity> students = studentRepository.findByDepartmentEntity_IdAndStatus(departmentId, status);

        return students.stream().map(ResponseStudent::fromEntity).toList();

    }


}
