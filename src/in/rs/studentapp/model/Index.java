package in.rs.studentapp.model;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Welcome to Student Application");

		do {
			System.out.println("1. SIGHUP");
			System.out.println("2. LOGIN");
			System.out.println("3. FORGOT PASSWORD");
			System.out.println("4. EXIT");
			choice = sc.nextInt();

			switch (choice) {
			case 1:Signup.signup();
				break;

			case 2:Login.login();
				break;

			case 3:Password.forgot();
				break;

			case 4:
				System.out.println("Thank You!!!!!!!");
				break;

			default:
				System.out.println("Invalid choice,Please select Valid One");
				break;

			}
		} while (choice != 4);
		sc.close();
	}

}
