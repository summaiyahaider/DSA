//Print the spiral order matrix as output for a given matrix of numbers. 

import java.util.*;

public class TwoD3 {

    public static void printSpiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
    
        int left = 0, right = cols - 1, top = 0, bottom = rows - 1;
    
        while (left <= right && top <= bottom) {
            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
    
            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
    
            // Print bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
    
            // Print left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
    

    public static void main(String args[]){

        System.out.println("Enter the number of rows and columns");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("Enter the elements");

        int[][] numbers = new int[n][m];

        //input

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        printSpiralMatrix(numbers);

    }



        
        }



    
    

