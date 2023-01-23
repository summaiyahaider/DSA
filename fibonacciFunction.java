import java.util.*;
public class fibonacciFunction {
    
    public static void fib(int count){
        int a = 0, b = 1, i, c;
        for(i = 2; i<=count; i++){
            c = a + b;
            System.out.print(" "+c);
            a=b;
            b=c;
        
        
        }
        return;
    }

    public static void main(String args[]){

    System.out.println("Enter an integer");    
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    
    fib(count);

    sc.close();
}
}
