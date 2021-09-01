package kodlamaiobackend.business.concretes;

import java.util.List;

import kodlamaiobackend.business.abstracts.CourseService;
import kodlamaiobackend.dataAccess.concretes.CourseDao;
import kodlamaiobackend.entities.concretes.Course;

public class CourseManager implements CourseService {

	CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	@Override
	public List<Course> getAll() {
		return this.courseDao.getAll();
	}

	@Override
	public void add(Course entity) {
		this.courseDao.add(entity);
		
	}

	@Override
	public void update(Course entity) {
		this.courseDao.update(entity);
		
	}

	@Override
	public void delete(int id) {
		this.courseDao.delete(id);
		
	}

}
