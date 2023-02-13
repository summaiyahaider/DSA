/* Take a 2D array as an input. Find an element x and then print the indices */

import java.util.*;

public class TwoD2 {

    public static void main(String args[]){

        System.out.println("Enter the number of rows and columns");
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        System.out.println("Enter the elements");

        int[][] numbers = new int[rows][cols];

        //input

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        //finding the element

        System.out.println("Enter the number you want to find");

        int x = sc.nextInt();
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j<cols; j++){

                if(numbers[i][j]==x){
                    System.out.println(i + " " + j);
                    
                }

            }
        }



    }
    
}
