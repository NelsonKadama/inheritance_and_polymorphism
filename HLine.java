/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 4
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 15/08/13

public class HLine extends VectorObject {
    private int len;
    public HLine(int id, int x, int y, int Len){
        super(id,x,y);
        len = Len;

    }
    public void draw ( char [][] matrix ){
        for (int k = x; k < len+x; k++){
            matrix[y][k] = '*';
            
        }
    }

}
