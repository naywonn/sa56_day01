package sg.edu.nus.iss.sa56_day01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.sa56_day01.model.Employee;
import sg.edu.nus.iss.sa56_day01.service.EmployeeeService;

//RequestMapping
//GetMapping(Retrieve lsit/single objects)
//PostMapping (Create new object)
//PutMapping (Update an existing object)
//DeleteMapping (Delete a object from list/db)
//
@Controller
@RequestMapping(path="/employees")
public class EmployeeController {

    @Autowired  //this will auto call EmployeeService obj
    EmployeeeService empSvc;

    //@getMapping(value="/list")
    @GetMapping(value="/")
    public @ResponseBody List<Employee> getAllEmplyees(){
        return empSvc.getAllEmplyees();
    }

    @GetMapping(value="/filterlist")
    public @ResponseBody List<Employee> getAllEmplyeesByLastname(){
        return empSvc.getEmployeesByLastName("Tan");
    }
    
}
