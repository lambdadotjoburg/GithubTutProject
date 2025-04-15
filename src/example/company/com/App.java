package example.company.com;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class App {
	
	Scanner scanner = new Scanner(System.in);
	AccountManager account = new AccountManager();
	
	// AccountManager() => registering/login 
	
	// logic for keeping app running
	// logic for decision making
	public void Run() {
		
		while(true) {
			
			printMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if (choice == 0) {
				break;
			}
			HandleInput(choice);
		}
	}
	
	private void printMenu() {
		System.out.println("0) Exit");
		System.out.println("1) Register");
		System.out.println("2) Login");
	}
	
	public void HandleInput(int choice) {
		if (choice == 1) {
			// register ...
			System.out.println("Enter username: \n");
			String username = scanner.nextLine();
			
			System.out.println("Enter password: \n");
			String password = scanner.nextLine();			
			
			boolean success = account.Register(username, password);
			if (success) {
				System.out.println("registration success");
			} else {
				System.out.println("registration failed");
			}
			
		} else if (choice == 2) {
			// login ...
			System.out.println("Login");
		} else {
			System.out.println("Invalid menu option selected");
		}
	}
	
//	AccountManager accMan = new AccountManager();		
//	accMan.Register("john", "1234");
//	accMan.Register("john", "1234");
//	accMan.Register("john", "12345");
	
}
