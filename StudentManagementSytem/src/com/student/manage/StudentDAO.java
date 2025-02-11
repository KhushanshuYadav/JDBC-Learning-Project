package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
	public static void selectAll() throws SQLException {
		
        Connection conn=CreateConnection.giveConnection();
		
		String q=Queries.selectQuery;
		PreparedStatement pstmt=conn.prepareStatement(q);
		
		//data is obtained as result set object we need to process it
		ResultSet resultSet=pstmt.executeQuery();
		
		while(resultSet.next()){
			
			int id=resultSet.getInt(1);
			String name=resultSet.getString("sname");
			String city=resultSet.getString("scity");
			String phone=resultSet.getString("sphone");
			
			System.out.println("Id "+id+" Name: "+name+" city: "+city+" phone: "+phone);
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		    
		}
		
		System.out.println("Complete");
		
	}

}
