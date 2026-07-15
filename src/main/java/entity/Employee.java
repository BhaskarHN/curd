package entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "curddd")
public class Employee {

    @Id
    private int id;
   @NotBlank(message="namee cant be empty")
   @Size(min=3,max=20,message="name should contain 3 to 20 characters")
    private String name;
   @Email(message="enter valid email")
    private String email;
    @NotNull(message ="salary is mandatory")
    @Min(value=10000,message="minimum salary is 10000")
    @Max(value=10000,message="minimum salary is 10000")
    private Double salary;
   @Min(value=18,message="age should be min 18")
   @Max(value=60,message="age should be min 60")
    private int age;
public Employee() {
	
}
public Employee(int id,String name,
		 String email,
		 Double salary,
		  int age) {
	
	this.id = id;
	this.name = name;
	this.email = email;
	this.salary = salary;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}