package kodlama.io;

public class UserManager {

	public void add( User user) {
		System.out.println(user.getFirstName() + " kullan�c�s� eklendi.");
	}

	public void delete( User user) {
		System.out.println(user.getFirstName() + " kullan�c�s� silindi.");
	}

	public void getAll() {
		System.out.println("T�m kullan�c�lar listelendi.");
	}



	public void login( String email,  String password) {
		System.out.println(email + " e-postaya sahip kullan�c� taraf�ndan giri� yap�ld�.");
	}

	public void logout( User user) {
		System.out.println(
				user.getEmail() + " e-postaya sahip " + user.getFirstName() + "kullan�c� taraf�ndan ��k�� yap�ld�.");
	}

	public void update( User user) {
		System.out.println(user.getFirstName() + " kullan�c�s� g�ncellendi.");
	}
	
	
}
