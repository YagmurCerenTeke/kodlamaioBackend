package kodlamaiobackend.business.abstracts;

import kodlamaiobackend.entities.concretes.Course;
import kodlamaiobackend.entities.concretes.Instructor;

public interface CourseSearchManager {

	public Integer search(Course course, String keyword);
	
	public Integer search(Instructor instructor, String keyword);
	
}
