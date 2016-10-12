/**
 * Driver class for question0 supplied to students
 *
 * Created 10 August, 2013
 * Last edited: 
 **/
import java.util.*;

class Question0{

   public static void main(String [] args){
	
  	    Scanner input = new Scanner (System.in);
	
	    Student aStudent = new Student();
	
	    System.out.println("All persons perform the following functions:");
		 aStudent.shower();
	         aStudent.eat();
	         aStudent.sleep();
	
	    System.out.println("Students do the following:");
	         aStudent.study();
		 aStudent.lectures();
	         aStudent.extraActivity();
		
	}//end main

}//end Quesiton0
