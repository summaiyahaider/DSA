// Finding maximum and minimum number in an array of integers  

import java.util.*;
public class arrayIntro4 {
    public static void main(String args[]){

        System.out.println("Enter the size of integers");

        

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        System.out.println("Enter the integers in the array");

        int arr[] = new int[size];

        for(int i = 0; i <size; i++){
            arr[i] = sc.nextInt();
        }

        // Read about max and min

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i <arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }

            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("This is the minimum value in the array: " + min);
        System.out.println("This is the maximum value in the array: " + max);

        sc.close();
    }
}
