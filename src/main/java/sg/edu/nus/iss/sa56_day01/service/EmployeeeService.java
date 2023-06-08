package sg.edu.nus.iss.sa56_day01.service;

import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.sa56_day01.model.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeeService {

    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeeService(){
        
        employees.add(new Employee("1","Hsien Loong", "Lee"));
        employees.add(new Employee("2","Derrick", "Tan"));
        employees.add(new Employee("3","Maverick", "Tan"));
        
    }

    public List<Employee> getAllEmplyees(){
        return this.employees;
    }

    public List<Employee>getEmployeesByLastName(String lastName){
        List<Employee> filterEmployees = employees.stream().filter(emp -> emp.getLastName().equals(lastName)).toList();

        return filterEmployees;
    }


    
}
