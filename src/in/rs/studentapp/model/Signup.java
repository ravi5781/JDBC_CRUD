package in.rs.studentapp.model;

import java.util.Scanner;

import in.rs.studentapp.dao.StudentDAO;
import in.rs.studentapp.dao.StudentImp;
import in.rs.studentapp.dto.Student;

public class Signup {
	public static void signup() {
		StudentDAO sdao=new StudentImp();
		Scanner sc = new Scanner(System.in);

		// creation of pojo class object
		Student s = new Student();

		// collecting the data from the user
		System.out.println("<--------  Welcome to Signup Page   -------->");
		System.out.println("Enter name: ");
		s.setName(sc.next());

		System.out.println("Enter Phone: ");
		s.setPhone(sc.nextLong());

		System.out.println("Enter Email: ");
		s.setMail(sc.next());

		System.out.println("Enter Branch: ");
		s.setBranch(sc.next());

		System.out.println("Enter Location: ");
		s.setLoc(sc.next());

		System.out.println("Enter Password: ");
		String password = sc.next();

		System.out.println("Enter Confirm Password: ");
		String confirmPassword = sc.next();

		if (password.equals(confirmPassword)) {
			s.setPassword(confirmPassword);
			
			boolean status=sdao.insertStudent(s);
			 if(status) {
			 System.out.println("Data added successfully!");
			 }
			 else {
			 System.out.println("Failed to add the data");
			 }
			
		} else {
			System.out.println("Password Mismatch. Try again.");
		}
sc.close();
	}

}
