package in.rs.studentapp.dao;

import in.rs.studentapp.dto.Student;
import java.util.ArrayList;


public interface StudentDAO {
	public boolean insertStudent(Student s);

	public boolean updateStudent(Student s);

	public boolean deleteStudent(int id);

	public Student getStudent(String mail, String password);

	public Student getStudent(long phone, String mail);

	public ArrayList<Student> getStudent();
}
