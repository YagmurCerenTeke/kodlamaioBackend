package kodlamaiobackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaiobackend.dataAccess.abstracts.StudentDaoRepository;
import kodlamaiobackend.entities.concretes.Student;


public class StudentDao implements StudentDaoRepository {

	List<Student> students;
	boolean check = false;
	
	public StudentDao() {
		this.students = new ArrayList<Student>();
		this.students.add(new Student(null, 1, 0, "Fatma", "Gül", "fatma@gul.co", "img.jpg"));
	}
	
	@Override
	public List<Student> getAll() {
		return students;
	}

	@Override
	public void add(Student entity) {
		this.students.add(entity);
		
	}

	@Override
	public void update(Student entity) {
		System.out.println(entity.getFirstName() + " updated.");
		
	}

	@Override
	public void delete(int id) {
		for(Student student : this.students) {
			if(student.getId() == id) {
				this.students.remove(id);
				this.check=true;
			}
		}
		if(!check) {
			System.out.println("Student not found.");
		}
		
	}

}
