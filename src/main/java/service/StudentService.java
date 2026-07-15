package service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import entity.Student;
import repository.StudentRepository;

@Service
public class StudentService {

	@Autowired 
	private StudentRepository repository; 
	
	
	public Student saveStudent(int id,
			String name, MultipartFile photo,MultipartFile resume) throws IOException{
		Student student=new Student();
		student.setId(id);
		student.setName(name);
		student.setPhoto(photo.getBytes());
		student.setResume(resume.getBytes());
		
	
				return  repository.save(student);
		
	}
	
}
