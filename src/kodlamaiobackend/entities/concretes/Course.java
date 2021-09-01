package kodlamaiobackend.entities.concretes;

import kodlamaiobackend.entities.abstracts.Entity;

public class Course implements Entity {

	private int id;
	private String image;
	private String name;
	private String details;
	private Instructor instructor;
	private double completionRate;
	
	public Course() {
		super();
	}

	public Course(int id, String image, String name, String details, Instructor instructor, double completionRate) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.details = details;
		this.instructor = instructor;
		this.completionRate = completionRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public double getCompletionRate() {
		return completionRate;
	}

	public void setCompletionRate(double completionRate) {
		this.completionRate = completionRate;
	}

	@Override
	public String toString() {
		return "Course [image=" + image + ", name=" + name + ", details=" + details + ", instructor=" + instructor
				+ ", completionRate=" + completionRate + "]";
	}
	
}
