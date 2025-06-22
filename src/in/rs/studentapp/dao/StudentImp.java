package in.rs.studentapp.dao;

import java.sql.*;
import java.util.ArrayList;

import in.rs.studentapp.connection.Connector;
import in.rs.studentapp.dto.Student;

public class StudentImp implements StudentDAO {
	private Connection con;

	public StudentImp() {
		this.con = Connector.requestConnection();
	}

	@Override
	public boolean insertStudent(Student s) {
		PreparedStatement ps = null;
		String query = "INSERT INTO STUDENT VALUES (0,?,?,?,?,?,?,sysdate())";
		int res = 0;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, s.getName());
			ps.setLong(2, s.getPhone());
			ps.setString(3, s.getMail());
			ps.setString(4, s.getBranch());
			ps.setString(5, s.getLoc());
			ps.setString(6, s.getPassword());
			res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (res > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudent(String mail, String password) {
		// TODO Auto-generated method stub
		PreparedStatement ps=null;
		 String query="SELECT * FROM STUDENT WHERE MAIL=? AND PASSWORD=?";
		 Student s=null;
		 try {
		 ps=con.prepareStatement(query);
		 ps.setString(1,mail);
		 ps.setString(2, password);
		 ResultSet rs=ps.executeQuery();
		 while(rs.next()) {
		 s=new Student();
		//int id=rs.getInt("id");
		 //s.setId(id);
		 s.setId(rs.getInt("id"));
		 s.setName(rs.getString("name"));
		 s.setPhone(rs.getLong("phone"));
		 s.setMail(rs.getString("mail"));
		 s.setBranch(rs.getString("branch"));
		 s.setLoc(rs.getString("loc"));
		 s.setPassword(rs.getString("password"));
		 s.setDate(rs.getString("date"));
		 }

		 } catch (SQLException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		 return s;

	}

	@Override
	public Student getStudent(long phone, String mail) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public ArrayList<Student> getStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
