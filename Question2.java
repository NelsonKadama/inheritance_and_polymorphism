/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 4
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 15/08/13
import java.util.Scanner;
public class Question2 {
    public static void main (String [] args){
        
        Computer[] details = null;
        Computer[] new_details;
        Computer[] temp;
        int count = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Great International Technology");
        while(true){
            char choice;
            System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
            choice = Character.toUpperCase((input.nextLine()).charAt(0));
            
            switch(choice){
                case 'B':
                    count+=1;
                    new_details = new Computer[1];
                    new_details[0] = new Box();
                    
                    System.out.println("Enter the serial number");
                    new_details[0].setSerial(input.nextLine());
                    System.out.println("Enter the manufacturer");
                    new_details[0].setManufacturer(input.nextLine());
                    System.out.println("Enter the colour");
                    new_details[0].setColour(input.nextLine());
                    System.out.println("Enter the amount of memory (MB)");
                    new_details[0].setSize(input.nextLine());
                    
                    if(count == 1){
                        details = new Computer[1];
                        details[0] = new_details[0].copy();
                    }
                    else{
                        temp = new Computer[count];
                        for(int k = 0; k < count-1; k++){
                            temp[k] = details[k].copy();
                        }
                        details = new Computer[count];
                        for(int k = 0; k < count; k++){
                            if(k == count-1)
                                details[k] = new_details[0].copy();
                            else
                                details[k] = temp[k].copy();
                        }
                        
                    }
                    
                    System.out.println("Done");
                    
                    
                    break;
                    
                case 'S':
                    count+=1;
                    new_details = new Computer[1];
                    new_details[0] = new Screen();
                    
                    System.out.println("Enter the serial number");
                    new_details[0].setSerial(input.nextLine());
                    System.out.println("Enter the manufacturer");
                    new_details[0].setManufacturer(input.nextLine());
                    System.out.println("Enter the colour");
                    new_details[0].setColour(input.nextLine());
                    System.out.println("Enter the screen size in inches");
                    new_details[0].setSize(input.nextLine());
                    
                    if(count == 1){
                        details = new Computer[1];
                        details[0] = new_details[0].copy();
                    }
                    else{
                        temp = new Computer[count];
                        for(int k = 0; k < count-1; k++){
                            temp[k] = details[k].copy();
                        }
                        details = new Computer[count];
                        for(int k = 0; k < count; k++){
                            if(k == count-1)
                                details[k] = new_details[0].copy();
                            else
                                details[k] = temp[k].copy();
                        }
                        
                    }
                    
                    System.out.println("Done");
                    break;
                    
                case 'A':
                    count+=1;
                    new_details = new Computer[1];
                    new_details[0] = new Accessories();
                    
                    System.out.println("Enter the serial number");
                    new_details[0].setSerial(input.nextLine());
                    System.out.println("Enter the manufacturer");
                    new_details[0].setManufacturer(input.nextLine());
                    System.out.println("Enter the colour");
                    new_details[0].setColour(input.nextLine());
                    
                    if(count == 1){
                        details = new Computer[1];
                        details[0] = new_details[0].copy();
                    }
                    else{
                        temp = new Computer[count];
                        for(int k = 0; k < count-1; k++){
                            temp[k] = details[k].copy();
                        }
                        details = new Computer[count];
                        for(int k = 0; k < count; k++){
                            if(k == count-1)
                                details[k] = new_details[0].copy();
                            else
                                details[k] = temp[k].copy();
                        }
                        
                    }
                    
                    System.out.println("Done");
                    break;
                    
                case 'D':
                    System.out.println("Enter the serial number");
                    String number = input.nextLine();
                    boolean found = false;
                    int pos = 0;
                    int iterator = 0;
                    int occurences = 0;
                    
                    if (details == null){
                        System.out.println("Not found");
                        break;
                    }
                        
                    for(int k = 0; k < details.length; k++){
                        if((details[k].serial).equals(number)){
                            occurences+=1;
                            found = true;
                        }
                            
                    }
                    if (occurences == 0){
                        System.out.println("Not found");
                        break;
                    }
                    temp = new Computer[(details.length)-occurences];
                    
                    while(iterator < details.length){
                        
                        if((details[iterator].serial).equals(number)){
                            iterator+=1;
                            continue;
                        }
                        else{
                            temp[pos] = details[iterator].copy();
                            pos+=1;
                        }
                        
                        iterator+=1;
                    }
                    details = new Computer[temp.length];
                    for(int k = 0; k < details.length; k++){
                        details[k] = temp[k].copy();
                    }
                    
                    if (found == false)
                        System.out.println("Not found");
                    else{
                        System.out.println("Done");
                        count-=1;
                    }
                        
                    break;
                    
                case 'L':
                    for (int k = 0; k < details.length; k++){
                        System.out.println(details[k]);
                    }
                    System.out.println("Done");
                    break;
                    
                case 'Q':
                    return ;
                    
                    
                    
            
                
            }
        }
 
    
    }

}
