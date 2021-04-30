package kodlama.io;

public class Main {

	public static void main(String[] args) {


		StudentManager studentManager = new StudentManager();
		Student student = new Student(1,"NUR","HAYAT","nurhayatketenci@outlook.com", "kodlamaio",3);
		studentManager.add(student);
		student.setFirstName("NUR HAYAT");
        studentManager.update(student);
		studentManager.delete(student);

		 InstructorManager instructorManager = new InstructorManager();

		
		 Instructor instructor = new Instructor(1,"ENGÝN","DEMÝROÐ","engindemirog@gmail.com","kodlamaio","java");
		instructorManager.add(instructor);
		instructor.setFirstName("Engin DEMÝROG");
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
		
	}

}
