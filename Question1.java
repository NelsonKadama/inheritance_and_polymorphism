/**
 * Driver class for question 1 provided to students
 *
 * created 10 August, 2013
 * Last edited
 **/
import java.util.*;

class Question1
{
   public static void main ( String args [] )
   {
      Scanner input = new Scanner(System.in);
		String owner; //name of the vehicle owner
		String make;  //make of the vehicle or manufacurer
		int cylinders; //number of cylinders in the engine
		int capacity; //car's seating capacity  
		double weight; //weight of the car
		
		System.out.println("Enter the vehicle manufacturer:");
		   make = input.nextLine();
		System.out.println("Enter the name of the vehicle owner:");
		   owner = input.nextLine();
		System.out.println("Enter the number of cylinders in the engine:");
		   cylinders = input.nextInt();
			
		System.out.println (new Vehicle (cylinders, make, owner)); //create Vehicle object
		
		   input.nextLine(); //clear the \n

		System.out.println("\nEnter the Car manufacturer:");
		   make = input.nextLine(); 
		System.out.println("Enter the name of the car owner:");
		   owner = input.nextLine();
		System.out.println("Enter the number of cylinders in the engine:");
		   cylinders = input.nextInt();
		System.out.println("Enter the car sitting capacity:");
		   capacity = input.nextInt();
		System.out.println("Enter the weight of the car:");
		   weight = input.nextDouble();
		
     System.out.println (new Car (cylinders, make, owner, capacity, weight)); //create car object
     
   }
}
