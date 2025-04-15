package example.company.com;

public class User {

	int _id;
	String _username;
	String _email;
	String _password;
	
	// class constructor
	public User(int id, String username, String email, String password) {
		_id = id;
		_username = username;
		_email = email;
		_password = password;
	}
	public String getUsername() {
		return _username;
	}
	public String getEmail() {
		return _email;
	}
	public int getId() {
		return _id;
	}
	
	public String getPassword() {
		return _password;
	}
}
