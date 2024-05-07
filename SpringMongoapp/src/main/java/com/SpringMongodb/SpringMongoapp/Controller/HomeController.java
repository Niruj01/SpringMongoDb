package com.SpringMongodb.SpringMongoapp.Controller;


import com.SpringMongodb.SpringMongoapp.Entity.EmployeeEntity;
import com.SpringMongodb.SpringMongoapp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/addEmployee")
    public String showAddEmployee(){
        return "addEmployee";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute EmployeeEntity employeeEntity){
        employeeService.storeEmployeeInDb(employeeEntity);
        return "redirect:/";
    }

    @GetMapping("/displayAllEmployee")
    public String showAllEmployee(Model model){
        List<EmployeeEntity> Employees = employeeService.getDisplayAll();
        model.addAttribute("employee",Employees);
        return "displayEmployee";
    }

    @GetMapping("/findEmployeeById")
    public String findById(){
        return "findById";
    }

    @GetMapping("/search")
    public String showEmployeeById(@RequestParam int employeeId,Model model){
        List<EmployeeEntity> employeesid = employeeService.findByEmployeeId(employeeId);
        model.addAttribute("employee",employeesid);
        return "displayEmployee";
    }

}
