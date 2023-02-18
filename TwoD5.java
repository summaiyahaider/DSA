//Imput a 2D matrix and find the largest and smallest element

import java.util.*;


public class TwoD5 {

    public static void main(String args[]){

        System.out.println("Enter the number of rows and cols");
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("Enter the elements in the array");

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The input matrix is:");

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    //The maximum element

    int x = arr[0][0];
    int y = arr[0][0];

    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            if(arr[i][j]>x){
                x=arr[i][j];
            }
        }
    }

    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
            if(arr[i][j]<y){
                y=arr[i][j];
            }
        }
    }

    System.out.println("The largest element is " + x);
    System.out.println("The smallest element is " + y);


    





    }

    
}
