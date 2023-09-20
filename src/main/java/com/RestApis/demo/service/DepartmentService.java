package com.RestApis.demo.service;

import com.RestApis.demo.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department save(Department data);
    public List<Department> getAll();
    public Department findById(long Id);
    public void deleteById(long Id);
    public Department update(long Id,Department data);
    public Department getByName(String name);
}
