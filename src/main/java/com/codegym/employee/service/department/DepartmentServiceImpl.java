package com.codegym.employee.service.department;

import com.codegym.employee.model.Department;
import com.codegym.employee.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        departmentRepository.delete(findById(id).get());
    }
}
