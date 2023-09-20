package com.RestApis.demo.service;

import com.RestApis.demo.entity.Department;
import com.RestApis.demo.repository.DeparmtentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements  DepartmentService{

    @Autowired
    public DeparmtentRepository _repo;

    @Override
    public Department save(Department data) {
        return _repo.save(data);
    }

    @Override
    public List<Department> getAll() {
        return _repo.findAll();
    }

    @Override
    public Department findById(long Id) {
        return _repo.findById(Id).get();
    }

    @Override
    public void deleteById(long Id) {
        _repo.deleteById(Id);
    }

    @Override
    public Department update(long Id, Department data) {
        Department dep = _repo.findById(Id).get();
        if(Objects.nonNull(dep))
        {
            dep.setDepCode(data.depCode);
            dep.setDepName(data.depName);
        }
        return  _repo.save(dep);
    }

    @Override
    public Department getByName(String name) {
        return _repo.findByDepName(name);
    }
}
