package kodlama.io;

public class UserManager {

	public void add( User user) {
		System.out.println(user.getFirstName() + "  eklendi.");
	}

	public void delete( User user) {
		System.out.println(user.getFirstName() + "  silindi.");
	}

	public void getAll() {
		System.out.println("kullanýcýlar listelendi.");
	}
    public void login( String email,  String password) {
		System.out.println(email + "giriþ yapýldý.");
	}

	public void logout( User user) {
		System.out.println(user.getFirstName() + "çýkýþ yapýldý.");
	}

	public void update( User user) {
		System.out.println(user.getFirstName() + "güncellendi.");
	}
	
	
}
