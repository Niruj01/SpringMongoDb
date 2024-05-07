package com.SpringMongodb.SpringMongoapp.Repository;

import com.SpringMongodb.SpringMongoapp.Entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity,Integer> {

    List<EmployeeEntity> findById(int employeeId);
}
