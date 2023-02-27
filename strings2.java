//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;

public class strings2 {
    public static void main(String args[]){

        System.out.println("Enter the number of strings you want to input");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter the strings");

        String arr[]=new String[size];
        for(int i = 0; i < size; i++){
            arr[i]=sc.next();
        }

        //Using nextLine the size decreased by 1, don't know the reason yet

        int combinedLength = 0;

        for(int i = 0; i < arr.length; i++){

            combinedLength+=arr[i].length();

        }

        System.out.println("The total length of the strings is "+combinedLength);
    }
}
