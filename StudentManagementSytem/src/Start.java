import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.student.manage.Student;
import com.student.manage.StudentDAO;



public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello,");
		
		 BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
		
		while(true) {
			
			System.out.println("Enter 1 to add student details");
			System.out.println("Enter 2 to delete student details");
			System.out.println("Enter 3 to update student details");
			System.out.println("Enter 4 to show all students details");
			
			System.out.println("Enter 5 to end opeartions");
			
			int c= Integer.parseInt(bReader.readLine());
			
			
			if(c==1) {
				//TODO add student
				System.out.println("Enter student's name");
				String name=bReader.readLine();
				
				System.out.println("Enter student's phone");
				String phone=bReader.readLine();
				
				System.out.println("Enter student's city");
				String city=bReader.readLine();
				
				Student st=new Student(name,phone,city);
				
				
				StudentDAO.insert(st);
				
				
				
			}
			else if(c==2) {
				//TODO delete student
				System.out.println("Enter student's id");
				int id= Integer.parseInt(bReader.readLine());
				StudentDAO.delete(id);
				
				
			}
			else if(c==3) {
				//TODO update student
				System.out.println("Enter student's id");
				int id= Integer.parseInt(bReader.readLine());
				
				System.out.println("Enter student's name");
				String changeName=bReader.readLine();

				StudentDAO.updateName(id,changeName);
				
			}
			else if(c==4) {
				//TODO show all
				
			}
			else if(c==5) {
				break;
				
			}
			else {
				System.out.println("Enter a valid value");
				continue;
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
