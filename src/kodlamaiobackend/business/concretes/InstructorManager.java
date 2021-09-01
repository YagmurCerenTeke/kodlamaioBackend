package kodlamaiobackend.business.concretes;

import java.util.List;

import kodlamaiobackend.business.abstracts.InstructorService;
import kodlamaiobackend.dataAccess.concretes.InstructorDao;
import kodlamaiobackend.entities.concretes.Instructor;

public class InstructorManager implements InstructorService {

	InstructorDao instructorDao;
	
	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
	}

	@Override
	public List<Instructor> getAll() {
		return this.instructorDao.getAll();
	}

	@Override
	public void add(Instructor entity) {
		this.instructorDao.add(entity);
		
	}

	@Override
	public void update(Instructor entity) {
		this.instructorDao.update(entity);
		
	}

	@Override
	public void delete(int id) {
		this.instructorDao.delete(id);
		
	}

}
