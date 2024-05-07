package com.SpringMongodb.SpringMongoapp.Service;

import com.SpringMongodb.SpringMongoapp.Entity.EmployeeEntity;
import com.SpringMongodb.SpringMongoapp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;


    public void storeEmployeeInDb(EmployeeEntity employeeEntity){
        employeeRepository.save(employeeEntity);
    }


    public List<EmployeeEntity> getDisplayAll(){
        return employeeRepository.findAll();
    }


    public List<EmployeeEntity> findByEmployeeId(int employeeId){
        return employeeRepository.findById(employeeId);
    }
}
