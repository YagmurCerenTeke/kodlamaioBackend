package kodlamaiobackend.business.abstracts;

import kodlamaiobackend.entities.concretes.Course;
import kodlamaiobackend.entities.concretes.Student;

public interface StatsService {

	public void progress(Student student, Course course, double completionAmount);
}
