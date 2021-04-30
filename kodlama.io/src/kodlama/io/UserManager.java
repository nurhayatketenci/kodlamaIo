package kodlama.io;

public class UserManager {

	public void add( User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý eklendi.");
	}

	public void delete( User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý silindi.");
	}

	public void getAll() {
		System.out.println("Tüm kullanýcýlar listelendi.");
	}



	public void login( String email,  String password) {
		System.out.println(email + " e-postaya sahip kullanýcý tarafýndan giriþ yapýldý.");
	}

	public void logout( User user) {
		System.out.println(
				user.getEmail() + " e-postaya sahip " + user.getFirstName() + "kullanýcý tarafýndan çýkýþ yapýldý.");
	}

	public void update( User user) {
		System.out.println(user.getFirstName() + " kullanýcýsý güncellendi.");
	}
	
	
}
