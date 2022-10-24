import java.util.*;

public class functions1 {
    public static void printMyName(String name) {
        System.out.println("The user's name is  "+name +".");
        return;
    }


public static void main(String args[]) {

    System.out.println("Write your name");
    
    Scanner sc = new Scanner(System.in);
    String name = sc.next();


    printMyName(name);
    
}
}