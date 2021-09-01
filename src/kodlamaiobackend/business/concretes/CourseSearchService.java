package kodlamaiobackend.business.concretes;

import kodlamaiobackend.entities.concretes.Course;
import kodlamaiobackend.entities.concretes.Instructor;

public class CourseSearchService{
	
	public Integer search(Course course, String keyword) {
		if(keyword == course.getName()) {
			System.out.println(course.getName());
			return course.getId();
		}else {
			System.out.println("Course not found.");
			return null;
		}
		
	}
	
	public Integer search(Instructor instructor, String keyword) {
		if(keyword == instructor.getFirstName()) {
			System.out.println(instructor.getFirstName());
			return instructor.getId();
		}else {
			System.out.println("Instructor not found.");
			return null;
		}
		
	}

}
