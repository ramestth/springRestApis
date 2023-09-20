package com.RestApis.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public  Long depId;
    public  String depName;

    public Department() {
    }

    public Department(Long depId, String depName, String depCode) {
        this.depId = depId;
        this.depName = depName;
        this.depCode = depCode;
    }

    public  String depCode;

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

}
