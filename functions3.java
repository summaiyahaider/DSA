import java.util.*;

public class functions3 {
    public static int multiplyInt(int a, int b) {
        int product = a * b;
        return product;
    }
public static void main(String args[]){
    System.out.println("Enter two integers");

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int product = multiplyInt(a, b);

    System.out.println("The product of the two integers is: "+product);
    sc.close();
}
}