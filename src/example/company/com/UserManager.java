package example.company.com;

public class UserManager {
	
	int capacity = 2;
	int count = 0;
	
	User[] data = new User[capacity];
	
	public void insert(User user) {
		data[count] = user;
		count++;
		if (count >= capacity-1) {
			grow(capacity);
		}
//		printInfo();
	}
	
	public void grow(int c) {
		capacity = c*2;
		User[] tempData = new User[capacity];
		for (int i = 0; i < count; i++) {
			tempData[i] = data[i];
		}
		data = tempData;
	}
	
	public void printInfo() {
		System.out.println("Count: " + count);
		System.out.println("Capacity: " + capacity);
	}
	
	public User remove() {
		User tempUser = data[count-1];
		data[count-1] = null;
		count--;
		if (count <= capacity/2 - 1) {
			shrink(capacity);
		}
//		printInfo();
		return tempUser;
	}
	
	public void shrink(int c) {
		capacity = c/2;
		User[] tempData = new User[capacity];
		for (int i = 0; i < count; i++) {
			tempData[i] = data[i];
		}
		data = tempData;
	}
	
	public void printArray() {
		for (int i = 0; i < count; i++) {
			String userData = i + ") " + "\t" + data[i].getId() + " " + data[i].getUsername() + " " + data[i].getEmail();
			System.out.println(userData);
		}
	}
	
	public void insertAt(User user, int index) {
		
		if (index > count)  {
			insert(user);
			return;
		}
		
		for (int i = count-1; i >= index; i--) {
//			System.out.println(i);
			data[i+1] = data[i];
//			System.out.println(data[i]._username);
		}
		data[index] = user;
		count++;
		if (count >= capacity-1) {
			grow(capacity);
		}
	}
	
	public void removeAt(int index) {
		for (int i = index; i < count-1; i++) {
			data[i] = data[i+1];
		}
		data[count] = null;
		count--;
		if (count <= capacity/2 - 1) {
			shrink(capacity);
		}
	}
	
	public void findById(int id) {
		
	}
	
	public boolean checkUserExists(String usernameToFind) {
		
		for (int i = 0; i < count; i++) {
			if (data[i].getUsername().equals(usernameToFind)) {
				return true;
			}
		}
		
		return false;
	}
	
	
	// removeById(int id) => remove user based on id
	// removeByUsername(String username) => remove user based on username
	
}
