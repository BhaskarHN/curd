package entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	private int id;
	
	private String name;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] resume;
	public Student() {
	}	
	public Student(int id, String name, byte[] photo, byte[] resume) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.resume = resume;
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
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getResume() {
		return resume;
	}
	public void setResume(byte[] resume) {
		this.resume = resume;
	}
	
	
	
	
	

}
