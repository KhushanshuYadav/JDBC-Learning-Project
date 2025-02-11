package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//this class is responsible for interaction with the database i.e
//all interaction logic here

//generally DAO is a interface and is implemented by multiple classes

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
	
	public static void delete(int id) throws SQLException {
		
        Connection conn=CreateConnection.giveConnection();
		
		String q=Queries.deleteQuery;
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		System.out.println("Data deletion done");
		
	}
    
	public static void updateName(int id,String name) throws SQLException {
		
        Connection conn=CreateConnection.giveConnection();
		
		String q=Queries.updateQuery;
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		pstmt.setString(1,name);
		pstmt.setInt(2, id);
		
		pstmt.executeUpdate();
		System.out.println("Data updation done");
		
		
	}
    
	public static void selectAll(Student st) {
		
		
	}

}
