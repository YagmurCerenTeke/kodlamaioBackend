package kodlamaiobackend.entities.concretes;

import kodlamaiobackend.entities.abstracts.Entity;

public class Category implements Entity{

	private int id;
	private String name;
	private Course course;
	
	public Category() {
		super();
	}

	public Category(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}
