package service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import entity.Employee;
import repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired 
	private EmployeeRepository repository; 
	public Employee saveEmployee(Employee employee) {
//		if(employee.getName()==null|| employee.getName().trim().isEmpty()) {
//			
//			throw new RuntimeException("employeee name cantt be emptyy");
//			
//		}
//		if(employee.getName().length()<3) {
//			
//			throw new ResponseStatusException(
//					
//					HttpStatus.BAD_REQUEST,
//					
//	"bussiness rule faied:Employee name should contains at least 3 character");
//
//			
//			
//		}
		
		return repository.save(employee);
	}
}