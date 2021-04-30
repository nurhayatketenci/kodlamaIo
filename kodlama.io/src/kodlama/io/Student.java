package kodlama.io;

public class Student extends User{
	
private int grade;


public Student(int id,String firstName,String lastName, String email, String password,int grade) {
	super(id, firstName, lastName, email,password);
	this.grade = grade;
}
  
public int getGrade() {
	return grade;
}

public void setGrade(int grade) {
	this.grade = grade;
}

public Student() {
	super();
}






}
