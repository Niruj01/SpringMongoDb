package com.SpringMongodb.SpringMongoapp.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {


    @Id

    private int employeeId;

    private String employeeName;

    private String employeeEmail;

    private String location;


}
