package kodlamaiobackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaiobackend.dataAccess.abstracts.CourseDaoRepository;
import kodlamaiobackend.entities.concretes.Course;



public class CourseDao implements CourseDaoRepository {

	List<Course> courses;
	boolean check;
	
	public CourseDao() {
		this.courses = new ArrayList<Course>();
		this.courses.add(new Course(1, "img.jpg", "Java", "Java öğreniyoruz.", null, 0));
	}
	
	@Override
	public List<Course> getAll() {
		return courses;
	}

	@Override
	public void add(Course entity) {
		this.courses.add(entity);
		
	}

	@Override
	public void update(Course entity) {
		System.out.println(entity.getName() + " updated.");
		
	}

	@Override
	public void delete(int id) {
		for(Course course : this.courses) {
			if(course.getId() == id) {
				this.courses.remove(id);
				this.check=true;
			}
		}
		if(!check) {
			System.out.println("Course not found.");
		}
		
	}
}
