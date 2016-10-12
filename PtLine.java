/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question , Assignment 4
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 15/08/13

public class PtLine extends VectorObject{
    private int x2,y2;
    public PtLine(int id, int x, int y, int x2, int y2){
        super(id,x,y);
        this.x2 = x2;
        this.y2 = y2;

    }
    public void draw ( char [][] matrix ){
        if((x==x2)&(y2>y)){     //increasing vertical
            for(int k = y; k <=y2; k++ )
                matrix[k][x] = '*';
        }
        if((x==x2)&(y>y2)){     //decreasing vertical
            for(int k = y; k >=y2; k-- )
                matrix[k][x] = '*';
        }
        if((y==y2)&(x2>x)){     //increasing horizontal
            for(int k = x; k <=x2; k++ )
                matrix[y][k] = '*';
        }
        if((y==y2)&(x>x2)){     //decreasing horizontal
            for(int k = x; k >=x2; k-- )
                matrix[y][k] = '*';
        }
        
        if((y2>y)&(x2>x)){  //decreasing at obtuse angle (\)
            int pos = x;
            for (int k = y; k <= y2; k++){
                if (pos <= x2)
                    matrix[k][pos] = '*';
                pos+=1;


            }
        }
        if((y>y2)&(x>x2)){  //increasing at obtuse angle (\)
            int pos = x2;
            for (int k = y; k >= y2; k--){
                if (pos >= x)
                    matrix[k][pos] = '*';
                pos-=1;


            }
        }
        if((y>y2)&(x2>x)){  //increasing at acute angle (/)
            int pos = x;
            for (int k = y; k >= y2; k--){
                if (pos <= x2)
                    matrix[k][pos] = '*';
                pos+=1;


            }
        }
        if((y2>y)&(x>x2)){  //Decreasing at acute angle (/)
            int pos = x;
            for (int k = y; k <= y2; k++){
                if (pos >= x2)
                    matrix[k][pos] = '*';
                pos-=1;


            }
        }
        
        
    }

}
