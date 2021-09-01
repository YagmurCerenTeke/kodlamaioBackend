package kodlamaiobackend.entities.concretes;

import java.util.List;

public class Student extends User{

	private int studentId;
	private List<Course> ownedCourses;

	public Student() {
		super();
	}
	
	public Student(List<Course> ownedCourses,int studentId,int id, String firstName, String lastName, String email, String image) {
		super(id, firstName, lastName, email, image);
		this.ownedCourses = ownedCourses;
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public List<Course> getOwnedCourses() {
		return ownedCourses;
	}

	public void setOwnedCourses(List<Course> ownedCourses) {
		this.ownedCourses = ownedCourses;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", ownedCourses=" + ownedCourses + ", getId()=" + getId()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
				+ getEmail() + ", getImage()=" + getImage() + "]";
	}

	



	
}
