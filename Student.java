/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Student extends Person {
    
    public void setName(String Name){
        this.Name = Name;
    }
    public void study(){
        System.out.println("study");
    }
    public void lectures(){
        System.out.println("attend lectures");
    }
    public void extraActivity(){
        System.out.println("and other extra-curricular activities");
    }
    
}
