package kodlamaiobackend.entities.concretes;

import java.util.List;

public class Instructor extends User {

	private int instructorId;
	private List<Course> ownedCourses;

	public Instructor() {
		super();
	}

	public Instructor(List<Course> ownedCourses, int instructorId, int id, String firstName, String lastName, String email, String image) {
		super(id, firstName, lastName, email, image);
		this.ownedCourses = ownedCourses;
		this.instructorId = instructorId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public List<Course> getOwnedCourses() {
		return ownedCourses;
	}

	public void setOwnedCourses(List<Course> ownedCourses) {
		this.ownedCourses = ownedCourses;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", ownedCourses=" + ownedCourses + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
				+ getEmail() + ", getImage()=" + getImage() + "]";
	}

	

}
