import java.io.*;
import java.util.*;

public class string1 {

    public static void main(String[] args) {

        System.out.print("Enter two Strings");
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int n = A.length()+B.length();
        System.out.println(n); 
        
         int get_val = A.compareTo(B);  
  
         if (get_val < 0) {  
         System.out.println("Yes");  
      } 
         else {  
         System.out.println("No");  
      } 
      
        String cap1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String cap2 = B.substring(0,1).toUpperCase() + B.substring(1);
        
        System.out.println(cap1 + " " + cap2); 
    }
}



