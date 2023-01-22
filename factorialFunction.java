import java.util.*;

public class factorialFunction {
    
    public static void factorialResult(int n){

        int factorial = 1;

        for(int i = n; i>= 1 ; i--){

            factorial = factorial * i;
        }

            System.out.println(factorial);

            return;

        }


    public static void main(String args[]){
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorialResult(n);
    }
}
