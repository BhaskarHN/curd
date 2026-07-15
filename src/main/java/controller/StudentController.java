package controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import entity.Student;
import service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService service;
	
	@PostMapping("/saveeee")
	public Student saveStudent(
			@RequestParam int id,
			@RequestParam String name,
			@RequestParam MultipartFile photo,
			@RequestParam MultipartFile resume
			
			)throws IOException{
		return service.saveStudent(id,name,photo,resume);
	}
	
	
	
	
	

}
