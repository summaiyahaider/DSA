//Print the transpose of a matrix

import java.util.*;

public class TwoD4 {

    public static void main(String args[]){

        System.out.println("Enter the no of rows and columns");

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        
        System.out.println("Enter the elements in the matrix");

        int arr[][]= new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j]=scan.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Transpose

        //To print transpose
      System.out.println("Transpose is:");
      for(int j=0; j<m ;j++) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
 }

    
}
