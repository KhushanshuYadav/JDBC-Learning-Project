package com.student.manage;

public class Queries {
	
	static String insertQuery="INSERT INTO students(sid,sname,sphone,scity) VALUES (?,?,?,?)";
	static String deleteQuery="DELETE FROM students WHERE sid=?";
	static String updateQuery="UPDATE students SET sname=? where id=?";
	static String selectQuery="SELECT * FROM students";
	
	

}
