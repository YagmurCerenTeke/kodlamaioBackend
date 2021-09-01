package kodlamaiobackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaiobackend.dataAccess.abstracts.InstructorDaoRepository;
import kodlamaiobackend.entities.concretes.Instructor;


public class InstructorDao implements InstructorDaoRepository {

	List<Instructor> instructors;
	boolean check;
	
	public InstructorDao() {
		this.instructors = new ArrayList<Instructor>();
		this.instructors.add(new Instructor(null, 0, 3, "Engin", "Demirog", "engin@demir.og", "img.jpg"));
	}
	
	@Override
	public List<Instructor> getAll() {
		return instructors;
	}

	@Override
	public void add(Instructor entity) {
		this.instructors.add(entity);
		
	}

	@Override
	public void update(Instructor entity) {
		System.out.println(entity.getFirstName() + " updated.");
		
	}

	@Override
	public void delete(int id) {
		for(Instructor instructor : this.instructors) {
			if(instructor.getId() == id) {
				this.instructors.remove(id);
				this.check=true;
			}
		}
		if(!check) {
			System.out.println("Instructor not found.");
		}
		
	}

}