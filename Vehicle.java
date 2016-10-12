/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Vehicle {
    public String Name;
    public int Cylinders;
    public Student Owner = new Student();
    
    public Vehicle(int cylinders, String Name, String Owner){
        this.Name = Name;
        Cylinders = cylinders;
        this.Owner.setName(Owner);
         
    }
    
    public String toString(){
        return Name +", "+ Cylinders + " cylinders, owned by " + Owner.Name;
    }
            
}
