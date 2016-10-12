/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 4
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 15/08/13

public class Screen extends Computer {
    
    public Computer copy(){
        Screen temp = new Screen();
        temp.colour = this.colour;
        temp.manufacturer = this.manufacturer;
        temp.serial = this.serial;
        temp.size = this.size;
        
        return temp;
    }
    public String toString(){
        return "Screen: "+serial +", "+colour+", "+manufacturer+", "+size;
    }

}
