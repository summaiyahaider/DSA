import java.util.*;

public class functions4 {
    public static void checkPrime(int a){
        int count = 0;
        for(int i = 1; i<=a; i++){
            if(a%i==0){
                count +=1;
            }
            }
        if(count!=2){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
        return;
        }

   public static void main(String args[]){
    System.out.println("Enter an integer");

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    sc.close();

    checkPrime(a);
   }    
}
