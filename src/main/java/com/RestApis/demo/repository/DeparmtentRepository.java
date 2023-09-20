package com.RestApis.demo.repository;

import com.RestApis.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeparmtentRepository extends JpaRepository<Department,Long> {

    public Department findByDepName(String name);
}
