import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello,");
		
		 BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
		
		while(true) {
			
			System.out.println("Enter 1 to add student details");
			System.out.println("Enter 2 to delete student details");
			System.out.println("Enter 3 to update student details");
			System.out.println("Enter 4 to end opeartions");
			
			int c= Integer.parseInt(bReader.readLine());
			
			
			if(c==1) {
				//TODO add student
				
			}
			else if(c==2) {
				//TODO delete student
				
			}
			else if(c==3) {
				//TODO update student
				
			}
			else if(c==4) {
				break;
				
			}
			else {
				System.out.println("Enter a valid value");
				continue;
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
