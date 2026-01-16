package kh.com.laytong.demo.Department.controller;

import kh.com.laytong.demo.Department.dto.RegisterDepartment;
import kh.com.laytong.demo.Department.entity.DepartmentEntity;
import kh.com.laytong.demo.Department.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/register")
    public ResponseEntity<DepartmentEntity> addDepartment (@RequestBody RegisterDepartment request){
        DepartmentEntity department = departmentService.addDepartment(request);
        return new ResponseEntity<>(department, HttpStatus.CREATED);
    }
}
