package kodlama.io;

public class UserManager {

	public void add( User user) {
		System.out.println(user.getFirstName() + "  eklendi.");
	}

	public void delete( User user) {
		System.out.println(user.getFirstName() + "  silindi.");
	}

	public void getAll() {
		System.out.println("kullan�c�lar listelendi.");
	}
    public void login( String email,  String password) {
		System.out.println(email + "giri� yap�ld�.");
	}

	public void logout( User user) {
		System.out.println(user.getFirstName() + "��k�� yap�ld�.");
	}

	public void update( User user) {
		System.out.println(user.getFirstName() + "g�ncellendi.");
	}
	
	
}
