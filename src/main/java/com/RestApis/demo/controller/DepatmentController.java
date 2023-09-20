package com.RestApis.demo.controller;

import com.RestApis.demo.entity.Department;
import com.RestApis.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepatmentController {

     @Autowired
     public DepartmentService _service;

    @PostMapping("/department/save")
    public Department saveDepartment(@RequestBody Department data)
    {
        return _service.save(data);
    }

    @GetMapping("/department/getAll")
    public List<Department>  getAllDepartment()
    {
        return _service.getAll();
    }

    @GetMapping("/department/getById/{id}")
    public Department getById(@PathVariable("id") long Id)
    {
        return _service.findById(Id);
    }

    @DeleteMapping("/department/deleteById/{id}")
    public String  deleteById(@PathVariable("id") long Id)
    {
         _service.deleteById(Id);
        return "delete success";
    }

    @PutMapping("/department/update/{id}")
    public Department  update(@PathVariable("id") Long Id,@RequestBody Department data)
    {
        return _service.update(Id,data);
    }

    @GetMapping("/department/getByName/{name}")
    public Department  getByName(@PathVariable("name") String name)
    {
        return _service.getByName(name);
    }
}
