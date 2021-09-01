package kodlamaiobackend.business.concretes;


import java.util.List;

import kodlamaiobackend.business.abstracts.StatsService;
import kodlamaiobackend.entities.concretes.Course;
import kodlamaiobackend.entities.concretes.Student;

public class StatsManager implements StatsService {

	public void progress(Student student, Course course, double completionAmount) {
		
		List<Course> ownedCourses = student.getOwnedCourses();
		for(Course course1: ownedCourses) {
			if(course.getId() == course1.getId()) {
				course1.setCompletionRate(completionAmount/100);
			}
		}		
	}

}
