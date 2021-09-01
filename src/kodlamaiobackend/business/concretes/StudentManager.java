package kodlamaiobackend.business.concretes;

import java.util.List;

import kodlamaiobackend.business.abstracts.StudentService;
import kodlamaiobackend.dataAccess.concretes.StudentDao;
import kodlamaiobackend.entities.concretes.Student;


public class StudentManager implements StudentService{

	StudentDao studentDao;
	
	public StudentManager(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> getAll() {
		return this.studentDao.getAll();
	}

	@Override
	public void add(Student entity) {
		this.studentDao.add(entity);
		
	}

	@Override
	public void update(Student entity) {
		this.studentDao.update(entity);
		
	}

	@Override
	public void delete(int id) {
		this.studentDao.delete(id);
		
	}
}
