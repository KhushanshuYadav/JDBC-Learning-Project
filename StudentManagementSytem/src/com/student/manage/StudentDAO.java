package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//this class is responsible for interaction with the database i.e
//all interaction logic here

public class StudentDAO {
	
	public static void insert(Student st) throws SQLException {
		
		Connection conn=CreateConnection.giveConnection();
		
		String q=Queries.insertQuery;
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		pstmt.setString(1,st.getStudentName() );
		pstmt.setString(2,st.getStudentPhone() );
		pstmt.setString(3,st.getStudentCity() );
		
		pstmt.executeUpdate();
		System.out.println("Data insertion done");
		
	}
	
	public static void delete(Student st) {
		
		
	}
    
	public static void update(Student st) {
		
		
	}
    
	public static void selectAll(Student st) {
		
		
	}

}
