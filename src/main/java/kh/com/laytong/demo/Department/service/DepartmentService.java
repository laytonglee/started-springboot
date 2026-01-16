package kh.com.laytong.demo.Department.service;

import kh.com.laytong.demo.Department.dto.RegisterDepartment;
import kh.com.laytong.demo.Department.entity.DepartmentEntity;
import kh.com.laytong.demo.Department.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {


    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public DepartmentEntity addDepartment(RegisterDepartment request){
        DepartmentEntity department = new DepartmentEntity();
        department.setId(department.getId());
        department.setName(request.getName());
        department.setDescription(request.getDescription());

        return departmentRepository.save(department);

    }
}
