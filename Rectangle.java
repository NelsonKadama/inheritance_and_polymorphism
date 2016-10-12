/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 4
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 15/08/13

public class Rectangle extends VectorObject{
    private int xlen,ylen;
    public Rectangle(int id, int x, int y, int xLen, int yLen){
        super(id,x,y);
        xlen = xLen;
        ylen = yLen;

    }
    public void draw ( char [][] matrix ){
        for (int k = y; k < ylen+y; k++){
            for (int l = x; l < xlen+x; l++){
                matrix[k][l] = '*';
            }
        }
    }

}
