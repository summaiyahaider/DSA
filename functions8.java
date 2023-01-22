import java.util.*;

public class functions8 {
    public static void fibonacciNumbers(int n){

        int a = 0;
        int b = 1;

        for(int i=2; i<=n; i++){

            System.out.print(a+" ");

            int temp = b;
            b = a+b;
            a=temp;


        }
        System.out.println();
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        sc.close();

        fibonacciNumbers(x);
    }
}
