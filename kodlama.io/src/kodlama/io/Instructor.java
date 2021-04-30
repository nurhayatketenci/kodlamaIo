package kodlama.io;

public class Instructor extends User {
	
	
private String instructorCourseName;

public Instructor(int id,String firstName,String lastName, String email, String password,String instructorCourseName) {
	super(id, firstName, lastName, email,password);
	this.instructorCourseName = instructorCourseName;
}


public Instructor() {
	super();
}


public String getInstructorCourseName() {
	return instructorCourseName;
}

public void setInstructorCourseName(String instructorCourseName) {
	this.instructorCourseName = instructorCourseName;
}


}
