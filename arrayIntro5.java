/*Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.
 */

import java.util.*;

public class arrayIntro5 {
    public static void main(String args[]){
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter the integers");

        int arr[]= new int[size];

        for(int i=0; i <size; i++){
            arr[i]=sc.nextInt();
        }

        for(int j = 0; j <arr.length-1; j++){

            if (arr[j]>arr[j+1]){
                System.out.println("The array is not is ascending order");
            }   
            
        }

        

        
    }
}
