/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */

import java.text.*;

public class Car extends Vehicle{
    
    DecimalFormat df = new DecimalFormat("0.0");
    private int Capacity;
    private double Weight;
    
    public Car(int cylinders, String manufacturer, String owner,  int capacity,double weight){
        
        super(cylinders,manufacturer,owner);
        Capacity = capacity;
        Weight = weight;

    
    }
    
    public String toString(){
        return Name +", "+ Cylinders + " cylinders, owned by " + Owner.Name + ", " + Capacity + " seater, weighs " + df.format(Weight) + " kg";   
    }
    
}
