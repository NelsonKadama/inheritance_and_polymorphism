/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 4
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 15/08/13

public class VLine extends VectorObject {
    private int len;
    public VLine(int id, int x, int y, int Len){
        super(id,x,y);
        len = Len;

    }
    public void draw ( char [][] matrix ){
        for (int k = y; k < len+y; k++){
            matrix[k][x] = '*';
            
        }
    }
    

}
