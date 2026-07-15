
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import entity.Employee;
//import repository.EmployeeRepository;
//
//@RestController
//public class EmployeeController {
//
//    @Autowired
//    private EmployeeRepository repository;
//
//    // Save Employee
//    @PostMapping("/save")
//    public Employee saveEmployee(@RequestBody Employee employee) {
//
//        return repository.save(employee);
//
//    }
// 
//    // Get All Employees
//    @GetMapping("/getAll")
//    public List<Employee> getAllEmployees() {
//
//        return repository.findAll();
//
//    }
//
//    // Get Employee By Id
////    @GetMapping("/getById/{id}")
////    public Optional<Employee> getEmployeeById(@PathVariable int id) {
////
////        return repository.findById(id);
////
////    }
//    @GetMapping("/getById/{id}")
//    public Employee getEmployeeById(@PathVariable int id) {
//
//        return repository.findById(id).get();
//
//    }
//
//    // Update Employee
//    @PutMapping("/update")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//
//        return repository.save(employee);
//
//    }
//
//    // Delete Employee By Id
//    @DeleteMapping("/delete/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//
//        repository.deleteById(id);
//        
//        return "Employee Deleted Successfully";
//
//    }
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Employee;
import jakarta.validation.Valid;
import service.EmployeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService  service;
//	@PostMapping("/save")
//	public Employee saveEmployee(@RequestBody Employee employee)
//	{
//		return service.saveEmployee(employee);
//	}
//	
//	@PostMapping("/save")
//	public Employee saveEmployee(@Valid @RequestBody Employee employee)
//	{
//		return service.saveEmployee(employee);
//	}
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(
	        @Valid @RequestBody Employee employee){

	    Employee savedEmployee = service.saveEmployee(employee);

	    return new ResponseEntity<>(savedEmployee,
	            HttpStatus.CREATED);

	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Employee> getEmployee(
	@PathVariable int id){

	Employee employee = service.getEmployeeById(id);

	if(employee!=null){

	return ResponseEntity.ok(employee);

	}

	return ResponseEntity.notFound().build();

	}
	
	
	
}
