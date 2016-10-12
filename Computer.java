/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 4
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 15/08/13

public class Computer {
    protected String serial,manufacturer,colour,size;
    
    public Computer copy(){
        return this;
    }
    public void setSerial(String number){
        serial = number;
    }
    
    public void setManufacturer(String Name){
        manufacturer = Name;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public void setSize(String size){
        this.size = size;
    }
    

}
