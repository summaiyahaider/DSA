import java.util.*;

public class arrayIntro3 {
    public static void main(String args[]){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements for the array");

        for(int i = 0; i <size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element you want to find");

        int x = sc.nextInt();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println(i);
                break;
            }
        }
    }  
}
