package kodlamaiobackend;

import java.util.List;

import kodlamaiobackend.business.concretes.CategoryManager;
import kodlamaiobackend.business.concretes.CourseManager;
import kodlamaiobackend.business.concretes.CourseSearchService;
import kodlamaiobackend.business.concretes.InstructorManager;
import kodlamaiobackend.business.concretes.StatsManager;
import kodlamaiobackend.business.concretes.StudentManager;
import kodlamaiobackend.dataAccess.concretes.CategoryDao;
import kodlamaiobackend.dataAccess.concretes.CourseDao;
import kodlamaiobackend.dataAccess.concretes.InstructorDao;
import kodlamaiobackend.dataAccess.concretes.StudentDao;
import kodlamaiobackend.dataAccess.concretes.UserDao;
import kodlamaiobackend.entities.concretes.Category;
import kodlamaiobackend.entities.concretes.Course;
import kodlamaiobackend.entities.concretes.Instructor;
import kodlamaiobackend.entities.concretes.Student;
import kodlamaiobackend.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(2, "img.jpg", "HTML/CSS", "HTML/CSS öğreniyoruz.", null, 0);
		CourseManager courseManager = new CourseManager(new CourseDao());
		courseManager.add(course1);
		System.out.println(courseManager.getAll());
		System.out.println("-------");

		Category category1 = new Category(2, "Programlama", course1);
		Category category2 = new Category(4, "Programlama", null);
		CategoryManager categoryManager = new CategoryManager(new CategoryDao());
		categoryManager.add(category1);
		categoryManager.add(category2);
		System.out.println(categoryManager.getAll());
		System.out.println("-------");
		
		List<Course> courses = courseManager.getAll();
		
		Student student1 = new Student(courses, 1, 1, "Ceren", "Teke", "ct@gmail.co", "img.jpg");
		Student student2 = new Student(null, 2, 2, "Tospik", "Teke", "sev@i.co", "img.jpg");
		StudentManager studentManager = new StudentManager(new StudentDao());
		studentManager.add(student1);
		studentManager.add(student2);
		System.out.println(studentManager.getAll());
		studentManager.delete(1);
		System.out.println(studentManager.getAll());
		System.out.println("-------");
		
		Instructor instructor1 = new Instructor(courseManager.getAll(), 0, 3, "Tospik", "Demirog", "engin@demir.og", "img.jpg");
		InstructorManager instructorManager = new InstructorManager(new InstructorDao());
		instructorManager.add(instructor1);
		System.out.println(instructorManager.getAll());
		System.out.println("-------");

		
		CourseSearchService courseSearchService = new CourseSearchService();
		courseSearchService.search(new Course(3, "img.jpg", "C++", "C++ öğreniyoruz.", null, 0), "C++");
		courseSearchService.search(new Course(3, "img.jpg", "C++", "C++ öğreniyoruz.", null, 0), "Python");
		courseSearchService.search(instructor1, "Tospik");

		StatsManager statsManager = new StatsManager();
		statsManager.progress(student1, course1, 50);
		System.out.println(student1.getOwnedCourses());
	}

}
