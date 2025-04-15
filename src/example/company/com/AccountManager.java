package example.company.com;

public class AccountManager {

	// This class will store UserManager
	UserManager manager = new UserManager();
	
//	Login() {
//		
//	}
	
	public boolean Register(String username, String password) {
		boolean exists = manager.checkUserExists(username);
		boolean strong = checkPasswordStrength(password);
		if (exists) {
			System.out.println("Username exists!");
			return false;
		}
		if (!strong) {
			System.out.println("Password to weak!");
			return false;
		}
		manager.insert(new User(0, username, password, ""));
		return true;
	}
	
	private boolean checkPasswordStrength(String password) {
		if (password.length() >= 5 && password.length() <= 8) {
			return true;
		}
		return false;
	}
	
}

